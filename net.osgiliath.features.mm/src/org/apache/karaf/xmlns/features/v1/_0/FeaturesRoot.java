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
 * A representation of the model object '<em><b>Features Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * Root element of Feature definition. It contains optional attribute which allow
 *  name of repository. This name will be used in shell to display source repository
 *  of given feature.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.FeaturesRoot#getGroup <em>Group</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.FeaturesRoot#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.FeaturesRoot#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.FeaturesRoot#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getFeaturesRoot()
 * @model extendedMetaData="name='featuresRoot' kind='elementOnly'"
 * @generated
 */
public interface FeaturesRoot extends EObject {
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
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getFeaturesRoot_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Additional repositories where dependencies are stored.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository</em>' attribute list.
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getFeaturesRoot_Repository()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='repository' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getRepository();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link org.apache.karaf.xmlns.features.v1._0.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  
	 *  Feature definition.
	 *  
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getFeaturesRoot_Feature()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='feature' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Feature> getFeature();

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
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getFeaturesRoot_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.apache.karaf.xmlns.features.v1._0.FeaturesRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FeaturesRoot
