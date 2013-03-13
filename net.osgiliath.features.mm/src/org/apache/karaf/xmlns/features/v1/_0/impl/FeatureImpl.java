/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.karaf.xmlns.features.v1._0.impl;

import java.util.Collection;

import org.apache.karaf.xmlns.features.v1._0.Bundle;
import org.apache.karaf.xmlns.features.v1._0.Config;
import org.apache.karaf.xmlns.features.v1._0.ConfigFile;
import org.apache.karaf.xmlns.features.v1._0.Dependency;
import org.apache.karaf.xmlns.features.v1._0.Feature;
import org.apache.karaf.xmlns.features.v1._0._0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.impl.FeatureImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.impl.FeatureImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.impl.FeatureImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.impl.FeatureImpl#getConfigfile <em>Configfile</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.impl.FeatureImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.impl.FeatureImpl#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.impl.FeatureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.impl.FeatureImpl#getResolver <em>Resolver</em>}</li>
 *   <li>{@link org.apache.karaf.xmlns.features.v1._0.impl.FeatureImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends EObjectImpl implements Feature {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolver() <em>Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolver()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolver() <em>Resolver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolver()
	 * @generated
	 * @ordered
	 */
	protected String resolver = RESOLVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "0.0.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, _0Package.FEATURE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDetails() {
		return getGroup().list(_0Package.Literals.FEATURE__DETAILS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Config> getConfig() {
		return getGroup().list(_0Package.Literals.FEATURE__CONFIG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigFile> getConfigfile() {
		return getGroup().list(_0Package.Literals.FEATURE__CONFIGFILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getFeature() {
		return getGroup().list(_0Package.Literals.FEATURE__FEATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bundle> getBundle() {
		return getGroup().list(_0Package.Literals.FEATURE__BUNDLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.FEATURE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResolver() {
		return resolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolver(String newResolver) {
		String oldResolver = resolver;
		resolver = newResolver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.FEATURE__RESOLVER, oldResolver, resolver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.FEATURE__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion() {
		String oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.FEATURE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.FEATURE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case _0Package.FEATURE__CONFIG:
				return ((InternalEList<?>)getConfig()).basicRemove(otherEnd, msgs);
			case _0Package.FEATURE__CONFIGFILE:
				return ((InternalEList<?>)getConfigfile()).basicRemove(otherEnd, msgs);
			case _0Package.FEATURE__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case _0Package.FEATURE__BUNDLE:
				return ((InternalEList<?>)getBundle()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _0Package.FEATURE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case _0Package.FEATURE__DETAILS:
				return getDetails();
			case _0Package.FEATURE__CONFIG:
				return getConfig();
			case _0Package.FEATURE__CONFIGFILE:
				return getConfigfile();
			case _0Package.FEATURE__FEATURE:
				return getFeature();
			case _0Package.FEATURE__BUNDLE:
				return getBundle();
			case _0Package.FEATURE__DESCRIPTION:
				return getDescription();
			case _0Package.FEATURE__NAME:
				return getName();
			case _0Package.FEATURE__RESOLVER:
				return getResolver();
			case _0Package.FEATURE__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.FEATURE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case _0Package.FEATURE__DETAILS:
				getDetails().clear();
				getDetails().addAll((Collection<? extends String>)newValue);
				return;
			case _0Package.FEATURE__CONFIG:
				getConfig().clear();
				getConfig().addAll((Collection<? extends Config>)newValue);
				return;
			case _0Package.FEATURE__CONFIGFILE:
				getConfigfile().clear();
				getConfigfile().addAll((Collection<? extends ConfigFile>)newValue);
				return;
			case _0Package.FEATURE__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Dependency>)newValue);
				return;
			case _0Package.FEATURE__BUNDLE:
				getBundle().clear();
				getBundle().addAll((Collection<? extends Bundle>)newValue);
				return;
			case _0Package.FEATURE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _0Package.FEATURE__NAME:
				setName((String)newValue);
				return;
			case _0Package.FEATURE__RESOLVER:
				setResolver((String)newValue);
				return;
			case _0Package.FEATURE__VERSION:
				setVersion((String)newValue);
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
			case _0Package.FEATURE__GROUP:
				getGroup().clear();
				return;
			case _0Package.FEATURE__DETAILS:
				getDetails().clear();
				return;
			case _0Package.FEATURE__CONFIG:
				getConfig().clear();
				return;
			case _0Package.FEATURE__CONFIGFILE:
				getConfigfile().clear();
				return;
			case _0Package.FEATURE__FEATURE:
				getFeature().clear();
				return;
			case _0Package.FEATURE__BUNDLE:
				getBundle().clear();
				return;
			case _0Package.FEATURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _0Package.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _0Package.FEATURE__RESOLVER:
				setResolver(RESOLVER_EDEFAULT);
				return;
			case _0Package.FEATURE__VERSION:
				unsetVersion();
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
			case _0Package.FEATURE__GROUP:
				return group != null && !group.isEmpty();
			case _0Package.FEATURE__DETAILS:
				return !getDetails().isEmpty();
			case _0Package.FEATURE__CONFIG:
				return !getConfig().isEmpty();
			case _0Package.FEATURE__CONFIGFILE:
				return !getConfigfile().isEmpty();
			case _0Package.FEATURE__FEATURE:
				return !getFeature().isEmpty();
			case _0Package.FEATURE__BUNDLE:
				return !getBundle().isEmpty();
			case _0Package.FEATURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _0Package.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _0Package.FEATURE__RESOLVER:
				return RESOLVER_EDEFAULT == null ? resolver != null : !RESOLVER_EDEFAULT.equals(resolver);
			case _0Package.FEATURE__VERSION:
				return isSetVersion();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(", resolver: ");
		result.append(resolver);
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
