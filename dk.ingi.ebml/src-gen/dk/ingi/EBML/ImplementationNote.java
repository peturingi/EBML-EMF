/**
 */
package dk.ingi.EBML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.ingi.EBML.ImplementationNote#getNoteAttribute <em>Note Attribute</em>}</li>
 * </ul>
 *
 * @see dk.ingi.EBML.EBMLPackage#getImplementationNote()
 * @model
 * @generated
 */
public interface ImplementationNote extends EObject {
	/**
	 * Returns the value of the '<em><b>Note Attribute</b></em>' attribute.
	 * The literals are from the enumeration {@link dk.ingi.EBML.NoteAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Attribute</em>' attribute.
	 * @see dk.ingi.EBML.NoteAttribute
	 * @see #setNoteAttribute(NoteAttribute)
	 * @see dk.ingi.EBML.EBMLPackage#getImplementationNote_NoteAttribute()
	 * @model id="true" required="true"
	 *        extendedMetaData="name='note_attribute'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!ImplementationNote!noteAttribute'"
	 * @generated
	 */
	NoteAttribute getNoteAttribute();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.ImplementationNote#getNoteAttribute <em>Note Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Attribute</em>' attribute.
	 * @see dk.ingi.EBML.NoteAttribute
	 * @see #getNoteAttribute()
	 * @generated
	 */
	void setNoteAttribute(NoteAttribute value);

} // ImplementationNote
