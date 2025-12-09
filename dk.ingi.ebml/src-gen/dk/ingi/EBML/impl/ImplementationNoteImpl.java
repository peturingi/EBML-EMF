/**
 */
package dk.ingi.EBML.impl;

import dk.ingi.EBML.EBMLPackage;
import dk.ingi.EBML.ImplementationNote;
import dk.ingi.EBML.NoteAttribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.ingi.EBML.impl.ImplementationNoteImpl#getNoteAttribute <em>Note Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationNoteImpl extends MinimalEObjectImpl.Container implements ImplementationNote {
	/**
	 * The default value of the '{@link #getNoteAttribute() <em>Note Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final NoteAttribute NOTE_ATTRIBUTE_EDEFAULT = NoteAttribute.MIN_OCCURS;

	/**
	 * The cached value of the '{@link #getNoteAttribute() <em>Note Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteAttribute()
	 * @generated
	 * @ordered
	 */
	protected NoteAttribute noteAttribute = NOTE_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EBMLPackage.Literals.IMPLEMENTATION_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoteAttribute getNoteAttribute() {
		return noteAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteAttribute(NoteAttribute newNoteAttribute) {
		NoteAttribute oldNoteAttribute = noteAttribute;
		noteAttribute = newNoteAttribute == null ? NOTE_ATTRIBUTE_EDEFAULT : newNoteAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EBMLPackage.IMPLEMENTATION_NOTE__NOTE_ATTRIBUTE,
					oldNoteAttribute, noteAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EBMLPackage.IMPLEMENTATION_NOTE__NOTE_ATTRIBUTE:
			return getNoteAttribute();
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
		case EBMLPackage.IMPLEMENTATION_NOTE__NOTE_ATTRIBUTE:
			setNoteAttribute((NoteAttribute) newValue);
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
		case EBMLPackage.IMPLEMENTATION_NOTE__NOTE_ATTRIBUTE:
			setNoteAttribute(NOTE_ATTRIBUTE_EDEFAULT);
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
		case EBMLPackage.IMPLEMENTATION_NOTE__NOTE_ATTRIBUTE:
			return noteAttribute != NOTE_ATTRIBUTE_EDEFAULT;
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
		result.append(" (noteAttribute: ");
		result.append(noteAttribute);
		result.append(')');
		return result.toString();
	}

} //ImplementationNoteImpl
