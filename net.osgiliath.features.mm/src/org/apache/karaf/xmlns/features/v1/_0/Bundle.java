/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.karaf.xmlns.features.v1._0;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *  
 *  Deployable element to install.
 *  
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.Bundle#getValue <em>Value</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.Bundle#isDependency <em>Dependency</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.Bundle#isStart <em>Start</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.Bundle#getStartLevel <em>Start Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getBundle()
 * @model extendedMetaData="name='bundle' kind='simple'"
 * @generated
 */
public interface Bundle extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getBundle_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.apache.karaf.xmlns.features.v1._0.Bundle#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  
	 *  Mark bundle as dependency for resolver.
	 *  
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependency</em>' attribute.
	 * @see #isSetDependency()
	 * @see #unsetDependency()
	 * @see #setDependency(boolean)
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getBundle_Dependency()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='dependency'"
	 * @generated
	 */
	boolean isDependency();

	/**
	 * Sets the value of the '{@link org.apache.karaf.xmlns.features.v1._0.Bundle#isDependency <em>Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' attribute.
	 * @see #isSetDependency()
	 * @see #unsetDependency()
	 * @see #isDependency()
	 * @generated
	 */
	void setDependency(boolean value);

	/**
	 * Unsets the value of the '{@link org.apache.karaf.xmlns.features.v1._0.Bundle#isDependency <em>Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDependency()
	 * @see #isDependency()
	 * @see #setDependency(boolean)
	 * @generated
	 */
	void unsetDependency();

	/**
	 * Returns whether the value of the '{@link org.apache.karaf.xmlns.features.v1._0.Bundle#isDependency <em>Dependency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dependency</em>' attribute is set.
	 * @see #unsetDependency()
	 * @see #isDependency()
	 * @see #setDependency(boolean)
	 * @generated
	 */
	boolean isSetDependency();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * This switch allow you to leave bundle in resolved state.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #isSetStart()
	 * @see #unsetStart()
	 * @see #setStart(boolean)
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getBundle_Start()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='start'"
	 * @generated
	 */
	boolean isStart();

	/**
	 * Sets the value of the '{@link org.apache.karaf.xmlns.features.v1._0.Bundle#isStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #isSetStart()
	 * @see #unsetStart()
	 * @see #isStart()
	 * @generated
	 */
	void setStart(boolean value);

	/**
	 * Unsets the value of the '{@link org.apache.karaf.xmlns.features.v1._0.Bundle#isStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStart()
	 * @see #isStart()
	 * @see #setStart(boolean)
	 * @generated
	 */
	void unsetStart();

	/**
	 * Returns whether the value of the '{@link org.apache.karaf.xmlns.features.v1._0.Bundle#isStart <em>Start</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start</em>' attribute is set.
	 * @see #unsetStart()
	 * @see #isStart()
	 * @see #setStart(boolean)
	 * @generated
	 */
	boolean isSetStart();

	/**
	 * Returns the value of the '<em><b>Start Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *  
	 *  Bundle start level set to OSGi framework.
	 *  
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Level</em>' attribute.
	 * @see #isSetStartLevel()
	 * @see #unsetStartLevel()
	 * @see #setStartLevel(int)
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getBundle_StartLevel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='start-level'"
	 * @generated
	 */
	int getStartLevel();

	/**
	 * Sets the value of the '{@link org.apache.karaf.xmlns.features.v1._0.Bundle#getStartLevel <em>Start Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Level</em>' attribute.
	 * @see #isSetStartLevel()
	 * @see #unsetStartLevel()
	 * @see #getStartLevel()
	 * @generated
	 */
	void setStartLevel(int value);

	/**
	 * Unsets the value of the '{@link org.apache.karaf.xmlns.features.v1._0.Bundle#getStartLevel <em>Start Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartLevel()
	 * @see #getStartLevel()
	 * @see #setStartLevel(int)
	 * @generated
	 */
	void unsetStartLevel();

	/**
	 * Returns whether the value of the '{@link org.apache.karaf.xmlns.features.v1._0.Bundle#getStartLevel <em>Start Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Level</em>' attribute is set.
	 * @see #unsetStartLevel()
	 * @see #getStartLevel()
	 * @see #setStartLevel(int)
	 * @generated
	 */
	boolean isSetStartLevel();

} // Bundle
