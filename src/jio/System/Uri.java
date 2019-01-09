package jio.System;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;

public class Uri implements ISerializable {
  protected NObject javonetHandle;

  public Uri(java.lang.String uriString) {
    try {
      javonetHandle = Javonet.New("System.Uri", uriString);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Uri(java.lang.String uriString, java.lang.Boolean dontEscape) {
    try {
      javonetHandle = Javonet.New("System.Uri", uriString, dontEscape);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Uri(Uri baseUri, java.lang.String relativeUri, java.lang.Boolean dontEscape) {
    try {
      javonetHandle = Javonet.New("System.Uri", baseUri, relativeUri, dontEscape);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Uri(java.lang.String uriString, UriKind uriKind) {
    try {
      javonetHandle = Javonet.New("System.Uri", uriString, NEnum.fromJavaEnum(uriKind));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Uri(Uri baseUri, java.lang.String relativeUri) {
    try {
      javonetHandle = Javonet.New("System.Uri", baseUri, relativeUri);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Uri(Uri baseUri, Uri relativeUri) {
    try {
      javonetHandle = Javonet.New("System.Uri", baseUri, relativeUri);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Uri(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void GetObjectData(
      SerializationInfo serializationInfo, StreamingContext streamingContext) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
          .invoke("GetObjectData", serializationInfo, streamingContext);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
