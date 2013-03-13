package net.osgiliath.features.to.maven.m2m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.karaf.xmlns.features.v1._0.Bundle;
import org.apache.karaf.xmlns.features.v1._0.Feature;
import org.apache.karaf.xmlns.features.v1._0.FeaturesRoot;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.maven.pom._4._0.Build;
import org.apache.maven.pom._4._0.ConfigurationType3;
import org.apache.maven.pom._4._0.DependenciesType;
import org.apache.maven.pom._4._0.DependenciesType1;
import org.apache.maven.pom._4._0.Dependency;
import org.apache.maven.pom._4._0.DependencyManagement;
import org.apache.maven.pom._4._0.DocumentRoot;
import org.apache.maven.pom._4._0.ExecutionsType;
import org.apache.maven.pom._4._0.GoalsType1;
import org.apache.maven.pom._4._0.Model;
import org.apache.maven.pom._4._0.Plugin;
import org.apache.maven.pom._4._0.PluginExecution;
import org.apache.maven.pom._4._0.PluginsType2;
import org.apache.maven.pom._4._0.PropertiesType2;
import org.apache.maven.pom._4._0._0Factory;
import org.apache.maven.pom._4._0._0Package;
import org.apache.maven.pom._4._0.impl._0FactoryImpl;
import org.eclipse.aether.examples.util.Booter;
import org.eclipse.aether.examples.util.MavenModelDependencyGraphDumper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.sonatype.aether.RepositorySystem;
import org.sonatype.aether.RepositorySystemSession;
import org.sonatype.aether.artifact.Artifact;
import org.sonatype.aether.collection.CollectRequest;
import org.sonatype.aether.collection.CollectResult;
import org.sonatype.aether.collection.DependencyCollectionException;
import org.sonatype.aether.repository.RemoteRepository;
import org.sonatype.aether.resolution.DependencyResolutionException;
import org.sonatype.aether.util.artifact.DefaultArtifact;

public class Main {
	private static Logger log = Logger.getLogger(Main.class.getSimpleName());
	private static String VERSION_SUFFIX = ".version";
	private static Map<String, String> propsCache = new HashMap<String, String>();

	/**
	 * @param args
	 * @throws DependencyResolutionException
	 * @throws DependencyCollectionException
	 */
	public static void main(String[] args)
			throws DependencyResolutionException, DependencyCollectionException {
		PropertyConfigurator.configure("log4j.properties");
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("maven", new XMIResourceFactoryImpl());
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("http://maven.apache.org/POM/4.0.0", new _0FactoryImpl());
		rs.getPackageRegistry().put(_0Package.eINSTANCE.getNsURI(),
				_0Package.eINSTANCE);
		convert(rs);

	}

	public static List<DocumentRoot> convert(ResourceSet rs)
			throws DependencyResolutionException, DependencyCollectionException {
		List<FeaturesRoot> features = net.osgiliath.features.populator.Main
				.parseFeatures();
		

		List<DocumentRoot> mavenProjects = convertFeatures(features, rs);
		int i = 0;
		Resource to = null;
		for (DocumentRoot proj : mavenProjects) {
			try {
				to = rs.createResource(URI
						.createURI("pomModels/out/" + i + ".maven"));
				to.getContents().add(proj);
				to.save(Collections.emptyMap());
				i++;
			} catch (Exception exc) {
				log.error(exc);
			}
		}

		return mavenProjects;
	}

