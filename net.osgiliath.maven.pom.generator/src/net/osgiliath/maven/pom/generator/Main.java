package net.osgiliath.maven.pom.generator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.maven.pom._4._0.Dependency;
import org.apache.maven.pom._4._0.DocumentRoot;
import org.apache.maven.pom._4._0.Plugin;
import org.apache.maven.pom._4._0.PluginExecution;
import org.apache.maven.pom._4._0._0Package;
import org.apache.maven.pom._4._0.impl._0FactoryImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.sonatype.aether.collection.DependencyCollectionException;
import org.sonatype.aether.resolution.DependencyResolutionException;

public class Main {
	private static Logger log = Logger.getLogger(Main.class.getSimpleName());

	/**
	 * @param args
	 * @throws DependencyCollectionException
	 * @throws DependencyResolutionException
	 * @throws IOException
	 */
	public static void main(String[] args)
			throws DependencyResolutionException,
			DependencyCollectionException, IOException {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("maven", new XMIResourceFactoryImpl());
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("http://maven.apache.org/POM/4.0.0", new _0FactoryImpl());
		rs.getPackageRegistry().put(_0Package.eINSTANCE.getNsURI(),
				_0Package.eINSTANCE);
		
		log.debug("start parsing");
		System.setProperty("Virgo", "true");// TODO comment this if you don't want to generate dependency plugin section
		Collection<DocumentRoot> pomModels = net.osgiliath.features.to.maven.m2m.Main
				.convert(rs);
		
		PropertyConfigurator.configure("log4j.properties");
		
		Collection<Element> pomsConfiguration = convertToRegularMavenPom(pomModels, rs);
		int i = 0;
		for (Element pomConfiguration : pomsConfiguration) {
			Document pom = new Document(pomConfiguration);
			XMLOutputter xout = new XMLOutputter(Format.getPrettyFormat());
			FileWriter fstream = new FileWriter("poms/out/" + i + ".pom");
			BufferedWriter out = new BufferedWriter(fstream);
			xout.output(pom, out);
			i++;
		}
	}

	private static Collection<Element> convertToRegularMavenPom(
			Collection<DocumentRoot> pomModels, ResourceSet rs) {
		Collection<Element> ret = new ArrayList<>();
		//EPackage dependencyManagementPackage = net.osgiliath.features.to.maven.m2m.Main.createArtifactItemsEcoreDefinition(rs);
		for (DocumentRoot pomModel : pomModels) {
			Element root = new Element("project");
			Element dependencyManagement = new Element("dependencyManagement");
			generateDependencyManagement(pomModel, dependencyManagement);
			root.getChildren().add(dependencyManagement);
			if (null != System.getProperty("Virgo")) {
				root.getChildren().add(generateDependencyPluginCopyConfiguration(pomModel));
			}
			root.getChildren().add(generateDependenciesBlock(pomModel));
			
			Element properties = new Element("properties");
			for (Entry prop : pomModel.getProject().getProperties().getAny()) {
				Element property =new Element(prop.getEStructuralFeature().getName());
				if (((AnyType)prop.getValue()).getMixed().getValue(0) != null && ((AnyType)prop.getValue()).getMixed().getValue(0) != "0" && !((AnyType)prop.getValue()).getMixed().getValue(0).equals(""))
				property.setText((String) ((AnyType)prop.getValue()).getMixed().getValue(0));
//				System.out.println(prop);
//				System.out.println(((AnyType)prop.getValue()).getMixed().getValue(0));
				//property.setText((String)prop.getEStructuralFeature().ge.toString());
				properties.getChildren().add(property);
				//Element propLabel = props.
			}
			root.getChildren().add(properties);
				
			ret.add(root);
		}

		// TODO Auto-generated method stub
		return ret;
	}

	private static Element generateDependenciesBlock(DocumentRoot pomModel) {
		Element dependencies = new Element("dependencies");
		for (Dependency dep : pomModel.getProject().getDependencies().getDependency()) {
			Element dependency = new Element("dependency");
			Element artifactId = new Element("artifactId");
			artifactId.setText(dep.getArtifactId());
			Element groupId = new Element("groupId");
			groupId.setText(dep.getGroupId());
			if (dep.getClassifier() != null) {
				Element classifier = new Element("classifier");
				classifier.setText(dep.getClassifier());
				dependency.getChildren().add(classifier);		
			}
			if (dep.getType() != null) {
				Element type = new Element("type");
				type.setText(dep.getType());
				dependency.getChildren().add(type);		
			}
			dependency.getChildren().add(groupId);
			dependency.getChildren().add(artifactId);
			dependencies.getChildren().add(dependency);
		}
		return dependencies;
	}

