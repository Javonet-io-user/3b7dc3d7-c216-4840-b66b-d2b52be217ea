package log4net.Util;

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
import log4net.Util.*;
import jio.System.*;
import log4net.Core.*;

public class OnlyOnceErrorHandler implements IErrorHandler {
  protected NObject javonetHandle;

  public OnlyOnceErrorHandler() {
    try {
      javonetHandle = Javonet.New("log4net.Util.OnlyOnceErrorHandler");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OnlyOnceErrorHandler(java.lang.String prefix) {
    try {
      javonetHandle = Javonet.New("log4net.Util.OnlyOnceErrorHandler", prefix);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OnlyOnceErrorHandler(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Error(java.lang.String message, jio.System.Exception e, ErrorCode errorCode) {
    try {
      javonetHandle
          .explicitInterface("log4net.Core.IErrorHandler")
          .invoke("Error", message, e, NEnum.fromJavaEnum(errorCode));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Error(java.lang.String message, jio.System.Exception e) {
    try {
      javonetHandle.explicitInterface("log4net.Core.IErrorHandler").invoke("Error", message, e);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Error(java.lang.String message) {
    try {
      javonetHandle.explicitInterface("log4net.Core.IErrorHandler").invoke("Error", message);
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
