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



## Note regarding Acceleo bug
With the used version of Acceleo in combination with the Eclipse IDE, sometimes an error is indicated to be present in the files `classifierJavaFile.mtl`, `classJavaFile.mtl`, and `interfaceJavaFile.mtl`, which has to do with circular imports.
However, this seems to be a false positive error indication (i.e., the imports are necessary to make the generation work properly and the generation executes without warning or error).
To get rid of these error messages, one can make a trivial change to each file (e.g., adding and removing a whitespace at any position) and saving the file, after which the error disappears.