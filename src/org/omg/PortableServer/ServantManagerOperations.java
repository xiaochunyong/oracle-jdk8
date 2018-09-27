package org.omg.PortableServer;


/**
* org/omg/PortableServer/ServantManagerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u172/10810/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, March 28, 2018 9:44:52 PM PDT
*/


/**
	 * A servant manager supplies a POA with the ability 
	 * to activate objects on demand when the POA receives 
	 * a request targeted at an inactive object. A servant 
	 * manager is registered with a POA as a callback object, 
	 * to be invoked by the POA when necessary.
	 * ServantManagers can either be ServantActivators or
	 * ServantLocators. A ServantManager object must be 
	 * local to the process containing the POA objects 
	 * it is registered with.
	 */
public interface ServantManagerOperations 
{
} // interface ServantManagerOperations
