package nl.guusgrievink.ontouml.implementationmodel.gen.java.services;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;

public class AncestorServices {
	
	/**
	 * Returns all interface ancestors of a particular interface.
	 * 
	 * In other words, returns all interfaces that anInterface extends (recursively)
	 * @author Guus Grievink
	 * @param anInterface
	 * @return All interface ancestors for anInterface
	 */
	public List<Interface> getAllInterfaceAncestors(Interface anInterface) {
		// Recursive base step: stop when interface extends no other interfaces
		if (anInterface.getGeneralizations().stream().filter(g -> g.getGeneral() instanceof Interface).count() <= 0) {
			return List.of();
		}
		
		ArrayList<Interface> allSuperInterfaces = new ArrayList<Interface>();
		
		for(Generalization generalization : anInterface.getGeneralizations()) {
			if (generalization.getGeneral() instanceof Interface superInterface) {
				// Recursive step: Add all super interfaces this interface
				allSuperInterfaces.addAll(getAllInterfaceAncestors(superInterface));
				
				// Add the current interface itself
				allSuperInterfaces.add(superInterface);
			}
		}
		return allSuperInterfaces;	
	}

}
