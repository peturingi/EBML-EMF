/**
 */
package dk.ingi.EBML.util;

import dk.ingi.EBML.Documentation;
import dk.ingi.EBML.EBMLPackage;
import dk.ingi.EBML.EBMLSchema;
import dk.ingi.EBML.Element;
import dk.ingi.EBML.Extension;
import dk.ingi.EBML.ImplementationNote;
import dk.ingi.EBML.Restriction;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dk.ingi.EBML.EBMLPackage
 * @generated
 */
public class EBMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EBMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EBMLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EBMLSwitch<Adapter> modelSwitch = new EBMLSwitch<Adapter>() {
		@Override
		public Adapter caseEBMLSchema(EBMLSchema object) {
			return createEBMLSchemaAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseExtension(Extension object) {
			return createExtensionAdapter();
		}

		@Override
		public Adapter caseDocumentation(Documentation object) {
			return createDocumentationAdapter();
		}

		@Override
		public Adapter caseImplementationNote(ImplementationNote object) {
			return createImplementationNoteAdapter();
		}

		@Override
		public Adapter caseRestriction(Restriction object) {
			return createRestrictionAdapter();
		}

		@Override
		public Adapter caseEnum(dk.ingi.EBML.Enum object) {
			return createEnumAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.ingi.EBML.EBMLSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.ingi.EBML.EBMLSchema
	 * @generated
	 */
	public Adapter createEBMLSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.ingi.EBML.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.ingi.EBML.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.ingi.EBML.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.ingi.EBML.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.ingi.EBML.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.ingi.EBML.Documentation
	 * @generated
	 */
	public Adapter createDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.ingi.EBML.ImplementationNote <em>Implementation Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.ingi.EBML.ImplementationNote
	 * @generated
	 */
	public Adapter createImplementationNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.ingi.EBML.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.ingi.EBML.Restriction
	 * @generated
	 */
	public Adapter createRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.ingi.EBML.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.ingi.EBML.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EBMLAdapterFactory
