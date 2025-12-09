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
import dk.ingi.EBML.util.EBMLValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EBMLPackageImpl extends EPackageImpl implements EBMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ebmlSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentationPurposeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum noteAttributeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zeroOneBooleanObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dk.ingi.EBML.EBMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EBMLPackageImpl() {
		super(eNS_URI, EBMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EBMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EBMLPackage init() {
		if (isInited)
			return (EBMLPackage) EPackage.Registry.INSTANCE.getEPackage(EBMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEBMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EBMLPackageImpl theEBMLPackage = registeredEBMLPackage instanceof EBMLPackageImpl
				? (EBMLPackageImpl) registeredEBMLPackage
				: new EBMLPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEBMLPackage.createPackageContents();

		// Initialize created meta-data
		theEBMLPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theEBMLPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return EBMLValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theEBMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EBMLPackage.eNS_URI, theEBMLPackage);
		return theEBMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEBMLSchema() {
		return ebmlSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEBMLSchema_DocType() {
		return (EAttribute) ebmlSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEBMLSchema_Version() {
		return (EAttribute) ebmlSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEBMLSchema_Ebml() {
		return (EAttribute) ebmlSchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEBMLSchema_Element() {
		return (EReference) ebmlSchemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEBMLSchema__Version_notNegative__DiagnosticChain_Map() {
		return ebmlSchemaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEBMLSchema__Ebml_positive__DiagnosticChain_Map() {
		return ebmlSchemaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Name() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Path() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_MinOccurs() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_MaxOccurs() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Minver() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Maxver() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Documentation() {
		return (EReference) elementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_ImplementationNote() {
		return (EReference) elementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Extension() {
		return (EReference) elementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Id() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Length() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Recurring() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Default() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Range() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_UnknownSizeAllowed() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Restriction() {
		return (EReference) elementEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Type() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Recursive() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_EffectiveMaxOccurs() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__MinOccurs_defaultlessWhenGreaterThanOne__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__Path_ifHasIsRecursivePartThenRecursiveIsTrue__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__MaxOccurs_greaterEqualMinOccurs__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__Minver_nonNegative__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__MinOccurs_nonNegative__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__UnknownSizeAllowed_notTrueIfRecursiveIsTrue__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__Recursive_notTrueIfUnknownSizeAllowedIsTrue__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__Maxver_nonNegative__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__Element_containedbyEBMLSchema__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__Name_valid__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__MaxOccurs_valid__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__Id_valid__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__Type_onlyMasterCanBeRecursive__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__Range_isAllowed__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__Recursive_ifTrueThenPathHasIsRecursivePart__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__Maxver_greaterOrEqualToMinver__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__UnknownSizeAllowed_isValid__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__Type_masterMustNotDeclareDefaultValue__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtension_Type() {
		return (EAttribute) extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtension_AnyAttribute() {
		return (EAttribute) extensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtension_Any() {
		return (EAttribute) extensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExtension__ContainerType__DiagnosticChain_Map() {
		return extensionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentation() {
		return documentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentation_Lang() {
		return (EAttribute) documentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentation_Purpose() {
		return (EAttribute) documentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentation_Simple() {
		return (EAttribute) documentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImplementationNote() {
		return implementationNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImplementationNote_NoteAttribute() {
		return (EAttribute) implementationNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestriction() {
		return restrictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRestriction_Enum() {
		return (EReference) restrictionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnum() {
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnum_Documentation() {
		return (EReference) enumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnum_Label() {
		return (EAttribute) enumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnum_Value() {
		return (EAttribute) enumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDocumentationPurpose() {
		return documentationPurposeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNoteAttribute() {
		return noteAttributeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDocumentType() {
		return documentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getElementType() {
		return elementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZeroOneBooleanObject() {
		return zeroOneBooleanObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EBMLFactory getEBMLFactory() {
		return (EBMLFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		ebmlSchemaEClass = createEClass(EBML_SCHEMA);
		createEAttribute(ebmlSchemaEClass, EBML_SCHEMA__DOC_TYPE);
		createEAttribute(ebmlSchemaEClass, EBML_SCHEMA__VERSION);
		createEAttribute(ebmlSchemaEClass, EBML_SCHEMA__EBML);
		createEReference(ebmlSchemaEClass, EBML_SCHEMA__ELEMENT);
		createEOperation(ebmlSchemaEClass, EBML_SCHEMA___VERSION_NOT_NEGATIVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(ebmlSchemaEClass, EBML_SCHEMA___EBML_POSITIVE__DIAGNOSTICCHAIN_MAP);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEAttribute(elementEClass, ELEMENT__PATH);
		createEAttribute(elementEClass, ELEMENT__MIN_OCCURS);
		createEAttribute(elementEClass, ELEMENT__MAX_OCCURS);
		createEAttribute(elementEClass, ELEMENT__MINVER);
		createEAttribute(elementEClass, ELEMENT__MAXVER);
		createEReference(elementEClass, ELEMENT__DOCUMENTATION);
		createEReference(elementEClass, ELEMENT__IMPLEMENTATION_NOTE);
		createEReference(elementEClass, ELEMENT__EXTENSION);
		createEAttribute(elementEClass, ELEMENT__ID);
		createEAttribute(elementEClass, ELEMENT__LENGTH);
		createEAttribute(elementEClass, ELEMENT__RECURRING);
		createEAttribute(elementEClass, ELEMENT__DEFAULT);
		createEAttribute(elementEClass, ELEMENT__RANGE);
		createEAttribute(elementEClass, ELEMENT__UNKNOWN_SIZE_ALLOWED);
		createEReference(elementEClass, ELEMENT__RESTRICTION);
		createEAttribute(elementEClass, ELEMENT__TYPE);
		createEAttribute(elementEClass, ELEMENT__RECURSIVE);
		createEAttribute(elementEClass, ELEMENT__EFFECTIVE_MAX_OCCURS);
		createEOperation(elementEClass, ELEMENT___MAXVER_GREATER_OR_EQUAL_TO_MINVER__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass, ELEMENT___MAX_OCCURS_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass, ELEMENT___RANGE_IS_ALLOWED__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass,
				ELEMENT___RECURSIVE_IF_TRUE_THEN_PATH_HAS_IS_RECURSIVE_PART__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass, ELEMENT___MAX_OCCURS_GREATER_EQUAL_MIN_OCCURS__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass,
				ELEMENT___PATH_IF_HAS_IS_RECURSIVE_PART_THEN_RECURSIVE_IS_TRUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass,
				ELEMENT___UNKNOWN_SIZE_ALLOWED_NOT_TRUE_IF_RECURSIVE_IS_TRUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass, ELEMENT___TYPE_ONLY_MASTER_CAN_BE_RECURSIVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass, ELEMENT___MIN_OCCURS_DEFAULTLESS_WHEN_GREATER_THAN_ONE__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass, ELEMENT___MIN_OCCURS_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass, ELEMENT___MAXVER_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass, ELEMENT___ELEMENT_CONTAINEDBY_EBML_SCHEMA__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass, ELEMENT___NAME_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass, ELEMENT___ID_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass,
				ELEMENT___RECURSIVE_NOT_TRUE_IF_UNKNOWN_SIZE_ALLOWED_IS_TRUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass, ELEMENT___TYPE_MASTER_MUST_NOT_DECLARE_DEFAULT_VALUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass, ELEMENT___MINVER_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass, ELEMENT___UNKNOWN_SIZE_ALLOWED_IS_VALID__DIAGNOSTICCHAIN_MAP);

		extensionEClass = createEClass(EXTENSION);
		createEAttribute(extensionEClass, EXTENSION__TYPE);
		createEAttribute(extensionEClass, EXTENSION__ANY_ATTRIBUTE);
		createEAttribute(extensionEClass, EXTENSION__ANY);
		createEOperation(extensionEClass, EXTENSION___CONTAINER_TYPE__DIAGNOSTICCHAIN_MAP);

		documentationEClass = createEClass(DOCUMENTATION);
		createEAttribute(documentationEClass, DOCUMENTATION__LANG);
		createEAttribute(documentationEClass, DOCUMENTATION__PURPOSE);
		createEAttribute(documentationEClass, DOCUMENTATION__SIMPLE);

		implementationNoteEClass = createEClass(IMPLEMENTATION_NOTE);
		createEAttribute(implementationNoteEClass, IMPLEMENTATION_NOTE__NOTE_ATTRIBUTE);

		restrictionEClass = createEClass(RESTRICTION);
		createEReference(restrictionEClass, RESTRICTION__ENUM);

		enumEClass = createEClass(ENUM);
		createEReference(enumEClass, ENUM__DOCUMENTATION);
		createEAttribute(enumEClass, ENUM__LABEL);
		createEAttribute(enumEClass, ENUM__VALUE);

		// Create enums
		documentationPurposeEEnum = createEEnum(DOCUMENTATION_PURPOSE);
		noteAttributeEEnum = createEEnum(NOTE_ATTRIBUTE);
		documentTypeEEnum = createEEnum(DOCUMENT_TYPE);
		elementTypeEEnum = createEEnum(ELEMENT_TYPE);

		// Create data types
		zeroOneBooleanObjectEDataType = createEDataType(ZERO_ONE_BOOLEAN_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(ebmlSchemaEClass, EBMLSchema.class, "EBMLSchema", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEBMLSchema_DocType(), this.getDocumentType(), "docType", null, 1, 1, EBMLSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEBMLSchema_Version(), ecorePackage.getEInt(), "version", null, 1, 1, EBMLSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEBMLSchema_Ebml(), ecorePackage.getEInt(), "ebml", "1", 1, 1, EBMLSchema.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEBMLSchema_Element(), this.getElement(), null, "element", null, 0, -1, EBMLSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getEBMLSchema__Version_notNegative__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "version_notNegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEBMLSchema__Ebml_positive__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ebml_positive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Path(), ecorePackage.getEString(), "path", null, 1, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_MinOccurs(), ecorePackage.getEInt(), "minOccurs", "0", 1, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_MaxOccurs(), ecorePackage.getEString(), "maxOccurs", "unbounded", 0, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Minver(), ecorePackage.getEIntegerObject(), "minver", "1", 0, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Maxver(), ecorePackage.getEIntegerObject(), "maxver", null, 0, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Documentation(), this.getDocumentation(), null, "documentation", null, 0, -1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_ImplementationNote(), this.getImplementationNote(), null, "implementationNote", null,
				0, 7, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Extension(), this.getExtension(), null, "extension", null, 0, -1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Length(), ecorePackage.getEString(), "length", null, 0, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Recurring(), this.getZeroOneBooleanObject(), "recurring", "false", 1, 1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Default(), ecorePackage.getEString(), "default", null, 0, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Range(), ecorePackage.getEString(), "range", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_UnknownSizeAllowed(), this.getZeroOneBooleanObject(), "unknownSizeAllowed", "false",
				1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Restriction(), this.getRestriction(), null, "restriction", null, 0, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Type(), this.getElementType(), "type", null, 1, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Recursive(), this.getZeroOneBooleanObject(), "recursive", "false", 1, 1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_EffectiveMaxOccurs(), ecorePackage.getEInt(), "effectiveMaxOccurs", null, 1, 1,
				Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getElement__Maxver_greaterOrEqualToMinver__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "maxver_greaterOrEqualToMinver", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__MaxOccurs_valid__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"maxOccurs_valid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__Range_isAllowed__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"range_isAllowed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__Recursive_ifTrueThenPathHasIsRecursivePart__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "recursive_ifTrueThenPathHasIsRecursivePart", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__MaxOccurs_greaterEqualMinOccurs__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "maxOccurs_greaterEqualMinOccurs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__Path_ifHasIsRecursivePartThenRecursiveIsTrue__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "path_ifHasIsRecursivePartThenRecursiveIsTrue", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__UnknownSizeAllowed_notTrueIfRecursiveIsTrue__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "unknownSizeAllowed_notTrueIfRecursiveIsTrue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__Type_onlyMasterCanBeRecursive__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "type_onlyMasterCanBeRecursive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__MinOccurs_defaultlessWhenGreaterThanOne__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "minOccurs_defaultlessWhenGreaterThanOne", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__MinOccurs_nonNegative__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"minOccurs_nonNegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__Maxver_nonNegative__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"maxver_nonNegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__Element_containedbyEBMLSchema__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "element_containedbyEBMLSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__Name_valid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "name_valid", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__Id_valid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "id_valid", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__Recursive_notTrueIfUnknownSizeAllowedIsTrue__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "recursive_notTrueIfUnknownSizeAllowedIsTrue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__Type_masterMustNotDeclareDefaultValue__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "type_masterMustNotDeclareDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__Minver_nonNegative__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"minver_nonNegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__UnknownSizeAllowed_isValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"unknownSizeAllowed_isValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtension_Type(), ecorePackage.getEString(), "type", null, 1, 1, Extension.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1,
				Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtension_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Extension.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getExtension__ContainerType__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"containerType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentation_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, Documentation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Purpose(), this.getDocumentationPurpose(), "purpose", "definition", 1, 1,
				Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Simple(), theXMLTypePackage.getString(), "simple", null, 0, 1,
				Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(implementationNoteEClass, ImplementationNote.class, "ImplementationNote", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementationNote_NoteAttribute(), this.getNoteAttribute(), "noteAttribute", null, 1, 1,
				ImplementationNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(restrictionEClass, Restriction.class, "Restriction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestriction_Enum(), this.getEnum(), null, "enum", null, 0, -1, Restriction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumEClass, dk.ingi.EBML.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnum_Documentation(), this.getDocumentation(), null, "documentation", null, 0, -1,
				dk.ingi.EBML.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnum_Label(), ecorePackage.getEString(), "label", null, 0, 1, dk.ingi.EBML.Enum.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnum_Value(), ecorePackage.getEString(), "value", null, 1, 1, dk.ingi.EBML.Enum.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(documentationPurposeEEnum, DocumentationPurpose.class, "DocumentationPurpose");
		addEEnumLiteral(documentationPurposeEEnum, DocumentationPurpose.DEFINITION);
		addEEnumLiteral(documentationPurposeEEnum, DocumentationPurpose.RATIONALE);
		addEEnumLiteral(documentationPurposeEEnum, DocumentationPurpose.USAGE_NOTES);
		addEEnumLiteral(documentationPurposeEEnum, DocumentationPurpose.REFERENCES);

		initEEnum(noteAttributeEEnum, NoteAttribute.class, "NoteAttribute");
		addEEnumLiteral(noteAttributeEEnum, NoteAttribute.MIN_OCCURS);
		addEEnumLiteral(noteAttributeEEnum, NoteAttribute.MAX_OCCURS);
		addEEnumLiteral(noteAttributeEEnum, NoteAttribute.RANGE);
		addEEnumLiteral(noteAttributeEEnum, NoteAttribute.LENGTH);
		addEEnumLiteral(noteAttributeEEnum, NoteAttribute.DEFAULT);
		addEEnumLiteral(noteAttributeEEnum, NoteAttribute.MINVER);
		addEEnumLiteral(noteAttributeEEnum, NoteAttribute.MAXVER);

		initEEnum(documentTypeEEnum, DocumentType.class, "DocumentType");
		addEEnumLiteral(documentTypeEEnum, DocumentType.MATROSKA);

		initEEnum(elementTypeEEnum, ElementType.class, "ElementType");
		addEEnumLiteral(elementTypeEEnum, ElementType.INTEGER);
		addEEnumLiteral(elementTypeEEnum, ElementType.UINTEGER);
		addEEnumLiteral(elementTypeEEnum, ElementType.FLOAT);
		addEEnumLiteral(elementTypeEEnum, ElementType.STRING);
		addEEnumLiteral(elementTypeEEnum, ElementType.DATE);
		addEEnumLiteral(elementTypeEEnum, ElementType.UTF8);
		addEEnumLiteral(elementTypeEEnum, ElementType.MASTER);
		addEEnumLiteral(elementTypeEEnum, ElementType.BINARY);

		// Initialize data types
		initEDataType(zeroOneBooleanObjectEDataType, Boolean.class, "ZeroOneBooleanObject", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// https://ingi.dk/XMLDataConverter
		createXMLDataConverterAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "queryDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(ebmlSchemaEClass, source, new String[] { "constraints", "ebml_positive" });
		addAnnotation(elementEClass, source, new String[] { "constraints", "unknownSizeAllowed_isValid" });
		addAnnotation(extensionEClass, source, new String[] { "constraints", "containerType" });
	}

	/**
	 * Initializes the annotations for <b>https://ingi.dk/XMLDataConverter</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void createXMLDataConverterAnnotations() {
		((EDataType.Internal) zeroOneBooleanObjectEDataType)
				.setConversionDelegate(new EDataType.Internal.ConversionDelegate() {

					@Override
					public final String convertToString(final Object value) {
						if (value == null) {
							return null;
						}
						if (value instanceof final Boolean bool) {
							return bool ? "1" : "0";
						}
						throw new IllegalArgumentException("Not implemented to handle '" + value + "'.");
					}

					@Override
					public final Object createFromString(final String literal) {
						if (literal == null) {
							return null;
						}
						switch (literal.toLowerCase()) {
						case "false":
						case "0":
							return false;
						case "true":
						case "1":
							return true;
						default:
							throw new IllegalArgumentException("Not implemented to handle '" + literal + "'.");
						}

					}
				});
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getEBMLSchema__Version_notNegative__DiagnosticChain_Map(), source,
				new String[] { "body", "self.version >= 0" });
		addAnnotation(getEBMLSchema__Ebml_positive__DiagnosticChain_Map(), source,
				new String[] { "body", "self.ebml >= 1" });
		addAnnotation(getElement__Maxver_greaterOrEqualToMinver__DiagnosticChain_Map(), source, new String[] { "body",
				"\nlet effectiveMaxver : Integer = if self.maxver.oclIsUndefined()\n                                                   then self.oclContainer().oclAsType(EBMLSchema).version\n                                                   else self.maxver\n                                                   endif\nin\n    let effectiveMinver : Integer = if self.minver.oclIsUndefined()\n                                                      then 1\n                                                      else self.minver\n                                                      endif\n    in\n        effectiveMinver <= effectiveMaxver " });
		addAnnotation(getElement__MaxOccurs_valid__DiagnosticChain_Map(), source,
				new String[] { "body", "self.maxOccurs.matches(\'^(unbounded|0|[1-9][0-9]*)$\')" });
		addAnnotation(getElement__Range_isAllowed__DiagnosticChain_Map(), source, new String[] { "body",
				"not self.range.oclIsUndefined()\nimplies\nSet{ElementType::INTEGER, ElementType::UINTEGER, ElementType::FLOAT, ElementType::DATE}->includes(self.type)" });
		addAnnotation(getElement__Recursive_ifTrueThenPathHasIsRecursivePart__DiagnosticChain_Map(), source,
				new String[] { "body",
						"(not self.recursive.oclIsUndefined() and self.recursive = true)\nimplies\nnot self.path.oclIsUndefined()\nand let i : Integer = self.path.lastIndexOf(\'\\\\\') in (i > 0 and self.path.size() > i+1 and self.path.at(i+1) = \'+\')" });
		addAnnotation(getElement__MaxOccurs_greaterEqualMinOccurs__DiagnosticChain_Map(), source,
				new String[] { "body", "self.minOccurs <= self.effectiveMaxOccurs" });
		addAnnotation(getElement__Path_ifHasIsRecursivePartThenRecursiveIsTrue__DiagnosticChain_Map(), source,
				new String[] { "body",
						"let i : Integer = self.path.lastIndexOf(\'\\\\\')\nin if self.path.oclIsUndefined() or self.path.size() < i or i = -1\nthen true\nelse self.path.at(i+1) = \'+\' implies (not self.recursive.oclIsUndefined() and self.recursive = true)\nendif" });
		addAnnotation(getElement__UnknownSizeAllowed_notTrueIfRecursiveIsTrue__DiagnosticChain_Map(), source,
				new String[] { "body",
						"(not self.unknownSizeAllowed.oclIsUndefined() and self.unknownSizeAllowed = true)\nimplies\n(self.recursive.oclIsUndefined() or self.recursive = false)" });
		addAnnotation(getElement__Type_onlyMasterCanBeRecursive__DiagnosticChain_Map(), source,
				new String[] { "body", "self.recursive = true implies self.type = ElementType::MASTER" });
		addAnnotation(getElement__MinOccurs_defaultlessWhenGreaterThanOne__DiagnosticChain_Map(), source,
				new String[] { "body", "self.minOccurs > 1 implies self.default.oclIsUndefined()" });
		addAnnotation(getElement__MinOccurs_nonNegative__DiagnosticChain_Map(), source,
				new String[] { "body", "self.minOccurs >= 0" });
		addAnnotation(getElement__Maxver_nonNegative__DiagnosticChain_Map(), source,
				new String[] { "body", "not self.maxver.oclIsUndefined() implies self.maxver >= 0" });
		addAnnotation(getElement__Element_containedbyEBMLSchema__DiagnosticChain_Map(), source,
				new String[] { "body", "self.oclContainer().oclIsTypeOf(EBMLSchema)" });
		addAnnotation(getElement__Name_valid__DiagnosticChain_Map(), source, new String[] { "body",
				"not self.name.oclIsUndefined() implies self.name.matches(\'^[A-Za-z0-9][A-Za-z0-9.-]*$\')" });
		addAnnotation(getElement__Id_valid__DiagnosticChain_Map(), source, new String[] { "body",
				"not self.id.oclIsUndefined() implies self.id.matches(\'^0x([0-9A-F][0-9A-F])+$\')" });
		addAnnotation(getElement__Recursive_notTrueIfUnknownSizeAllowedIsTrue__DiagnosticChain_Map(), source,
				new String[] { "body",
						"(not self.recursive.oclIsUndefined() and self.recursive = true)\nimplies\n(self.unknownSizeAllowed.oclIsUndefined() or self.unknownSizeAllowed = false)" });
		addAnnotation(getElement__Type_masterMustNotDeclareDefaultValue__DiagnosticChain_Map(), source,
				new String[] { "body", "self.type = ElementType::MASTER implies self.default.oclIsUndefined()" });
		addAnnotation(getElement__Minver_nonNegative__DiagnosticChain_Map(), source,
				new String[] { "body", "not self.minver.oclIsUndefined()\nimplies\nself.minver >= 0" });
		addAnnotation(getElement__UnknownSizeAllowed_isValid__DiagnosticChain_Map(), source, new String[] { "body",
				"if self.unknownSizeAllowed.oclIsUndefined() or self.unknownSizeAllowed = false then true else let i : Integer = self.path.lastIndexOf(\'\\\\\')\nin if i = -1 or i = 1\n     then true\n     else\n     let parentPath : String = self.path.substring(1, i-1)\n     in  Element.allInstances()->exists(e: Element | e.path = parentPath and e.unknownSizeAllowed = true) endif endif\n     \n     " });
		addAnnotation(getExtension__ContainerType__DiagnosticChain_Map(), source,
				new String[] { "body", "self.oclContainer().oclIsTypeOf(Element)" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation(getEBMLSchema__Version_notNegative__DiagnosticChain_Map(), source, new String[] { "body",
				"final <%java.lang.String%> constraintName = \"EBMLSchema::version_notNegative\";\ntry {\n\t/**\n\t *\n\t * inv version_notNegative:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let result : Boolean[1] = self.version >= 0\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.EBML_SCHEMA___VERSION_NOT_NEGATIVE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid*/ int version = this.getVersion();\n\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> BOXED_version = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.integerValueOf(version);\n\t\tfinal /*@NonInvalid*/ boolean result = <%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%>.INSTANCE.evaluate(executor, BOXED_version, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getEBMLSchema__Ebml_positive__DiagnosticChain_Map(), source, new String[] { "body",
				"final <%java.lang.String%> constraintName = \"EBMLSchema::ebml_positive\";\ntry {\n\t/**\n\t *\n\t * inv ebml_positive:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let result : Boolean[1] = self.ebml >= 1\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.EBML_SCHEMA___EBML_POSITIVE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid*/ int ebml = this.getEbml();\n\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> BOXED_ebml = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.integerValueOf(ebml);\n\t\tfinal /*@NonInvalid*/ boolean result = <%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%>.INSTANCE.evaluate(executor, BOXED_ebml, <%dk.ingi.EBML.EBMLTables%>.INT_1).booleanValue();\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getEBMLSchema_DocType(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!EBMLSchema!docType" });
		addAnnotation(getEBMLSchema_Version(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!EBMLSchema!version" });
		addAnnotation(getEBMLSchema_Ebml(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!EBMLSchema!ebml" });
		addAnnotation(getEBMLSchema_Element(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!EBMLSchema!element" });
		addAnnotation(getElement__Maxver_greaterOrEqualToMinver__DiagnosticChain_Map(), source, new String[] { "body",
				"final <%java.lang.String%> constraintName = \"Element::maxver_greaterOrEqualToMinver\";\ntry {\n\t/**\n\t *\n\t * inv maxver_greaterOrEqualToMinver:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[1] = let\n\t *           effectiveMaxver : Integer[?] = if self.maxver.oclIsUndefined()\n\t *           then self.oclContainer().oclAsType(EBMLSchema).version\n\t *           else self.maxver\n\t *           endif\n\t *         in\n\t *           let\n\t *             effectiveMinver : Integer[?] = if self.minver.oclIsUndefined()\n\t *             then 1\n\t *             else self.minver\n\t *             endif\n\t *           in effectiveMinver <= effectiveMaxver\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___MAXVER_GREATER_OR_EQUAL_TO_MINVER__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_le_0;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.Integer%> maxver_0 = this.getMaxver();\n\t\t\tfinal /*@NonInvalid*/ boolean oclIsUndefined = maxver_0 == null;\n\t\t\t/*@Thrown*/ <%java.lang.Integer%> effectiveMaxver;\n\t\t\tif (oclIsUndefined) {\n\t\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.Class%> TYP_EBML_c_c_EBMLSchema_0 = idResolver.getClass(<%dk.ingi.EBML.EBMLTables%>.CLSSid_EBMLSchema, null);\n\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Object%> oclContainer = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(executor, this);\n\t\t\t\tfinal /*@Thrown*/ <%dk.ingi.EBML.EBMLSchema%> oclAsType = (<%dk.ingi.EBML.EBMLSchema%>)<%org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation%>.INSTANCE.evaluate(executor, oclContainer, TYP_EBML_c_c_EBMLSchema_0);\n\t\t\t\tfinal /*@Thrown*/ int version = oclAsType.getVersion();\n\t\t\t\teffectiveMaxver = (<%java.lang.Integer%>)version;\n\t\t\t}\n\t\t\telse {\n\t\t\t\teffectiveMaxver = maxver_0;\n\t\t\t}\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.Integer%> minver_0 = this.getMinver();\n\t\t\tfinal /*@NonInvalid*/ boolean oclIsUndefined_0 = minver_0 == null;\n\t\t\t/*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> effectiveMinver;\n\t\t\tif (oclIsUndefined_0) {\n\t\t\t\teffectiveMinver = <%dk.ingi.EBML.EBMLTables%>.INT_1;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> BOXED_minver_0 = minver_0 == null ? null : <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.integerValueOf(minver_0);\n\t\t\t\teffectiveMinver = BOXED_minver_0;\n\t\t\t}\n\t\t\tif (effectiveMinver == null) {\n\t\t\t\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null \\\'\\\'OclComparable\\\'\\\' rather than \\\'\\\'OclVoid\\\'\\\' value required\");\n\t\t\t}\n\t\t\tif (effectiveMaxver == null) {\n\t\t\t\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null \\\'\\\'OclSelf\\\'\\\' rather than \\\'\\\'OclVoid\\\'\\\' value required\");\n\t\t\t}\n\t\t\tfinal /*@Thrown*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> BOXED_effectiveMaxver = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.integerValueOf(effectiveMaxver);\n\t\t\tif (BOXED_effectiveMaxver instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\n\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)BOXED_effectiveMaxver;\n\t\t\t}\n\t\t\tfinal /*@Thrown*/ boolean le_0 = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, effectiveMinver, BOXED_effectiveMaxver).booleanValue();\n\t\t\tCAUGHT_le_0 = le_0;\n\t\t}\n\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\tCAUGHT_le_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_le_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__MaxOccurs_valid__DiagnosticChain_Map(), source, new String[] { "body",
				"final <%java.lang.String%> constraintName = \"Element::maxOccurs_valid\";\ntry {\n\t/**\n\t *\n\t * inv maxOccurs_valid:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[1] = self.maxOccurs.matches(\'^(unbounded|0|[1-9][0-9]*)$\')\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___MAX_OCCURS_VALID__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.String%> maxOccurs = this.getMaxOccurs();\n\t\t\tif (maxOccurs == null) {\n\t\t\t\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null \\\'\\\'String\\\'\\\' rather than \\\'\\\'OclVoid\\\'\\\' value required\");\n\t\t\t}\n\t\t\tfinal /*@Thrown*/ boolean result = <%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, maxOccurs, <%dk.ingi.EBML.EBMLTables%>.STR__94_o_unbounded_124_0_124_91_1_m_9_93_91_0_m_9_93_a_e_$).booleanValue();\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__Range_isAllowed__DiagnosticChain_Map(), source, new String[] { "body",
				"final <%java.lang.String%> constraintName = \"Element::range_isAllowed\";\ntry {\n\t/**\n\t *\n\t * inv range_isAllowed:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = not self.range.oclIsUndefined() implies\n\t *         Set{ElementType::INTEGER, ElementType::UINTEGER, ElementType::FLOAT, ElementType::DATE\n\t *         }\n\t *         ->includes(self.type)\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___RANGE_IS_ALLOWED__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.String%> range = this.getRange();\n\t\t\tfinal /*@NonInvalid*/ boolean oclIsUndefined = range == null;\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> not;\n\t\t\tif (!oclIsUndefined) {\n\t\t\t\tnot = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tif (oclIsUndefined) {\n\t\t\t\t\tnot = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tnot = null;\n\t\t\t\t}\n\t\t\t}\n\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> result;\n\t\t\tif (not == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid*/ <%dk.ingi.EBML.ElementType%> type = this.getType();\n\t\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.ids.EnumerationLiteralId%> BOXED_type = <%dk.ingi.EBML.EBMLTables%>.ENUMid_ElementType.getEnumerationLiteralId(<%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(type.getName()));\n\t\t\t\tfinal /*@NonInvalid*/ boolean includes = <%org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation%>.INSTANCE.evaluate(<%dk.ingi.EBML.EBMLTables%>.Set, BOXED_type).booleanValue();\n\t\t\t\tif (includes) {\n\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\tresult = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__Recursive_ifTrueThenPathHasIsRecursivePart__DiagnosticChain_Map(), source,
				new String[] { "body",
						"final <%java.lang.String%> constraintName = \"Element::recursive_ifTrueThenPathHasIsRecursivePart\";\ntry {\n\t/**\n\t *\n\t * inv recursive_ifTrueThenPathHasIsRecursivePart:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = not self.recursive.oclIsUndefined() and self.recursive = true implies\n\t *         not self.path.oclIsUndefined() and\n\t *         let i : Integer[1] = self.path.lastIndexOf(\'\\\\\')\n\t *         in i > 0 and\n\t *           self.path.size() > i + 1 and\n\t *           self.path.at(i + 1) = \'+\'\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___RECURSIVE_IF_TRUE_THEN_PATH_HAS_IS_RECURSIVE_PART__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_result;\n\t\ttry {\n\t\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_and;\n\t\t\ttry {\n\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> not = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> and;\n\t\t\t\tif (not == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\tand = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> recursive = this.getRecursive();\n\t\t\t\t\tfinal /*@NonInvalid*/ boolean eq = recursive;\n\t\t\t\t\tif (!eq) {\n\t\t\t\t\t\tand = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\t\tand = null;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\n\t\t\t\t\t\t\tand = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\tCAUGHT_and = and;\n\t\t\t}\n\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\tCAUGHT_and = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t}\n\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> result;\n\t\t\tif (CAUGHT_and == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_and_2;\n\t\t\t\ttry {\n\t\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> not_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> and_2;\n\t\t\t\t\tif (not_0 == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\t\tand_2 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_and_1;\n\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.String%> path = this.getPath();\n\t\t\t\t\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> i = <%org.eclipse.ocl.pivot.library.string.StringLastIndexOfOperation%>.INSTANCE.evaluate(path, <%dk.ingi.EBML.EBMLTables%>.STR__92);\n\t\t\t\t\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> sum = (<%org.eclipse.ocl.pivot.values.IntegerValue%>)<%org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation%>.INSTANCE.evaluate(i, <%dk.ingi.EBML.EBMLTables%>.INT_1);\n\t\t\t\t\t\t\tfinal /*@NonInvalid*/ boolean gt = <%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation%>.INSTANCE.evaluate(executor, i, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\t\t\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> and_0;\n\t\t\t\t\t\t\tif (!gt) {\n\t\t\t\t\t\t\t\tand_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> size = <%org.eclipse.ocl.pivot.library.string.StringSizeOperation%>.INSTANCE.evaluate(path);\n\t\t\t\t\t\t\t\tfinal /*@NonInvalid*/ boolean gt_0 = <%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation%>.INSTANCE.evaluate(executor, size, sum).booleanValue();\n\t\t\t\t\t\t\t\tif (!gt_0) {\n\t\t\t\t\t\t\t\t\tand_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\t\tand_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> and_1;\n\t\t\t\t\t\t\tif (and_0 == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\t\t\t\tand_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_eq_0;\n\t\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\t\tfinal /*@Thrown*/ <%java.lang.String%> at = <%org.eclipse.ocl.pivot.library.string.StringAtOperation%>.INSTANCE.evaluate(path, sum);\n\t\t\t\t\t\t\t\t\tfinal /*@Thrown*/ boolean eq_0 = at.equals(<%dk.ingi.EBML.EBMLTables%>.STR_sum);\n\t\t\t\t\t\t\t\t\tCAUGHT_eq_0 = eq_0;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\t\t\t\t\tCAUGHT_eq_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\tif (CAUGHT_eq_0 == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\t\t\t\t\tand_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\t\tif (CAUGHT_eq_0 instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\n\t\t\t\t\t\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)CAUGHT_eq_0;\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\tif (and_0 == null) {\n\t\t\t\t\t\t\t\t\t\tand_1 = null;\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\t\t\tand_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tCAUGHT_and_1 = and_1;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\t\t\tCAUGHT_and_1 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t\t\t}\n\t\t\t\t\t\tif (CAUGHT_and_1 == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\t\t\tand_2 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\n\t\t\t\t\t\t\tif (CAUGHT_and_1 instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\n\t\t\t\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)CAUGHT_and_1;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tif ((not_0 == null) || (CAUGHT_and_1 == null)) {\n\t\t\t\t\t\t\t\tand_2 = null;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\tand_2 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t\tCAUGHT_and_2 = and_2;\n\t\t\t\t}\n\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\tCAUGHT_and_2 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\tif (CAUGHT_and_2 == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (CAUGHT_and instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\n\t\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)CAUGHT_and;\n\t\t\t\t\t}\n\t\t\t\t\tif (CAUGHT_and_2 instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\n\t\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)CAUGHT_and_2;\n\t\t\t\t\t}\n\t\t\t\t\tif ((CAUGHT_and == null) || (CAUGHT_and_2 == null)) {\n\t\t\t\t\t\tresult = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__MaxOccurs_greaterEqualMinOccurs__DiagnosticChain_Map(), source, new String[] { "body",
				"final <%java.lang.String%> constraintName = \"Element::maxOccurs_greaterEqualMinOccurs\";\ntry {\n\t/**\n\t *\n\t * inv maxOccurs_greaterEqualMinOccurs:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let result : Boolean[1] = self.minOccurs <= self.effectiveMaxOccurs\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___MAX_OCCURS_GREATER_EQUAL_MIN_OCCURS__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid*/ int minOccurs = this.getMinOccurs();\n\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> BOXED_minOccurs = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.integerValueOf(minOccurs);\n\t\tfinal /*@NonInvalid*/ int effectiveMaxOccurs = this.getEffectiveMaxOccurs();\n\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> BOXED_effectiveMaxOccurs = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.integerValueOf(effectiveMaxOccurs);\n\t\tfinal /*@NonInvalid*/ boolean result = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, BOXED_minOccurs, BOXED_effectiveMaxOccurs).booleanValue();\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__Path_ifHasIsRecursivePartThenRecursiveIsTrue__DiagnosticChain_Map(), source,
				new String[] { "body",
						"final <%java.lang.String%> constraintName = \"Element::path_ifHasIsRecursivePartThenRecursiveIsTrue\";\ntry {\n\t/**\n\t *\n\t * inv path_ifHasIsRecursivePartThenRecursiveIsTrue:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = let\n\t *           i : Integer[1] = self.path.lastIndexOf(\'\\\\\')\n\t *         in\n\t *           if self.path.oclIsUndefined() or self.path.size() < i or i = -1\n\t *           then true\n\t *           else\n\t *             self.path.at(i + 1) = \'+\' implies\n\t *             not self.recursive.oclIsUndefined() and self.recursive = true\n\t *           endif\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___PATH_IF_HAS_IS_RECURSIVE_PART_THEN_RECURSIVE_IS_TRUE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_IF_or_0;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.String%> path = this.getPath();\n\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> i = <%org.eclipse.ocl.pivot.library.string.StringLastIndexOfOperation%>.INSTANCE.evaluate(path, <%dk.ingi.EBML.EBMLTables%>.STR__92);\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> or;\n\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> size = <%org.eclipse.ocl.pivot.library.string.StringSizeOperation%>.INSTANCE.evaluate(path);\n\t\t\tfinal /*@NonInvalid*/ boolean lt = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation%>.INSTANCE.evaluate(executor, size, i).booleanValue();\n\t\t\tor = lt;\n\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> or_0;\n\t\t\tif (or == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\tor_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> diff = (<%org.eclipse.ocl.pivot.values.IntegerValue%>)<%org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation%>.INSTANCE.evaluate(<%dk.ingi.EBML.EBMLTables%>.INT_1);\n\t\t\t\tfinal /*@NonInvalid*/ boolean eq = i.equals(diff);\n\t\t\t\tif (eq) {\n\t\t\t\t\tor_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (or == null) {\n\t\t\t\t\t\tor_0 = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tor_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tif (or_0 == null) {\n\t\t\t\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null if condition\");\n\t\t\t}\n\t\t\t/*@Thrown*/ <%java.lang.Boolean%> IF_or_0;\n\t\t\tif (or_0) {\n\t\t\t\tIF_or_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_eq_0;\n\t\t\t\ttry {\n\t\t\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> sum = (<%org.eclipse.ocl.pivot.values.IntegerValue%>)<%org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation%>.INSTANCE.evaluate(i, <%dk.ingi.EBML.EBMLTables%>.INT_1);\n\t\t\t\t\tfinal /*@Thrown*/ <%java.lang.String%> at = <%org.eclipse.ocl.pivot.library.string.StringAtOperation%>.INSTANCE.evaluate(path, sum);\n\t\t\t\t\tfinal /*@Thrown*/ boolean eq_0 = at.equals(<%dk.ingi.EBML.EBMLTables%>.STR_sum);\n\t\t\t\t\tCAUGHT_eq_0 = eq_0;\n\t\t\t\t}\n\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\tCAUGHT_eq_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> implies;\n\t\t\t\tif (CAUGHT_eq_0 == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\timplies = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_and;\n\t\t\t\t\ttry {\n\t\t\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> not = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> and;\n\t\t\t\t\t\tif (not == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\t\t\tand = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\n\t\t\t\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> recursive = this.getRecursive();\n\t\t\t\t\t\t\tfinal /*@NonInvalid*/ boolean eq_1 = recursive;\n\t\t\t\t\t\t\tif (!eq_1) {\n\t\t\t\t\t\t\t\tand = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\t\t\t\tand = null;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\t\tand = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t}\n\t\t\t\t\t\tCAUGHT_and = and;\n\t\t\t\t\t}\n\t\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\t\tCAUGHT_and = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t\t}\n\t\t\t\t\tif (CAUGHT_and == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\t\t\timplies = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tif (CAUGHT_eq_0 instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\n\t\t\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)CAUGHT_eq_0;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tif (CAUGHT_and instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\n\t\t\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)CAUGHT_and;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tif (CAUGHT_and == null) {\n\t\t\t\t\t\t\timplies = null;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\n\t\t\t\t\t\t\timplies = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\tIF_or_0 = implies;\n\t\t\t}\n\t\t\tCAUGHT_IF_or_0 = IF_or_0;\n\t\t}\n\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\tCAUGHT_IF_or_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_IF_or_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__UnknownSizeAllowed_notTrueIfRecursiveIsTrue__DiagnosticChain_Map(), source,
				new String[] { "body",
						"final <%java.lang.String%> constraintName = \"Element::unknownSizeAllowed_notTrueIfRecursiveIsTrue\";\ntry {\n\t/**\n\t *\n\t * inv unknownSizeAllowed_notTrueIfRecursiveIsTrue:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = not self.unknownSizeAllowed.oclIsUndefined() and self.unknownSizeAllowed = true implies\n\t *         self.recursive.oclIsUndefined() or self.recursive = false\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___UNKNOWN_SIZE_ALLOWED_NOT_TRUE_IF_RECURSIVE_IS_TRUE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_result;\n\t\ttry {\n\t\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_and;\n\t\t\ttry {\n\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> not = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> and;\n\t\t\t\tif (not == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\tand = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> unknownSizeAllowed = this.getUnknownSizeAllowed();\n\t\t\t\t\tfinal /*@NonInvalid*/ boolean eq = unknownSizeAllowed;\n\t\t\t\t\tif (!eq) {\n\t\t\t\t\t\tand = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\t\tand = null;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\n\t\t\t\t\t\t\tand = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\tCAUGHT_and = and;\n\t\t\t}\n\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\tCAUGHT_and = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t}\n\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> result;\n\t\t\tif (CAUGHT_and == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> or;\n\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> recursive = this.getRecursive();\n\t\t\t\tfinal /*@NonInvalid*/ boolean eq_0 = !recursive;\n\t\t\t\tor = eq_0;\n\t\t\t\tif (or == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (CAUGHT_and instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\n\t\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)CAUGHT_and;\n\t\t\t\t\t}\n\t\t\t\t\tif ((CAUGHT_and == null) || (or == null)) {\n\t\t\t\t\t\tresult = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__Type_onlyMasterCanBeRecursive__DiagnosticChain_Map(), source, new String[] { "body",
				"final <%java.lang.String%> constraintName = \"Element::type_onlyMasterCanBeRecursive\";\ntry {\n\t/**\n\t *\n\t * inv type_onlyMasterCanBeRecursive:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let result : Boolean[?] = self.recursive = true implies self.type = ElementType::MASTER\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___TYPE_ONLY_MASTER_CAN_BE_RECURSIVE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> recursive = this.getRecursive();\n\t\tfinal /*@NonInvalid*/ boolean eq = recursive;\n\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> result;\n\t\tif (!eq) {\n\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid*/ <%dk.ingi.EBML.ElementType%> type = this.getType();\n\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.ids.EnumerationLiteralId%> BOXED_type = <%dk.ingi.EBML.EBMLTables%>.ENUMid_ElementType.getEnumerationLiteralId(<%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(type.getName()));\n\t\t\tfinal /*@NonInvalid*/ boolean eq_0 = BOXED_type == <%dk.ingi.EBML.EBMLTables%>.ELITid_MASTER;\n\t\t\tif (eq_0) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t}\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__MinOccurs_defaultlessWhenGreaterThanOne__DiagnosticChain_Map(), source, new String[] {
				"body",
				"final <%java.lang.String%> constraintName = \"Element::minOccurs_defaultlessWhenGreaterThanOne\";\ntry {\n\t/**\n\t *\n\t * inv minOccurs_defaultlessWhenGreaterThanOne:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let result : Boolean[?] = self.minOccurs > 1 implies\n\t *         self.default.oclIsUndefined()\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___MIN_OCCURS_DEFAULTLESS_WHEN_GREATER_THAN_ONE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid*/ int minOccurs = this.getMinOccurs();\n\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> BOXED_minOccurs = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.integerValueOf(minOccurs);\n\t\tfinal /*@NonInvalid*/ boolean gt = <%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation%>.INSTANCE.evaluate(executor, BOXED_minOccurs, <%dk.ingi.EBML.EBMLTables%>.INT_1).booleanValue();\n\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> result;\n\t\tif (!gt) {\n\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.String%> default1 = this.getDefault();\n\t\t\tfinal /*@NonInvalid*/ boolean oclIsUndefined = default1 == null;\n\t\t\tif (oclIsUndefined) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t}\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__MinOccurs_nonNegative__DiagnosticChain_Map(), source, new String[] { "body",
				"final <%java.lang.String%> constraintName = \"Element::minOccurs_nonNegative\";\ntry {\n\t/**\n\t *\n\t * inv minOccurs_nonNegative:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let result : Boolean[1] = self.minOccurs >= 0\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___MIN_OCCURS_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid*/ int minOccurs = this.getMinOccurs();\n\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> BOXED_minOccurs = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.integerValueOf(minOccurs);\n\t\tfinal /*@NonInvalid*/ boolean result = <%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%>.INSTANCE.evaluate(executor, BOXED_minOccurs, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__Maxver_nonNegative__DiagnosticChain_Map(), source, new String[] { "body",
				"final <%java.lang.String%> constraintName = \"Element::maxver_nonNegative\";\ntry {\n\t/**\n\t *\n\t * inv maxver_nonNegative:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = not self.maxver.oclIsUndefined() implies self.maxver >= 0\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___MAXVER_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.Integer%> maxver = this.getMaxver();\n\t\t\tfinal /*@NonInvalid*/ boolean oclIsUndefined = maxver == null;\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> not;\n\t\t\tif (!oclIsUndefined) {\n\t\t\t\tnot = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tif (oclIsUndefined) {\n\t\t\t\t\tnot = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tnot = null;\n\t\t\t\t}\n\t\t\t}\n\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> result;\n\t\t\tif (not == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_ge;\n\t\t\t\ttry {\n\t\t\t\t\tif (maxver == null) {\n\t\t\t\t\t\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null \\\'\\\'OclComparable\\\'\\\' rather than \\\'\\\'OclVoid\\\'\\\' value required\");\n\t\t\t\t\t}\n\t\t\t\t\tfinal /*@Thrown*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> BOXED_maxver_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.integerValueOf(maxver);\n\t\t\t\t\tfinal /*@Thrown*/ boolean ge = <%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%>.INSTANCE.evaluate(executor, BOXED_maxver_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\t\t\t\tCAUGHT_ge = ge;\n\t\t\t\t}\n\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\tCAUGHT_ge = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\tif (CAUGHT_ge == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (CAUGHT_ge instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\n\t\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)CAUGHT_ge;\n\t\t\t\t\t}\n\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\tresult = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__Element_containedbyEBMLSchema__DiagnosticChain_Map(), source, new String[] { "body",
				"final <%java.lang.String%> constraintName = \"Element::element_containedbyEBMLSchema\";\ntry {\n\t/**\n\t *\n\t * inv element_containedbyEBMLSchema:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[1] = self.oclContainer()\n\t *         .oclIsTypeOf(EBMLSchema)\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___ELEMENT_CONTAINEDBY_EBML_SCHEMA__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.Class%> TYP_EBML_c_c_EBMLSchema = idResolver.getClass(<%dk.ingi.EBML.EBMLTables%>.CLSSid_EBMLSchema, null);\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.Object%> oclContainer = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(executor, this);\n\t\t\tfinal /*@Thrown*/ boolean result = <%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%>.INSTANCE.evaluate(executor, oclContainer, TYP_EBML_c_c_EBMLSchema).booleanValue();\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__Name_valid__DiagnosticChain_Map(), source, new String[] { "body",
				"final <%java.lang.String%> constraintName = \"Element::name_valid\";\ntry {\n\t/**\n\t *\n\t * inv name_valid:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = not self.name.oclIsUndefined() implies\n\t *         self.name.matches(\'^[A-Za-z0-9][A-Za-z0-9.-]*$\')\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___NAME_VALID__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> not = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> result;\n\t\t\tif (not == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.String%> name = this.getName();\n\t\t\t\tfinal /*@NonInvalid*/ boolean matches = <%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, name, <%dk.ingi.EBML.EBMLTables%>.STR__94_91_A_m_Za_m_z0_m_9_93_91_A_m_Za_m_z0_m_9_m_93_a_$).booleanValue();\n\t\t\t\tif (matches) {\n\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\tresult = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__Id_valid__DiagnosticChain_Map(), source, new String[] { "body",
				"final <%java.lang.String%> constraintName = \"Element::id_valid\";\ntry {\n\t/**\n\t *\n\t * inv id_valid:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = not self.id.oclIsUndefined() implies\n\t *         self.id.matches(\'^0x([0-9A-F][0-9A-F])+$\')\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___ID_VALID__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> not = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> result;\n\t\t\tif (not == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.String%> id = this.getId();\n\t\t\t\tfinal /*@NonInvalid*/ boolean matches = <%org.eclipse.ocl.pivot.library.string.StringMatchesOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, id, <%dk.ingi.EBML.EBMLTables%>.STR__94_0x_o_91_0_m_9A_m_F_93_91_0_m_9A_m_F_93_e_p_$).booleanValue();\n\t\t\t\tif (matches) {\n\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\tresult = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__Recursive_notTrueIfUnknownSizeAllowedIsTrue__DiagnosticChain_Map(), source,
				new String[] { "body",
						"final <%java.lang.String%> constraintName = \"Element::recursive_notTrueIfUnknownSizeAllowedIsTrue\";\ntry {\n\t/**\n\t *\n\t * inv recursive_notTrueIfUnknownSizeAllowedIsTrue:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = not self.recursive.oclIsUndefined() and self.recursive = true implies\n\t *         self.unknownSizeAllowed.oclIsUndefined() or self.unknownSizeAllowed = false\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___RECURSIVE_NOT_TRUE_IF_UNKNOWN_SIZE_ALLOWED_IS_TRUE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_result;\n\t\ttry {\n\t\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_and;\n\t\t\ttry {\n\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> not = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> and;\n\t\t\t\tif (not == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\tand = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> recursive = this.getRecursive();\n\t\t\t\t\tfinal /*@NonInvalid*/ boolean eq = recursive;\n\t\t\t\t\tif (!eq) {\n\t\t\t\t\t\tand = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\t\tand = null;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\n\t\t\t\t\t\t\tand = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\tCAUGHT_and = and;\n\t\t\t}\n\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\tCAUGHT_and = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t}\n\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> result;\n\t\t\tif (CAUGHT_and == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> or;\n\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> unknownSizeAllowed = this.getUnknownSizeAllowed();\n\t\t\t\tfinal /*@NonInvalid*/ boolean eq_0 = !unknownSizeAllowed;\n\t\t\t\tor = eq_0;\n\t\t\t\tif (or == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (CAUGHT_and instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\n\t\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)CAUGHT_and;\n\t\t\t\t\t}\n\t\t\t\t\tif ((CAUGHT_and == null) || (or == null)) {\n\t\t\t\t\t\tresult = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__Type_masterMustNotDeclareDefaultValue__DiagnosticChain_Map(), source, new String[] {
				"body",
				"final <%java.lang.String%> constraintName = \"Element::type_masterMustNotDeclareDefaultValue\";\ntry {\n\t/**\n\t *\n\t * inv type_masterMustNotDeclareDefaultValue:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let result : Boolean[?] = self.type = ElementType::MASTER implies\n\t *         self.default.oclIsUndefined()\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___TYPE_MASTER_MUST_NOT_DECLARE_DEFAULT_VALUE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid*/ <%dk.ingi.EBML.ElementType%> type = this.getType();\n\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.ids.EnumerationLiteralId%> BOXED_type = <%dk.ingi.EBML.EBMLTables%>.ENUMid_ElementType.getEnumerationLiteralId(<%org.eclipse.ocl.pivot.utilities.ClassUtil%>.nonNullState(type.getName()));\n\t\tfinal /*@NonInvalid*/ boolean eq = BOXED_type == <%dk.ingi.EBML.EBMLTables%>.ELITid_MASTER;\n\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> result;\n\t\tif (!eq) {\n\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t}\n\t\telse {\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.String%> default1 = this.getDefault();\n\t\t\tfinal /*@NonInvalid*/ boolean oclIsUndefined = default1 == null;\n\t\t\tif (oclIsUndefined) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t}\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__Minver_nonNegative__DiagnosticChain_Map(), source, new String[] { "body",
				"final <%java.lang.String%> constraintName = \"Element::minver_nonNegative\";\ntry {\n\t/**\n\t *\n\t * inv minver_nonNegative:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = not self.minver.oclIsUndefined() implies self.minver >= 0\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___MINVER_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.Integer%> minver = this.getMinver();\n\t\t\tfinal /*@NonInvalid*/ boolean oclIsUndefined = minver == null;\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> not;\n\t\t\tif (!oclIsUndefined) {\n\t\t\t\tnot = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tif (oclIsUndefined) {\n\t\t\t\t\tnot = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tnot = null;\n\t\t\t\t}\n\t\t\t}\n\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> result;\n\t\t\tif (not == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_ge;\n\t\t\t\ttry {\n\t\t\t\t\tif (minver == null) {\n\t\t\t\t\t\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null \\\'\\\'OclComparable\\\'\\\' rather than \\\'\\\'OclVoid\\\'\\\' value required\");\n\t\t\t\t\t}\n\t\t\t\t\tfinal /*@Thrown*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> BOXED_minver_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.integerValueOf(minver);\n\t\t\t\t\tfinal /*@Thrown*/ boolean ge = <%org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation%>.INSTANCE.evaluate(executor, BOXED_minver_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\t\t\t\tCAUGHT_ge = ge;\n\t\t\t\t}\n\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\tCAUGHT_ge = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t}\n\t\t\t\tif (CAUGHT_ge == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\n\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tif (CAUGHT_ge instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\n\t\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)CAUGHT_ge;\n\t\t\t\t\t}\n\t\t\t\t\tif (not == null) {\n\t\t\t\t\t\tresult = null;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement__UnknownSizeAllowed_isValid__DiagnosticChain_Map(), source, new String[] { "body",
				"final <%java.lang.String%> constraintName = \"Element::unknownSizeAllowed_isValid\";\ntry {\n\t/**\n\t *\n\t * inv unknownSizeAllowed_isValid:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let\n\t *         result : Boolean[?] = if\n\t *           self.unknownSizeAllowed.oclIsUndefined() or self.unknownSizeAllowed = false\n\t *         then true\n\t *         else\n\t *           let i : Integer[1] = self.path.lastIndexOf(\'\\\\\')\n\t *           in\n\t *             if i = -1 or i = 1\n\t *             then true\n\t *             else\n\t *               let parentPath : String[1] = self.path.substring(1, i - 1)\n\t *               in\n\t *                 Element.allInstances()\n\t *                 ->exists(e | e.path = parentPath and e.unknownSizeAllowed = true)\n\t *             endif\n\t *         endif\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.ELEMENT___UNKNOWN_SIZE_ALLOWED_IS_VALID__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> or;\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> unknownSizeAllowed = this.getUnknownSizeAllowed();\n\t\t\tfinal /*@NonInvalid*/ boolean eq = !unknownSizeAllowed;\n\t\t\tor = eq;\n\t\t\tif (or == null) {\n\t\t\t\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null if condition\");\n\t\t\t}\n\t\t\t/*@Thrown*/ <%java.lang.Boolean%> result;\n\t\t\tif (or) {\n\t\t\t\tresult = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t}\n\t\t\telse {\n\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.String%> path = this.getPath();\n\t\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> i = <%org.eclipse.ocl.pivot.library.string.StringLastIndexOfOperation%>.INSTANCE.evaluate(path, <%dk.ingi.EBML.EBMLTables%>.STR__92);\n\t\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> diff = (<%org.eclipse.ocl.pivot.values.IntegerValue%>)<%org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation%>.INSTANCE.evaluate(<%dk.ingi.EBML.EBMLTables%>.INT_1);\n\t\t\t\tfinal /*@NonInvalid*/ boolean eq_0 = i.equals(diff);\n\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> or_0;\n\t\t\t\tif (eq_0) {\n\t\t\t\t\tor_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\tfinal /*@NonInvalid*/ boolean eq_1 = i.equals(<%dk.ingi.EBML.EBMLTables%>.INT_1);\n\t\t\t\t\tif (eq_1) {\n\t\t\t\t\t\tor_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t\telse {\n\t\t\t\t\t\tor_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\tif (or_0 == null) {\n\t\t\t\t\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null if condition\");\n\t\t\t\t}\n\t\t\t\t/*@Thrown*/ <%java.lang.Boolean%> IF_or_0;\n\t\t\t\tif (or_0) {\n\t\t\t\t\tIF_or_0 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t}\n\t\t\t\telse {\n\t\t\t\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_parentPath;\n\t\t\t\t\ttry {\n\t\t\t\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> diff_0 = (<%org.eclipse.ocl.pivot.values.IntegerValue%>)<%org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation%>.INSTANCE.evaluate(i, <%dk.ingi.EBML.EBMLTables%>.INT_1);\n\t\t\t\t\t\tfinal /*@Thrown*/ <%java.lang.String%> parentPath = <%org.eclipse.ocl.pivot.library.string.StringSubstringOperation%>.INSTANCE.evaluate(path, <%dk.ingi.EBML.EBMLTables%>.INT_1, diff_0);\n\t\t\t\t\t\tCAUGHT_parentPath = parentPath;\n\t\t\t\t\t}\n\t\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\t\tCAUGHT_parentPath = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t\t}\n\t\t\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.Class%> TYP_EBML_c_c_Element = idResolver.getClass(<%dk.ingi.EBML.EBMLTables%>.CLSSid_Element, null);\n\t\t\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.SetValue%> allInstances = <%org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLTables%>.SET_CLSSid_Element, TYP_EBML_c_c_Element);\n\t\t\t\t\t/*@Thrown*/ <%java.lang.Object%> accumulator = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t<%java.util.Iterator%><<%java.lang.Object%>> ITERATOR_e_0 = allInstances.iterator();\n\t\t\t\t\t/*@Thrown*/ <%java.lang.Boolean%> exists;\n\t\t\t\t\twhile (true) {\n\t\t\t\t\t\tif (!ITERATOR_e_0.hasNext()) {\n\t\t\t\t\t\t\tif (accumulator == null) {\n\t\t\t\t\t\t\t\texists = null;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse if (accumulator == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\t\t\t\texists = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)accumulator;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tbreak;\n\t\t\t\t\t\t}\n\t\t\t\t\t\t/*@NonInvalid*/ <%dk.ingi.EBML.Element%> e_0 = (<%dk.ingi.EBML.Element%>)ITERATOR_e_0.next();\n\t\t\t\t\t\t/**\n\t\t\t\t\t\t * e.path = parentPath and e.unknownSizeAllowed = true\n\t\t\t\t\t\t */\n\t\t\t\t\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_and;\n\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_eq_2;\n\t\t\t\t\t\t\ttry {\n\t\t\t\t\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.String%> path_1 = e_0.getPath();\n\t\t\t\t\t\t\t\tif (CAUGHT_parentPath instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\n\t\t\t\t\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)CAUGHT_parentPath;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\tfinal /*@Thrown*/ boolean eq_2 = path_1.equals(CAUGHT_parentPath);\n\t\t\t\t\t\t\t\tCAUGHT_eq_2 = eq_2;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\t\t\t\tCAUGHT_eq_2 = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tfinal /*@Thrown*/ <%java.lang.Boolean%> and;\n\t\t\t\t\t\t\tif (CAUGHT_eq_2 == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\t\t\t\tand = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\tfinal /*@NonInvalid*/ <%java.lang.Boolean%> unknownSizeAllowed_0 = e_0.getUnknownSizeAllowed();\n\t\t\t\t\t\t\t\tfinal /*@NonInvalid*/ boolean eq_3 = unknownSizeAllowed_0;\n\t\t\t\t\t\t\t\tif (!eq_3) {\n\t\t\t\t\t\t\t\t\tand = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\telse {\n\t\t\t\t\t\t\t\t\tif (CAUGHT_eq_2 instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\n\t\t\t\t\t\t\t\t\t\tthrow (<%org.eclipse.ocl.pivot.values.InvalidValueException%>)CAUGHT_eq_2;\n\t\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t\t\tand = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t\tCAUGHT_and = and;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\t\t\t\t\tCAUGHT_and = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t\t\t\t\t}\n\t\t\t\t\t\t//\n\t\t\t\t\t\tif (CAUGHT_and == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE) {\t\t\t\t\t// Normal successful body evaluation result\n\t\t\t\t\t\t\texists = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.TRUE_VALUE;\n\t\t\t\t\t\t\tbreak;\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Stop immediately\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse if (CAUGHT_and == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\t\t\t\t// Normal unsuccessful body evaluation result\n\t\t\t\t\t\t\t;\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Carry on\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse if (CAUGHT_and == null) {\t\t\t\t\t\t\t\t// Abnormal null body evaluation result\n\t\t\t\t\t\t\tif (accumulator == <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.FALSE_VALUE) {\n\t\t\t\t\t\t\t\taccumulator = null;\t\t\t\t\t\t\t\t\t\t// Cache a null failure\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse if (CAUGHT_and instanceof <%org.eclipse.ocl.pivot.values.InvalidValueException%>) {\t\t// Abnormal exception evaluation result\n\t\t\t\t\t\t\taccumulator = CAUGHT_and;\t\t\t\t\t\t\t\t\t// Cache an exception failure\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse {\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// Impossible badly typed result\n\t\t\t\t\t\t\taccumulator = new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(<%org.eclipse.ocl.pivot.messages.PivotMessages%>.NonBooleanBody, \"exists\");\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t\tIF_or_0 = exists;\n\t\t\t\t}\n\t\t\t\tresult = IF_or_0;\n\t\t\t}\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getElement_Name(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!name" });
		addAnnotation(getElement_Path(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!path" });
		addAnnotation(getElement_MinOccurs(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!minOccurs" });
		addAnnotation(getElement_MaxOccurs(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!maxOccurs" });
		addAnnotation(getElement_Minver(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!minver" });
		addAnnotation(getElement_Maxver(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!maxver" });
		addAnnotation(getElement_Documentation(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!documentation" });
		addAnnotation(getElement_ImplementationNote(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!implementationNote" });
		addAnnotation(getElement_Extension(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!extension" });
		addAnnotation(getElement_Id(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!id" });
		addAnnotation(getElement_Length(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!length" });
		addAnnotation(getElement_Recurring(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!recurring" });
		addAnnotation(getElement_Default(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!default" });
		addAnnotation(getElement_Range(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!range" });
		addAnnotation(getElement_UnknownSizeAllowed(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!unknownSizeAllowed" });
		addAnnotation(getElement_Restriction(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!restriction" });
		addAnnotation(getElement_Type(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!type" });
		addAnnotation(getElement_Recursive(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Element!recursive" });
		addAnnotation(getElement_EffectiveMaxOccurs(), source, new String[] { "get",
				"/**\n *\n * if self.maxOccurs = \'unbounded\'\n * then 2147483647\n * else self.maxOccurs.toInteger()\n * endif\n */\nfinal /*@NonInvalid*/ <%java.lang.String%> maxOccurs = this.getMaxOccurs();\nfinal /*@NonInvalid*/ boolean eq = <%dk.ingi.EBML.EBMLTables%>.STR_unbounded.equals(maxOccurs);\n/*@Thrown*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> IF_eq;\nif (eq) {\n\tIF_eq = <%dk.ingi.EBML.EBMLTables%>.INT_2147483647;\n}\nelse {\n\tif (maxOccurs == null) {\n\t\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null \\\'\\\'String\\\'\\\' rather than \\\'\\\'OclVoid\\\'\\\' value required\");\n\t}\n\tfinal /*@Thrown*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> toInteger = <%org.eclipse.ocl.pivot.library.string.StringToIntegerOperation%>.INSTANCE.evaluate(maxOccurs);\n\tIF_eq = toInteger;\n}\nif (IF_eq == null) {\n\tthrow new <%org.eclipse.ocl.pivot.values.InvalidValueException%>(\"Null body for \\\'EBML::Element::effectiveMaxOccurs\\\'\");\n}\nfinal /*@Thrown*/ int ECORE_IF_eq = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.intValueOf(IF_eq);\nreturn ECORE_IF_eq;" });
		addAnnotation(getExtension__ContainerType__DiagnosticChain_Map(), source, new String[] { "body",
				"final <%java.lang.String%> constraintName = \"Extension::containerType\";\ntry {\n\t/**\n\t *\n\t * inv containerType:\n\t *   let severity : Integer[1] = constraintName.getSeverity()\n\t *   in\n\t *     if severity <= 0\n\t *     then true\n\t *     else\n\t *       let result : Boolean[1] = self.oclContainer().oclIsTypeOf(Element)\n\t *       in\n\t *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n\t *     endif\n\t */\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.evaluation.Executor%> executor = <%org.eclipse.ocl.pivot.utilities.PivotUtil%>.getExecutor(this);\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.ids.IdResolver%> idResolver = executor.getIdResolver();\n\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.values.IntegerValue%> severity_0 = <%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%>.INSTANCE.evaluate(executor, <%dk.ingi.EBML.EBMLPackage%>.Literals.EXTENSION___CONTAINER_TYPE__DIAGNOSTICCHAIN_MAP);\n\tfinal /*@NonInvalid*/ boolean le = <%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%>.INSTANCE.evaluate(executor, severity_0, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t/*@NonInvalid*/ boolean IF_le;\n\tif (le) {\n\t\tIF_le = true;\n\t}\n\telse {\n\t\t/*@Caught*/ <%java.lang.Object%> CAUGHT_result;\n\t\ttry {\n\t\t\tfinal /*@NonInvalid*/ <%org.eclipse.ocl.pivot.Class%> TYP_EBML_c_c_Element_0 = idResolver.getClass(<%dk.ingi.EBML.EBMLTables%>.CLSSid_Element, null);\n\t\t\tfinal /*@NonInvalid*/ <%java.lang.Object%> oclContainer = <%org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation%>.INSTANCE.evaluate(executor, this);\n\t\t\tfinal /*@Thrown*/ boolean result = <%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation%>.INSTANCE.evaluate(executor, oclContainer, TYP_EBML_c_c_Element_0).booleanValue();\n\t\t\tCAUGHT_result = result;\n\t\t}\n\t\tcatch (<%java.lang.Exception%> e) {\n\t\t\tCAUGHT_result = <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.createInvalidValue(e);\n\t\t}\n\t\tfinal /*@NonInvalid*/ boolean logDiagnostic = <%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%>.INSTANCE.evaluate(executor, <%org.eclipse.ocl.pivot.ids.TypeId%>.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, <%dk.ingi.EBML.EBMLTables%>.INT_0).booleanValue();\n\t\tIF_le = logDiagnostic;\n\t}\n\treturn IF_le;\n}\ncatch (<%java.lang.Throwable%> e) {\n\treturn <%org.eclipse.ocl.pivot.utilities.ValueUtil%>.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);\n}" });
		addAnnotation(getExtension_Type(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Extension!type" });
		addAnnotation(getExtension_AnyAttribute(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Extension!anyAttribute" });
		addAnnotation(getExtension_Any(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Extension!any" });
		addAnnotation(getDocumentation_Lang(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Documentation!lang" });
		addAnnotation(getDocumentation_Purpose(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Documentation!purpose" });
		addAnnotation(getDocumentation_Simple(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Documentation!simple" });
		addAnnotation(getImplementationNote_NoteAttribute(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!ImplementationNote!noteAttribute" });
		addAnnotation(getRestriction_Enum(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Restriction!enum" });
		addAnnotation(getEnum_Documentation(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Enum!documentation" });
		addAnnotation(getEnum_Label(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Enum!label" });
		addAnnotation(getEnum_Value(), source, new String[] { "get",
				"throw new UnsupportedOperationException();  // FIXME Unimplemented urn:ietf:rfc:8794!Enum!value" });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(getElement_ImplementationNote(), source, new String[] { "name", "implementation_note" });
		addAnnotation(getElement_UnknownSizeAllowed(), source,
				new String[] { "name", "unknownsizeallowed", "kind", "attribute" });
		addAnnotation(getExtension_Type(), source, new String[] { "kind", "attribute", "name", "type" });
		addAnnotation(getExtension_AnyAttribute(), source,
				new String[] { "kind", "attributeWildcard", "name", ":1", "wildcards", "##any", "processing", "lax" });
		addAnnotation(getExtension_Any(), source,
				new String[] { "name", "", "kind", "elementWildcard", "processing", "lax", "wildcards", "##other" });
		addAnnotation(documentationEClass, source, new String[] { "kind", "simple" });
		addAnnotation(getDocumentation_Simple(), source, new String[] { "kind", "simple" });
		addAnnotation(getImplementationNote_NoteAttribute(), source, new String[] { "name", "note_attribute" });
	}

} //EBMLPackageImpl