	private static Element generateDependencyPluginCopyConfiguration(
			DocumentRoot pomModel) {
		Element build = new Element("build");
		Element mavenDependencyPlugin = new Element("plugin");
		Element mavenDependencyPluginGroupId = new Element("groupId");
		Plugin pomModelMavenDependencyPlugin = pomModel.getProject().getBuild().getPlugins().getPlugin().get(0);
		
		mavenDependencyPluginGroupId.setText(pomModelMavenDependencyPlugin.getGroupId());
		Element mavenDependencyPluginArtifactId = new Element("artifactId");
		mavenDependencyPluginArtifactId.setText(pomModelMavenDependencyPlugin.getArtifactId());
		Element mavenDependencyPluginExecutions = new Element("executions");
		Element mavenDependencyPluginExecution = new Element("execution");
		Element mavenDependencyPluginExecutionId = new Element("id");
		PluginExecution pomModelMavenDependencyPluginCopyExecution = pomModelMavenDependencyPlugin.getExecutions().getExecution().get(0);
		mavenDependencyPluginExecutionId.setText(pomModelMavenDependencyPluginCopyExecution.getId());
		Element mavenDependencyPluginExecutionPhase = new Element("phase");
		mavenDependencyPluginExecutionPhase.setText(pomModelMavenDependencyPluginCopyExecution.getPhase());
		Element mavenDependencyPluginExecutionGoals = new Element("goals");
		Element mavenDependencyPluginExecutionGoal = new Element("goal");
		mavenDependencyPluginExecutionGoal.setText(pomModelMavenDependencyPluginCopyExecution.getGoals().getGoal().get(0));
		Element mavenDependencyPluginExecutionConfiguration = new Element("configuration");
		Element mavenDependencyPluginExecutionConfigurationArtifactItems = new Element("artifactItems");
		for (Entry artifactItemsEntry : pomModelMavenDependencyPluginCopyExecution.getConfiguration().getAny()) {
			EObject artifactItems = (EObject) artifactItemsEntry.getValue();
			for (EObject artifactItem : ((List<EObject>)artifactItems.eGet(artifactItems.eClass().getEStructuralFeatures().get(0)))) {
				Element artifactItemContainer = new Element("artifactItem");
				Element artifactItemContainerArtifactId = new Element("artifactId");
				artifactItemContainerArtifactId.setText((String)artifactItem.eGet(artifactItem.eClass().getEStructuralFeature("artifactId")));
				Element artifactItemContainerGroupId = new Element("groupId");
				artifactItemContainerGroupId.setText((String)artifactItem.eGet(artifactItem.eClass().getEStructuralFeature("groupId")));
				Element artifactItemContainerType = new Element("type");
				artifactItemContainerType.setText((String)artifactItem.eGet(artifactItem.eClass().getEStructuralFeature("type")));
				Element artifactItemContainerOverWrite = new Element("overWrite");
				artifactItemContainerOverWrite.setText((String)artifactItem.eGet(artifactItem.eClass().getEStructuralFeature("overWrite")));
				Element artifactItemContainerOutputDirectory = new Element("outputDirectory");
				artifactItemContainerOutputDirectory.setText((String)artifactItem.eGet(artifactItem.eClass().getEStructuralFeature("outputDirectory")));
				artifactItemContainer.getChildren().add(artifactItemContainerOutputDirectory);
				artifactItemContainer.getChildren().add(artifactItemContainerOverWrite);
				artifactItemContainer.getChildren().add(artifactItemContainerType);
				artifactItemContainer.getChildren().add(artifactItemContainerGroupId);
				artifactItemContainer.getChildren().add(artifactItemContainerArtifactId);
				mavenDependencyPluginExecutionConfigurationArtifactItems.getChildren().add(artifactItemContainer);
			}
		}
		mavenDependencyPluginExecutionConfiguration.getChildren().add(mavenDependencyPluginExecutionConfigurationArtifactItems);
		mavenDependencyPluginExecution.getChildren().add(mavenDependencyPluginExecutionConfiguration);
		mavenDependencyPluginExecutionGoals.getChildren().add(mavenDependencyPluginExecutionGoal);
		mavenDependencyPluginExecution.getChildren().add(mavenDependencyPluginExecutionGoals);
		mavenDependencyPluginExecution.getChildren().add(mavenDependencyPluginExecutionPhase);
		mavenDependencyPluginExecution.getChildren().add(mavenDependencyPluginExecutionId);
		mavenDependencyPluginExecutions.getChildren().add(mavenDependencyPluginExecution);
		mavenDependencyPlugin.getChildren().add(mavenDependencyPluginExecutions);
		mavenDependencyPlugin.getChildren().add(mavenDependencyPluginArtifactId);
		mavenDependencyPlugin.getChildren().add(mavenDependencyPluginGroupId);
		build.getChildren().add(mavenDependencyPlugin);
		return build;
	}

	private static void generateDependencyManagement(DocumentRoot pomModel,
			Element dependencyManagement) {
		for (Dependency modelDependency : pomModel.getProject()
				.getDependencyManagement().getDependencies()
				.getDependency()) {
			Element dependency = new Element("dependency");
			Element artifactId = new Element("artifactId");
			artifactId.setText(modelDependency.getArtifactId());
			dependency.getChildren().add(artifactId);
			Element groupId = new Element("groupId");
			groupId.setText(modelDependency.getGroupId());
			dependency.getChildren().add(groupId);
			if (null != modelDependency.getScope()) {
				Element scope = new Element("scope");
				scope.setText(modelDependency.getScope());
				dependency.getChildren().add(scope);
			}
			if (null != modelDependency.getClassifier()) {
				Element classifier = new Element("classifier");
				classifier.setText(modelDependency.getClassifier());
				dependency.getChildren().add(classifier);
			}
			if (null != modelDependency.getType()) {
				Element type = new Element("type");
				type.setText(modelDependency.getType());
				dependency.getChildren().add(type);
			}
			if (null != modelDependency.getVersion()) {
				Element version = new Element("version");
				version.setText(modelDependency.getVersion());
				dependency.getChildren().add(version);
			}
			dependencyManagement.getChildren().add(dependency);
		}
	}

}
