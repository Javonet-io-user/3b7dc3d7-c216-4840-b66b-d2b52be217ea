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
import jio.System.Reflection.*;
import jio.System.*;
import jio.System.Collections.*;

public class SystemInfo {
  protected NObject javonetHandle;
  /** GetProperty */
  public static java.lang.String getNewLine() {
    try {
      java.lang.String res = Javonet.getType("SystemInfo").get("NewLine");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public static java.lang.String getApplicationBaseDirectory() {
    try {
      java.lang.String res = Javonet.getType("SystemInfo").get("ApplicationBaseDirectory");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public static java.lang.String getConfigurationFileLocation() {
    try {
      java.lang.String res = Javonet.getType("SystemInfo").get("ConfigurationFileLocation");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public static java.lang.String getEntryAssemblyLocation() {
    try {
      java.lang.String res = Javonet.getType("SystemInfo").get("EntryAssemblyLocation");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public static java.lang.Integer getCurrentThreadId() {
    try {
      java.lang.Integer res = Javonet.getType("SystemInfo").get("CurrentThreadId");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public static java.lang.String getHostName() {
    try {
      java.lang.String res = Javonet.getType("SystemInfo").get("HostName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public static java.lang.String getApplicationFriendlyName() {
    try {
      java.lang.String res = Javonet.getType("SystemInfo").get("ApplicationFriendlyName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public static DateTime getProcessStartTime() {
    try {
      Object res = Javonet.getType("SystemInfo").<NObject>get("ProcessStartTime");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public static void setNullText(java.lang.String value) {
    try {
      Javonet.getType("SystemInfo").set("NullText", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public static java.lang.String getNullText() {
    try {
      java.lang.String res = Javonet.getType("SystemInfo").get("NullText");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public static void setNotAvailableText(java.lang.String value) {
    try {
      Javonet.getType("SystemInfo").set("NotAvailableText", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public static java.lang.String getNotAvailableText() {
    try {
      java.lang.String res = Javonet.getType("SystemInfo").get("NotAvailableText");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetFiled */

  public static jio.System.Type[] getEmptyTypes(Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("SystemInfo").<NObject[]>get("EmptyTypes");
      if (res == null) return null;
      return (jio.System.Type[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setEmptyTypes(jio.System.Type[] param) {
    try {
      Javonet.getType("SystemInfo").set("EmptyTypes", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SystemInfo(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static java.lang.String AssemblyLocationInfo(Assembly myAssembly) {
    try {
      java.lang.String res =
          Javonet.getType("SystemInfo").invoke("AssemblyLocationInfo", myAssembly);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static java.lang.String AssemblyQualifiedName(jio.System.Type type) {
    try {
      java.lang.String res = Javonet.getType("SystemInfo").invoke("AssemblyQualifiedName", type);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static java.lang.String AssemblyShortName(Assembly myAssembly) {
    try {
      java.lang.String res = Javonet.getType("SystemInfo").invoke("AssemblyShortName", myAssembly);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static java.lang.String AssemblyFileName(Assembly myAssembly) {
    try {
      java.lang.String res = Javonet.getType("SystemInfo").invoke("AssemblyFileName", myAssembly);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static jio.System.Type GetTypeFromString(
      jio.System.Type relativeType,
      java.lang.String typeName,
      java.lang.Boolean throwOnError,
      java.lang.Boolean ignoreCase) {
    try {
      Object res =
          Javonet.getType("SystemInfo")
              .invoke("GetTypeFromString", relativeType, typeName, throwOnError, ignoreCase);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static jio.System.Type GetTypeFromString(
      java.lang.String typeName, java.lang.Boolean throwOnError, java.lang.Boolean ignoreCase) {
    try {
      Object res =
          Javonet.getType("SystemInfo")
              .invoke("GetTypeFromString", typeName, throwOnError, ignoreCase);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static jio.System.Type GetTypeFromString(
      Assembly relativeAssembly,
      java.lang.String typeName,
      java.lang.Boolean throwOnError,
      java.lang.Boolean ignoreCase) {
    try {
      Object res =
          Javonet.getType("SystemInfo")
              .invoke("GetTypeFromString", relativeAssembly, typeName, throwOnError, ignoreCase);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Guid NewGuid() {
    try {
      Object res = Javonet.getType("SystemInfo").invoke("NewGuid");
      if (res == null) return null;
      return new Guid((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ArgumentOutOfRangeException CreateArgumentOutOfRangeException(
      java.lang.String parameterName, Object actualValue, java.lang.String message) {
    try {
      Object res =
          Javonet.getType("SystemInfo")
              .invoke("CreateArgumentOutOfRangeException", parameterName, actualValue, message);
      if (res == null) return null;
      return new ArgumentOutOfRangeException((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static java.lang.Boolean TryParse(
      java.lang.String s, AtomicReference<java.lang.Integer> val) {
    try {
      java.lang.Boolean res =
          Javonet.getType("SystemInfo")
              .invoke(
                  "TryParse",
                  s,
                  new NOut(val, Helper.JavaToDotnetType.get(java.lang.Integer.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public static java.lang.Boolean TryParse(
      java.lang.String s, AtomicReference<java.lang.Long> val) {
    try {
      java.lang.Boolean res =
          Javonet.getType("SystemInfo")
              .invoke(
                  "TryParse", s, new NOut(val, Helper.JavaToDotnetType.get(java.lang.Long.class)));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public static java.lang.String GetAppSetting(java.lang.String key) {
    try {
      java.lang.String res = Javonet.getType("SystemInfo").invoke("GetAppSetting", key);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static java.lang.String ConvertToFullPath(java.lang.String path) {
    try {
      java.lang.String res = Javonet.getType("SystemInfo").invoke("ConvertToFullPath", path);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static Hashtable CreateCaseInsensitiveHashtable() {
    try {
      Object res = Javonet.getType("SystemInfo").invoke("CreateCaseInsensitiveHashtable");
      if (res == null) return null;
      return new Hashtable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