	private static List<DocumentRoot> convertFeatures(
			List<FeaturesRoot> featuress, ResourceSet rs)
			throws DependencyResolutionException, DependencyCollectionException {
		List<DocumentRoot> poms = new ArrayList<>();
		ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(
				rs.getPackageRegistry());

		for (FeaturesRoot features : featuress) {
			DocumentRoot pom = _0Factory.eINSTANCE.createDocumentRoot();
			Model project = _0Factory.eINSTANCE.createModel();
			PropertiesType2 props = _0Factory.eINSTANCE.createPropertiesType2();
			DependencyManagement mngmt = _0Factory.eINSTANCE
					.createDependencyManagement();
			DependenciesType1 mngmtCont = _0Factory.eINSTANCE
					.createDependenciesType1();
			DependenciesType deps = _0Factory.eINSTANCE
					.createDependenciesType();
			for (String repo : features.getRepository()) {
				log.debug("parsing repo:" + repo);
				genPomDef(repo, props, mngmtCont, deps, extendedMetaData, null,
						false, null);
			}
			EClass artifactItemsClass = null;
			EObject artifactItemsObject = null;
			EFactory artifactItemsFactoryInstance = null;
			EPackage artifactItemsPackage = null;
			if (System.getProperty("Virgo") != null) {
				Build build = _0Factory.eINSTANCE.createBuild();
				PluginsType2 plugins = _0Factory.eINSTANCE.createPluginsType2();
				Plugin dependencyPlugin = _0Factory.eINSTANCE.createPlugin();
				dependencyPlugin.setGroupId("org.apache.maven.plugins");
				dependencyPlugin.setArtifactId("maven-dependency-plugin");

				ExecutionsType executions = _0Factory.eINSTANCE
						.createExecutionsType();
				PluginExecution pluginExecution = _0Factory.eINSTANCE
						.createPluginExecution();
				pluginExecution.setId("copy");
				pluginExecution.setPhase("install");
				GoalsType1 goal = _0Factory.eINSTANCE.createGoalsType1();
				goal.getGoal().add("copy");
				pluginExecution.setGoals(goal);
				ConfigurationType3 artifactItemsConf = _0Factory.eINSTANCE
						.createConfigurationType3();
				EStructuralFeature artifactItems = null;
				artifactItemsPackage = createArtifactItemsEcoreDefinition(rs);
				artifactItemsFactoryInstance = artifactItemsPackage
						.getEFactoryInstance();
				log.debug("registrered classifiers:"
						+ artifactItemsPackage.getEClassifiers());
				artifactItemsClass = (EClass) artifactItemsPackage
						.getEClassifier("artifactItemsClass");
				artifactItemsObject = artifactItemsFactoryInstance
						.create(artifactItemsClass);
				artifactItems = extendedMetaData
						.demandFeature(
								"http:///org.apache.maven.dependencyplugin.artifactItems.ecore",
								"artifactItemsClass", true);
				artifactItemsConf.getAny().add(artifactItems,
						artifactItemsObject);
				pluginExecution.setConfiguration(artifactItemsConf);
				executions.getExecution().add(pluginExecution);
				dependencyPlugin.setExecutions(executions);
				plugins.getPlugin().add(dependencyPlugin);
				build.setPlugins(plugins);
				project.setBuild(build);
			}
			for (Feature feat : features.getFeature()) {
				for (Bundle bnd : feat.getBundle()) {
					log.debug("parsing bundle: " + bnd.getValue());
					genPomDef(bnd.getValue(), props, mngmtCont, deps,
							extendedMetaData, artifactItemsObject,
							bnd.isDependency(), artifactItemsPackage);
				}
			}
			project.setDependencies(deps);
			mngmt.setDependencies(mngmtCont);
			project.setDependencyManagement(mngmt);
			project.setProperties(props);
			pom.setProject(project);
			poms.add(pom);
		}
		return poms;
	}

