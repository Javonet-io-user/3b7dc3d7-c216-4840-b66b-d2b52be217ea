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

public class Level implements IComparable {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.String getName() {
    try {
      java.lang.String res = javonetHandle.get("Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.Integer getValue() {
    try {
      java.lang.Integer res = javonetHandle.get("Value");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.String getDisplayName() {
    try {
      java.lang.String res = javonetHandle.get("DisplayName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetFiled */

  public static Level getOff() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("Off");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setOff(Level param) {
    try {
      Javonet.getType("Level").set("Off", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static Level getEmergency() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("Emergency");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setEmergency(Level param) {
    try {
      Javonet.getType("Level").set("Emergency", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static Level getFatal() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("Fatal");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setFatal(Level param) {
    try {
      Javonet.getType("Level").set("Fatal", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static Level getAlert() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("Alert");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setAlert(Level param) {
    try {
      Javonet.getType("Level").set("Alert", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static Level getCritical() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("Critical");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setCritical(Level param) {
    try {
      Javonet.getType("Level").set("Critical", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static Level getSevere() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("Severe");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setSevere(Level param) {
    try {
      Javonet.getType("Level").set("Severe", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static Level getError() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("Error");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setError(Level param) {
    try {
      Javonet.getType("Level").set("Error", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static Level getWarn() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("Warn");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setWarn(Level param) {
    try {
      Javonet.getType("Level").set("Warn", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static Level getNotice() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("Notice");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setNotice(Level param) {
    try {
      Javonet.getType("Level").set("Notice", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static Level getInfo() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("Info");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setInfo(Level param) {
    try {
      Javonet.getType("Level").set("Info", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static Level getDebug() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("Debug");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setDebug(Level param) {
    try {
      Javonet.getType("Level").set("Debug", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static Level getFine() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("Fine");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setFine(Level param) {
    try {
      Javonet.getType("Level").set("Fine", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static Level getTrace() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("Trace");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setTrace(Level param) {
    try {
      Javonet.getType("Level").set("Trace", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static Level getFiner() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("Finer");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setFiner(Level param) {
    try {
      Javonet.getType("Level").set("Finer", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static Level getVerbose() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("Verbose");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setVerbose(Level param) {
    try {
      Javonet.getType("Level").set("Verbose", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static Level getFinest() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("Finest");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setFinest(Level param) {
    try {
      Javonet.getType("Level").set("Finest", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static Level getAll() {
    try {
      Object res = Javonet.getType("Level").<NObject>get("All");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setAll(Level param) {
    try {
      Javonet.getType("Level").set("All", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Level(java.lang.Integer level, java.lang.String levelName, java.lang.String displayName) {
    try {
      javonetHandle = Javonet.New("log4net.Core.Level", level, levelName, displayName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Level(java.lang.Integer level, java.lang.String levelName) {
    try {
      javonetHandle = Javonet.New("log4net.Core.Level", level, levelName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Level(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.Boolean Equals(Object o) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Equals", o);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Integer GetHashCode() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetHashCode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer CompareTo(Object r) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.IComparable").invoke("CompareTo", r);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public static java.lang.Integer Compare(Level l, Level r) {
    try {
      java.lang.Integer res = Javonet.getType("Level").invoke("Compare", l, r);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
