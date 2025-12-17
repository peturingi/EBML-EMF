/**
 */
package dk.ingi.EBML.util;

import dk.ingi.EBML.EBMLPackage;

import java.util.Map;

import dk.ingi.EBML.EBMLSchema;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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

	/**
	 * Load an EBMLSchema model from the given URI.
	 * @generated NOT
	 * @throws IllegalArgumentException if the URI does not point to a valid EBML model.
	 * @throws IllegalArgumentException if the URI does not have the "ebml" file extension.
	 */
	public static EBMLSchema load(final URI model) {
		if (model.fileExtension() == null || !model.fileExtension().equals("ebml")) {
			throw new IllegalArgumentException("Not an ebml model: " + model);
		}

		EBMLPackage.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ebml", new EBMLResourceFactoryImpl());
		final ResourceSetImpl resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(model, true);

		if (resource.getContents().getFirst() instanceof final EBMLSchema ebmlPackage) {
			return ebmlPackage;
		}
		throw new IllegalArgumentException("The model's root element is not an EBMLSchema.");
	}

} //EBMLXMLProcessor
