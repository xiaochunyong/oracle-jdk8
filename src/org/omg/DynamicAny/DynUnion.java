package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynUnion.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u172/10810/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Wednesday, March 28, 2018 9:44:51 PM PDT
*/


/**
    * DynUnion objects support the manipulation of IDL unions.
    * A union can have only two valid current positions:
    * <UL>
    * <LI>zero, which denotes the discriminator
    * <LI>one, which denotes the active member
    * </UL>
    * The component_count value for a union depends on the current discriminator:
    * it is 2 for a union whose discriminator indicates a named member, and 1 otherwise.
    */
public interface DynUnion extends DynUnionOperations, org.omg.DynamicAny.DynAny, org.omg.CORBA.portable.IDLEntity 
{
} // interface DynUnion
