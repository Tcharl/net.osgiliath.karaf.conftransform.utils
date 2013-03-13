package org.eclipse.aether.examples.util;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.maven.pom._4._0.DependenciesType;
import org.apache.maven.pom._4._0.DependenciesType1;
import org.apache.maven.pom._4._0.Dependency;
import org.apache.maven.pom._4._0.PropertiesType2;
import org.apache.maven.pom._4._0._0Factory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.sonatype.aether.graph.DependencyNode;
import org.sonatype.aether.graph.DependencyVisitor;

public class MavenModelDependencyGraphDumper 
	 implements DependencyVisitor
	 {
	private static Logger log = Logger.getLogger(MavenModelDependencyGraphDumper.class.getSimpleName());
	private PropertiesType2 properties;
	private DependenciesType1 depsMngmt;
	private DependenciesType deps;
	private EObject artifactItemsObject;
	private EPackage artifactItemsPackage;
	public void setArtifactItemsPackage(EPackage artifactItemsPackage) {
		this.artifactItemsPackage = artifactItemsPackage;
	}



	private static String VERSION_SUFFIX = ".version";
	private ExtendedMetaData extendedMetaData;


		public void setArtifactItemsObject(EObject artifactItemsObject) {
		this.artifactItemsObject = artifactItemsObject;
	}

		public void setExtendedMetaData(ExtendedMetaData extendedMetaData) {
		this.extendedMetaData = extendedMetaData;
	}

		public void setProperties(PropertiesType2 properties) {
		this.properties = properties;
	}

	public void setDepsMngmt(DependenciesType1 depsMngmt) {
		this.depsMngmt = depsMngmt;
	}

	public void setDeps(DependenciesType deps) {
		this.deps = deps;
	}

	

//		private PrintStream out;

	     private String currentIndent = "";

	     public MavenModelDependencyGraphDumper()
	     {
	       //  this( null );
	     }

//	     public ConsoleDependencyGraphDumper( PrintStream out )
//	     {
//	         this.out = ( out != null ) ? out : System.out;
//	     }

	     public boolean visitEnter( DependencyNode node )
	     {
	    	 log.debug(currentIndent + node);
	         //out.println( currentIndent + node );
	         if ( currentIndent.length() <= 0 )
	         {
	             currentIndent = "+- ";
	         }
	         else
	         {
	             currentIndent = "|  " + currentIndent;
	             Dependency depMngmt = _0Factory.eINSTANCE.createDependency();
	 			depMngmt.setGroupId(node.getDependency().getArtifact().getGroupId());
	 			depMngmt.setArtifactId(node.getDependency().getArtifact().getArtifactId());
	 			depMngmt.setVersion("${"+node.getDependency().getArtifact().getArtifactId() + VERSION_SUFFIX+"}");
	 			this.depsMngmt.getDependency().add(depMngmt);
	 			Dependency dep = _0Factory.eINSTANCE.createDependency();
				dep.setGroupId(node.getDependency().getArtifact().getGroupId());
				dep.setArtifactId(node.getDependency().getArtifact().getArtifactId());
				dep.setScope("provided");
				this.deps.getDependency().add(dep);
				EStructuralFeature pro = extendedMetaData.demandFeature(
						null, node.getDependency().getArtifact().getArtifactId() + VERSION_SUFFIX, true);
				AnyType proValue = XMLTypeFactory.eINSTANCE.createAnyType();
				FeatureMapUtil.addText(proValue.getAny(), node.getDependency().getArtifact().getVersion().trim());
				this.properties.getAny().add(pro, proValue);
				
				if (null != artifactItemsObject) {
					EFactory artifactItemsFactory = artifactItemsPackage.getEFactoryInstance();
					EClass artifactItemClass = (EClass) artifactItemsPackage.getEClassifier("artifactItemClass");
					EObject artifactItemObject = artifactItemsFactory.create(artifactItemClass);
					artifactItemObject.eSet(artifactItemClass.getEStructuralFeature("artifactId"),
							node.getDependency().getArtifact().getArtifactId());
					artifactItemObject.eSet(artifactItemClass.getEStructuralFeature("groupId"),
							node.getDependency().getArtifact().getGroupId());
					artifactItemObject.eSet(artifactItemClass.getEStructuralFeature("type"),
							"jar");
					artifactItemObject.eSet(artifactItemClass.getEStructuralFeature("overWrite"),
							"false");
					artifactItemObject.eSet(artifactItemClass.getEStructuralFeature("outputDirectory"),
							"${virgo.path}/repository/usr");
					EClass artifactsItems = (EClass) artifactItemsPackage.getEClassifier("artifactItemsClass");
					
					((List)artifactItemsObject.eGet(artifactsItems.getEStructuralFeature("artifactItem"))).add(artifactItemObject);
					
					
				}
				
				
	         }
	         
	         return true;
	     }

	     public boolean visitLeave( DependencyNode node )
	     {
	         currentIndent = currentIndent.substring( 3, currentIndent.length() );
	         return true;
	     }

}
