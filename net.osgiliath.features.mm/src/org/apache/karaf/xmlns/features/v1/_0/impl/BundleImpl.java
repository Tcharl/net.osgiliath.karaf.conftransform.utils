/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.karaf.xmlns.features.v1._0.impl;

import org.apache.karaf.xmlns.features.v1._0.Bundle;
import org.apache.karaf.xmlns.features.v1._0._0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.impl.BundleImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.impl.BundleImpl#isDependency <em>Dependency</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.impl.BundleImpl#isStart <em>Start</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.impl.BundleImpl#getStartLevel <em>Start Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BundleImpl extends EObjectImpl implements Bundle {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDependency() <em>Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDependency()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEPENDENCY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDependency() <em>Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDependency()
	 * @generated
	 * @ordered
	 */
	protected boolean dependency = DEPENDENCY_EDEFAULT;

	/**
	 * This is true if the Dependency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dependencyESet;

	/**
	 * The default value of the '{@link #isStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStart()
	 * @generated
	 * @ordered
	 */
	protected boolean start = START_EDEFAULT;

	/**
	 * This is true if the Start attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startESet;

	/**
	 * The default value of the '{@link #getStartLevel() <em>Start Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int START_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartLevel() <em>Start Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLevel()
	 * @generated
	 * @ordered
	 */
	protected int startLevel = START_LEVEL_EDEFAULT;

	/**
	 * This is true if the Start Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startLevelESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BundleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.BUNDLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.BUNDLE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependency() {
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependency(boolean newDependency) {
		boolean oldDependency = dependency;
		dependency = newDependency;
		boolean oldDependencyESet = dependencyESet;
		dependencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.BUNDLE__DEPENDENCY, oldDependency, dependency, !oldDependencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDependency() {
		boolean oldDependency = dependency;
		boolean oldDependencyESet = dependencyESet;
		dependency = DEPENDENCY_EDEFAULT;
		dependencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.BUNDLE__DEPENDENCY, oldDependency, DEPENDENCY_EDEFAULT, oldDependencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDependency() {
		return dependencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(boolean newStart) {
		boolean oldStart = start;
		start = newStart;
		boolean oldStartESet = startESet;
		startESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.BUNDLE__START, oldStart, start, !oldStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStart() {
		boolean oldStart = start;
		boolean oldStartESet = startESet;
		start = START_EDEFAULT;
		startESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.BUNDLE__START, oldStart, START_EDEFAULT, oldStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStart() {
		return startESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartLevel() {
		return startLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLevel(int newStartLevel) {
		int oldStartLevel = startLevel;
		startLevel = newStartLevel;
		boolean oldStartLevelESet = startLevelESet;
		startLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.BUNDLE__START_LEVEL, oldStartLevel, startLevel, !oldStartLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartLevel() {
		int oldStartLevel = startLevel;
		boolean oldStartLevelESet = startLevelESet;
		startLevel = START_LEVEL_EDEFAULT;
		startLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.BUNDLE__START_LEVEL, oldStartLevel, START_LEVEL_EDEFAULT, oldStartLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartLevel() {
		return startLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _0Package.BUNDLE__VALUE:
				return getValue();
			case _0Package.BUNDLE__DEPENDENCY:
				return isDependency();
			case _0Package.BUNDLE__START:
				return isStart();
			case _0Package.BUNDLE__START_LEVEL:
				return getStartLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.BUNDLE__VALUE:
				setValue((String)newValue);
				return;
			case _0Package.BUNDLE__DEPENDENCY:
				setDependency((Boolean)newValue);
				return;
			case _0Package.BUNDLE__START:
				setStart((Boolean)newValue);
				return;
			case _0Package.BUNDLE__START_LEVEL:
				setStartLevel((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _0Package.BUNDLE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case _0Package.BUNDLE__DEPENDENCY:
				unsetDependency();
				return;
			case _0Package.BUNDLE__START:
				unsetStart();
				return;
			case _0Package.BUNDLE__START_LEVEL:
				unsetStartLevel();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _0Package.BUNDLE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case _0Package.BUNDLE__DEPENDENCY:
				return isSetDependency();
			case _0Package.BUNDLE__START:
				return isSetStart();
			case _0Package.BUNDLE__START_LEVEL:
				return isSetStartLevel();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", dependency: ");
		if (dependencyESet) result.append(dependency); else result.append("<unset>");
		result.append(", start: ");
		if (startESet) result.append(start); else result.append("<unset>");
		result.append(", startLevel: ");
		if (startLevelESet) result.append(startLevel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BundleImpl
