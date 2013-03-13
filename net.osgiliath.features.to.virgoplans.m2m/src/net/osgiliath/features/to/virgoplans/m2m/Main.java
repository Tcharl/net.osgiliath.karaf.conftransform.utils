package net.osgiliath.features.to.virgoplans.m2m;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import net.osgiliath.features.to.virgoplans.m2m.util.VirgoDependencyGraphDumper;

import org.apache.karaf.xmlns.features.v1._0.Bundle;
import org.apache.karaf.xmlns.features.v1._0.Dependency;
import org.apache.karaf.xmlns.features.v1._0.Feature;
import org.apache.karaf.xmlns.features.v1._0.FeaturesRoot;
import org.apache.karaf.xmlns.features.v1._0._0Package;
import org.apache.karaf.xmlns.features.v1._0.impl._0FactoryImpl;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.aether.examples.util.Booter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.virgo.schema.plan.ArtifactType;
import org.eclipse.virgo.schema.plan.DocumentRoot;
import org.eclipse.virgo.schema.plan.Plan;
import org.eclipse.virgo.schema.plan.PlanFactory;
import org.eclipse.virgo.schema.plan.PlanPackage;
import org.eclipse.virgo.schema.plan.impl.PlanFactoryImpl;
import org.sonatype.aether.RepositorySystem;
import org.sonatype.aether.RepositorySystemSession;
import org.sonatype.aether.artifact.Artifact;
import org.sonatype.aether.collection.CollectRequest;
import org.sonatype.aether.collection.CollectResult;
import org.sonatype.aether.collection.DependencyCollectionException;
import org.sonatype.aether.repository.RemoteRepository;
import org.sonatype.aether.util.artifact.DefaultArtifact;

public class Main {
	private static Logger log = Logger.getLogger(Main.class.getSimpleName());

