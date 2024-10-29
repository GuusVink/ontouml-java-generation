package nl.guusgrievink.emf.ontouml.model;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emfcloud.jackson.annotations.EcoreReferenceInfo;
import org.eclipse.emfcloud.jackson.annotations.EcoreTypeInfo;
import org.eclipse.emfcloud.jackson.module.EMFModule;
import org.eclipse.emfcloud.jackson.resource.JsonResourceFactory;
import org.eclipse.emfcloud.jackson.utils.ValueReader;
import org.eclipse.emfcloud.jackson.utils.ValueWriter;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;

import nl.guusgrievink.emf.ontouml.model.ontouml.OntoumlPackage;
import nl.guusgrievink.emf.ontouml.model.ontouml.Project;

public class readOntoUML {

	public static void main(String[] args) throws IOException {
		String ontoUMLJsonPath = null;
		String xmiStoreLocation = null;
		
		if (args.length >= 2) {
			ontoUMLJsonPath = args[0];
			xmiStoreLocation = args[1];
		} else {
			String modelName = "CategoryWithAttributes";
			ontoUMLJsonPath = "source-models\\fragments\\" + modelName + ".json";
			xmiStoreLocation = "../OntoUML2ImplementationModel/source-models/testFragments/" + modelName + ".xmi";
//			xmiStoreLocation = "generated-models\\fragments\\" + modelName + ".xmi";
		}
		
		
//		String xmiStoreLocation = "C:\\Users\\64guu\\eclipse-ontouml\\OntoUML2ImplementationModel\\source-models\\testFragments\\" + modelName + ".xmi"; 
//		String jsonStoreLocation = "generated-models\\" + modelName + ".json";
		
		convertOntoUmlJsonToXmi(ontoUMLJsonPath, xmiStoreLocation);
		
		
		// Store loaded project as OntoUML JSON
//		Resource jsonStoreResource = resourceSet.createResource(URI.createFileURI(jsonStoreLocation));
//		jsonStoreResource.getContents().add(loadedProject);
//		jsonStoreResource.save(null);
	}
	
	private static void convertOntoUmlJsonToXmi(String jsonPath, String outputXmiPath) throws IOException {
		System.out.println("Reading from: " + jsonPath);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		var packageRegistry = resourceSet.getPackageRegistry();
		packageRegistry.put(OntoumlPackage.eNS_URI, OntoumlPackage.eINSTANCE);		
		
		var extensionFactory = resourceSet.getResourceFactoryRegistry()
						.getExtensionToFactoryMap();
		// Create JsonResourceFactory with the OntoUML specific mapper
		extensionFactory.put("json", new JsonResourceFactory(getOntoUMLMapper()));
		extensionFactory.put("xmi", new XMIResourceFactoryImpl());
		
		
		Resource resource = resourceSet.createResource(URI.createFileURI(jsonPath));
		resource.load(null);
		Project loadedProject = (Project) resource.getContents().get(0);
		
		System.out.println(loadedProject);
		
		// Store loaded project as XMI		
		Resource xmiResource = resourceSet.createResource(URI.createFileURI(outputXmiPath));
		xmiResource.getContents().add(loadedProject);
		xmiResource.save(null);
		
		System.out.println("Stored project at "+ outputXmiPath);
	}
	
	/**
	 * Returns a Jackson mapper specifically for OntoUML JSON.
	 * @return Jackson mapper for OntoUML
	 */
	private static ObjectMapper getOntoUMLMapper() {
		ObjectMapper mapper = new ObjectMapper();
		EMFModule module = new EMFModule();
		
		module.setTypeInfo(new EcoreTypeInfo("type",
				  new ValueReader<String, EClass>() {
					  public EClass readValue(String value, DeserializationContext context) {
						  return (EClass) OntoumlPackage.eINSTANCE.getEClassifier(value);
					  }
				  }, new ValueWriter<EClass, String>() {
					
					@Override
					public String writeValue(EClass value, SerializerProvider context) {
						String longName = value.getInstanceTypeName();
						return longName.substring(longName.lastIndexOf('.')+1);
					}
				}));
		
		// not necessary as field 'id' is marked as such in the ecore metamodel
//		module.setIdentityInfo(new EcoreIdentityInfo("id"));
		module.setReferenceInfo(new EcoreReferenceInfo("id"));
		
		mapper.registerModule(module);
		return mapper;
	}
}
