package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/ServerNotActiveHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u172/10810/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, March 28, 2018 9:44:51 PM PDT
*/

public final class ServerNotActiveHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.ServerNotActive value = null;

  public ServerNotActiveHolder ()
  {
  }

  public ServerNotActiveHolder (com.sun.corba.se.spi.activation.ServerNotActive initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.ServerNotActiveHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.ServerNotActiveHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.ServerNotActiveHelper.type ();
  }

}
