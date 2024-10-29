package nl.guusgrievink.ontouml.implementationmodel.gen.java.services;

import java.util.List;

import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Class;

public class ImplementationModelUtils {
	
	public ImplementationModelUtils() {}
	

	public boolean hasStereotype(Class clazz, String stereotypeName) {
	   List<Stereotype> stereotypes = clazz.getAppliedStereotypes();
	     for (Stereotype stereotype : stereotypes) {
	       if (stereotype.getName().equals(stereotypeName)) {
	         return true;
	       }
	     }
	     return false;
	  }
}
