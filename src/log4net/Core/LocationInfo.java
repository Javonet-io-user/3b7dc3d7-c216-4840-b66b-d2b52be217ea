package log4net.Core;

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
import log4net.Core.*;
import jio.System.*;

public class LocationInfo {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.String getClassName() {
    try {
      java.lang.String res = javonetHandle.get("ClassName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getFileName() {
    try {
      java.lang.String res = javonetHandle.get("FileName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getLineNumber() {
    try {
      java.lang.String res = javonetHandle.get("LineNumber");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getMethodName() {
    try {
      java.lang.String res = javonetHandle.get("MethodName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getFullInfo() {
    try {
      java.lang.String res = javonetHandle.get("FullInfo");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public LocationInfo(jio.System.Type callerStackBoundaryDeclaringType) {
    try {
      javonetHandle = Javonet.New("log4net.Core.LocationInfo", callerStackBoundaryDeclaringType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LocationInfo(
      java.lang.String className,
      java.lang.String methodName,
      java.lang.String fileName,
      java.lang.String lineNumber) {
    try {
      javonetHandle =
          Javonet.New("log4net.Core.LocationInfo", className, methodName, fileName, lineNumber);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LocationInfo(NObject handle) {
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
