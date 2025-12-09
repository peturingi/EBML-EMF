/**
 */
package dk.ingi.EBML.util;

import dk.ingi.EBML.EBMLPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EBMLXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBMLXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EBMLPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the EBMLResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new EBMLResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new EBMLResourceFactoryImpl());
		}
		return registrations;
	}

} //EBMLXMLProcessor
