# OntoUML2ImplementationModel

ATL Project that takes an OntoUML EMF model (adhering to the [Ecore metamodel](../nl.guusgrievink.emf.ontouml.model/readme.md)) 
and generates an implementation model (adhering to the [UML2 metamodel](https://projects.eclipse.org/projects/modeling.mdt.uml2)).


## Structure
`OntoUML2ImplementationModel.atl` is the main transformation that should be executed.
Both `MyStrings.atl` and `OntoUmlUtilities.atl` contain utility functions that are used by the main transformation.

This project can only be executed within an instance of Eclipse using the ATL plugin.
The [OntoUML2ImplementationModel project](../nl.guusgrievink.atl.OntoUML2ImplementationModel/readme.md) is an ATL plugin
derived from this project which can also be executed from Java.
