/**
 */
package org.eclipse.virgo.schema.plan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.virgo.schema.plan.Plan#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.virgo.schema.plan.Plan#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.virgo.schema.plan.Plan#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.eclipse.virgo.schema.plan.Plan#isAtomic <em>Atomic</em>}</li>
 *   <li>{@link org.eclipse.virgo.schema.plan.Plan#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.virgo.schema.plan.Plan#getProvisioning <em>Provisioning</em>}</li>
 *   <li>{@link org.eclipse.virgo.schema.plan.Plan#isScoped <em>Scoped</em>}</li>
 *   <li>{@link org.eclipse.virgo.schema.plan.Plan#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.virgo.schema.plan.PlanPackage#getPlan()
 * @model extendedMetaData="name='plan' kind='elementOnly'"
 * @generated
 */
public interface Plan extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attributes for this plan
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(AttributesType)
	 * @see org.eclipse.virgo.schema.plan.PlanPackage#getPlan_Attributes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attributes' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributesType getAttributes();

	/**
	 * Sets the value of the '{@link org.eclipse.virgo.schema.plan.Plan#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(AttributesType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.virgo.schema.plan.PlanPackage#getPlan_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.virgo.schema.plan.ArtifactType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An artifact to include as part of this plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference list.
	 * @see org.eclipse.virgo.schema.plan.PlanPackage#getPlan_Artifact()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ArtifactType> getArtifact();

	/**
	 * Returns the value of the '<em><b>Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the lifecycle of the artifacts in the plan should be tied together. Making a plan atomic means that install, start, stop and uninstall events for a single artifact in the plan will be escalated to all artifacts in the plan. Also, in an atomic plan, Virgo prevents artifacts from being in inconsistent states. For example, if one artifact should fail to start, then Virgo will stop all artifacts in the plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Atomic</em>' attribute.
	 * @see #isSetAtomic()
	 * @see #unsetAtomic()
	 * @see #setAtomic(boolean)
	 * @see org.eclipse.virgo.schema.plan.PlanPackage#getPlan_Atomic()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='atomic'"
	 * @generated
	 */
	boolean isAtomic();

	/**
	 * Sets the value of the '{@link org.eclipse.virgo.schema.plan.Plan#isAtomic <em>Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atomic</em>' attribute.
	 * @see #isSetAtomic()
	 * @see #unsetAtomic()
	 * @see #isAtomic()
	 * @generated
	 */
	void setAtomic(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.virgo.schema.plan.Plan#isAtomic <em>Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAtomic()
	 * @see #isAtomic()
	 * @see #setAtomic(boolean)
	 * @generated
	 */
	void unsetAtomic();

	/**
	 * Returns whether the value of the '{@link org.eclipse.virgo.schema.plan.Plan#isAtomic <em>Atomic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Atomic</em>' attribute is set.
	 * @see #unsetAtomic()
	 * @see #isAtomic()
	 * @see #setAtomic(boolean)
	 * @generated
	 */
	boolean isSetAtomic();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of this plan.
	 * This is one component of the unique identifier for this plan along with a type of 'plan' and a specified version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.virgo.schema.plan.PlanPackage#getPlan_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.virgo.schema.plan.Plan#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provisioning</b></em>' attribute.
	 * The default value is <code>"inherit"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether Virgo installs bundles from the repository to attempt to satisfy any missing dependencies in the plan. A value of 'auto' instructs Virgo to install bundles from the repository to attempt to satisfy any missing dependencies in the plan. This is known as 'auto-provisioning'. A value of 'disabled' prevents Virgo from installing bundles from the repository to attempt to satisfy any missing	dependencies in the plan. A value of 'inherit', which is the default if no value is specified, inherits the parent plan's provisioning behaviour. If the plan does not have a parent, it inherits Virgo's auto-provisioning behaviour.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provisioning</em>' attribute.
	 * @see #isSetProvisioning()
	 * @see #unsetProvisioning()
	 * @see #setProvisioning(String)
	 * @see org.eclipse.virgo.schema.plan.PlanPackage#getPlan_Provisioning()
	 * @model default="inherit" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='provisioning'"
	 * @generated
	 */
	String getProvisioning();

	/**
	 * Sets the value of the '{@link org.eclipse.virgo.schema.plan.Plan#getProvisioning <em>Provisioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provisioning</em>' attribute.
	 * @see #isSetProvisioning()
	 * @see #unsetProvisioning()
	 * @see #getProvisioning()
	 * @generated
	 */
	void setProvisioning(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.virgo.schema.plan.Plan#getProvisioning <em>Provisioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProvisioning()
	 * @see #getProvisioning()
	 * @see #setProvisioning(String)
	 * @generated
	 */
	void unsetProvisioning();

	/**
	 * Returns whether the value of the '{@link org.eclipse.virgo.schema.plan.Plan#getProvisioning <em>Provisioning</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Provisioning</em>' attribute is set.
	 * @see #unsetProvisioning()
	 * @see #getProvisioning()
	 * @see #setProvisioning(String)
	 * @generated
	 */
	boolean isSetProvisioning();

	/**
	 * Returns the value of the '<em><b>Scoped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the artifacts in the plan should be installed into a plan-specific scope. When scoping is disabled, the artifacts are deployed into the global scope and are available for access by all other artifacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scoped</em>' attribute.
	 * @see #isSetScoped()
	 * @see #unsetScoped()
	 * @see #setScoped(boolean)
	 * @see org.eclipse.virgo.schema.plan.PlanPackage#getPlan_Scoped()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='scoped'"
	 * @generated
	 */
	boolean isScoped();

	/**
	 * Sets the value of the '{@link org.eclipse.virgo.schema.plan.Plan#isScoped <em>Scoped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped</em>' attribute.
	 * @see #isSetScoped()
	 * @see #unsetScoped()
	 * @see #isScoped()
	 * @generated
	 */
	void setScoped(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.virgo.schema.plan.Plan#isScoped <em>Scoped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScoped()
	 * @see #isScoped()
	 * @see #setScoped(boolean)
	 * @generated
	 */
	void unsetScoped();

	/**
	 * Returns whether the value of the '{@link org.eclipse.virgo.schema.plan.Plan#isScoped <em>Scoped</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scoped</em>' attribute is set.
	 * @see #unsetScoped()
	 * @see #isScoped()
	 * @see #setScoped(boolean)
	 * @generated
	 */
	boolean isSetScoped();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of this plan.
	 * This version must meet the OSGi version specification. This is one component of the unique identifier for this plan along with a type of 'plan' and a specified name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.virgo.schema.plan.PlanPackage#getPlan_Version()
	 * @model dataType="org.eclipse.virgo.schema.plan.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.virgo.schema.plan.Plan#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Plan
