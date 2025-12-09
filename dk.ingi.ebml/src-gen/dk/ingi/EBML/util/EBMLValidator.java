/**
 */
package dk.ingi.EBML.util;

import dk.ingi.EBML.DocumentType;
import dk.ingi.EBML.Documentation;
import dk.ingi.EBML.DocumentationPurpose;
import dk.ingi.EBML.EBMLPackage;
import dk.ingi.EBML.EBMLSchema;
import dk.ingi.EBML.Element;
import dk.ingi.EBML.ElementType;
import dk.ingi.EBML.Extension;
import dk.ingi.EBML.ImplementationNote;
import dk.ingi.EBML.NoteAttribute;
import dk.ingi.EBML.Restriction;

import dk.ingi.EBML.provider.EBMLPlugin;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see dk.ingi.EBML.EBMLPackage
 * @generated
 */
public class EBMLValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EBMLValidator INSTANCE = new EBMLValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "dk.ingi.EBML";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Version not Negative' of 'Schema'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EBML_SCHEMA__VERSION_NOT_NEGATIVE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Ebml positive' of 'Schema'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EBML_SCHEMA__EBML_POSITIVE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Min Occurs defaultless When Greater Than One' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__MIN_OCCURS_DEFAULTLESS_WHEN_GREATER_THAN_ONE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Path if Has Is Recursive Part Then Recursive Is True' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__PATH_IF_HAS_IS_RECURSIVE_PART_THEN_RECURSIVE_IS_TRUE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Max Occurs greater Equal Min Occurs' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__MAX_OCCURS_GREATER_EQUAL_MIN_OCCURS = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Minver non Negative' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__MINVER_NON_NEGATIVE = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Min Occurs non Negative' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__MIN_OCCURS_NON_NEGATIVE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unknown Size Allowed not True If Recursive Is True' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__UNKNOWN_SIZE_ALLOWED_NOT_TRUE_IF_RECURSIVE_IS_TRUE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Recursive not True If Unknown Size Allowed Is True' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__RECURSIVE_NOT_TRUE_IF_UNKNOWN_SIZE_ALLOWED_IS_TRUE = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Maxver non Negative' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__MAXVER_NON_NEGATIVE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Element containedby EBML Schema' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__ELEMENT_CONTAINEDBY_EBML_SCHEMA = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name valid' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__NAME_VALID = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Max Occurs valid' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__MAX_OCCURS_VALID = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Id valid' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__ID_VALID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type only Master Can Be Recursive' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__TYPE_ONLY_MASTER_CAN_BE_RECURSIVE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Range is Allowed' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__RANGE_IS_ALLOWED = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Recursive if True Then Path Has Is Recursive Part' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__RECURSIVE_IF_TRUE_THEN_PATH_HAS_IS_RECURSIVE_PART = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Maxver greater Or Equal To Minver' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__MAXVER_GREATER_OR_EQUAL_TO_MINVER = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unknown Size Allowed is Valid' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__UNKNOWN_SIZE_ALLOWED_IS_VALID = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Type master Must Not Declare Default Value' of 'Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEMENT__TYPE_MASTER_MUST_NOT_DECLARE_DEFAULT_VALUE = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Container Type' of 'Extension'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTENSION__CONTAINER_TYPE = 21;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 21;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBMLValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return EBMLPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case EBMLPackage.EBML_SCHEMA:
			return validateEBMLSchema((EBMLSchema) value, diagnostics, context);
		case EBMLPackage.ELEMENT:
			return validateElement((Element) value, diagnostics, context);
		case EBMLPackage.EXTENSION:
			return validateExtension((Extension) value, diagnostics, context);
		case EBMLPackage.DOCUMENTATION:
			return validateDocumentation((Documentation) value, diagnostics, context);
		case EBMLPackage.IMPLEMENTATION_NOTE:
			return validateImplementationNote((ImplementationNote) value, diagnostics, context);
		case EBMLPackage.RESTRICTION:
			return validateRestriction((Restriction) value, diagnostics, context);
		case EBMLPackage.ENUM:
			return validateEnum((dk.ingi.EBML.Enum) value, diagnostics, context);
		case EBMLPackage.DOCUMENTATION_PURPOSE:
			return validateDocumentationPurpose((DocumentationPurpose) value, diagnostics, context);
		case EBMLPackage.NOTE_ATTRIBUTE:
			return validateNoteAttribute((NoteAttribute) value, diagnostics, context);
		case EBMLPackage.DOCUMENT_TYPE:
			return validateDocumentType((DocumentType) value, diagnostics, context);
		case EBMLPackage.ELEMENT_TYPE:
			return validateElementType((ElementType) value, diagnostics, context);
		case EBMLPackage.ZERO_ONE_BOOLEAN_OBJECT:
			return validateZeroOneBooleanObject((Boolean) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBMLSchema(EBMLSchema ebmlSchema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ebmlSchema, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(ebmlSchema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(ebmlSchema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(ebmlSchema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(ebmlSchema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(ebmlSchema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(ebmlSchema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(ebmlSchema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(ebmlSchema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEBMLSchema_ebml_positive(ebmlSchema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEBMLSchema_version_notNegative(ebmlSchema, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ebml_positive constraint of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBMLSchema_ebml_positive(EBMLSchema ebmlSchema, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ebmlSchema.ebml_positive(diagnostics, context);
	}

	/**
	 * Validates the version_notNegative constraint of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBMLSchema_version_notNegative(EBMLSchema ebmlSchema, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ebmlSchema.version_notNegative(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(element, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_unknownSizeAllowed_isValid(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_maxver_greaterOrEqualToMinver(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_maxOccurs_valid(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_range_isAllowed(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_recursive_ifTrueThenPathHasIsRecursivePart(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_maxOccurs_greaterEqualMinOccurs(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_path_ifHasIsRecursivePartThenRecursiveIsTrue(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_unknownSizeAllowed_notTrueIfRecursiveIsTrue(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_type_onlyMasterCanBeRecursive(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_minOccurs_defaultlessWhenGreaterThanOne(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_minOccurs_nonNegative(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_maxver_nonNegative(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_element_containedbyEBMLSchema(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_name_valid(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_id_valid(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_recursive_notTrueIfUnknownSizeAllowedIsTrue(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_type_masterMustNotDeclareDefaultValue(element, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElement_minver_nonNegative(element, diagnostics, context);
		return result;
	}

	/**
	 * Validates the type_masterMustNotDeclareDefaultValue constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_type_masterMustNotDeclareDefaultValue(Element element, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return element.type_masterMustNotDeclareDefaultValue(diagnostics, context);
	}

	/**
	 * Validates the minOccurs_defaultlessWhenGreaterThanOne constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_minOccurs_defaultlessWhenGreaterThanOne(Element element, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return element.minOccurs_defaultlessWhenGreaterThanOne(diagnostics, context);
	}

	/**
	 * Validates the path_ifHasIsRecursivePartThenRecursiveIsTrue constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_path_ifHasIsRecursivePartThenRecursiveIsTrue(Element element,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return element.path_ifHasIsRecursivePartThenRecursiveIsTrue(diagnostics, context);
	}

	/**
	 * Validates the maxOccurs_greaterEqualMinOccurs constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_maxOccurs_greaterEqualMinOccurs(Element element, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return element.maxOccurs_greaterEqualMinOccurs(diagnostics, context);
	}

	/**
	 * Validates the minver_nonNegative constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_minver_nonNegative(Element element, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return element.minver_nonNegative(diagnostics, context);
	}

	/**
	 * Validates the minOccurs_nonNegative constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_minOccurs_nonNegative(Element element, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return element.minOccurs_nonNegative(diagnostics, context);
	}

	/**
	 * Validates the unknownSizeAllowed_notTrueIfRecursiveIsTrue constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_unknownSizeAllowed_notTrueIfRecursiveIsTrue(Element element,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return element.unknownSizeAllowed_notTrueIfRecursiveIsTrue(diagnostics, context);
	}

	/**
	 * Validates the recursive_notTrueIfUnknownSizeAllowedIsTrue constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_recursive_notTrueIfUnknownSizeAllowedIsTrue(Element element,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return element.recursive_notTrueIfUnknownSizeAllowedIsTrue(diagnostics, context);
	}

	/**
	 * Validates the maxver_nonNegative constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_maxver_nonNegative(Element element, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return element.maxver_nonNegative(diagnostics, context);
	}

	/**
	 * Validates the element_containedbyEBMLSchema constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_element_containedbyEBMLSchema(Element element, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return element.element_containedbyEBMLSchema(diagnostics, context);
	}

	/**
	 * Validates the name_valid constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_name_valid(Element element, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return element.name_valid(diagnostics, context);
	}

	/**
	 * Validates the maxOccurs_valid constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_maxOccurs_valid(Element element, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return element.maxOccurs_valid(diagnostics, context);
	}

	/**
	 * Validates the id_valid constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_id_valid(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return element.id_valid(diagnostics, context);
	}

	/**
	 * Validates the type_onlyMasterCanBeRecursive constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_type_onlyMasterCanBeRecursive(Element element, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return element.type_onlyMasterCanBeRecursive(diagnostics, context);
	}

	/**
	 * Validates the range_isAllowed constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_range_isAllowed(Element element, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return element.range_isAllowed(diagnostics, context);
	}

	/**
	 * Validates the recursive_ifTrueThenPathHasIsRecursivePart constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_recursive_ifTrueThenPathHasIsRecursivePart(Element element,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return element.recursive_ifTrueThenPathHasIsRecursivePart(diagnostics, context);
	}

	/**
	 * Validates the maxver_greaterOrEqualToMinver constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_maxver_greaterOrEqualToMinver(Element element, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return element.maxver_greaterOrEqualToMinver(diagnostics, context);
	}

	/**
	 * Validates the unknownSizeAllowed_isValid constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement_unknownSizeAllowed_isValid(Element element, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return element.unknownSizeAllowed_isValid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(extension, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(extension, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(extension, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(extension, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(extension, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(extension, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(extension, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(extension, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(extension, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateExtension_containerType(extension, diagnostics, context);
		return result;
	}

	/**
	 * Validates the containerType constraint of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension_containerType(Extension extension, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return extension.containerType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentation(Documentation documentation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationNote(ImplementationNote implementationNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationNote, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestriction(Restriction restriction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(restriction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnum(dk.ingi.EBML.Enum enum_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enum_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentationPurpose(DocumentationPurpose documentationPurpose, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteAttribute(NoteAttribute noteAttribute, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentType(DocumentType documentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementType(ElementType elementType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZeroOneBooleanObject(Boolean zeroOneBooleanObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EBMLPlugin.INSTANCE;
	}

} //EBMLValidator
