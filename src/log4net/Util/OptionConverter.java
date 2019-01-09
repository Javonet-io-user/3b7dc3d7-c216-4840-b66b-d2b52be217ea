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
import jio.System.Collections.*;

public class OptionConverter {
  protected NObject javonetHandle;

  public OptionConverter(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static java.lang.Boolean ToBoolean(
      java.lang.String argValue, java.lang.Boolean defaultValue) {
    try {
      java.lang.Boolean res =
          Javonet.getType("OptionConverter").invoke("ToBoolean", argValue, defaultValue);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public static java.lang.Long ToFileSize(java.lang.String argValue, java.lang.Long defaultValue) {
    try {
      java.lang.Long res =
          Javonet.getType("OptionConverter").invoke("ToFileSize", argValue, defaultValue);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Object ConvertStringTo(jio.System.Type target, java.lang.String txt) {
    try {
      Object res = Javonet.getType("OptionConverter").invoke("ConvertStringTo", target, txt);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static java.lang.Boolean CanConvertTypeTo(
      jio.System.Type sourceType, jio.System.Type targetType) {
    try {
      java.lang.Boolean res =
          Javonet.getType("OptionConverter").invoke("CanConvertTypeTo", sourceType, targetType);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public static Object ConvertTypeTo(Object sourceInstance, jio.System.Type targetType) {
    try {
      Object res =
          Javonet.getType("OptionConverter").invoke("ConvertTypeTo", sourceInstance, targetType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static Object InstantiateByClassName(
      java.lang.String className, jio.System.Type superClass, Object defaultValue) {
    try {
      Object res =
          Javonet.getType("OptionConverter")
              .invoke("InstantiateByClassName", className, superClass, defaultValue);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static java.lang.String SubstituteVariables(java.lang.String value, IDictionary props) {
    try {
      java.lang.String res =
          Javonet.getType("OptionConverter").invoke("SubstituteVariables", value, props);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
