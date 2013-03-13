/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.karaf.xmlns.features.v1._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *  
 *  Definition of the Feature.
 *  
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.Feature#getGroup <em>Group</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.Feature#getDetails <em>Details</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.Feature#getConfig <em>Config</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.Feature#getConfigfile <em>Configfile</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.Feature#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.Feature#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.Feature#getDescription <em>Description</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.Feature#getName <em>Name</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.Feature#getResolver <em>Resolver</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.Feature#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getFeature()
 * @model extendedMetaData="name='feature' kind='elementOnly'"
 * @generated
 */
public interface Feature extends EObject {
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
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getFeature_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Details</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Long info displayed in features:info command result.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Details</em>' attribute list.
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getFeature_Details()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='details' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getDetails();

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference list.
	 * The list contents are of type {@link org.apache.karaf.xmlns.features.v1._0.Config}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference list.
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getFeature_Config()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='config' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Config> getConfig();

	/**
	 * Returns the value of the '<em><b>Configfile</b></em>' containment reference list.
	 * The list contents are of type {@link org.apache.karaf.xmlns.features.v1._0.ConfigFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configfile</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configfile</em>' containment reference list.
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getFeature_Configfile()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='configfile' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ConfigFile> getConfigfile();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link org.apache.karaf.xmlns.features.v1._0.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getFeature_Feature()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='feature' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Dependency> getFeature();

	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' containment reference list.
	 * The list contents are of type {@link org.apache.karaf.xmlns.features.v1._0.Bundle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle</em>' containment reference list.
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getFeature_Bundle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bundle' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Bundle> getBundle();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getFeature_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.apache.karaf.xmlns.features.v1._0.Feature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getFeature_Name()
	 * @model dataType="org.apache.karaf.xmlns.features.v1._0.FeatureName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.apache.karaf.xmlns.features.v1._0.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resolver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  
	 *  Karaf allow using dynamic resolvers.
	 *  
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolver</em>' attribute.
	 * @see #setResolver(String)
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getFeature_Resolver()
	 * @model dataType="org.apache.karaf.xmlns.features.v1._0.Resolver"
	 *        extendedMetaData="kind='attribute' name='resolver'"
	 * @generated
	 */
	String getResolver();

	/**
	 * Sets the value of the '{@link org.apache.karaf.xmlns.features.v1._0.Feature#getResolver <em>Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolver</em>' attribute.
	 * @see #getResolver()
	 * @generated
	 */
	void setResolver(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"0.0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getFeature_Version()
	 * @model default="0.0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.apache.karaf.xmlns.features.v1._0.Feature#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Unsets the value of the '{@link org.apache.karaf.xmlns.features.v1._0.Feature#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link org.apache.karaf.xmlns.features.v1._0.Feature#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // Feature
