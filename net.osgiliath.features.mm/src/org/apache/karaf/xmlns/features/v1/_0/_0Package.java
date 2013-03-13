/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.karaf.xmlns.features.v1._0;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * 
 * Karaf features mechanism. For documentation please visit 
 *  <a href="http://karaf.apache.org/">Karaf website</a>.
 * 
 * 
 * <!-- end-model-doc -->
 * @see org.apache.karaf.xmlns.features.v1._0._0Factory
 * @model kind="package"
 * @generated
 */
public interface _0Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_0";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://karaf.apache.org/xmlns/features/v1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_0";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_0Package eINSTANCE = org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.apache.karaf.xmlns.features.v1._0.impl.BundleImpl <em>Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.karaf.xmlns.features.v1._0.impl.BundleImpl
	 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__START = 2;

	/**
	 * The feature id for the '<em><b>Start Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__START_LEVEL = 3;

	/**
	 * The number of structural features of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.apache.karaf.xmlns.features.v1._0.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.karaf.xmlns.features.v1._0.impl.ConfigImpl
	 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__NAME = 1;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.apache.karaf.xmlns.features.v1._0.impl.ConfigFileImpl <em>Config File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.karaf.xmlns.features.v1._0.impl.ConfigFileImpl
	 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getConfigFile()
	 * @generated
	 */
	int CONFIG_FILE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FILE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Finalname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FILE__FINALNAME = 1;

	/**
	 * The number of structural features of the '<em>Config File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FILE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.apache.karaf.xmlns.features.v1._0.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.karaf.xmlns.features.v1._0.impl.DependencyImpl
	 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.apache.karaf.xmlns.features.v1._0.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.karaf.xmlns.features.v1._0.impl.DocumentRootImpl
	 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEATURES = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.apache.karaf.xmlns.features.v1._0.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.karaf.xmlns.features.v1._0.impl.FeatureImpl
	 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DETAILS = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Configfile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONFIGFILE = 3;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BUNDLE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Resolver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__RESOLVER = 8;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VERSION = 9;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.apache.karaf.xmlns.features.v1._0.impl.FeaturesRootImpl <em>Features Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.karaf.xmlns.features.v1._0.impl.FeaturesRootImpl
	 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getFeaturesRoot()
	 * @generated
	 */
	int FEATURES_ROOT = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_ROOT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_ROOT__REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_ROOT__FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_ROOT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Features Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '<em>Feature Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getFeatureName()
	 * @generated
	 */
	int FEATURE_NAME = 7;

	/**
	 * The meta object id for the '<em>Resolver</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getResolver()
	 * @generated
	 */
	int RESOLVER = 8;


	/**
	 * Returns the meta object for class '{@link org.apache.karaf.xmlns.features.v1._0.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Bundle
	 * @generated
	 */
	EClass getBundle();

	/**
	 * Returns the meta object for the attribute '{@link org.apache.karaf.xmlns.features.v1._0.Bundle#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Bundle#getValue()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.apache.karaf.xmlns.features.v1._0.Bundle#isDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependency</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Bundle#isDependency()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Dependency();

	/**
	 * Returns the meta object for the attribute '{@link org.apache.karaf.xmlns.features.v1._0.Bundle#isStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Bundle#isStart()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.apache.karaf.xmlns.features.v1._0.Bundle#getStartLevel <em>Start Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Level</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Bundle#getStartLevel()
	 * @see #getBundle()
	 * @generated
	 */
	EAttribute getBundle_StartLevel();

	/**
	 * Returns the meta object for class '{@link org.apache.karaf.xmlns.features.v1._0.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.apache.karaf.xmlns.features.v1._0.Config#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Config#getValue()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.apache.karaf.xmlns.features.v1._0.Config#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Config#getName()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Name();

	/**
	 * Returns the meta object for class '{@link org.apache.karaf.xmlns.features.v1._0.ConfigFile <em>Config File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config File</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.ConfigFile
	 * @generated
	 */
	EClass getConfigFile();

	/**
	 * Returns the meta object for the attribute '{@link org.apache.karaf.xmlns.features.v1._0.ConfigFile#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.ConfigFile#getValue()
	 * @see #getConfigFile()
	 * @generated
	 */
	EAttribute getConfigFile_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.apache.karaf.xmlns.features.v1._0.ConfigFile#getFinalname <em>Finalname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finalname</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.ConfigFile#getFinalname()
	 * @see #getConfigFile()
	 * @generated
	 */
	EAttribute getConfigFile_Finalname();

	/**
	 * Returns the meta object for class '{@link org.apache.karaf.xmlns.features.v1._0.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the attribute '{@link org.apache.karaf.xmlns.features.v1._0.Dependency#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Dependency#getValue()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.apache.karaf.xmlns.features.v1._0.Dependency#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Dependency#getVersion()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Version();

	/**
	 * Returns the meta object for class '{@link org.apache.karaf.xmlns.features.v1._0.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.apache.karaf.xmlns.features.v1._0.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.apache.karaf.xmlns.features.v1._0.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.apache.karaf.xmlns.features.v1._0.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.apache.karaf.xmlns.features.v1._0.DocumentRoot#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Features</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.DocumentRoot#getFeatures()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Features();

	/**
	 * Returns the meta object for class '{@link org.apache.karaf.xmlns.features.v1._0.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute list '{@link org.apache.karaf.xmlns.features.v1._0.Feature#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Feature#getGroup()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.apache.karaf.xmlns.features.v1._0.Feature#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Details</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Feature#getDetails()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Details();

	/**
	 * Returns the meta object for the containment reference list '{@link org.apache.karaf.xmlns.features.v1._0.Feature#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Feature#getConfig()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Config();

	/**
	 * Returns the meta object for the containment reference list '{@link org.apache.karaf.xmlns.features.v1._0.Feature#getConfigfile <em>Configfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configfile</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Feature#getConfigfile()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Configfile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.apache.karaf.xmlns.features.v1._0.Feature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Feature#getFeature()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.apache.karaf.xmlns.features.v1._0.Feature#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundle</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Feature#getBundle()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Bundle();

	/**
	 * Returns the meta object for the attribute '{@link org.apache.karaf.xmlns.features.v1._0.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.apache.karaf.xmlns.features.v1._0.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.apache.karaf.xmlns.features.v1._0.Feature#getResolver <em>Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolver</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Feature#getResolver()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Resolver();

	/**
	 * Returns the meta object for the attribute '{@link org.apache.karaf.xmlns.features.v1._0.Feature#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.Feature#getVersion()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Version();

	/**
	 * Returns the meta object for class '{@link org.apache.karaf.xmlns.features.v1._0.FeaturesRoot <em>Features Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Features Root</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.FeaturesRoot
	 * @generated
	 */
	EClass getFeaturesRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.apache.karaf.xmlns.features.v1._0.FeaturesRoot#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.FeaturesRoot#getGroup()
	 * @see #getFeaturesRoot()
	 * @generated
	 */
	EAttribute getFeaturesRoot_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.apache.karaf.xmlns.features.v1._0.FeaturesRoot#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Repository</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.FeaturesRoot#getRepository()
	 * @see #getFeaturesRoot()
	 * @generated
	 */
	EAttribute getFeaturesRoot_Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.apache.karaf.xmlns.features.v1._0.FeaturesRoot#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.FeaturesRoot#getFeature()
	 * @see #getFeaturesRoot()
	 * @generated
	 */
	EReference getFeaturesRoot_Feature();

	/**
	 * Returns the meta object for the attribute '{@link org.apache.karaf.xmlns.features.v1._0.FeaturesRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.apache.karaf.xmlns.features.v1._0.FeaturesRoot#getName()
	 * @see #getFeaturesRoot()
	 * @generated
	 */
	EAttribute getFeaturesRoot_Name();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Feature Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='featureName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1'"
	 * @generated
	 */
	EDataType getFeatureName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resolver</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='resolver' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1'"
	 * @generated
	 */
	EDataType getResolver();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_0Factory get_0Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.apache.karaf.xmlns.features.v1._0.impl.BundleImpl <em>Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.karaf.xmlns.features.v1._0.impl.BundleImpl
		 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getBundle()
		 * @generated
		 */
		EClass BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__VALUE = eINSTANCE.getBundle_Value();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__DEPENDENCY = eINSTANCE.getBundle_Dependency();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__START = eINSTANCE.getBundle_Start();

		/**
		 * The meta object literal for the '<em><b>Start Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE__START_LEVEL = eINSTANCE.getBundle_StartLevel();

		/**
		 * The meta object literal for the '{@link org.apache.karaf.xmlns.features.v1._0.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.karaf.xmlns.features.v1._0.impl.ConfigImpl
		 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__VALUE = eINSTANCE.getConfig_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__NAME = eINSTANCE.getConfig_Name();

		/**
		 * The meta object literal for the '{@link org.apache.karaf.xmlns.features.v1._0.impl.ConfigFileImpl <em>Config File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.karaf.xmlns.features.v1._0.impl.ConfigFileImpl
		 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getConfigFile()
		 * @generated
		 */
		EClass CONFIG_FILE = eINSTANCE.getConfigFile();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_FILE__VALUE = eINSTANCE.getConfigFile_Value();

		/**
		 * The meta object literal for the '<em><b>Finalname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_FILE__FINALNAME = eINSTANCE.getConfigFile_Finalname();

		/**
		 * The meta object literal for the '{@link org.apache.karaf.xmlns.features.v1._0.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.karaf.xmlns.features.v1._0.impl.DependencyImpl
		 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__VALUE = eINSTANCE.getDependency_Value();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__VERSION = eINSTANCE.getDependency_Version();

		/**
		 * The meta object literal for the '{@link org.apache.karaf.xmlns.features.v1._0.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.karaf.xmlns.features.v1._0.impl.DocumentRootImpl
		 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FEATURES = eINSTANCE.getDocumentRoot_Features();

		/**
		 * The meta object literal for the '{@link org.apache.karaf.xmlns.features.v1._0.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.karaf.xmlns.features.v1._0.impl.FeatureImpl
		 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__GROUP = eINSTANCE.getFeature_Group();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DETAILS = eINSTANCE.getFeature_Details();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CONFIG = eINSTANCE.getFeature_Config();

		/**
		 * The meta object literal for the '<em><b>Configfile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CONFIGFILE = eINSTANCE.getFeature_Configfile();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURE = eINSTANCE.getFeature_Feature();

		/**
		 * The meta object literal for the '<em><b>Bundle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__BUNDLE = eINSTANCE.getFeature_Bundle();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Resolver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__RESOLVER = eINSTANCE.getFeature_Resolver();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__VERSION = eINSTANCE.getFeature_Version();

		/**
		 * The meta object literal for the '{@link org.apache.karaf.xmlns.features.v1._0.impl.FeaturesRootImpl <em>Features Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.karaf.xmlns.features.v1._0.impl.FeaturesRootImpl
		 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getFeaturesRoot()
		 * @generated
		 */
		EClass FEATURES_ROOT = eINSTANCE.getFeaturesRoot();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURES_ROOT__GROUP = eINSTANCE.getFeaturesRoot_Group();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURES_ROOT__REPOSITORY = eINSTANCE.getFeaturesRoot_Repository();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURES_ROOT__FEATURE = eINSTANCE.getFeaturesRoot_Feature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURES_ROOT__NAME = eINSTANCE.getFeaturesRoot_Name();

		/**
		 * The meta object literal for the '<em>Feature Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getFeatureName()
		 * @generated
		 */
		EDataType FEATURE_NAME = eINSTANCE.getFeatureName();

		/**
		 * The meta object literal for the '<em>Resolver</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.apache.karaf.xmlns.features.v1._0.impl._0PackageImpl#getResolver()
		 * @generated
		 */
		EDataType RESOLVER = eINSTANCE.getResolver();

	}

} //_0Package
