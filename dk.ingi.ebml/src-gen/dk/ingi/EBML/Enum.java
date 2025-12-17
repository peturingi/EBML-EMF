/**
 */
package dk.ingi.EBML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.ingi.EBML.Enum#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link dk.ingi.EBML.Enum#getLabel <em>Label</em>}</li>
 *   <li>{@link dk.ingi.EBML.Enum#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dk.ingi.EBML.EBMLPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link dk.ingi.EBML.Documentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference list.
	 * @see dk.ingi.EBML.EBMLPackage#getEnum_Documentation()
	 * @model containment="true" resolveProxies="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Enum!documentation'"
	 * @generated
	 */
	EList<Documentation> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dk.ingi.EBML.EBMLPackage#getEnum_Label()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Enum!label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Enum#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see dk.ingi.EBML.EBMLPackage#getEnum_Value()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Enum!value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Enum#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Enum
