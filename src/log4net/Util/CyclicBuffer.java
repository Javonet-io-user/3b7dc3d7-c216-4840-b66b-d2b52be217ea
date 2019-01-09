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
import log4net.Core.*;

public class CyclicBuffer {
  protected NObject javonetHandle;
  /** GetProperty */
  public LoggingEvent get_Item(java.lang.Integer i) {
    try {
      Object res = javonetHandle.invoke("get_Item", i);
      if (res == null) return null;
      return new LoggingEvent((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getMaxSize() {
    try {
      java.lang.Integer res = javonetHandle.get("MaxSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getLength() {
    try {
      java.lang.Integer res = javonetHandle.get("Length");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public CyclicBuffer(java.lang.Integer maxSize) {
    try {
      javonetHandle = Javonet.New("log4net.Util.CyclicBuffer", maxSize);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CyclicBuffer(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public LoggingEvent Append(LoggingEvent loggingEvent) {
    try {
      Object res = javonetHandle.invoke("Append", loggingEvent);
      if (res == null) return null;
      return new LoggingEvent((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LoggingEvent PopOldest() {
    try {
      Object res = javonetHandle.invoke("PopOldest");
      if (res == null) return null;
      return new LoggingEvent((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LoggingEvent[] PopAll(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("PopAll");
      if (res == null) return null;
      return (LoggingEvent[]) Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Clear() {
    try {
      javonetHandle.invoke("Clear");
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
