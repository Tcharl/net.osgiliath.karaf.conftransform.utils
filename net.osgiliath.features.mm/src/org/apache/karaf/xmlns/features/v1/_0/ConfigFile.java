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
 * A representation of the model object '<em><b>Config File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * Additional configuration files which should be created during feature installation.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.ConfigFile#getValue <em>Value</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.ConfigFile#getFinalname <em>Finalname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getConfigFile()
 * @model extendedMetaData="name='configFile' kind='simple'"
 * @generated
 */
public interface ConfigFile extends EObject {
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
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getConfigFile_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.apache.karaf.xmlns.features.v1._0.ConfigFile#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Finalname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 
	 * Name of file name where given deployable element should be stored.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finalname</em>' attribute.
	 * @see #setFinalname(String)
	 * @see org.apache.karaf.xmlns.features.v1._0._0Package#getConfigFile_Finalname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='finalname'"
	 * @generated
	 */
	String getFinalname();

	/**
	 * Sets the value of the '{@link org.apache.karaf.xmlns.features.v1._0.ConfigFile#getFinalname <em>Finalname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalname</em>' attribute.
	 * @see #getFinalname()
	 * @generated
	 */
	void setFinalname(String value);

} // ConfigFile
