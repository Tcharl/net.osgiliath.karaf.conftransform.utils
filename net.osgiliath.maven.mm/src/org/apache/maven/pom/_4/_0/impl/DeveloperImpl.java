/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.apache.maven.pom._4._0.impl;

import org.apache.maven.pom._4._0.Developer;
import org.apache.maven.pom._4._0.PropertiesType3;
import org.apache.maven.pom._4._0.RolesType1;
import org.apache.maven.pom._4._0._0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Developer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.maven.pom._4._0.impl.DeveloperImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.DeveloperImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.DeveloperImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.DeveloperImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.DeveloperImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.DeveloperImpl#getOrganizationUrl <em>Organization Url</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.DeveloperImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.DeveloperImpl#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.apache.maven.pom._4._0.impl.DeveloperImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeveloperImpl extends EObjectImpl implements Developer {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected String organization = ORGANIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizationUrl() <em>Organization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationUrl() <em>Organization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUrl()
	 * @generated
	 * @ordered
	 */
	protected String organizationUrl = ORGANIZATION_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected RolesType1 roles;

	/**
	 * The default value of the '{@link #getTimezone() <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimezone() <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone()
	 * @generated
	 * @ordered
	 */
	protected String timezone = TIMEZONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected PropertiesType3 properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeveloperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.DEVELOPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DEVELOPER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DEVELOPER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DEVELOPER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DEVELOPER__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(String newOrganization) {
		String oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DEVELOPER__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationUrl() {
		return organizationUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationUrl(String newOrganizationUrl) {
		String oldOrganizationUrl = organizationUrl;
		organizationUrl = newOrganizationUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DEVELOPER__ORGANIZATION_URL, oldOrganizationUrl, organizationUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolesType1 getRoles() {
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoles(RolesType1 newRoles, NotificationChain msgs) {
		RolesType1 oldRoles = roles;
		roles = newRoles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.DEVELOPER__ROLES, oldRoles, newRoles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoles(RolesType1 newRoles) {
		if (newRoles != roles) {
			NotificationChain msgs = null;
			if (roles != null)
				msgs = ((InternalEObject)roles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.DEVELOPER__ROLES, null, msgs);
			if (newRoles != null)
				msgs = ((InternalEObject)newRoles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.DEVELOPER__ROLES, null, msgs);
			msgs = basicSetRoles(newRoles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DEVELOPER__ROLES, newRoles, newRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimezone() {
		return timezone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimezone(String newTimezone) {
		String oldTimezone = timezone;
		timezone = newTimezone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DEVELOPER__TIMEZONE, oldTimezone, timezone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType3 getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(PropertiesType3 newProperties, NotificationChain msgs) {
		PropertiesType3 oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.DEVELOPER__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(PropertiesType3 newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.DEVELOPER__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.DEVELOPER__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DEVELOPER__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DEVELOPER__ROLES:
				return basicSetRoles(null, msgs);
			case _0Package.DEVELOPER__PROPERTIES:
				return basicSetProperties(null, msgs);
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
			case _0Package.DEVELOPER__ID:
				return getId();
			case _0Package.DEVELOPER__NAME:
				return getName();
			case _0Package.DEVELOPER__EMAIL:
				return getEmail();
			case _0Package.DEVELOPER__URL:
				return getUrl();
			case _0Package.DEVELOPER__ORGANIZATION:
				return getOrganization();
			case _0Package.DEVELOPER__ORGANIZATION_URL:
				return getOrganizationUrl();
			case _0Package.DEVELOPER__ROLES:
				return getRoles();
			case _0Package.DEVELOPER__TIMEZONE:
				return getTimezone();
			case _0Package.DEVELOPER__PROPERTIES:
				return getProperties();
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
			case _0Package.DEVELOPER__ID:
				setId((String)newValue);
				return;
			case _0Package.DEVELOPER__NAME:
				setName((String)newValue);
				return;
			case _0Package.DEVELOPER__EMAIL:
				setEmail((String)newValue);
				return;
			case _0Package.DEVELOPER__URL:
				setUrl((String)newValue);
				return;
			case _0Package.DEVELOPER__ORGANIZATION:
				setOrganization((String)newValue);
				return;
			case _0Package.DEVELOPER__ORGANIZATION_URL:
				setOrganizationUrl((String)newValue);
				return;
			case _0Package.DEVELOPER__ROLES:
				setRoles((RolesType1)newValue);
				return;
			case _0Package.DEVELOPER__TIMEZONE:
				setTimezone((String)newValue);
				return;
			case _0Package.DEVELOPER__PROPERTIES:
				setProperties((PropertiesType3)newValue);
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
			case _0Package.DEVELOPER__ID:
				setId(ID_EDEFAULT);
				return;
			case _0Package.DEVELOPER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _0Package.DEVELOPER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case _0Package.DEVELOPER__URL:
				setUrl(URL_EDEFAULT);
				return;
			case _0Package.DEVELOPER__ORGANIZATION:
				setOrganization(ORGANIZATION_EDEFAULT);
				return;
			case _0Package.DEVELOPER__ORGANIZATION_URL:
				setOrganizationUrl(ORGANIZATION_URL_EDEFAULT);
				return;
			case _0Package.DEVELOPER__ROLES:
				setRoles((RolesType1)null);
				return;
			case _0Package.DEVELOPER__TIMEZONE:
				setTimezone(TIMEZONE_EDEFAULT);
				return;
			case _0Package.DEVELOPER__PROPERTIES:
				setProperties((PropertiesType3)null);
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
			case _0Package.DEVELOPER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case _0Package.DEVELOPER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _0Package.DEVELOPER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case _0Package.DEVELOPER__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case _0Package.DEVELOPER__ORGANIZATION:
				return ORGANIZATION_EDEFAULT == null ? organization != null : !ORGANIZATION_EDEFAULT.equals(organization);
			case _0Package.DEVELOPER__ORGANIZATION_URL:
				return ORGANIZATION_URL_EDEFAULT == null ? organizationUrl != null : !ORGANIZATION_URL_EDEFAULT.equals(organizationUrl);
			case _0Package.DEVELOPER__ROLES:
				return roles != null;
			case _0Package.DEVELOPER__TIMEZONE:
				return TIMEZONE_EDEFAULT == null ? timezone != null : !TIMEZONE_EDEFAULT.equals(timezone);
			case _0Package.DEVELOPER__PROPERTIES:
				return properties != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", email: ");
		result.append(email);
		result.append(", url: ");
		result.append(url);
		result.append(", organization: ");
		result.append(organization);
		result.append(", organizationUrl: ");
		result.append(organizationUrl);
		result.append(", timezone: ");
		result.append(timezone);
		result.append(')');
		return result.toString();
	}

} //DeveloperImpl
