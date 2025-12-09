/**
 */
package dk.ingi.EBML.impl;

import dk.ingi.EBML.Documentation;
import dk.ingi.EBML.DocumentationPurpose;
import dk.ingi.EBML.EBMLPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.ingi.EBML.impl.DocumentationImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.DocumentationImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link dk.ingi.EBML.impl.DocumentationImpl#getSimple <em>Simple</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentationImpl extends MinimalEObjectImpl.Container implements Documentation {
	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * This is true if the Lang attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean langESet;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final DocumentationPurpose PURPOSE_EDEFAULT = DocumentationPurpose.DEFINITION;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected DocumentationPurpose purpose = PURPOSE_EDEFAULT;

	/**
	 * This is true if the Purpose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean purposeESet;

	/**
	 * The default value of the '{@link #getSimple() <em>Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimple()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimple() <em>Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimple()
	 * @generated
	 * @ordered
	 */
	protected String simple = SIMPLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EBMLPackage.Literals.DOCUMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		boolean oldLangESet = langESet;
		langESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.DOCUMENTATION__LANG, oldLang, lang,
					!oldLangESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLang() {
		String oldLang = lang;
		boolean oldLangESet = langESet;
		lang = LANG_EDEFAULT;
		langESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EBMLPackage.DOCUMENTATION__LANG, oldLang,
					LANG_EDEFAULT, oldLangESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLang() {
		return langESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentationPurpose getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(DocumentationPurpose newPurpose) {
		DocumentationPurpose oldPurpose = purpose;
		purpose = newPurpose == null ? PURPOSE_EDEFAULT : newPurpose;
		boolean oldPurposeESet = purposeESet;
		purposeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.DOCUMENTATION__PURPOSE, oldPurpose,
					purpose, !oldPurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPurpose() {
		DocumentationPurpose oldPurpose = purpose;
		boolean oldPurposeESet = purposeESet;
		purpose = PURPOSE_EDEFAULT;
		purposeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EBMLPackage.DOCUMENTATION__PURPOSE, oldPurpose,
					PURPOSE_EDEFAULT, oldPurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPurpose() {
		return purposeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSimple() {
		return simple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimple(String newSimple) {
		String oldSimple = simple;
		simple = newSimple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.DOCUMENTATION__SIMPLE, oldSimple,
					simple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EBMLPackage.DOCUMENTATION__LANG:
			return getLang();
		case EBMLPackage.DOCUMENTATION__PURPOSE:
			return getPurpose();
		case EBMLPackage.DOCUMENTATION__SIMPLE:
			return getSimple();
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
		case EBMLPackage.DOCUMENTATION__LANG:
			setLang((String) newValue);
			return;
		case EBMLPackage.DOCUMENTATION__PURPOSE:
			setPurpose((DocumentationPurpose) newValue);
			return;
		case EBMLPackage.DOCUMENTATION__SIMPLE:
			setSimple((String) newValue);
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
		case EBMLPackage.DOCUMENTATION__LANG:
			unsetLang();
			return;
		case EBMLPackage.DOCUMENTATION__PURPOSE:
			unsetPurpose();
			return;
		case EBMLPackage.DOCUMENTATION__SIMPLE:
			setSimple(SIMPLE_EDEFAULT);
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
		case EBMLPackage.DOCUMENTATION__LANG:
			return isSetLang();
		case EBMLPackage.DOCUMENTATION__PURPOSE:
			return isSetPurpose();
		case EBMLPackage.DOCUMENTATION__SIMPLE:
			return SIMPLE_EDEFAULT == null ? simple != null : !SIMPLE_EDEFAULT.equals(simple);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (lang: ");
		if (langESet)
			result.append(lang);
		else
			result.append("<unset>");
		result.append(", purpose: ");
		if (purposeESet)
			result.append(purpose);
		else
			result.append("<unset>");
		result.append(", simple: ");
		result.append(simple);
		result.append(')');
		return result.toString();
	}

} //DocumentationImpl
