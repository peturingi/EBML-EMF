/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /dk.ingi.ebml/model/EBML.ecore
 * using:
 *   /dk.ingi.ebml/model/EBML.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package dk.ingi.EBML;

// import dk.ingi.EBML.EBMLPackage;
// import dk.ingi.EBML.EBMLTables;
import java.lang.String;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * EBMLTables provides the dispatch tables for the EBML for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class EBMLTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(EBMLPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_urn_c_ietf_c_rfc_c_8794 = IdManager.getNsURIPackageId("urn:ietf:rfc:8794", null, EBMLPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = EBMLTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Documentation = EBMLTables.PACKid_urn_c_ietf_c_rfc_c_8794.getClassId("Documentation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EBMLSchema = EBMLTables.PACKid_urn_c_ietf_c_rfc_c_8794.getClassId("EBMLSchema", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Element = EBMLTables.PACKid_urn_c_ietf_c_rfc_c_8794.getClassId("Element", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Enum = EBMLTables.PACKid_urn_c_ietf_c_rfc_c_8794.getClassId("Enum", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Extension = EBMLTables.PACKid_urn_c_ietf_c_rfc_c_8794.getClassId("Extension", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ImplementationNote = EBMLTables.PACKid_urn_c_ietf_c_rfc_c_8794.getClassId("ImplementationNote", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OclElement = EBMLTables.PACKid_$metamodel$.getClassId("OclElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Restriction = EBMLTables.PACKid_urn_c_ietf_c_rfc_c_8794.getClassId("Restriction", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFeatureMapEntry = EBMLTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFeatureMapEntry", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = EBMLTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EIntegerObject = EBMLTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EIntegerObject", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_ZeroOneBooleanObject = EBMLTables.PACKid_urn_c_ietf_c_rfc_c_8794.getDataTypeId("ZeroOneBooleanObject", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DocumentType = EBMLTables.PACKid_urn_c_ietf_c_rfc_c_8794.getEnumerationId("DocumentType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DocumentationPurpose = EBMLTables.PACKid_urn_c_ietf_c_rfc_c_8794.getEnumerationId("DocumentationPurpose");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ElementType = EBMLTables.PACKid_urn_c_ietf_c_rfc_c_8794.getEnumerationId("ElementType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_NoteAttribute = EBMLTables.PACKid_urn_c_ietf_c_rfc_c_8794.getEnumerationId("NoteAttribute");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_2147483647 = ValueUtil.integerValueOf("2147483647");
	public static final /*@NonInvalid*/ String STR__92 = "\\";
	public static final /*@NonInvalid*/ String STR__94_0x_o_91_0_m_9A_m_F_93_91_0_m_9A_m_F_93_e_p_$ = "^0x([0-9A-F][0-9A-F])+$";
	public static final /*@NonInvalid*/ String STR__94_91_A_m_Za_m_z0_m_9_93_91_A_m_Za_m_z0_m_9_m_93_a_$ = "^[A-Za-z0-9][A-Za-z0-9.-]*$";
	public static final /*@NonInvalid*/ String STR__94_o_unbounded_124_0_124_91_1_m_9_93_91_0_m_9_93_a_e_$ = "^(unbounded|0|[1-9][0-9]*)$";
	public static final /*@NonInvalid*/ String STR_sum = "+";
	public static final /*@NonInvalid*/ String STR_unbounded = "unbounded";
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_DATE = EBMLTables.ENUMid_ElementType.getEnumerationLiteralId("DATE");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_FLOAT = EBMLTables.ENUMid_ElementType.getEnumerationLiteralId("FLOAT");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_INTEGER = EBMLTables.ENUMid_ElementType.getEnumerationLiteralId("INTEGER");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_MASTER = EBMLTables.ENUMid_ElementType.getEnumerationLiteralId("MASTER");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_UINTEGER = EBMLTables.ENUMid_ElementType.getEnumerationLiteralId("UINTEGER");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Documentation = TypeId.ORDERED_SET.getSpecializedId(EBMLTables.CLSSid_Documentation, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Element = TypeId.ORDERED_SET.getSpecializedId(EBMLTables.CLSSid_Element, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Enum = TypeId.ORDERED_SET.getSpecializedId(EBMLTables.CLSSid_Enum, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Extension = TypeId.ORDERED_SET.getSpecializedId(EBMLTables.CLSSid_Extension, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ImplementationNote = TypeId.ORDERED_SET.getSpecializedId(EBMLTables.CLSSid_ImplementationNote, true, ValueUtil.ZERO_VALUE, ValueUtil.integerValueOf(7));
	public static final /*@NonInvalid*/ CollectionTypeId ORD_DATAid_EFeatureMapEntry = TypeId.ORDERED_SET.getSpecializedId(EBMLTables.DATAid_EFeatureMapEntry, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Element = TypeId.SET.getSpecializedId(EBMLTables.CLSSid_Element, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_ENUMid_ElementType = TypeId.SET.getSpecializedId(EBMLTables.ENUMid_ElementType, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ SetValue Set = ValueUtil.createSetOfEach(EBMLTables.SET_ENUMid_ElementType, EBMLTables.ELITid_INTEGER, EBMLTables.ELITid_UINTEGER, EBMLTables.ELITid_FLOAT, EBMLTables.ELITid_DATE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			EBMLTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EBMLTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorEnumeration _DocumentType = new EcoreExecutorEnumeration(EBMLPackage.Literals.DOCUMENT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Documentation = new EcoreExecutorType(EBMLPackage.Literals.DOCUMENTATION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _DocumentationPurpose = new EcoreExecutorEnumeration(EBMLPackage.Literals.DOCUMENTATION_PURPOSE, PACKAGE, 0);
		public static final EcoreExecutorType _EBMLSchema = new EcoreExecutorType(EBMLPackage.Literals.EBML_SCHEMA, PACKAGE, 0);
		public static final EcoreExecutorType _Element = new EcoreExecutorType(EBMLPackage.Literals.ELEMENT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ElementType = new EcoreExecutorEnumeration(EBMLPackage.Literals.ELEMENT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Enum = new EcoreExecutorType(EBMLPackage.Literals.ENUM, PACKAGE, 0);
		public static final EcoreExecutorType _Extension = new EcoreExecutorType(EBMLPackage.Literals.EXTENSION, PACKAGE, 0);
		public static final EcoreExecutorType _ImplementationNote = new EcoreExecutorType(EBMLPackage.Literals.IMPLEMENTATION_NOTE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _NoteAttribute = new EcoreExecutorEnumeration(EBMLPackage.Literals.NOTE_ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _Restriction = new EcoreExecutorType(EBMLPackage.Literals.RESTRICTION, PACKAGE, 0);
		public static final EcoreExecutorType _ZeroOneBooleanObject = new EcoreExecutorType("ZeroOneBooleanObject", PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_DocumentType,
			_Documentation,
			_DocumentationPurpose,
			_EBMLSchema,
			_Element,
			_ElementType,
			_Enum,
			_Extension,
			_ImplementationNote,
			_NoteAttribute,
			_Restriction,
			_ZeroOneBooleanObject
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EBMLTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _DocumentType__DocumentType = new ExecutorFragment(Types._DocumentType, EBMLTables.Types._DocumentType);
		private static final ExecutorFragment _DocumentType__OclAny = new ExecutorFragment(Types._DocumentType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DocumentType__OclElement = new ExecutorFragment(Types._DocumentType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DocumentType__OclEnumeration = new ExecutorFragment(Types._DocumentType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DocumentType__OclType = new ExecutorFragment(Types._DocumentType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Documentation__Documentation = new ExecutorFragment(Types._Documentation, EBMLTables.Types._Documentation);
		private static final ExecutorFragment _Documentation__OclAny = new ExecutorFragment(Types._Documentation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Documentation__OclElement = new ExecutorFragment(Types._Documentation, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DocumentationPurpose__DocumentationPurpose = new ExecutorFragment(Types._DocumentationPurpose, EBMLTables.Types._DocumentationPurpose);
		private static final ExecutorFragment _DocumentationPurpose__OclAny = new ExecutorFragment(Types._DocumentationPurpose, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DocumentationPurpose__OclElement = new ExecutorFragment(Types._DocumentationPurpose, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DocumentationPurpose__OclEnumeration = new ExecutorFragment(Types._DocumentationPurpose, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DocumentationPurpose__OclType = new ExecutorFragment(Types._DocumentationPurpose, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _EBMLSchema__EBMLSchema = new ExecutorFragment(Types._EBMLSchema, EBMLTables.Types._EBMLSchema);
		private static final ExecutorFragment _EBMLSchema__OclAny = new ExecutorFragment(Types._EBMLSchema, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EBMLSchema__OclElement = new ExecutorFragment(Types._EBMLSchema, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Element__Element = new ExecutorFragment(Types._Element, EBMLTables.Types._Element);
		private static final ExecutorFragment _Element__OclAny = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Element__OclElement = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ElementType__ElementType = new ExecutorFragment(Types._ElementType, EBMLTables.Types._ElementType);
		private static final ExecutorFragment _ElementType__OclAny = new ExecutorFragment(Types._ElementType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ElementType__OclElement = new ExecutorFragment(Types._ElementType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ElementType__OclEnumeration = new ExecutorFragment(Types._ElementType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ElementType__OclType = new ExecutorFragment(Types._ElementType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Enum__Enum = new ExecutorFragment(Types._Enum, EBMLTables.Types._Enum);
		private static final ExecutorFragment _Enum__OclAny = new ExecutorFragment(Types._Enum, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Enum__OclElement = new ExecutorFragment(Types._Enum, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Extension__Extension = new ExecutorFragment(Types._Extension, EBMLTables.Types._Extension);
		private static final ExecutorFragment _Extension__OclAny = new ExecutorFragment(Types._Extension, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Extension__OclElement = new ExecutorFragment(Types._Extension, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ImplementationNote__ImplementationNote = new ExecutorFragment(Types._ImplementationNote, EBMLTables.Types._ImplementationNote);
		private static final ExecutorFragment _ImplementationNote__OclAny = new ExecutorFragment(Types._ImplementationNote, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ImplementationNote__OclElement = new ExecutorFragment(Types._ImplementationNote, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NoteAttribute__NoteAttribute = new ExecutorFragment(Types._NoteAttribute, EBMLTables.Types._NoteAttribute);
		private static final ExecutorFragment _NoteAttribute__OclAny = new ExecutorFragment(Types._NoteAttribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NoteAttribute__OclElement = new ExecutorFragment(Types._NoteAttribute, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _NoteAttribute__OclEnumeration = new ExecutorFragment(Types._NoteAttribute, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _NoteAttribute__OclType = new ExecutorFragment(Types._NoteAttribute, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Restriction__OclAny = new ExecutorFragment(Types._Restriction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Restriction__OclElement = new ExecutorFragment(Types._Restriction, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Restriction__Restriction = new ExecutorFragment(Types._Restriction, EBMLTables.Types._Restriction);

		private static final ExecutorFragment _ZeroOneBooleanObject__Boolean = new ExecutorFragment(Types._ZeroOneBooleanObject, OCLstdlibTables.Types._Boolean);
		private static final ExecutorFragment _ZeroOneBooleanObject__OclAny = new ExecutorFragment(Types._ZeroOneBooleanObject, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ZeroOneBooleanObject__OclComparable = new ExecutorFragment(Types._ZeroOneBooleanObject, OCLstdlibTables.Types._OclComparable);
		private static final ExecutorFragment _ZeroOneBooleanObject__ZeroOneBooleanObject = new ExecutorFragment(Types._ZeroOneBooleanObject, EBMLTables.Types._ZeroOneBooleanObject);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EBMLTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _OclSelf = TypeUtil.createParameterTypes(OCLstdlibTables.Types._OclSelf);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EBMLTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _ZeroOneBooleanObject__compareTo = new ExecutorOperation("compareTo", Parameters._OclSelf, Types._ZeroOneBooleanObject,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EBMLTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final ExecutorProperty _Documentation__lang = new EcoreExecutorProperty(EBMLPackage.Literals.DOCUMENTATION__LANG, Types._Documentation, 0);
		public static final ExecutorProperty _Documentation__purpose = new EcoreExecutorProperty(EBMLPackage.Literals.DOCUMENTATION__PURPOSE, Types._Documentation, 1);
		public static final ExecutorProperty _Documentation__simple = new EcoreExecutorProperty(EBMLPackage.Literals.DOCUMENTATION__SIMPLE, Types._Documentation, 2);
		public static final ExecutorProperty _Documentation__Element__documentation = new ExecutorPropertyWithImplementation("Element", Types._Documentation, 3, new EcoreLibraryOppositeProperty(EBMLPackage.Literals.ELEMENT__DOCUMENTATION));
		public static final ExecutorProperty _Documentation__Enum__documentation = new ExecutorPropertyWithImplementation("Enum", Types._Documentation, 4, new EcoreLibraryOppositeProperty(EBMLPackage.Literals.ENUM__DOCUMENTATION));

		public static final ExecutorProperty _EBMLSchema__docType = new EcoreExecutorProperty(EBMLPackage.Literals.EBML_SCHEMA__DOC_TYPE, Types._EBMLSchema, 0);
		public static final ExecutorProperty _EBMLSchema__ebml = new EcoreExecutorProperty(EBMLPackage.Literals.EBML_SCHEMA__EBML, Types._EBMLSchema, 1);
		public static final ExecutorProperty _EBMLSchema__element = new EcoreExecutorProperty(EBMLPackage.Literals.EBML_SCHEMA__ELEMENT, Types._EBMLSchema, 2);
		public static final ExecutorProperty _EBMLSchema__version = new EcoreExecutorProperty(EBMLPackage.Literals.EBML_SCHEMA__VERSION, Types._EBMLSchema, 3);

		public static final ExecutorProperty _Element__default = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__DEFAULT, Types._Element, 0);
		public static final ExecutorProperty _Element__documentation = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__DOCUMENTATION, Types._Element, 1);
		public static final ExecutorProperty _Element__effectiveMaxOccurs = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__EFFECTIVE_MAX_OCCURS, Types._Element, 2);
		public static final ExecutorProperty _Element__extension = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__EXTENSION, Types._Element, 3);
		public static final ExecutorProperty _Element__id = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__ID, Types._Element, 4);
		public static final ExecutorProperty _Element__implementationNote = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__IMPLEMENTATION_NOTE, Types._Element, 5);
		public static final ExecutorProperty _Element__length = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__LENGTH, Types._Element, 6);
		public static final ExecutorProperty _Element__maxOccurs = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__MAX_OCCURS, Types._Element, 7);
		public static final ExecutorProperty _Element__maxver = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__MAXVER, Types._Element, 8);
		public static final ExecutorProperty _Element__minOccurs = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__MIN_OCCURS, Types._Element, 9);
		public static final ExecutorProperty _Element__minver = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__MINVER, Types._Element, 10);
		public static final ExecutorProperty _Element__name = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__NAME, Types._Element, 11);
		public static final ExecutorProperty _Element__path = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__PATH, Types._Element, 12);
		public static final ExecutorProperty _Element__range = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__RANGE, Types._Element, 13);
		public static final ExecutorProperty _Element__recurring = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__RECURRING, Types._Element, 14);
		public static final ExecutorProperty _Element__recursive = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__RECURSIVE, Types._Element, 15);
		public static final ExecutorProperty _Element__restriction = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__RESTRICTION, Types._Element, 16);
		public static final ExecutorProperty _Element__type = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__TYPE, Types._Element, 17);
		public static final ExecutorProperty _Element__unknownSizeAllowed = new EcoreExecutorProperty(EBMLPackage.Literals.ELEMENT__UNKNOWN_SIZE_ALLOWED, Types._Element, 18);
		public static final ExecutorProperty _Element__EBMLSchema__element = new ExecutorPropertyWithImplementation("EBMLSchema", Types._Element, 19, new EcoreLibraryOppositeProperty(EBMLPackage.Literals.EBML_SCHEMA__ELEMENT));

		public static final ExecutorProperty _Enum__documentation = new EcoreExecutorProperty(EBMLPackage.Literals.ENUM__DOCUMENTATION, Types._Enum, 0);
		public static final ExecutorProperty _Enum__label = new EcoreExecutorProperty(EBMLPackage.Literals.ENUM__LABEL, Types._Enum, 1);
		public static final ExecutorProperty _Enum__value = new EcoreExecutorProperty(EBMLPackage.Literals.ENUM__VALUE, Types._Enum, 2);
		public static final ExecutorProperty _Enum__Restriction__enum = new ExecutorPropertyWithImplementation("Restriction", Types._Enum, 3, new EcoreLibraryOppositeProperty(EBMLPackage.Literals.RESTRICTION__ENUM));

		public static final ExecutorProperty _Extension__any = new EcoreExecutorProperty(EBMLPackage.Literals.EXTENSION__ANY, Types._Extension, 0);
		public static final ExecutorProperty _Extension__anyAttribute = new EcoreExecutorProperty(EBMLPackage.Literals.EXTENSION__ANY_ATTRIBUTE, Types._Extension, 1);
		public static final ExecutorProperty _Extension__type = new EcoreExecutorProperty(EBMLPackage.Literals.EXTENSION__TYPE, Types._Extension, 2);
		public static final ExecutorProperty _Extension__Element__extension = new ExecutorPropertyWithImplementation("Element", Types._Extension, 3, new EcoreLibraryOppositeProperty(EBMLPackage.Literals.ELEMENT__EXTENSION));

		public static final ExecutorProperty _ImplementationNote__noteAttribute = new EcoreExecutorProperty(EBMLPackage.Literals.IMPLEMENTATION_NOTE__NOTE_ATTRIBUTE, Types._ImplementationNote, 0);
		public static final ExecutorProperty _ImplementationNote__Element__implementationNote = new ExecutorPropertyWithImplementation("Element", Types._ImplementationNote, 1, new EcoreLibraryOppositeProperty(EBMLPackage.Literals.ELEMENT__IMPLEMENTATION_NOTE));

		public static final ExecutorProperty _Restriction__enum = new EcoreExecutorProperty(EBMLPackage.Literals.RESTRICTION__ENUM, Types._Restriction, 0);
		public static final ExecutorProperty _Restriction__Element__restriction = new ExecutorPropertyWithImplementation("Element", Types._Restriction, 1, new EcoreLibraryOppositeProperty(EBMLPackage.Literals.ELEMENT__RESTRICTION));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EBMLTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _DocumentType =
			{
				Fragments._DocumentType__OclAny /* 0 */,
				Fragments._DocumentType__OclElement /* 1 */,
				Fragments._DocumentType__OclType /* 2 */,
				Fragments._DocumentType__OclEnumeration /* 3 */,
				Fragments._DocumentType__DocumentType /* 4 */
			};
		private static final int /*@NonNull*/ [] __DocumentType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Documentation =
			{
				Fragments._Documentation__OclAny /* 0 */,
				Fragments._Documentation__OclElement /* 1 */,
				Fragments._Documentation__Documentation /* 2 */
			};
		private static final int /*@NonNull*/ [] __Documentation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DocumentationPurpose =
			{
				Fragments._DocumentationPurpose__OclAny /* 0 */,
				Fragments._DocumentationPurpose__OclElement /* 1 */,
				Fragments._DocumentationPurpose__OclType /* 2 */,
				Fragments._DocumentationPurpose__OclEnumeration /* 3 */,
				Fragments._DocumentationPurpose__DocumentationPurpose /* 4 */
			};
		private static final int /*@NonNull*/ [] __DocumentationPurpose = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EBMLSchema =
			{
				Fragments._EBMLSchema__OclAny /* 0 */,
				Fragments._EBMLSchema__OclElement /* 1 */,
				Fragments._EBMLSchema__EBMLSchema /* 2 */
			};
		private static final int /*@NonNull*/ [] __EBMLSchema = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Element =
			{
				Fragments._Element__OclAny /* 0 */,
				Fragments._Element__OclElement /* 1 */,
				Fragments._Element__Element /* 2 */
			};
		private static final int /*@NonNull*/ [] __Element = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ElementType =
			{
				Fragments._ElementType__OclAny /* 0 */,
				Fragments._ElementType__OclElement /* 1 */,
				Fragments._ElementType__OclType /* 2 */,
				Fragments._ElementType__OclEnumeration /* 3 */,
				Fragments._ElementType__ElementType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ElementType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Enum =
			{
				Fragments._Enum__OclAny /* 0 */,
				Fragments._Enum__OclElement /* 1 */,
				Fragments._Enum__Enum /* 2 */
			};
		private static final int /*@NonNull*/ [] __Enum = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Extension =
			{
				Fragments._Extension__OclAny /* 0 */,
				Fragments._Extension__OclElement /* 1 */,
				Fragments._Extension__Extension /* 2 */
			};
		private static final int /*@NonNull*/ [] __Extension = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ImplementationNote =
			{
				Fragments._ImplementationNote__OclAny /* 0 */,
				Fragments._ImplementationNote__OclElement /* 1 */,
				Fragments._ImplementationNote__ImplementationNote /* 2 */
			};
		private static final int /*@NonNull*/ [] __ImplementationNote = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NoteAttribute =
			{
				Fragments._NoteAttribute__OclAny /* 0 */,
				Fragments._NoteAttribute__OclElement /* 1 */,
				Fragments._NoteAttribute__OclType /* 2 */,
				Fragments._NoteAttribute__OclEnumeration /* 3 */,
				Fragments._NoteAttribute__NoteAttribute /* 4 */
			};
		private static final int /*@NonNull*/ [] __NoteAttribute = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Restriction =
			{
				Fragments._Restriction__OclAny /* 0 */,
				Fragments._Restriction__OclElement /* 1 */,
				Fragments._Restriction__Restriction /* 2 */
			};
		private static final int /*@NonNull*/ [] __Restriction = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ZeroOneBooleanObject =
			{
				Fragments._ZeroOneBooleanObject__OclAny /* 0 */,
				Fragments._ZeroOneBooleanObject__Boolean /* 1 */,
				Fragments._ZeroOneBooleanObject__OclComparable /* 1 */,
				Fragments._ZeroOneBooleanObject__ZeroOneBooleanObject /* 2 */
			};
		private static final int /*@NonNull*/ [] __ZeroOneBooleanObject = { 1,2,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._DocumentType.initFragments(_DocumentType, __DocumentType);
			Types._Documentation.initFragments(_Documentation, __Documentation);
			Types._DocumentationPurpose.initFragments(_DocumentationPurpose, __DocumentationPurpose);
			Types._EBMLSchema.initFragments(_EBMLSchema, __EBMLSchema);
			Types._Element.initFragments(_Element, __Element);
			Types._ElementType.initFragments(_ElementType, __ElementType);
			Types._Enum.initFragments(_Enum, __Enum);
			Types._Extension.initFragments(_Extension, __Extension);
			Types._ImplementationNote.initFragments(_ImplementationNote, __ImplementationNote);
			Types._NoteAttribute.initFragments(_NoteAttribute, __NoteAttribute);
			Types._Restriction.initFragments(_Restriction, __Restriction);
			Types._ZeroOneBooleanObject.initFragments(_ZeroOneBooleanObject, __ZeroOneBooleanObject);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EBMLTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _DocumentType__DocumentType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Documentation__Documentation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Documentation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Documentation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DocumentationPurpose__DocumentationPurpose = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentationPurpose__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentationPurpose__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentationPurpose__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DocumentationPurpose__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EBMLSchema__EBMLSchema = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EBMLSchema__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EBMLSchema__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Element__Element = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Element__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Element__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ElementType__ElementType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ElementType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ElementType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ElementType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ElementType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Enum__Enum = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Enum__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Enum__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Extension__Extension = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Extension__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Extension__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ImplementationNote__ImplementationNote = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ImplementationNote__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ImplementationNote__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NoteAttribute__NoteAttribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NoteAttribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NoteAttribute__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NoteAttribute__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NoteAttribute__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Restriction__Restriction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Restriction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Restriction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ZeroOneBooleanObject__ZeroOneBooleanObject = {
			EBMLTables.Operations._ZeroOneBooleanObject__compareTo /* compareTo(OclSelf[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ZeroOneBooleanObject__Boolean = {
			OCLstdlibTables.Operations._Boolean___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Boolean___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._Boolean__and /* _'and'(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__implies /* _'implies'(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__not /* _'not'() */,
			OCLstdlibTables.Operations._Boolean__or /* _'or'(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__xor /* _'xor'(Boolean[?]) */,
			OCLstdlibTables.Operations._Boolean__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._Boolean__and2 /* and2(Boolean[1]) */,
			OCLstdlibTables.Operations._Boolean__implies2 /* implies2(Boolean[1]) */,
			OCLstdlibTables.Operations._Boolean__not2 /* not2() */,
			OCLstdlibTables.Operations._Boolean__or2 /* or2(Boolean[1]) */,
			OCLstdlibTables.Operations._Boolean__toString /* toString() */,
			OCLstdlibTables.Operations._Boolean__xor2 /* xor2(Boolean[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ZeroOneBooleanObject__OclAny = {
			OCLstdlibTables.Operations._Boolean___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._Boolean___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._Boolean__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ZeroOneBooleanObject__OclComparable = {
			OCLstdlibTables.Operations._OclComparable___lt_ /* _'<'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclComparable___lt__eq_ /* _'<='(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclComparable___gt_ /* _'>'(OclSelf[1]) */,
			OCLstdlibTables.Operations._OclComparable___gt__eq_ /* _'>='(OclSelf[1]) */,
			EBMLTables.Operations._ZeroOneBooleanObject__compareTo /* compareTo(OclSelf[1]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._DocumentType__DocumentType.initOperations(_DocumentType__DocumentType);
			Fragments._DocumentType__OclAny.initOperations(_DocumentType__OclAny);
			Fragments._DocumentType__OclElement.initOperations(_DocumentType__OclElement);
			Fragments._DocumentType__OclEnumeration.initOperations(_DocumentType__OclEnumeration);
			Fragments._DocumentType__OclType.initOperations(_DocumentType__OclType);

			Fragments._Documentation__Documentation.initOperations(_Documentation__Documentation);
			Fragments._Documentation__OclAny.initOperations(_Documentation__OclAny);
			Fragments._Documentation__OclElement.initOperations(_Documentation__OclElement);

			Fragments._DocumentationPurpose__DocumentationPurpose.initOperations(_DocumentationPurpose__DocumentationPurpose);
			Fragments._DocumentationPurpose__OclAny.initOperations(_DocumentationPurpose__OclAny);
			Fragments._DocumentationPurpose__OclElement.initOperations(_DocumentationPurpose__OclElement);
			Fragments._DocumentationPurpose__OclEnumeration.initOperations(_DocumentationPurpose__OclEnumeration);
			Fragments._DocumentationPurpose__OclType.initOperations(_DocumentationPurpose__OclType);

			Fragments._EBMLSchema__EBMLSchema.initOperations(_EBMLSchema__EBMLSchema);
			Fragments._EBMLSchema__OclAny.initOperations(_EBMLSchema__OclAny);
			Fragments._EBMLSchema__OclElement.initOperations(_EBMLSchema__OclElement);

			Fragments._Element__Element.initOperations(_Element__Element);
			Fragments._Element__OclAny.initOperations(_Element__OclAny);
			Fragments._Element__OclElement.initOperations(_Element__OclElement);

			Fragments._ElementType__ElementType.initOperations(_ElementType__ElementType);
			Fragments._ElementType__OclAny.initOperations(_ElementType__OclAny);
			Fragments._ElementType__OclElement.initOperations(_ElementType__OclElement);
			Fragments._ElementType__OclEnumeration.initOperations(_ElementType__OclEnumeration);
			Fragments._ElementType__OclType.initOperations(_ElementType__OclType);

			Fragments._Enum__Enum.initOperations(_Enum__Enum);
			Fragments._Enum__OclAny.initOperations(_Enum__OclAny);
			Fragments._Enum__OclElement.initOperations(_Enum__OclElement);

			Fragments._Extension__Extension.initOperations(_Extension__Extension);
			Fragments._Extension__OclAny.initOperations(_Extension__OclAny);
			Fragments._Extension__OclElement.initOperations(_Extension__OclElement);

			Fragments._ImplementationNote__ImplementationNote.initOperations(_ImplementationNote__ImplementationNote);
			Fragments._ImplementationNote__OclAny.initOperations(_ImplementationNote__OclAny);
			Fragments._ImplementationNote__OclElement.initOperations(_ImplementationNote__OclElement);

			Fragments._NoteAttribute__NoteAttribute.initOperations(_NoteAttribute__NoteAttribute);
			Fragments._NoteAttribute__OclAny.initOperations(_NoteAttribute__OclAny);
			Fragments._NoteAttribute__OclElement.initOperations(_NoteAttribute__OclElement);
			Fragments._NoteAttribute__OclEnumeration.initOperations(_NoteAttribute__OclEnumeration);
			Fragments._NoteAttribute__OclType.initOperations(_NoteAttribute__OclType);

			Fragments._Restriction__OclAny.initOperations(_Restriction__OclAny);
			Fragments._Restriction__OclElement.initOperations(_Restriction__OclElement);
			Fragments._Restriction__Restriction.initOperations(_Restriction__Restriction);

			Fragments._ZeroOneBooleanObject__Boolean.initOperations(_ZeroOneBooleanObject__Boolean);
			Fragments._ZeroOneBooleanObject__OclAny.initOperations(_ZeroOneBooleanObject__OclAny);
			Fragments._ZeroOneBooleanObject__OclComparable.initOperations(_ZeroOneBooleanObject__OclComparable);
			Fragments._ZeroOneBooleanObject__ZeroOneBooleanObject.initOperations(_ZeroOneBooleanObject__ZeroOneBooleanObject);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EBMLTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _DocumentType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Documentation = {
			EBMLTables.Properties._Documentation__lang,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EBMLTables.Properties._Documentation__purpose,
			EBMLTables.Properties._Documentation__simple
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DocumentationPurpose = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EBMLSchema = {
			EBMLTables.Properties._EBMLSchema__docType,
			EBMLTables.Properties._EBMLSchema__ebml,
			EBMLTables.Properties._EBMLSchema__element,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EBMLTables.Properties._EBMLSchema__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Element = {
			EBMLTables.Properties._Element__default,
			EBMLTables.Properties._Element__documentation,
			EBMLTables.Properties._Element__effectiveMaxOccurs,
			EBMLTables.Properties._Element__extension,
			EBMLTables.Properties._Element__id,
			EBMLTables.Properties._Element__implementationNote,
			EBMLTables.Properties._Element__length,
			EBMLTables.Properties._Element__maxOccurs,
			EBMLTables.Properties._Element__maxver,
			EBMLTables.Properties._Element__minOccurs,
			EBMLTables.Properties._Element__minver,
			EBMLTables.Properties._Element__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EBMLTables.Properties._Element__path,
			EBMLTables.Properties._Element__range,
			EBMLTables.Properties._Element__recurring,
			EBMLTables.Properties._Element__recursive,
			EBMLTables.Properties._Element__restriction,
			EBMLTables.Properties._Element__type,
			EBMLTables.Properties._Element__unknownSizeAllowed
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ElementType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Enum = {
			EBMLTables.Properties._Enum__documentation,
			EBMLTables.Properties._Enum__label,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EBMLTables.Properties._Enum__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Extension = {
			EBMLTables.Properties._Extension__any,
			EBMLTables.Properties._Extension__anyAttribute,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EBMLTables.Properties._Extension__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ImplementationNote = {
			EBMLTables.Properties._ImplementationNote__noteAttribute,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NoteAttribute = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Restriction = {
			EBMLTables.Properties._Restriction__enum,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ZeroOneBooleanObject = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._DocumentType__DocumentType.initProperties(_DocumentType);
			Fragments._Documentation__Documentation.initProperties(_Documentation);
			Fragments._DocumentationPurpose__DocumentationPurpose.initProperties(_DocumentationPurpose);
			Fragments._EBMLSchema__EBMLSchema.initProperties(_EBMLSchema);
			Fragments._Element__Element.initProperties(_Element);
			Fragments._ElementType__ElementType.initProperties(_ElementType);
			Fragments._Enum__Enum.initProperties(_Enum);
			Fragments._Extension__Extension.initProperties(_Extension);
			Fragments._ImplementationNote__ImplementationNote.initProperties(_ImplementationNote);
			Fragments._NoteAttribute__NoteAttribute.initProperties(_NoteAttribute);
			Fragments._Restriction__Restriction.initProperties(_Restriction);
			Fragments._ZeroOneBooleanObject__ZeroOneBooleanObject.initProperties(_ZeroOneBooleanObject);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EBMLTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _DocumentType__MATROSKA = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.DOCUMENT_TYPE.getEEnumLiteral("MATROSKA"), Types._DocumentType, 0);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DocumentType = {
			_DocumentType__MATROSKA
		};

		public static final EcoreExecutorEnumerationLiteral _DocumentationPurpose__DEFINITION = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.DOCUMENTATION_PURPOSE.getEEnumLiteral("DEFINITION"), Types._DocumentationPurpose, 0);
		public static final EcoreExecutorEnumerationLiteral _DocumentationPurpose__RATIONALE = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.DOCUMENTATION_PURPOSE.getEEnumLiteral("RATIONALE"), Types._DocumentationPurpose, 1);
		public static final EcoreExecutorEnumerationLiteral _DocumentationPurpose__USAGE_NOTES = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.DOCUMENTATION_PURPOSE.getEEnumLiteral("USAGE_NOTES"), Types._DocumentationPurpose, 2);
		public static final EcoreExecutorEnumerationLiteral _DocumentationPurpose__REFERENCES = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.DOCUMENTATION_PURPOSE.getEEnumLiteral("REFERENCES"), Types._DocumentationPurpose, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DocumentationPurpose = {
			_DocumentationPurpose__DEFINITION,
			_DocumentationPurpose__RATIONALE,
			_DocumentationPurpose__USAGE_NOTES,
			_DocumentationPurpose__REFERENCES
		};

		public static final EcoreExecutorEnumerationLiteral _ElementType__INTEGER = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.ELEMENT_TYPE.getEEnumLiteral("INTEGER"), Types._ElementType, 0);
		public static final EcoreExecutorEnumerationLiteral _ElementType__UINTEGER = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.ELEMENT_TYPE.getEEnumLiteral("UINTEGER"), Types._ElementType, 1);
		public static final EcoreExecutorEnumerationLiteral _ElementType__FLOAT = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.ELEMENT_TYPE.getEEnumLiteral("FLOAT"), Types._ElementType, 2);
		public static final EcoreExecutorEnumerationLiteral _ElementType__STRING = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.ELEMENT_TYPE.getEEnumLiteral("STRING"), Types._ElementType, 3);
		public static final EcoreExecutorEnumerationLiteral _ElementType__DATE = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.ELEMENT_TYPE.getEEnumLiteral("DATE"), Types._ElementType, 4);
		public static final EcoreExecutorEnumerationLiteral _ElementType__UTF8 = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.ELEMENT_TYPE.getEEnumLiteral("UTF8"), Types._ElementType, 5);
		public static final EcoreExecutorEnumerationLiteral _ElementType__MASTER = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.ELEMENT_TYPE.getEEnumLiteral("MASTER"), Types._ElementType, 6);
		public static final EcoreExecutorEnumerationLiteral _ElementType__BINARY = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.ELEMENT_TYPE.getEEnumLiteral("BINARY"), Types._ElementType, 7);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ElementType = {
			_ElementType__INTEGER,
			_ElementType__UINTEGER,
			_ElementType__FLOAT,
			_ElementType__STRING,
			_ElementType__DATE,
			_ElementType__UTF8,
			_ElementType__MASTER,
			_ElementType__BINARY
		};

		public static final EcoreExecutorEnumerationLiteral _NoteAttribute__MIN_OCCURS = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.NOTE_ATTRIBUTE.getEEnumLiteral("MIN_OCCURS"), Types._NoteAttribute, 0);
		public static final EcoreExecutorEnumerationLiteral _NoteAttribute__MAX_OCCURS = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.NOTE_ATTRIBUTE.getEEnumLiteral("MAX_OCCURS"), Types._NoteAttribute, 1);
		public static final EcoreExecutorEnumerationLiteral _NoteAttribute__RANGE = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.NOTE_ATTRIBUTE.getEEnumLiteral("RANGE"), Types._NoteAttribute, 2);
		public static final EcoreExecutorEnumerationLiteral _NoteAttribute__LENGTH = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.NOTE_ATTRIBUTE.getEEnumLiteral("LENGTH"), Types._NoteAttribute, 3);
		public static final EcoreExecutorEnumerationLiteral _NoteAttribute__DEFAULT = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.NOTE_ATTRIBUTE.getEEnumLiteral("DEFAULT"), Types._NoteAttribute, 4);
		public static final EcoreExecutorEnumerationLiteral _NoteAttribute__MINVER = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.NOTE_ATTRIBUTE.getEEnumLiteral("MINVER"), Types._NoteAttribute, 5);
		public static final EcoreExecutorEnumerationLiteral _NoteAttribute__MAXVER = new EcoreExecutorEnumerationLiteral(EBMLPackage.Literals.NOTE_ATTRIBUTE.getEEnumLiteral("MAXVER"), Types._NoteAttribute, 6);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _NoteAttribute = {
			_NoteAttribute__MIN_OCCURS,
			_NoteAttribute__MAX_OCCURS,
			_NoteAttribute__RANGE,
			_NoteAttribute__LENGTH,
			_NoteAttribute__DEFAULT,
			_NoteAttribute__MINVER,
			_NoteAttribute__MAXVER
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._DocumentType.initLiterals(_DocumentType);
			Types._DocumentationPurpose.initLiterals(_DocumentationPurpose);
			Types._ElementType.initLiterals(_ElementType);
			Types._NoteAttribute.initLiterals(_NoteAttribute);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EBMLTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new EBMLTables();
	}

	private EBMLTables() {
		super(EBMLPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		EBMLPackage.Literals.ELEMENT
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
