# OntoUML to Java transformation

Eclipse EMF Workspace containing several projects to generate Java code from OntoUML models.
Related to the Master's thesis 'Generating Java from OntoUML'.

This workspace provides several projects:
- An OntoUML Ecore metamodel
- An ATL transformation from OntoUML to an implementation model (defined in UML2)
- An Acceleo UML to Java generation project

Each of the separate projects contains a readme with some more information.

## Requirements
- Eclipse IDE with Modelling Tools (https://www.eclipse.org/downloads/packages/release/2024-09/r/eclipse-modeling-tools)
- Eclipse ATL plugin (https://help.eclipse.org/latest/index.jsp?topic=%2Forg.eclipse.m2m.atl.doc%2Fguide%2Fuser%2FInstallation.html)
- Eclipse Acceleo plugin (https://wiki.eclipse.org/Acceleo/Installation)
- EMFJSON-Jackson (https://emfjson.github.io/projects/jackson/latest/)
- EMF version of UML2 metamodel (https://projects.eclipse.org/projects/modeling.mdt.uml2)

## Overview of each project
\**in custom order*

- [nl.guusgrievink.emf.ontouml.model](nl.guusgrievink.emf.ontouml.model/readme.md)
    Contains the OntoUML Ecore metamodel and code to read an OntoUML JSON file.
- [OntoUML2ImplementationModel](OntoUML2ImplementationModel/readme.md)
    ATL transformation from an OntoUML model to implementation model (UML).
- [nl.guusgrievink.atl.OntoUML2ImplementationModel](nl.guusgrievink.atl.OntoUML2ImplementationModel/readme.md)
    ATL plugin version of the OntoUML-to-implementationmodel transformation (for execution outside of Eclipse).
- [nl.guusgrievink.ontouml.implementationmodel.gen.java](nl.guusgrievink.ontouml.implementationmodel.gen.java/readme.md)
    Acceleo Java code generation from a UML model.
- [TestCodeGeneration](TestCodeGeneration/readme.md) Plain Java project used as a location to store (and compile) generated Java code. 

## Contact

In case you have any questions, either regarding using the transformation or about other things, feel free to leave an Issue.


