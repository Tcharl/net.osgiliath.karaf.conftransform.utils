/**
 */
package org.eclipse.virgo.schema.plan;

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
 * @see org.eclipse.virgo.schema.plan.PlanFactory
 * @model kind="package"
 * @generated
 */
public interface PlanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "plan";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/virgo/schema/plan";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "plan";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlanPackage eINSTANCE = org.eclipse.virgo.schema.plan.impl.PlanPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.virgo.schema.plan.impl.ArtifactTypeImpl <em>Artifact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.virgo.schema.plan.impl.ArtifactTypeImpl
	 * @see org.eclipse.virgo.schema.plan.impl.PlanPackageImpl#getArtifactType()
	 * @generated
	 */
	int ARTIFACT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE__VERSION = 4;

	/**
	 * The number of structural features of the '<em>Artifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.virgo.schema.plan.impl.AttributesTypeImpl <em>Attributes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.virgo.schema.plan.impl.AttributesTypeImpl
	 * @see org.eclipse.virgo.schema.plan.impl.PlanPackageImpl#getAttributesType()
	 * @generated
	 */
	int ATTRIBUTES_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TYPE__ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Attributes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.virgo.schema.plan.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.virgo.schema.plan.impl.DocumentRootImpl
	 * @see org.eclipse.virgo.schema.plan.impl.PlanPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

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
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLAN = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.virgo.schema.plan.impl.NameValueTypeImpl <em>Name Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.virgo.schema.plan.impl.NameValueTypeImpl
	 * @see org.eclipse.virgo.schema.plan.impl.PlanPackageImpl#getNameValueType()
	 * @generated
	 */
	int NAME_VALUE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_VALUE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_VALUE_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Name Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.virgo.schema.plan.impl.PlanImpl <em>Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.virgo.schema.plan.impl.PlanImpl
	 * @see org.eclipse.virgo.schema.plan.impl.PlanPackageImpl#getPlan()
	 * @generated
	 */
	int PLAN = 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__ARTIFACT = 2;

	/**
	 * The feature id for the '<em><b>Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__ATOMIC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__NAME = 4;

	/**
	 * The feature id for the '<em><b>Provisioning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__PROVISIONING = 5;

	/**
	 * The feature id for the '<em><b>Scoped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__SCOPED = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__VERSION = 7;

	/**
	 * The number of structural features of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '<em>Version Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.virgo.schema.plan.impl.PlanPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.virgo.schema.plan.ArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Type</em>'.
	 * @see org.eclipse.virgo.schema.plan.ArtifactType
	 * @generated
	 */
	EClass getArtifactType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.virgo.schema.plan.ArtifactType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.virgo.schema.plan.ArtifactType#getGroup()
	 * @see #getArtifactType()
	 * @generated
	 */
	EAttribute getArtifactType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.virgo.schema.plan.ArtifactType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.eclipse.virgo.schema.plan.ArtifactType#getProperty()
	 * @see #getArtifactType()
	 * @generated
	 */
	EReference getArtifactType_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.virgo.schema.plan.ArtifactType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.virgo.schema.plan.ArtifactType#getName()
	 * @see #getArtifactType()
	 * @generated
	 */
	EAttribute getArtifactType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.virgo.schema.plan.ArtifactType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.virgo.schema.plan.ArtifactType#getType()
	 * @see #getArtifactType()
	 * @generated
	 */
	EAttribute getArtifactType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.virgo.schema.plan.ArtifactType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.virgo.schema.plan.ArtifactType#getVersion()
	 * @see #getArtifactType()
	 * @generated
	 */
	EAttribute getArtifactType_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.virgo.schema.plan.AttributesType <em>Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes Type</em>'.
	 * @see org.eclipse.virgo.schema.plan.AttributesType
	 * @generated
	 */
	EClass getAttributesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.virgo.schema.plan.AttributesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.virgo.schema.plan.AttributesType#getGroup()
	 * @see #getAttributesType()
	 * @generated
	 */
	EAttribute getAttributesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.virgo.schema.plan.AttributesType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.eclipse.virgo.schema.plan.AttributesType#getAttribute()
	 * @see #getAttributesType()
	 * @generated
	 */
	EReference getAttributesType_Attribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.virgo.schema.plan.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.virgo.schema.plan.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.virgo.schema.plan.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.virgo.schema.plan.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.virgo.schema.plan.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.virgo.schema.plan.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.virgo.schema.plan.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.virgo.schema.plan.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.virgo.schema.plan.DocumentRoot#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan</em>'.
	 * @see org.eclipse.virgo.schema.plan.DocumentRoot#getPlan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Plan();

	/**
	 * Returns the meta object for class '{@link org.eclipse.virgo.schema.plan.NameValueType <em>Name Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Value Type</em>'.
	 * @see org.eclipse.virgo.schema.plan.NameValueType
	 * @generated
	 */
	EClass getNameValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.virgo.schema.plan.NameValueType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.virgo.schema.plan.NameValueType#getName()
	 * @see #getNameValueType()
	 * @generated
	 */
	EAttribute getNameValueType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.virgo.schema.plan.NameValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.virgo.schema.plan.NameValueType#getValue()
	 * @see #getNameValueType()
	 * @generated
	 */
	EAttribute getNameValueType_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.virgo.schema.plan.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan</em>'.
	 * @see org.eclipse.virgo.schema.plan.Plan
	 * @generated
	 */
	EClass getPlan();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.virgo.schema.plan.Plan#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.eclipse.virgo.schema.plan.Plan#getAttributes()
	 * @see #getPlan()
	 * @generated
	 */
	EReference getPlan_Attributes();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.virgo.schema.plan.Plan#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.virgo.schema.plan.Plan#getGroup()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.virgo.schema.plan.Plan#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact</em>'.
	 * @see org.eclipse.virgo.schema.plan.Plan#getArtifact()
	 * @see #getPlan()
	 * @generated
	 */
	EReference getPlan_Artifact();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.virgo.schema.plan.Plan#isAtomic <em>Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Atomic</em>'.
	 * @see org.eclipse.virgo.schema.plan.Plan#isAtomic()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Atomic();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.virgo.schema.plan.Plan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.virgo.schema.plan.Plan#getName()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.virgo.schema.plan.Plan#getProvisioning <em>Provisioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provisioning</em>'.
	 * @see org.eclipse.virgo.schema.plan.Plan#getProvisioning()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Provisioning();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.virgo.schema.plan.Plan#isScoped <em>Scoped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scoped</em>'.
	 * @see org.eclipse.virgo.schema.plan.Plan#isScoped()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Scoped();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.virgo.schema.plan.Plan#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.virgo.schema.plan.Plan#getVersion()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_Version();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='version_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='\\d+(\\.\\d+(\\.\\d+(\\.([\\w_-])+)?)?)?'"
	 * @generated
	 */
	EDataType getVersionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlanFactory getPlanFactory();

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
		 * The meta object literal for the '{@link org.eclipse.virgo.schema.plan.impl.ArtifactTypeImpl <em>Artifact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.virgo.schema.plan.impl.ArtifactTypeImpl
		 * @see org.eclipse.virgo.schema.plan.impl.PlanPackageImpl#getArtifactType()
		 * @generated
		 */
		EClass ARTIFACT_TYPE = eINSTANCE.getArtifactType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_TYPE__GROUP = eINSTANCE.getArtifactType_Group();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_TYPE__PROPERTY = eINSTANCE.getArtifactType_Property();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_TYPE__NAME = eINSTANCE.getArtifactType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_TYPE__TYPE = eINSTANCE.getArtifactType_Type();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_TYPE__VERSION = eINSTANCE.getArtifactType_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.virgo.schema.plan.impl.AttributesTypeImpl <em>Attributes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.virgo.schema.plan.impl.AttributesTypeImpl
		 * @see org.eclipse.virgo.schema.plan.impl.PlanPackageImpl#getAttributesType()
		 * @generated
		 */
		EClass ATTRIBUTES_TYPE = eINSTANCE.getAttributesType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES_TYPE__GROUP = eINSTANCE.getAttributesType_Group();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES_TYPE__ATTRIBUTE = eINSTANCE.getAttributesType_Attribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.virgo.schema.plan.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.virgo.schema.plan.impl.DocumentRootImpl
		 * @see org.eclipse.virgo.schema.plan.impl.PlanPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PLAN = eINSTANCE.getDocumentRoot_Plan();

		/**
		 * The meta object literal for the '{@link org.eclipse.virgo.schema.plan.impl.NameValueTypeImpl <em>Name Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.virgo.schema.plan.impl.NameValueTypeImpl
		 * @see org.eclipse.virgo.schema.plan.impl.PlanPackageImpl#getNameValueType()
		 * @generated
		 */
		EClass NAME_VALUE_TYPE = eINSTANCE.getNameValueType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_VALUE_TYPE__NAME = eINSTANCE.getNameValueType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_VALUE_TYPE__VALUE = eINSTANCE.getNameValueType_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.virgo.schema.plan.impl.PlanImpl <em>Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.virgo.schema.plan.impl.PlanImpl
		 * @see org.eclipse.virgo.schema.plan.impl.PlanPackageImpl#getPlan()
		 * @generated
		 */
		EClass PLAN = eINSTANCE.getPlan();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN__ATTRIBUTES = eINSTANCE.getPlan_Attributes();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__GROUP = eINSTANCE.getPlan_Group();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN__ARTIFACT = eINSTANCE.getPlan_Artifact();

		/**
		 * The meta object literal for the '<em><b>Atomic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__ATOMIC = eINSTANCE.getPlan_Atomic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__NAME = eINSTANCE.getPlan_Name();

		/**
		 * The meta object literal for the '<em><b>Provisioning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__PROVISIONING = eINSTANCE.getPlan_Provisioning();

		/**
		 * The meta object literal for the '<em><b>Scoped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__SCOPED = eINSTANCE.getPlan_Scoped();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__VERSION = eINSTANCE.getPlan_Version();

		/**
		 * The meta object literal for the '<em>Version Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.virgo.schema.plan.impl.PlanPackageImpl#getVersionType()
		 * @generated
		 */
		EDataType VERSION_TYPE = eINSTANCE.getVersionType();

	}

} //PlanPackage
