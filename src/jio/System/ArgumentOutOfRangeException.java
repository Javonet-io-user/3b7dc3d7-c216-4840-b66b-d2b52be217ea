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
import jio.System.Runtime.InteropServices.*;

public class ArgumentOutOfRangeException extends ArgumentException
    implements ISerializable, _Exception {
  protected NObject javonetHandle;

  public ArgumentOutOfRangeException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.ArgumentOutOfRangeException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ArgumentOutOfRangeException(java.lang.String paramName) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.ArgumentOutOfRangeException", paramName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ArgumentOutOfRangeException(java.lang.String paramName, java.lang.String message) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.ArgumentOutOfRangeException", paramName, message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ArgumentOutOfRangeException(
      java.lang.String message, jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.ArgumentOutOfRangeException", message, innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ArgumentOutOfRangeException(
      java.lang.String paramName, Object actualValue, java.lang.String message) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.ArgumentOutOfRangeException", paramName, actualValue, message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ArgumentOutOfRangeException(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
