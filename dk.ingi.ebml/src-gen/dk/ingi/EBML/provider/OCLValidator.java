package dk.ingi.EBML.provider;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.validation.ComposedEValidator;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;

import dk.ingi.EBML.EBMLPackage;

public class OCLValidator {

	public static void register() {
		CompleteOCLStandaloneSetup.doSetup();
	
		final OCL ocl = OCL.newInstance();
		final URI oclURI = URI.createPlatformPluginURI("dk.ingi.ebml/model/EBML.ocl", true);
		ocl.parse(oclURI);
		
		final EBMLPackage ePackage = EBMLPackage.eINSTANCE;
		ComposedEValidator.install(EValidator.Registry.INSTANCE, ePackage);
	}

}
