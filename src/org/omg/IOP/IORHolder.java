package org.omg.IOP;

/**
* org/omg/IOP/IORHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u172/10810/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Wednesday, March 28, 2018 9:44:51 PM PDT
*/

public final class IORHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.IOR value = null;

  public IORHolder ()
  {
  }

  public IORHolder (org.omg.IOP.IOR initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.IORHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.IORHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.IORHelper.type ();
  }

}
