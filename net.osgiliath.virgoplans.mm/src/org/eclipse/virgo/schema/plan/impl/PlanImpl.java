/**
 */
package org.eclipse.virgo.schema.plan.impl;

import java.util.Collection;

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

import org.eclipse.virgo.schema.plan.ArtifactType;
import org.eclipse.virgo.schema.plan.AttributesType;
import org.eclipse.virgo.schema.plan.Plan;
import org.eclipse.virgo.schema.plan.PlanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.virgo.schema.plan.impl.PlanImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.virgo.schema.plan.impl.PlanImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.virgo.schema.plan.impl.PlanImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.eclipse.virgo.schema.plan.impl.PlanImpl#isAtomic <em>Atomic</em>}</li>
 *   <li>{@link org.eclipse.virgo.schema.plan.impl.PlanImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.virgo.schema.plan.impl.PlanImpl#getProvisioning <em>Provisioning</em>}</li>
 *   <li>{@link org.eclipse.virgo.schema.plan.impl.PlanImpl#isScoped <em>Scoped</em>}</li>
 *   <li>{@link org.eclipse.virgo.schema.plan.impl.PlanImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanImpl extends EObjectImpl implements Plan {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected AttributesType attributes;

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
	 * The default value of the '{@link #isAtomic() <em>Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtomic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATOMIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAtomic() <em>Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtomic()
	 * @generated
	 * @ordered
	 */
	protected boolean atomic = ATOMIC_EDEFAULT;

	/**
	 * This is true if the Atomic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean atomicESet;

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
	 * The default value of the '{@link #getProvisioning() <em>Provisioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisioning()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVISIONING_EDEFAULT = "inherit";

	/**
	 * The cached value of the '{@link #getProvisioning() <em>Provisioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisioning()
	 * @generated
	 * @ordered
	 */
	protected String provisioning = PROVISIONING_EDEFAULT;

	/**
	 * This is true if the Provisioning attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean provisioningESet;

	/**
	 * The default value of the '{@link #isScoped() <em>Scoped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScoped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCOPED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isScoped() <em>Scoped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScoped()
	 * @generated
	 * @ordered
	 */
	protected boolean scoped = SCOPED_EDEFAULT;

	/**
	 * This is true if the Scoped attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scopedESet;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanPackage.Literals.PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(AttributesType newAttributes, NotificationChain msgs) {
		AttributesType oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanPackage.PLAN__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(AttributesType newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanPackage.PLAN__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanPackage.PLAN__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.PLAN__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, PlanPackage.PLAN__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactType> getArtifact() {
		return getGroup().list(PlanPackage.Literals.PLAN__ARTIFACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAtomic() {
		return atomic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtomic(boolean newAtomic) {
		boolean oldAtomic = atomic;
		atomic = newAtomic;
		boolean oldAtomicESet = atomicESet;
		atomicESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.PLAN__ATOMIC, oldAtomic, atomic, !oldAtomicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAtomic() {
		boolean oldAtomic = atomic;
		boolean oldAtomicESet = atomicESet;
		atomic = ATOMIC_EDEFAULT;
		atomicESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PlanPackage.PLAN__ATOMIC, oldAtomic, ATOMIC_EDEFAULT, oldAtomicESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAtomic() {
		return atomicESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.PLAN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvisioning() {
		return provisioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvisioning(String newProvisioning) {
		String oldProvisioning = provisioning;
		provisioning = newProvisioning;
		boolean oldProvisioningESet = provisioningESet;
		provisioningESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.PLAN__PROVISIONING, oldProvisioning, provisioning, !oldProvisioningESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProvisioning() {
		String oldProvisioning = provisioning;
		boolean oldProvisioningESet = provisioningESet;
		provisioning = PROVISIONING_EDEFAULT;
		provisioningESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PlanPackage.PLAN__PROVISIONING, oldProvisioning, PROVISIONING_EDEFAULT, oldProvisioningESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProvisioning() {
		return provisioningESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScoped() {
		return scoped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScoped(boolean newScoped) {
		boolean oldScoped = scoped;
		scoped = newScoped;
		boolean oldScopedESet = scopedESet;
		scopedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.PLAN__SCOPED, oldScoped, scoped, !oldScopedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScoped() {
		boolean oldScoped = scoped;
		boolean oldScopedESet = scopedESet;
		scoped = SCOPED_EDEFAULT;
		scopedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PlanPackage.PLAN__SCOPED, oldScoped, SCOPED_EDEFAULT, oldScopedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScoped() {
		return scopedESet;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanPackage.PLAN__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanPackage.PLAN__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
			case PlanPackage.PLAN__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case PlanPackage.PLAN__ARTIFACT:
				return ((InternalEList<?>)getArtifact()).basicRemove(otherEnd, msgs);
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
			case PlanPackage.PLAN__ATTRIBUTES:
				return getAttributes();
			case PlanPackage.PLAN__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case PlanPackage.PLAN__ARTIFACT:
				return getArtifact();
			case PlanPackage.PLAN__ATOMIC:
				return isAtomic();
			case PlanPackage.PLAN__NAME:
				return getName();
			case PlanPackage.PLAN__PROVISIONING:
				return getProvisioning();
			case PlanPackage.PLAN__SCOPED:
				return isScoped();
			case PlanPackage.PLAN__VERSION:
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
			case PlanPackage.PLAN__ATTRIBUTES:
				setAttributes((AttributesType)newValue);
				return;
			case PlanPackage.PLAN__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case PlanPackage.PLAN__ARTIFACT:
				getArtifact().clear();
				getArtifact().addAll((Collection<? extends ArtifactType>)newValue);
				return;
			case PlanPackage.PLAN__ATOMIC:
				setAtomic((Boolean)newValue);
				return;
			case PlanPackage.PLAN__NAME:
				setName((String)newValue);
				return;
			case PlanPackage.PLAN__PROVISIONING:
				setProvisioning((String)newValue);
				return;
			case PlanPackage.PLAN__SCOPED:
				setScoped((Boolean)newValue);
				return;
			case PlanPackage.PLAN__VERSION:
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
			case PlanPackage.PLAN__ATTRIBUTES:
				setAttributes((AttributesType)null);
				return;
			case PlanPackage.PLAN__GROUP:
				getGroup().clear();
				return;
			case PlanPackage.PLAN__ARTIFACT:
				getArtifact().clear();
				return;
			case PlanPackage.PLAN__ATOMIC:
				unsetAtomic();
				return;
			case PlanPackage.PLAN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PlanPackage.PLAN__PROVISIONING:
				unsetProvisioning();
				return;
			case PlanPackage.PLAN__SCOPED:
				unsetScoped();
				return;
			case PlanPackage.PLAN__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case PlanPackage.PLAN__ATTRIBUTES:
				return attributes != null;
			case PlanPackage.PLAN__GROUP:
				return group != null && !group.isEmpty();
			case PlanPackage.PLAN__ARTIFACT:
				return !getArtifact().isEmpty();
			case PlanPackage.PLAN__ATOMIC:
				return isSetAtomic();
			case PlanPackage.PLAN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PlanPackage.PLAN__PROVISIONING:
				return isSetProvisioning();
			case PlanPackage.PLAN__SCOPED:
				return isSetScoped();
			case PlanPackage.PLAN__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(", atomic: ");
		if (atomicESet) result.append(atomic); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", provisioning: ");
		if (provisioningESet) result.append(provisioning); else result.append("<unset>");
		result.append(", scoped: ");
		if (scopedESet) result.append(scoped); else result.append("<unset>");
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //PlanImpl
