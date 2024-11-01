# OntoUML2ImplementationModel ATL Plugin

ATL plugin project derived from the [OntoUML2ImplementationModel](../OntoUML2ImplementationModel/readme.md)
ATL project. In the form of this ATL plugin, it can be executed from Java and does not require to be run from an
instance of Eclipse.

The folder [src/nl/guusgrievink/atl/OntoUML2ImplementationModel/files](src/nl/guusgrievink/atl/OntoUML2ImplementationModel/files) contains the ATL and comiled ASM 
files that are developed in the [OntoUML2ImplementationModel](../OntoUML2ImplementationModel/readme.md).
Hence, if changed are made in that project, the files in this project should be updated.
For convience, the [ANT task defined for this project](build.xml) takes care of this with the
target `copy-atl-files` (which is executed upon building the project).

The ANT configuration also contains a target that can be executed with command line arguments to provide a path to a source model (OntoUML Ecore model XMI)
and path to the location where the generated implementation model should be stored (path ending in .uml).
