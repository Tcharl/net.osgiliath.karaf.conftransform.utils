package net.osgiliath.features.populator;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.karaf.xmlns.features.v1._0.Bundle;
import org.apache.karaf.xmlns.features.v1._0.Dependency;
import org.apache.karaf.xmlns.features.v1._0.DocumentRoot;
import org.apache.karaf.xmlns.features.v1._0.Feature;
import org.apache.karaf.xmlns.features.v1._0.FeaturesRoot;
import org.apache.karaf.xmlns.features.v1._0._0Factory;
import org.apache.karaf.xmlns.features.v1._0._0Package;
import org.apache.karaf.xmlns.features.v1._0.impl._0FactoryImpl;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class Main {
	private static Logger log = Logger.getLogger(Main.class.getSimpleName());
	private static SAXBuilder sxb = new SAXBuilder();
	private static List<FeaturesRoot> toRet = new ArrayList<FeaturesRoot>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		parseFeatures();
	}

	public static List<FeaturesRoot> parseFeatures() {
		File dir = new File("features/in");
		String[] children = dir.list();
		// SAXBuilder sxb = new SAXBuilder();
		ResourceSet rs = new ResourceSetImpl();
		Resource to = null;
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("features", new XMIResourceFactoryImpl());
		rs.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put("http://karaf.apache.org/xmlns/features/v1.0.0",
						new _0FactoryImpl());
		rs.getPackageRegistry().put(_0Package.eINSTANCE.getNsURI(),
				_0Package.eINSTANCE);
		for (int i = 0; i < children.length; i++) {
			try {

				File ret = new File("features/out/" + children[i] + ".features");
				ret.createNewFile();
				File f = new File("features/in/" + children[i]);
				log.debug("begin parsing child: " + f.getAbsolutePath());
				to = rs.createResource(URI.createURI("features/out/"
						+ children[i] + ".features"));
				FileReader reader = new FileReader(f);
				Document newDoc = sxb.build(reader);
				DocumentRoot root = _0Factory.eINSTANCE.createDocumentRoot();
				FeaturesRoot modelRoot = parseDoc(newDoc, rs, root);
				root.setFeatures(modelRoot);
				to.getContents().add(root);
				to.save(Collections.emptyMap());
				reader.close();
				log.debug("saved child:" + children[i]);
				toRet.add(modelRoot);
			} catch (Exception e) {
				log.error(e);
			}
		}
		return toRet;
	}

	private static FeaturesRoot parseDoc(Document body, ResourceSet rs,
			DocumentRoot root) {
		FeaturesRoot rootMod = _0Factory.eINSTANCE.createFeaturesRoot();

		for (Element elt : body.getRootElement().getChildren()) {
			log.debug("parsing repositories");
			if (elt.getName().equals("repository")) {
				String url = elt.getValue();
				rootMod.getRepository().add(url);
			} else if (elt.getName().equals("feature")) {
				Feature feat = _0Factory.eINSTANCE.createFeature();
				feat.setName(elt.getAttributeValue("name"));
				feat.setVersion(elt.getAttributeValue("version"));
				for (Element child : elt.getChildren()) {
					if (child.getName().equals("bundle")) {
						Bundle b = _0Factory.eINSTANCE.createBundle();
						b.setValue(child.getValue().trim());
						if (null != child.getAttributeValue("start-level"))
							b.setStartLevel(Integer.valueOf(child
									.getAttributeValue("start-level")));
						if (null != child.getAttributeValue("dependency") && child.getAttributeValue(
								"dependency").equals("true")) {
							
							b.setDependency(true);
					}
						feat.getBundle().add(b);
					} else if (child.getName().equals("feature")) {
						Dependency dep = _0Factory.eINSTANCE.createDependency();
						if (null != child.getAttributeValue("version"))
							dep.setVersion(child.getAttributeValue("version").trim());

						dep.setValue(child.getValue().trim());
						feat.getFeature().add(dep);
					}
				}
				rootMod.getFeature().add(feat);
			}

		}
		return rootMod;

	}

	

}