	private static void genPomDef(String repo, PropertiesType2 props,
			DependenciesType1 mngmtCont, DependenciesType deps,
			ExtendedMetaData extendedMetaData, EObject artifactItemsObject,
			boolean collectDependencies, EPackage artifactItemsPackage)
			throws DependencyCollectionException {
		Pattern p = Pattern.compile("^\\$\\{.*\\}$");
		repo = removeMvnPrefix(repo);
		if (!repo.isEmpty() && !repo.contains("//") && !repo.contains("!")) {
			String[] mvnDef = repo.split("/");
			String groupId = mvnDef[0].trim();
			String artifactId = mvnDef[1].trim();
			String version = mvnDef[2].trim();
			String type = "";
			if (mvnDef.length > 3) {
				type = mvnDef[3].trim();
			}
			String classifier = "";
			if (mvnDef.length > 4) {
				classifier = mvnDef[4].trim();
			}

			// We're adding a new property if the feature groupId is of the
			// ${.*} form
			Matcher mGroupId = p.matcher(groupId);
			if (mGroupId.matches()
					&& !propsCache.containsKey(groupId.substring(2,
							groupId.length() - 1))) {
				EStructuralFeature prop = extendedMetaData.demandFeature(null,
						groupId.substring(2, groupId.length() - 1), true);
				AnyType propValue = XMLTypeFactory.eINSTANCE.createAnyType();
				FeatureMapUtil.addText(propValue.getAny(), "");
				props.getAny().add(prop, propValue);
				propsCache.put(groupId.substring(2, groupId.length() - 1), "");
			}
			// let's create dependency management
			Matcher mVersion = p.matcher(version);
			Dependency depMngmt = _0Factory.eINSTANCE.createDependency();
			depMngmt.setGroupId(groupId);
			depMngmt.setArtifactId(artifactId);
			if (mVersion.matches()) {
				depMngmt.setVersion(version);
			} else {
				depMngmt.setVersion("${" + artifactId + VERSION_SUFFIX + "}");
			}
			// and now the dependency
			Dependency dep = _0Factory.eINSTANCE.createDependency();
			dep.setGroupId(groupId);
			dep.setArtifactId(artifactId);
			dep.setScope("provided");
			// We generate the maven-dependency plugin copying dependencies in
			// the /usr folder
			if (null != artifactItemsObject) {
				EFactory artifactItemsFactory = artifactItemsPackage
						.getEFactoryInstance();
				EClass artifactItemClass = (EClass) artifactItemsPackage
						.getEClassifier("artifactItemClass");
				EObject artifactItemObject = artifactItemsFactory
						.create(artifactItemClass);
				artifactItemObject.eSet(
						artifactItemClass.getEStructuralFeature("artifactId"),
						artifactId);
				artifactItemObject.eSet(
						artifactItemClass.getEStructuralFeature("groupId"),
						groupId);
				artifactItemObject.eSet(
						artifactItemClass.getEStructuralFeature("type"), "jar");
				artifactItemObject.eSet(
						artifactItemClass.getEStructuralFeature("overWrite"),
						"false");
				artifactItemObject.eSet(artifactItemClass
						.getEStructuralFeature("outputDirectory"),
						"${virgo.path}/repository/usr");
				EClass artifactsItems = (EClass) artifactItemsPackage
						.getEClassifier("artifactItemsClass");
				((List) artifactItemsObject.eGet(artifactsItems
						.getEStructuralFeature("artifactItem")))
						.add(artifactItemObject);
			}
			if (!type.isEmpty()) {
				depMngmt.setType(type);
				dep.setType(type);
			}
			if (!classifier.isEmpty()) {
				depMngmt.setClassifier(classifier);
				dep.setClassifier(classifier);
			}
			mngmtCont.getDependency().add(depMngmt);
			deps.getDependency().add(dep);
			// finally the version
			if (mVersion.matches()) {
				if (!propsCache.containsKey(version.substring(2,
						version.length() - 1))) {
					EStructuralFeature pro = extendedMetaData.demandFeature(
							null, version.substring(2, version.length() - 1),
							true);
					AnyType proValue = XMLTypeFactory.eINSTANCE.createAnyType();
					FeatureMapUtil.addText(proValue.getAny(), "");
					props.getAny().add(pro, proValue);
					propsCache.put(version.substring(2, version.length() - 1),
							"");
				}
			} else {
				if (!propsCache.containsKey(artifactId + VERSION_SUFFIX)) {
					EStructuralFeature pro = extendedMetaData.demandFeature(
							null, artifactId + VERSION_SUFFIX, true);
					AnyType proValue = XMLTypeFactory.eINSTANCE.createAnyType();
					FeatureMapUtil.addText(proValue.getAny(), version);
					props.getAny().add(pro, proValue);
					propsCache.put(artifactId + VERSION_SUFFIX, version);
				}
			}

			if (collectDependencies) {
				log.debug("collecting dependencies for artifact:" + groupId
						+ ":" + artifactId + ":" + version);
				Artifact pomArtifact = new DefaultArtifact(groupId + ":"
						+ artifactId + ":" + version);
				RepositorySystem system = Booter.newRepositorySystem();
				RepositorySystemSession session = Booter
						.newRepositorySystemSession(system);
				RemoteRepository repoM = Booter.newCentralRepository();
				CollectRequest collectRequest = new CollectRequest();
				collectRequest
						.setRoot(new org.sonatype.aether.graph.Dependency(
								pomArtifact, ""));
				collectRequest.addRepository(repoM);
				CollectResult collectResult = system.collectDependencies(
						session, collectRequest);
				MavenModelDependencyGraphDumper dumper = new MavenModelDependencyGraphDumper();
				dumper.setArtifactItemsObject(artifactItemsObject);
				dumper.setArtifactItemsPackage(artifactItemsPackage);
				dumper.setDeps(deps);
				dumper.setDepsMngmt(mngmtCont);
				dumper.setProperties(props);
				dumper.setExtendedMetaData(extendedMetaData);
				collectResult.getRoot().accept(dumper);
			}

		}

	}