	/**
	 * @param args
	 * @throws DependencyCollectionException
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main(String[] args)
			throws DependencyCollectionException, IOException,
			InterruptedException {
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("Virgo", "true");
		if (null != System.getProperty("M2_REPO"))
		System.setProperty("M2_REPO", "C:/Users/Charlie/.m2/repository/");
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("maven", new XMIResourceFactoryImpl());
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("http://maven.apache.org/POM/4.0.0", new _0FactoryImpl());
		rs.getPackageRegistry().put(_0Package.eINSTANCE.getNsURI(),
				_0Package.eINSTANCE);

		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("plan", new XMIResourceFactoryImpl());
		rs.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put("http://www.eclipse.org/virgo/schema/plan",
						new PlanFactoryImpl());
		rs.getPackageRegistry().put(PlanPackage.eINSTANCE.getNsURI(),
				PlanPackage.eINSTANCE);

		log.debug("begining parsing feature and convert to plan model");
		List<FeaturesRoot> features = net.osgiliath.features.populator.Main
				.parseFeatures();
		Collection<Plan> plans = convertFeaturesToPlans(features);

		List<DocumentRoot> plansRoot = new ArrayList<>();
		for (Plan p : plans) {
			DocumentRoot planRoot = PlanFactory.eINSTANCE.createDocumentRoot();
			planRoot.setPlan(p);
			plansRoot.add(planRoot);
		}

		Resource to = null;
		for (Plan proj : plans) {
		//for (DocumentRoot proj : plansRoot) {
			try {
				to = rs.createResource(URI.createURI("plans/out/"
						+ proj.getName() + ".plan"));
				to.getContents().add(proj);
				to.save(Collections.emptyMap());
			} catch (Exception exc) {
				log.error(exc);
			}
		}

	}

	private static Collection<Plan> convertFeaturesToPlans(
			List<FeaturesRoot> features) throws DependencyCollectionException,
			IOException, InterruptedException {
		Collection<Plan> plans = new ArrayList<Plan>();
		for (FeaturesRoot featureFile : features) {
			for (Feature feature : featureFile.getFeature()) {
				Plan plan = PlanFactory.eINSTANCE.createPlan();
				System.out.println("******Parsing feature; "
						+ feature.getName());
				plan.setAtomic(true);
				plan.setScoped(false);
				plan.setName(feature.getName());
				plan.setVersion(feature.getVersion());
				for (Bundle bnd : feature.getBundle()) {
					if (bnd.isDependency()) {
						Collection<ArtifactType> artifactsToAdd = addDependencyBundle(bnd);
						if (artifactsToAdd != null)
							plan.getArtifact().addAll(artifactsToAdd);
					}
					Collection<ArtifactType> artifactsToAdd = addBundle(bnd);
					if (artifactsToAdd != null)
						plan.getArtifact().addAll(artifactsToAdd);
				}
				for (Dependency feat : feature.getFeature()) {
					ArtifactType depPlan = PlanFactory.eINSTANCE
							.createArtifactType();
					depPlan.setType("plan");
					depPlan.setName(feat.getValue());
					depPlan.setVersion(feat.getVersion());

				}
				plans.add(plan);
			}
		}

		return plans;
	}

	private static Collection<ArtifactType> addBundle(Bundle bnd)
			throws IOException, InterruptedException {
		Collection<ArtifactType> toRet = null;
		if (bnd.getValue().startsWith("mvn:") && !bnd.getValue().contains("//")) {
			String repo = removeMvnPrefix(bnd.getValue());
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

			Artifact pomArtifact = new DefaultArtifact(groupId + ":"
					+ artifactId + ":" + version);
			System.out.println("Collecting dependency for bundle:" + groupId
					+ ":" + artifactId + ":" + version);
			List<String> dependencies = new ArrayList<>();
			dependencies.add(repo.replace('/', ':'));

			toRet = generateArtifactTypeFromStringsDefinitions(dependencies);
		}
		return toRet;
	}

	private static Collection<ArtifactType> addDependencyBundle(Bundle bnd)
			throws DependencyCollectionException, IOException,
			InterruptedException {
		log.debug("Collecting dependency for bundle:" + bnd.getValue());
		System.out
				.println("Collecting dependency for bundle:" + bnd.getValue());
		Collection<ArtifactType> toRet = null;
		if (bnd.getValue().startsWith("mvn:") && !bnd.getValue().contains("//")) {
			String repo = removeMvnPrefix(bnd.getValue());
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

			Artifact pomArtifact = new DefaultArtifact(groupId + ":"
					+ artifactId + ":" + version);
			RepositorySystem system = Booter.newRepositorySystem();
			RepositorySystemSession session = Booter
					.newRepositorySystemSession(system);
			RemoteRepository repoM = Booter.newCentralRepository();
			CollectRequest collectRequest = new CollectRequest();
			collectRequest.setRoot(new org.sonatype.aether.graph.Dependency(
					pomArtifact, ""));
			collectRequest.addRepository(repoM);
			CollectResult collectResult = system.collectDependencies(session,
					collectRequest);
			VirgoDependencyGraphDumper dumper = new VirgoDependencyGraphDumper();
			List<String> dependencies = new ArrayList<>();
			dumper.setDependencyList(dependencies);
			collectResult.getRoot().accept(dumper);
			toRet = generateArtifactTypeFromStringsDefinitions(dependencies);
		}

		return toRet;
	}

	private static Collection<ArtifactType> generateArtifactTypeFromStringsDefinitions(
			List<String> dependencies) throws IOException, InterruptedException {
		Collection<ArtifactType> ret = new ArrayList<>();
		for (String dependency : dependencies) {
			String bundleSymbolicNameAndVersion = findSymbolicNameFromDependendency(dependency);
			String[] bundleArray = bundleSymbolicNameAndVersion.split(":");
			if (bundleArray != null)
				if (bundleArray.length == 2) {
					ArtifactType virgoPlanArtifact = PlanFactory.eINSTANCE
							.createArtifactType();
					virgoPlanArtifact.setName(bundleArray[0]);
					virgoPlanArtifact.setVersion(bundleArray[1]);
					virgoPlanArtifact.setType("bundle");
					ret.add(virgoPlanArtifact);
				}
		}
		return ret;
	}

	private static String findSymbolicNameFromDependendency(String dependency)
			throws IOException, InterruptedException {
		String path = System.getProperty("M2_REPO");
		String[] mvnDef = dependency.split(":");
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
		path += groupId.replace('.', '/') + '/';
		path += artifactId + '/';
		path += version + '/';

		String artifact = artifactId + "-" + version;
		if (classifier != null && !classifier.isEmpty()) {
			artifact += "-" + classifier;
		}
		if (type != null && !type.isEmpty()) {
			artifact += "." + type;
		} else {
			artifact += ".jar";
		}
		path += artifact;
		System.out.println("Dependency path in your local repo:" + path);
		System.out.println("Is prensent in your local repo: "+new File(path).isFile());
		if (new File(path).isFile()) {
			File manifest = getManifestFromZip(path);
			return readManifestAndExtractSymbolicNameAndVersion(manifest);
		} else {
			return "";
		}
	}

	private static String readManifestAndExtractSymbolicNameAndVersion(
			File manifest) {
		BufferedReader br = null;
		String symbolicName = null;
		String version = null;
		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(manifest));

			while ((sCurrentLine = br.readLine()) != null) {
				if (sCurrentLine.startsWith("Bundle-SymbolicName:")) {
					symbolicName = sCurrentLine.substring(
							"Bundle-SymbolicName:".length()).trim();
					System.out.println("Extracted bundle symbolic name:" + symbolicName);
				}
				if (sCurrentLine.startsWith("Bundle-Version:")) {
					version = sCurrentLine
							.substring("Bundle-Version:".length()).trim();
					System.out.println("Extracted bundle symbolic version:" + version);
				}
			}

		} catch (IOException e) {
			log.error(e);
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				log.error(ex);
			}
		}
		return symbolicName + ":" + version;
	}

	private static File getManifestFromZip(String path) throws IOException,
			InterruptedException {
		ZipInputStream in = null;
		OutputStream out = null;
		File manifest = new File("CurrentManifest");
		try {
			// Open the jar file

			in = new ZipInputStream(new FileInputStream(path));
			// Get the first entry
			manifest.delete();
			manifest.createNewFile();
			boolean found = false;
			do {
				ZipEntry entry = in.getNextEntry();
				if (entry.getName().equalsIgnoreCase("META-INF/MANIFEST.MF")) {
					found = true;
					out = new FileOutputStream(manifest);
					// Transfer bytes from the ZIP file to the output file
					byte[] buf = new byte[1024];
					int len;
					while ((len = in.read(buf)) > 0) {
						out.write(buf, 0, len);
					}
				}
			} while (!found);
		} catch (IOException e) {
			log.error(e);
		} finally {
			// Close the streams
			if (out != null) {
				out.close();
			}
			if (in != null) {
				in.close();
			}
		}
		return manifest;
	}

	private static String removeMvnPrefix(String url) {
		if (url.startsWith("mvn:")) {
			url = url.substring(4);
			return url;
		} else {
			return "";
		}
	}

}
