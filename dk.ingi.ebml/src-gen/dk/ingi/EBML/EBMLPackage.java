/**
 */
package dk.ingi.EBML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.ingi.EBML.EBMLFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore queryDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 *        annotation="https://ingi.dk/XMLDataConverter"
 * @generated
 */
public interface EBMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EBML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:ietf:rfc:8794";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dk.ingi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EBMLPackage eINSTANCE = dk.ingi.EBML.impl.EBMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.ingi.EBML.impl.EBMLSchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.ingi.EBML.impl.EBMLSchemaImpl
	 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getEBMLSchema()
	 * @generated
	 */
	int EBML_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Doc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBML_SCHEMA__DOC_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBML_SCHEMA__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Ebml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBML_SCHEMA__EBML = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBML_SCHEMA__ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBML_SCHEMA_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Version not Negative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBML_SCHEMA___VERSION_NOT_NEGATIVE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Ebml positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBML_SCHEMA___EBML_POSITIVE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBML_SCHEMA_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link dk.ingi.EBML.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.ingi.EBML.impl.ElementImpl
	 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PATH = 1;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MIN_OCCURS = 2;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MAX_OCCURS = 3;

	/**
	 * The feature id for the '<em><b>Minver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MINVER = 4;

	/**
	 * The feature id for the '<em><b>Maxver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MAXVER = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DOCUMENTATION = 6;

	/**
	 * The feature id for the '<em><b>Implementation Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IMPLEMENTATION_NOTE = 7;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EXTENSION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 9;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__LENGTH = 10;

	/**
	 * The feature id for the '<em><b>Recurring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RECURRING = 11;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DEFAULT = 12;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RANGE = 13;

	/**
	 * The feature id for the '<em><b>Unknown Size Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UNKNOWN_SIZE_ALLOWED = 14;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RESTRICTION = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = 16;

	/**
	 * The feature id for the '<em><b>Recursive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RECURSIVE = 17;

	/**
	 * The feature id for the '<em><b>Effective Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EFFECTIVE_MAX_OCCURS = 18;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 19;

	/**
	 * The operation id for the '<em>Maxver greater Or Equal To Minver</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___MAXVER_GREATER_OR_EQUAL_TO_MINVER__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Max Occurs valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___MAX_OCCURS_VALID__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Range is Allowed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___RANGE_IS_ALLOWED__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Recursive if True Then Path Has Is Recursive Part</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___RECURSIVE_IF_TRUE_THEN_PATH_HAS_IS_RECURSIVE_PART__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The operation id for the '<em>Max Occurs greater Equal Min Occurs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___MAX_OCCURS_GREATER_EQUAL_MIN_OCCURS__DIAGNOSTICCHAIN_MAP = 4;

	/**
	 * The operation id for the '<em>Path if Has Is Recursive Part Then Recursive Is True</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___PATH_IF_HAS_IS_RECURSIVE_PART_THEN_RECURSIVE_IS_TRUE__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The operation id for the '<em>Unknown Size Allowed not True If Recursive Is True</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___UNKNOWN_SIZE_ALLOWED_NOT_TRUE_IF_RECURSIVE_IS_TRUE__DIAGNOSTICCHAIN_MAP = 6;

	/**
	 * The operation id for the '<em>Type only Master Can Be Recursive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___TYPE_ONLY_MASTER_CAN_BE_RECURSIVE__DIAGNOSTICCHAIN_MAP = 7;

	/**
	 * The operation id for the '<em>Min Occurs defaultless When Greater Than One</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___MIN_OCCURS_DEFAULTLESS_WHEN_GREATER_THAN_ONE__DIAGNOSTICCHAIN_MAP = 8;

	/**
	 * The operation id for the '<em>Min Occurs non Negative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___MIN_OCCURS_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP = 9;

	/**
	 * The operation id for the '<em>Maxver non Negative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___MAXVER_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP = 10;

	/**
	 * The operation id for the '<em>Element containedby EBML Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___ELEMENT_CONTAINEDBY_EBML_SCHEMA__DIAGNOSTICCHAIN_MAP = 11;

	/**
	 * The operation id for the '<em>Name valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___NAME_VALID__DIAGNOSTICCHAIN_MAP = 12;

	/**
	 * The operation id for the '<em>Id valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___ID_VALID__DIAGNOSTICCHAIN_MAP = 13;

	/**
	 * The operation id for the '<em>Recursive not True If Unknown Size Allowed Is True</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___RECURSIVE_NOT_TRUE_IF_UNKNOWN_SIZE_ALLOWED_IS_TRUE__DIAGNOSTICCHAIN_MAP = 14;

	/**
	 * The operation id for the '<em>Type master Must Not Declare Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___TYPE_MASTER_MUST_NOT_DECLARE_DEFAULT_VALUE__DIAGNOSTICCHAIN_MAP = 15;

	/**
	 * The operation id for the '<em>Minver non Negative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___MINVER_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP = 16;

	/**
	 * The operation id for the '<em>Unknown Size Allowed is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___UNKNOWN_SIZE_ALLOWED_IS_VALID__DIAGNOSTICCHAIN_MAP = 17;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 18;

	/**
	 * The meta object id for the '{@link dk.ingi.EBML.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.ingi.EBML.impl.ExtensionImpl
	 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ANY_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ANY = 2;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Container Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___CONTAINER_TYPE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dk.ingi.EBML.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.ingi.EBML.impl.DocumentationImpl
	 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__LANG = 0;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__PURPOSE = 1;

	/**
	 * The feature id for the '<em><b>Simple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__SIMPLE = 2;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.ingi.EBML.impl.ImplementationNoteImpl <em>Implementation Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.ingi.EBML.impl.ImplementationNoteImpl
	 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getImplementationNote()
	 * @generated
	 */
	int IMPLEMENTATION_NOTE = 4;

	/**
	 * The feature id for the '<em><b>Note Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_NOTE__NOTE_ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Implementation Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_NOTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Implementation Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_NOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.ingi.EBML.impl.RestrictionImpl <em>Restriction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.ingi.EBML.impl.RestrictionImpl
	 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getRestriction()
	 * @generated
	 */
	int RESTRICTION = 5;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION__ENUM = 0;

	/**
	 * The number of structural features of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Restriction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.ingi.EBML.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.ingi.EBML.impl.EnumImpl
	 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.ingi.EBML.DocumentationPurpose <em>Documentation Purpose</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.ingi.EBML.DocumentationPurpose
	 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getDocumentationPurpose()
	 * @generated
	 */
	int DOCUMENTATION_PURPOSE = 7;

	/**
	 * The meta object id for the '{@link dk.ingi.EBML.NoteAttribute <em>Note Attribute</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.ingi.EBML.NoteAttribute
	 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getNoteAttribute()
	 * @generated
	 */
	int NOTE_ATTRIBUTE = 8;

	/**
	 * The meta object id for the '{@link dk.ingi.EBML.DocumentType <em>Document Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.ingi.EBML.DocumentType
	 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getDocumentType()
	 * @generated
	 */
	int DOCUMENT_TYPE = 9;

	/**
	 * The meta object id for the '{@link dk.ingi.EBML.ElementType <em>Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.ingi.EBML.ElementType
	 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 10;

	/**
	 * The meta object id for the '<em>Zero One Boolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getZeroOneBooleanObject()
	 * @generated
	 */
	int ZERO_ONE_BOOLEAN_OBJECT = 11;

	/**
	 * Returns the meta object for class '{@link dk.ingi.EBML.EBMLSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see dk.ingi.EBML.EBMLSchema
	 * @generated
	 */
	EClass getEBMLSchema();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.EBMLSchema#getDocType <em>Doc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc Type</em>'.
	 * @see dk.ingi.EBML.EBMLSchema#getDocType()
	 * @see #getEBMLSchema()
	 * @generated
	 */
	EAttribute getEBMLSchema_DocType();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.EBMLSchema#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see dk.ingi.EBML.EBMLSchema#getVersion()
	 * @see #getEBMLSchema()
	 * @generated
	 */
	EAttribute getEBMLSchema_Version();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.EBMLSchema#getEbml <em>Ebml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ebml</em>'.
	 * @see dk.ingi.EBML.EBMLSchema#getEbml()
	 * @see #getEBMLSchema()
	 * @generated
	 */
	EAttribute getEBMLSchema_Ebml();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.ingi.EBML.EBMLSchema#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see dk.ingi.EBML.EBMLSchema#getElement()
	 * @see #getEBMLSchema()
	 * @generated
	 */
	EReference getEBMLSchema_Element();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.EBMLSchema#version_notNegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Version not Negative</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Version not Negative</em>' operation.
	 * @see dk.ingi.EBML.EBMLSchema#version_notNegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEBMLSchema__Version_notNegative__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.EBMLSchema#ebml_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Ebml positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ebml positive</em>' operation.
	 * @see dk.ingi.EBML.EBMLSchema#ebml_positive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEBMLSchema__Ebml_positive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dk.ingi.EBML.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see dk.ingi.EBML.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.ingi.EBML.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Element#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see dk.ingi.EBML.Element#getPath()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Path();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Element#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see dk.ingi.EBML.Element#getMinOccurs()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Element#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see dk.ingi.EBML.Element#getMaxOccurs()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_MaxOccurs();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Element#getMinver <em>Minver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minver</em>'.
	 * @see dk.ingi.EBML.Element#getMinver()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Minver();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Element#getMaxver <em>Maxver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxver</em>'.
	 * @see dk.ingi.EBML.Element#getMaxver()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Maxver();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.ingi.EBML.Element#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see dk.ingi.EBML.Element#getDocumentation()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.ingi.EBML.Element#getImplementationNote <em>Implementation Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementation Note</em>'.
	 * @see dk.ingi.EBML.Element#getImplementationNote()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ImplementationNote();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.ingi.EBML.Element#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see dk.ingi.EBML.Element#getExtension()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Extension();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dk.ingi.EBML.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Element#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see dk.ingi.EBML.Element#getLength()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Length();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Element#getRecurring <em>Recurring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurring</em>'.
	 * @see dk.ingi.EBML.Element#getRecurring()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Recurring();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Element#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see dk.ingi.EBML.Element#getDefault()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Default();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Element#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see dk.ingi.EBML.Element#getRange()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Range();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Element#getUnknownSizeAllowed <em>Unknown Size Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown Size Allowed</em>'.
	 * @see dk.ingi.EBML.Element#getUnknownSizeAllowed()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_UnknownSizeAllowed();

	/**
	 * Returns the meta object for the containment reference '{@link dk.ingi.EBML.Element#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see dk.ingi.EBML.Element#getRestriction()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Restriction();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dk.ingi.EBML.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Element#getRecursive <em>Recursive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recursive</em>'.
	 * @see dk.ingi.EBML.Element#getRecursive()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Recursive();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Element#getEffectiveMaxOccurs <em>Effective Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Max Occurs</em>'.
	 * @see dk.ingi.EBML.Element#getEffectiveMaxOccurs()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_EffectiveMaxOccurs();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#minOccurs_defaultlessWhenGreaterThanOne(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Min Occurs defaultless When Greater Than One</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Min Occurs defaultless When Greater Than One</em>' operation.
	 * @see dk.ingi.EBML.Element#minOccurs_defaultlessWhenGreaterThanOne(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__MinOccurs_defaultlessWhenGreaterThanOne__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#path_ifHasIsRecursivePartThenRecursiveIsTrue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Path if Has Is Recursive Part Then Recursive Is True</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Path if Has Is Recursive Part Then Recursive Is True</em>' operation.
	 * @see dk.ingi.EBML.Element#path_ifHasIsRecursivePartThenRecursiveIsTrue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__Path_ifHasIsRecursivePartThenRecursiveIsTrue__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#maxOccurs_greaterEqualMinOccurs(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Max Occurs greater Equal Min Occurs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Max Occurs greater Equal Min Occurs</em>' operation.
	 * @see dk.ingi.EBML.Element#maxOccurs_greaterEqualMinOccurs(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__MaxOccurs_greaterEqualMinOccurs__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#minver_nonNegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Minver non Negative</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Minver non Negative</em>' operation.
	 * @see dk.ingi.EBML.Element#minver_nonNegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__Minver_nonNegative__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#minOccurs_nonNegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Min Occurs non Negative</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Min Occurs non Negative</em>' operation.
	 * @see dk.ingi.EBML.Element#minOccurs_nonNegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__MinOccurs_nonNegative__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#unknownSizeAllowed_notTrueIfRecursiveIsTrue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unknown Size Allowed not True If Recursive Is True</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unknown Size Allowed not True If Recursive Is True</em>' operation.
	 * @see dk.ingi.EBML.Element#unknownSizeAllowed_notTrueIfRecursiveIsTrue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__UnknownSizeAllowed_notTrueIfRecursiveIsTrue__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#recursive_notTrueIfUnknownSizeAllowedIsTrue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Recursive not True If Unknown Size Allowed Is True</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Recursive not True If Unknown Size Allowed Is True</em>' operation.
	 * @see dk.ingi.EBML.Element#recursive_notTrueIfUnknownSizeAllowedIsTrue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__Recursive_notTrueIfUnknownSizeAllowedIsTrue__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#maxver_nonNegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Maxver non Negative</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Maxver non Negative</em>' operation.
	 * @see dk.ingi.EBML.Element#maxver_nonNegative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__Maxver_nonNegative__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#element_containedbyEBMLSchema(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Element containedby EBML Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Element containedby EBML Schema</em>' operation.
	 * @see dk.ingi.EBML.Element#element_containedbyEBMLSchema(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__Element_containedbyEBMLSchema__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#name_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Name valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name valid</em>' operation.
	 * @see dk.ingi.EBML.Element#name_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__Name_valid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#maxOccurs_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Max Occurs valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Max Occurs valid</em>' operation.
	 * @see dk.ingi.EBML.Element#maxOccurs_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__MaxOccurs_valid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#id_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Id valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Id valid</em>' operation.
	 * @see dk.ingi.EBML.Element#id_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__Id_valid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#type_onlyMasterCanBeRecursive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Type only Master Can Be Recursive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type only Master Can Be Recursive</em>' operation.
	 * @see dk.ingi.EBML.Element#type_onlyMasterCanBeRecursive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__Type_onlyMasterCanBeRecursive__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#range_isAllowed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Range is Allowed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Range is Allowed</em>' operation.
	 * @see dk.ingi.EBML.Element#range_isAllowed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__Range_isAllowed__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#recursive_ifTrueThenPathHasIsRecursivePart(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Recursive if True Then Path Has Is Recursive Part</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Recursive if True Then Path Has Is Recursive Part</em>' operation.
	 * @see dk.ingi.EBML.Element#recursive_ifTrueThenPathHasIsRecursivePart(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__Recursive_ifTrueThenPathHasIsRecursivePart__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#maxver_greaterOrEqualToMinver(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Maxver greater Or Equal To Minver</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Maxver greater Or Equal To Minver</em>' operation.
	 * @see dk.ingi.EBML.Element#maxver_greaterOrEqualToMinver(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__Maxver_greaterOrEqualToMinver__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#unknownSizeAllowed_isValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unknown Size Allowed is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unknown Size Allowed is Valid</em>' operation.
	 * @see dk.ingi.EBML.Element#unknownSizeAllowed_isValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__UnknownSizeAllowed_isValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Element#type_masterMustNotDeclareDefaultValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Type master Must Not Declare Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type master Must Not Declare Default Value</em>' operation.
	 * @see dk.ingi.EBML.Element#type_masterMustNotDeclareDefaultValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElement__Type_masterMustNotDeclareDefaultValue__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dk.ingi.EBML.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see dk.ingi.EBML.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Extension#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dk.ingi.EBML.Extension#getType()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Type();

	/**
	 * Returns the meta object for the attribute list '{@link dk.ingi.EBML.Extension#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see dk.ingi.EBML.Extension#getAnyAttribute()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_AnyAttribute();

	/**
	 * Returns the meta object for the attribute list '{@link dk.ingi.EBML.Extension#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see dk.ingi.EBML.Extension#getAny()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Any();

	/**
	 * Returns the meta object for the '{@link dk.ingi.EBML.Extension#containerType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Container Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Container Type</em>' operation.
	 * @see dk.ingi.EBML.Extension#containerType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getExtension__ContainerType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link dk.ingi.EBML.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see dk.ingi.EBML.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Documentation#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see dk.ingi.EBML.Documentation#getLang()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Lang();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Documentation#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see dk.ingi.EBML.Documentation#getPurpose()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Documentation#getSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple</em>'.
	 * @see dk.ingi.EBML.Documentation#getSimple()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Simple();

	/**
	 * Returns the meta object for class '{@link dk.ingi.EBML.ImplementationNote <em>Implementation Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Note</em>'.
	 * @see dk.ingi.EBML.ImplementationNote
	 * @generated
	 */
	EClass getImplementationNote();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.ImplementationNote#getNoteAttribute <em>Note Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Attribute</em>'.
	 * @see dk.ingi.EBML.ImplementationNote#getNoteAttribute()
	 * @see #getImplementationNote()
	 * @generated
	 */
	EAttribute getImplementationNote_NoteAttribute();

	/**
	 * Returns the meta object for class '{@link dk.ingi.EBML.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restriction</em>'.
	 * @see dk.ingi.EBML.Restriction
	 * @generated
	 */
	EClass getRestriction();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.ingi.EBML.Restriction#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum</em>'.
	 * @see dk.ingi.EBML.Restriction#getEnum()
	 * @see #getRestriction()
	 * @generated
	 */
	EReference getRestriction_Enum();

	/**
	 * Returns the meta object for class '{@link dk.ingi.EBML.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see dk.ingi.EBML.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.ingi.EBML.Enum#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see dk.ingi.EBML.Enum#getDocumentation()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Enum#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dk.ingi.EBML.Enum#getLabel()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Label();

	/**
	 * Returns the meta object for the attribute '{@link dk.ingi.EBML.Enum#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see dk.ingi.EBML.Enum#getValue()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Value();

	/**
	 * Returns the meta object for enum '{@link dk.ingi.EBML.DocumentationPurpose <em>Documentation Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Documentation Purpose</em>'.
	 * @see dk.ingi.EBML.DocumentationPurpose
	 * @generated
	 */
	EEnum getDocumentationPurpose();

	/**
	 * Returns the meta object for enum '{@link dk.ingi.EBML.NoteAttribute <em>Note Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Note Attribute</em>'.
	 * @see dk.ingi.EBML.NoteAttribute
	 * @generated
	 */
	EEnum getNoteAttribute();

	/**
	 * Returns the meta object for enum '{@link dk.ingi.EBML.DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Type</em>'.
	 * @see dk.ingi.EBML.DocumentType
	 * @generated
	 */
	EEnum getDocumentType();

	/**
	 * Returns the meta object for enum '{@link dk.ingi.EBML.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Type</em>'.
	 * @see dk.ingi.EBML.ElementType
	 * @generated
	 */
	EEnum getElementType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Zero One Boolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Zero One Boolean Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getZeroOneBooleanObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EBMLFactory getEBMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dk.ingi.EBML.impl.EBMLSchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.ingi.EBML.impl.EBMLSchemaImpl
		 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getEBMLSchema()
		 * @generated
		 */
		EClass EBML_SCHEMA = eINSTANCE.getEBMLSchema();

		/**
		 * The meta object literal for the '<em><b>Doc Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBML_SCHEMA__DOC_TYPE = eINSTANCE.getEBMLSchema_DocType();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBML_SCHEMA__VERSION = eINSTANCE.getEBMLSchema_Version();

		/**
		 * The meta object literal for the '<em><b>Ebml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBML_SCHEMA__EBML = eINSTANCE.getEBMLSchema_Ebml();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBML_SCHEMA__ELEMENT = eINSTANCE.getEBMLSchema_Element();

		/**
		 * The meta object literal for the '<em><b>Version not Negative</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EBML_SCHEMA___VERSION_NOT_NEGATIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEBMLSchema__Version_notNegative__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Ebml positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EBML_SCHEMA___EBML_POSITIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getEBMLSchema__Ebml_positive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dk.ingi.EBML.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.ingi.EBML.impl.ElementImpl
		 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__PATH = eINSTANCE.getElement_Path();

		/**
		 * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__MIN_OCCURS = eINSTANCE.getElement_MinOccurs();

		/**
		 * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__MAX_OCCURS = eINSTANCE.getElement_MaxOccurs();

		/**
		 * The meta object literal for the '<em><b>Minver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__MINVER = eINSTANCE.getElement_Minver();

		/**
		 * The meta object literal for the '<em><b>Maxver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__MAXVER = eINSTANCE.getElement_Maxver();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__DOCUMENTATION = eINSTANCE.getElement_Documentation();

		/**
		 * The meta object literal for the '<em><b>Implementation Note</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__IMPLEMENTATION_NOTE = eINSTANCE.getElement_ImplementationNote();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__EXTENSION = eINSTANCE.getElement_Extension();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__LENGTH = eINSTANCE.getElement_Length();

		/**
		 * The meta object literal for the '<em><b>Recurring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__RECURRING = eINSTANCE.getElement_Recurring();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__DEFAULT = eINSTANCE.getElement_Default();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__RANGE = eINSTANCE.getElement_Range();

		/**
		 * The meta object literal for the '<em><b>Unknown Size Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__UNKNOWN_SIZE_ALLOWED = eINSTANCE.getElement_UnknownSizeAllowed();

		/**
		 * The meta object literal for the '<em><b>Restriction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__RESTRICTION = eINSTANCE.getElement_Restriction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TYPE = eINSTANCE.getElement_Type();

		/**
		 * The meta object literal for the '<em><b>Recursive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__RECURSIVE = eINSTANCE.getElement_Recursive();

		/**
		 * The meta object literal for the '<em><b>Effective Max Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__EFFECTIVE_MAX_OCCURS = eINSTANCE.getElement_EffectiveMaxOccurs();

		/**
		 * The meta object literal for the '<em><b>Min Occurs defaultless When Greater Than One</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___MIN_OCCURS_DEFAULTLESS_WHEN_GREATER_THAN_ONE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElement__MinOccurs_defaultlessWhenGreaterThanOne__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Path if Has Is Recursive Part Then Recursive Is True</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___PATH_IF_HAS_IS_RECURSIVE_PART_THEN_RECURSIVE_IS_TRUE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElement__Path_ifHasIsRecursivePartThenRecursiveIsTrue__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Max Occurs greater Equal Min Occurs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___MAX_OCCURS_GREATER_EQUAL_MIN_OCCURS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElement__MaxOccurs_greaterEqualMinOccurs__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Minver non Negative</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___MINVER_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElement__Minver_nonNegative__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Min Occurs non Negative</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___MIN_OCCURS_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElement__MinOccurs_nonNegative__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unknown Size Allowed not True If Recursive Is True</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___UNKNOWN_SIZE_ALLOWED_NOT_TRUE_IF_RECURSIVE_IS_TRUE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElement__UnknownSizeAllowed_notTrueIfRecursiveIsTrue__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Recursive not True If Unknown Size Allowed Is True</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___RECURSIVE_NOT_TRUE_IF_UNKNOWN_SIZE_ALLOWED_IS_TRUE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElement__Recursive_notTrueIfUnknownSizeAllowedIsTrue__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Maxver non Negative</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___MAXVER_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElement__Maxver_nonNegative__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Element containedby EBML Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___ELEMENT_CONTAINEDBY_EBML_SCHEMA__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElement__Element_containedbyEBMLSchema__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Name valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___NAME_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getElement__Name_valid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Max Occurs valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___MAX_OCCURS_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElement__MaxOccurs_valid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Id valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___ID_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getElement__Id_valid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Type only Master Can Be Recursive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___TYPE_ONLY_MASTER_CAN_BE_RECURSIVE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElement__Type_onlyMasterCanBeRecursive__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Range is Allowed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___RANGE_IS_ALLOWED__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElement__Range_isAllowed__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Recursive if True Then Path Has Is Recursive Part</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___RECURSIVE_IF_TRUE_THEN_PATH_HAS_IS_RECURSIVE_PART__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElement__Recursive_ifTrueThenPathHasIsRecursivePart__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Maxver greater Or Equal To Minver</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___MAXVER_GREATER_OR_EQUAL_TO_MINVER__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElement__Maxver_greaterOrEqualToMinver__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unknown Size Allowed is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___UNKNOWN_SIZE_ALLOWED_IS_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElement__UnknownSizeAllowed_isValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Type master Must Not Declare Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___TYPE_MASTER_MUST_NOT_DECLARE_DEFAULT_VALUE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElement__Type_masterMustNotDeclareDefaultValue__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dk.ingi.EBML.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.ingi.EBML.impl.ExtensionImpl
		 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__TYPE = eINSTANCE.getExtension_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__ANY_ATTRIBUTE = eINSTANCE.getExtension_AnyAttribute();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__ANY = eINSTANCE.getExtension_Any();

		/**
		 * The meta object literal for the '<em><b>Container Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___CONTAINER_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getExtension__ContainerType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link dk.ingi.EBML.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.ingi.EBML.impl.DocumentationImpl
		 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__LANG = eINSTANCE.getDocumentation_Lang();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__PURPOSE = eINSTANCE.getDocumentation_Purpose();

		/**
		 * The meta object literal for the '<em><b>Simple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__SIMPLE = eINSTANCE.getDocumentation_Simple();

		/**
		 * The meta object literal for the '{@link dk.ingi.EBML.impl.ImplementationNoteImpl <em>Implementation Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.ingi.EBML.impl.ImplementationNoteImpl
		 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getImplementationNote()
		 * @generated
		 */
		EClass IMPLEMENTATION_NOTE = eINSTANCE.getImplementationNote();

		/**
		 * The meta object literal for the '<em><b>Note Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_NOTE__NOTE_ATTRIBUTE = eINSTANCE.getImplementationNote_NoteAttribute();

		/**
		 * The meta object literal for the '{@link dk.ingi.EBML.impl.RestrictionImpl <em>Restriction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.ingi.EBML.impl.RestrictionImpl
		 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getRestriction()
		 * @generated
		 */
		EClass RESTRICTION = eINSTANCE.getRestriction();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTRICTION__ENUM = eINSTANCE.getRestriction_Enum();

		/**
		 * The meta object literal for the '{@link dk.ingi.EBML.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.ingi.EBML.impl.EnumImpl
		 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__DOCUMENTATION = eINSTANCE.getEnum_Documentation();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__LABEL = eINSTANCE.getEnum_Label();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__VALUE = eINSTANCE.getEnum_Value();

		/**
		 * The meta object literal for the '{@link dk.ingi.EBML.DocumentationPurpose <em>Documentation Purpose</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.ingi.EBML.DocumentationPurpose
		 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getDocumentationPurpose()
		 * @generated
		 */
		EEnum DOCUMENTATION_PURPOSE = eINSTANCE.getDocumentationPurpose();

		/**
		 * The meta object literal for the '{@link dk.ingi.EBML.NoteAttribute <em>Note Attribute</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.ingi.EBML.NoteAttribute
		 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getNoteAttribute()
		 * @generated
		 */
		EEnum NOTE_ATTRIBUTE = eINSTANCE.getNoteAttribute();

		/**
		 * The meta object literal for the '{@link dk.ingi.EBML.DocumentType <em>Document Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.ingi.EBML.DocumentType
		 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getDocumentType()
		 * @generated
		 */
		EEnum DOCUMENT_TYPE = eINSTANCE.getDocumentType();

		/**
		 * The meta object literal for the '{@link dk.ingi.EBML.ElementType <em>Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.ingi.EBML.ElementType
		 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getElementType()
		 * @generated
		 */
		EEnum ELEMENT_TYPE = eINSTANCE.getElementType();

		/**
		 * The meta object literal for the '<em>Zero One Boolean Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see dk.ingi.EBML.impl.EBMLPackageImpl#getZeroOneBooleanObject()
		 * @generated
		 */
		EDataType ZERO_ONE_BOOLEAN_OBJECT = eINSTANCE.getZeroOneBooleanObject();

	}

} //EBMLPackage
