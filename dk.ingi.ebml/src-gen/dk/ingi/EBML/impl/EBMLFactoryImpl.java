/**
 */
package dk.ingi.EBML.impl;

import dk.ingi.EBML.DocumentType;
import dk.ingi.EBML.Documentation;
import dk.ingi.EBML.DocumentationPurpose;
import dk.ingi.EBML.EBMLFactory;
import dk.ingi.EBML.EBMLPackage;
import dk.ingi.EBML.EBMLSchema;
import dk.ingi.EBML.Element;
import dk.ingi.EBML.ElementType;
import dk.ingi.EBML.Extension;
import dk.ingi.EBML.ImplementationNote;
import dk.ingi.EBML.NoteAttribute;
import dk.ingi.EBML.Restriction;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EBMLFactoryImpl extends EFactoryImpl implements EBMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EBMLFactory init() {
		try {
			EBMLFactory theEBMLFactory = (EBMLFactory) EPackage.Registry.INSTANCE.getEFactory(EBMLPackage.eNS_URI);
			if (theEBMLFactory != null) {
				return theEBMLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EBMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EBMLPackage.EBML_SCHEMA:
			return createEBMLSchema();
		case EBMLPackage.ELEMENT:
			return createElement();
		case EBMLPackage.EXTENSION:
			return createExtension();
		case EBMLPackage.DOCUMENTATION:
			return createDocumentation();
		case EBMLPackage.IMPLEMENTATION_NOTE:
			return createImplementationNote();
		case EBMLPackage.RESTRICTION:
			return createRestriction();
		case EBMLPackage.ENUM:
			return createEnum();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case EBMLPackage.DOCUMENTATION_PURPOSE:
			return createDocumentationPurposeFromString(eDataType, initialValue);
		case EBMLPackage.NOTE_ATTRIBUTE:
			return createNoteAttributeFromString(eDataType, initialValue);
		case EBMLPackage.DOCUMENT_TYPE:
			return createDocumentTypeFromString(eDataType, initialValue);
		case EBMLPackage.ELEMENT_TYPE:
			return createElementTypeFromString(eDataType, initialValue);
		case EBMLPackage.ZERO_ONE_BOOLEAN_OBJECT:
			return createZeroOneBooleanObjectFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case EBMLPackage.DOCUMENTATION_PURPOSE:
			return convertDocumentationPurposeToString(eDataType, instanceValue);
		case EBMLPackage.NOTE_ATTRIBUTE:
			return convertNoteAttributeToString(eDataType, instanceValue);
		case EBMLPackage.DOCUMENT_TYPE:
			return convertDocumentTypeToString(eDataType, instanceValue);
		case EBMLPackage.ELEMENT_TYPE:
			return convertElementTypeToString(eDataType, instanceValue);
		case EBMLPackage.ZERO_ONE_BOOLEAN_OBJECT:
			return convertZeroOneBooleanObjectToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EBMLSchema createEBMLSchema() {
		EBMLSchemaImpl ebmlSchema = new EBMLSchemaImpl();
		return ebmlSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationNote createImplementationNote() {
		ImplementationNoteImpl implementationNote = new ImplementationNoteImpl();
		return implementationNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Restriction createRestriction() {
		RestrictionImpl restriction = new RestrictionImpl();
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public dk.ingi.EBML.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentationPurpose createDocumentationPurpose(String literal) {
		DocumentationPurpose result = DocumentationPurpose.get(literal);
		if (result == null)
			throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '"
					+ EBMLPackage.Literals.DOCUMENTATION_PURPOSE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationPurpose createDocumentationPurposeFromString(EDataType eDataType, String initialValue) {
		return createDocumentationPurpose(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertDocumentationPurpose(DocumentationPurpose instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentationPurposeToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentationPurpose((DocumentationPurpose) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoteAttribute createNoteAttribute(String literal) {
		NoteAttribute result = NoteAttribute.get(literal);
		if (result == null)
			throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '"
					+ EBMLPackage.Literals.NOTE_ATTRIBUTE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteAttribute createNoteAttributeFromString(EDataType eDataType, String initialValue) {
		return createNoteAttribute(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertNoteAttribute(NoteAttribute instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteAttributeToString(EDataType eDataType, Object instanceValue) {
		return convertNoteAttribute((NoteAttribute) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentType createDocumentType(String literal) {
		DocumentType result = DocumentType.get(literal);
		if (result == null)
			throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '"
					+ EBMLPackage.Literals.DOCUMENT_TYPE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentType createDocumentTypeFromString(EDataType eDataType, String initialValue) {
		return createDocumentType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertDocumentType(DocumentType instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentTypeToString(EDataType eDataType, Object instanceValue) {
		return convertDocumentType((DocumentType) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementType createElementType(String literal) {
		ElementType result = ElementType.get(literal);
		if (result == null)
			throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '"
					+ EBMLPackage.Literals.ELEMENT_TYPE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType createElementTypeFromString(EDataType eDataType, String initialValue) {
		return createElementType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertElementType(ElementType instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElementTypeToString(EDataType eDataType, Object instanceValue) {
		return convertElementType((ElementType) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean createZeroOneBooleanObject(String literal) {
		return (Boolean) super.createFromString(EBMLPackage.Literals.ZERO_ONE_BOOLEAN_OBJECT, literal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createZeroOneBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createZeroOneBooleanObject(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertZeroOneBooleanObject(Boolean instanceValue) {
		return super.convertToString(EBMLPackage.Literals.ZERO_ONE_BOOLEAN_OBJECT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZeroOneBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertZeroOneBooleanObject((Boolean) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EBMLPackage getEBMLPackage() {
		return (EBMLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EBMLPackage getPackage() {
		return EBMLPackage.eINSTANCE;
	}

} //EBMLFactoryImpl
