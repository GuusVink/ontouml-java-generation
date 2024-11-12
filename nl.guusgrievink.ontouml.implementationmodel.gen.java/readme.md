# UML to Java generation

Acceleo project to generate Java code from UML2 models.
Derived from the non-active [UML-Java-Generation](https://github.com/ObeoNetwork/UML-Java-Generation) project by Obeo.

This project is adjusted in several ways:
- Now uses [UML2 5.0.0 EMF metamodel](https://projects.eclipse.org/projects/modeling.mdt.uml2)
- Updated to use Acceleo version 3.7.17
- Fixed numerous bugs
- Added functionality for Interface attributes

## Configuration
At the moment, the transformation is configured to generate all get/set and list update methods. 
To change this behaviour, the the method `setUml2JavaConfigurationHolder()` in the class [Uml2java.java](src/nl/guusgrievink/ontouml/implementationmodel/gen/java/main/Uml2java.java) should be adjusted.