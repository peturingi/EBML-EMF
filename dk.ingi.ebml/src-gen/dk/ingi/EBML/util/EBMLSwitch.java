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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dk.ingi.EBML.EBMLPackage
 * @generated
 */
public class EBMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EBMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBMLSwitch() {
		if (modelPackage == null) {
			modelPackage = EBMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case EBMLPackage.EBML_SCHEMA: {
			EBMLSchema ebmlSchema = (EBMLSchema) theEObject;
			T result = caseEBMLSchema(ebmlSchema);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EBMLPackage.ELEMENT: {
			Element element = (Element) theEObject;
			T result = caseElement(element);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EBMLPackage.EXTENSION: {
			Extension extension = (Extension) theEObject;
			T result = caseExtension(extension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EBMLPackage.DOCUMENTATION: {
			Documentation documentation = (Documentation) theEObject;
			T result = caseDocumentation(documentation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EBMLPackage.IMPLEMENTATION_NOTE: {
			ImplementationNote implementationNote = (ImplementationNote) theEObject;
			T result = caseImplementationNote(implementationNote);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EBMLPackage.RESTRICTION: {
			Restriction restriction = (Restriction) theEObject;
			T result = caseRestriction(restriction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EBMLPackage.ENUM: {
			dk.ingi.EBML.Enum enum_ = (dk.ingi.EBML.Enum) theEObject;
			T result = caseEnum(enum_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEBMLSchema(EBMLSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentation(Documentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationNote(ImplementationNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestriction(Restriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(dk.ingi.EBML.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EBMLSwitch