	private static String removeMvnPrefix(String url) {
		if (url.startsWith("mvn:")) {
			url = url.substring(4);
			return url;
		} else {
			return "";
		}
	}

	public static EPackage createArtifactItemsEcoreDefinition(ResourceSet rs) {
		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
		EcorePackage ecorePackage = EcorePackage.eINSTANCE;
		EClass artifactItemsClass = null;
		EClass artifactItemClass = null;
		EPackage artifactItemsEPackage = ecoreFactory.createEPackage();
		artifactItemsEPackage.setName("dependencyPluginArtifactItemsEPackage");
		artifactItemsEPackage.setNsPrefix("dependencyPluginArtifactItems");
		artifactItemsEPackage
				.setNsURI("http:///org.apache.maven.dependencyplugin.artifactItems.ecore");
		artifactItemsClass = ecoreFactory.createEClass();
		artifactItemsClass.setName("artifactItemsClass");
		EReference artifactItemRef = EcoreFactory.eINSTANCE.createEReference();
		artifactItemRef.setName("artifactItem");
		artifactItemRef.setContainment(true);
		artifactItemRef
				.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
		artifactItemClass = ecoreFactory.createEClass();
		artifactItemClass.setName("artifactItemClass");
		EAttribute artifactIdAttribute = ecoreFactory.createEAttribute();
		artifactIdAttribute.setName("artifactId");
		artifactIdAttribute.setEType(ecorePackage.getEString());
		artifactItemClass.getEStructuralFeatures().add(artifactIdAttribute);
		EAttribute groupIdAttribute = ecoreFactory.createEAttribute();
		groupIdAttribute.setName("groupId");
		groupIdAttribute.setEType(ecorePackage.getEString());
		artifactItemClass.getEStructuralFeatures().add(groupIdAttribute);
		EAttribute typeAttribute = ecoreFactory.createEAttribute();
		typeAttribute.setName("type");
		typeAttribute.setEType(ecorePackage.getEString());
		artifactItemClass.getEStructuralFeatures().add(typeAttribute);
		EAttribute overwriteAttribute = ecoreFactory.createEAttribute();
		overwriteAttribute.setName("overWrite");
		overwriteAttribute.setEType(ecorePackage.getEString());
		artifactItemClass.getEStructuralFeatures().add(overwriteAttribute);
		EAttribute outputDirectoryAttribute = ecoreFactory.createEAttribute();
		outputDirectoryAttribute.setName("outputDirectory");
		outputDirectoryAttribute.setEType(ecorePackage.getEString());
		artifactItemClass.getEStructuralFeatures()
				.add(outputDirectoryAttribute);
		artifactItemRef.setEType(artifactItemClass);
		artifactItemsClass.getEStructuralFeatures().add(artifactItemRef);
		artifactItemsEPackage.getEClassifiers().add(artifactItemsClass);
		artifactItemsEPackage.getEClassifiers().add(artifactItemClass);
		rs.getPackageRegistry().put(artifactItemsEPackage.getNsURI(),
				artifactItemsEPackage);
		return artifactItemsEPackage;
	}

}
