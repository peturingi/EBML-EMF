/**
 */
package dk.ingi.EBML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.ingi.EBML.Restriction#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @see dk.ingi.EBML.EBMLPackage#getRestriction()
 * @model
 * @generated
 */
public interface Restriction extends EObject {
	/**
	 * Returns the value of the '<em><b>Enum</b></em>' containment reference list.
	 * The list contents are of type {@link dk.ingi.EBML.Enum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' containment reference list.
	 * @see dk.ingi.EBML.EBMLPackage#getRestriction_Enum()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Restriction!enum'"
	 * @generated
	 */
	EList<dk.ingi.EBML.Enum> getEnum();

} // Restriction
