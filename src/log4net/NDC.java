package log4net;

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
import log4net.*;
import jio.System.Collections.*;
import jio.System.*;

public class NDC {
  protected NObject javonetHandle;
  /** GetProperty */
  public static java.lang.Integer getDepth() {
    try {
      java.lang.Integer res = Javonet.getType("NDC").get("Depth");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public NDC(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static void Clear() {
    try {
      Javonet.getType("NDC").invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static Stack CloneStack() {
    try {
      Object res = Javonet.getType("NDC").invoke("CloneStack");
      if (res == null) return null;
      return new Stack((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static void Inherit(Stack stack) {
    try {
      Javonet.getType("NDC").invoke("Inherit", stack);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.String Pop() {
    try {
      java.lang.String res = Javonet.getType("NDC").invoke("Pop");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static IDisposable Push(java.lang.String message) {
    try {
      Object res = Javonet.getType("NDC").invoke("Push", message);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static void Remove() {
    try {
      Javonet.getType("NDC").invoke("Remove");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void SetMaxDepth(java.lang.Integer maxDepth) {
    try {
      Javonet.getType("NDC").invoke("SetMaxDepth", maxDepth);
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
