/**
 */
package dk.ingi.EBML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.ingi.EBML.Documentation#getLang <em>Lang</em>}</li>
 *   <li>{@link dk.ingi.EBML.Documentation#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link dk.ingi.EBML.Documentation#getSimple <em>Simple</em>}</li>
 * </ul>
 *
 * @see dk.ingi.EBML.EBMLPackage#getDocumentation()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface Documentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #isSetLang()
	 * @see #unsetLang()
	 * @see #setLang(String)
	 * @see dk.ingi.EBML.EBMLPackage#getDocumentation_Lang()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Documentation!lang'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Documentation#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #isSetLang()
	 * @see #unsetLang()
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Unsets the value of the '{@link dk.ingi.EBML.Documentation#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLang()
	 * @see #getLang()
	 * @see #setLang(String)
	 * @generated
	 */
	void unsetLang();

	/**
	 * Returns whether the value of the '{@link dk.ingi.EBML.Documentation#getLang <em>Lang</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lang</em>' attribute is set.
	 * @see #unsetLang()
	 * @see #getLang()
	 * @see #setLang(String)
	 * @generated
	 */
	boolean isSetLang();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * The default value is <code>"definition"</code>.
	 * The literals are from the enumeration {@link dk.ingi.EBML.DocumentationPurpose}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see dk.ingi.EBML.DocumentationPurpose
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #setPurpose(DocumentationPurpose)
	 * @see dk.ingi.EBML.EBMLPackage#getDocumentation_Purpose()
	 * @model default="definition" unsettable="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Documentation!purpose'"
	 * @generated
	 */
	DocumentationPurpose getPurpose();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Documentation#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see dk.ingi.EBML.DocumentationPurpose
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(DocumentationPurpose value);

	/**
	 * Unsets the value of the '{@link dk.ingi.EBML.Documentation#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(DocumentationPurpose)
	 * @generated
	 */
	void unsetPurpose();

	/**
	 * Returns whether the value of the '{@link dk.ingi.EBML.Documentation#getPurpose <em>Purpose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Purpose</em>' attribute is set.
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(DocumentationPurpose)
	 * @generated
	 */
	boolean isSetPurpose();

	/**
	 * Returns the value of the '<em><b>Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple</em>' attribute.
	 * @see #setSimple(String)
	 * @see dk.ingi.EBML.EBMLPackage#getDocumentation_Simple()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='simple'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Documentation!simple'"
	 * @generated
	 */
	String getSimple();

	/**
	 * Sets the value of the '{@link dk.ingi.EBML.Documentation#getSimple <em>Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple</em>' attribute.
	 * @see #getSimple()
	 * @generated
	 */
	void setSimple(String value);

} // Documentation
