/**
 */
package dk.ingi.EBML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dk.ingi.EBML.EBMLPackage
 * @generated
 */
public interface EBMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EBMLFactory eINSTANCE = dk.ingi.EBML.impl.EBMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema</em>'.
	 * @generated
	 */
	EBMLSchema createEBMLSchema();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension</em>'.
	 * @generated
	 */
	Extension createExtension();

	/**
	 * Returns a new object of class '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documentation</em>'.
	 * @generated
	 */
	Documentation createDocumentation();

	/**
	 * Returns a new object of class '<em>Implementation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Note</em>'.
	 * @generated
	 */
	ImplementationNote createImplementationNote();

	/**
	 * Returns a new object of class '<em>Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restriction</em>'.
	 * @generated
	 */
	Restriction createRestriction();

	/**
	 * Returns a new object of class '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum</em>'.
	 * @generated
	 */
	Enum createEnum();

	/**
	 * Returns an instance of data type '<em>Documentation Purpose</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	DocumentationPurpose createDocumentationPurpose(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Documentation Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertDocumentationPurpose(DocumentationPurpose instanceValue);

	/**
	 * Returns an instance of data type '<em>Note Attribute</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	NoteAttribute createNoteAttribute(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Note Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertNoteAttribute(NoteAttribute instanceValue);

	/**
	 * Returns an instance of data type '<em>Document Type</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	DocumentType createDocumentType(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertDocumentType(DocumentType instanceValue);

	/**
	 * Returns an instance of data type '<em>Element Type</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	ElementType createElementType(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertElementType(ElementType instanceValue);

	/**
	 * Returns an instance of data type '<em>Zero One Boolean Object</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	Boolean createZeroOneBooleanObject(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Zero One Boolean Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertZeroOneBooleanObject(Boolean instanceValue);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EBMLPackage getEBMLPackage();

} //EBMLFactory
