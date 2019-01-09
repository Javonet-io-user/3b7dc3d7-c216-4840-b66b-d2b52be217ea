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
import jio.System.*;
import log4net.Core.*;
import log4net.Util.*;

public class LoggingEventData extends ValueType {
  protected NObject javonetHandle;
  /** GetFiled */
  public java.lang.String getLoggerName() {
    try {
      java.lang.String res = javonetHandle.get("LoggerName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setLoggerName(java.lang.String param) {
    try {
      javonetHandle.set("LoggerName", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public Level getLevel() {
    try {
      Object res = javonetHandle.<NObject>get("Level");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setLevel(Level param) {
    try {
      javonetHandle.set("Level", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String getMessage() {
    try {
      java.lang.String res = javonetHandle.get("Message");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setMessage(java.lang.String param) {
    try {
      javonetHandle.set("Message", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String getThreadName() {
    try {
      java.lang.String res = javonetHandle.get("ThreadName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setThreadName(java.lang.String param) {
    try {
      javonetHandle.set("ThreadName", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public DateTime getTimeStamp() {
    try {
      Object res = javonetHandle.<NObject>get("TimeStamp");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setTimeStamp(DateTime param) {
    try {
      javonetHandle.set("TimeStamp", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public LocationInfo getLocationInfo() {
    try {
      Object res = javonetHandle.<NObject>get("LocationInfo");
      if (res == null) return null;
      return new LocationInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setLocationInfo(LocationInfo param) {
    try {
      javonetHandle.set("LocationInfo", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String getUserName() {
    try {
      java.lang.String res = javonetHandle.get("UserName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setUserName(java.lang.String param) {
    try {
      javonetHandle.set("UserName", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String getIdentity() {
    try {
      java.lang.String res = javonetHandle.get("Identity");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setIdentity(java.lang.String param) {
    try {
      javonetHandle.set("Identity", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String getExceptionString() {
    try {
      java.lang.String res = javonetHandle.get("ExceptionString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setExceptionString(java.lang.String param) {
    try {
      javonetHandle.set("ExceptionString", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String getDomain() {
    try {
      java.lang.String res = javonetHandle.get("Domain");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setDomain(java.lang.String param) {
    try {
      javonetHandle.set("Domain", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public PropertiesDictionary getProperties() {
    try {
      Object res = javonetHandle.<NObject>get("Properties");
      if (res == null) return null;
      return new PropertiesDictionary((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setProperties(PropertiesDictionary param) {
    try {
      javonetHandle.set("Properties", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LoggingEventData(NObject handle) {
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
