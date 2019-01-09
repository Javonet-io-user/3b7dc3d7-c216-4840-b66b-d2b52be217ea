package log4net.DateFormatter;

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
import log4net.DateFormatter.*;
import jio.System.*;
import jio.System.IO.*;

public class AbsoluteTimeDateFormatter implements IDateFormatter {
  protected NObject javonetHandle;
  /** GetFiled */
  public static java.lang.String getAbsoluteTimeDateFormat() {
    try {
      java.lang.String res =
          Javonet.getType("AbsoluteTimeDateFormatter").get("AbsoluteTimeDateFormat");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setAbsoluteTimeDateFormat(java.lang.String param) {
    try {
      Javonet.getType("AbsoluteTimeDateFormatter").set("AbsoluteTimeDateFormat", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getDateAndTimeDateFormat() {
    try {
      java.lang.String res =
          Javonet.getType("AbsoluteTimeDateFormatter").get("DateAndTimeDateFormat");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setDateAndTimeDateFormat(java.lang.String param) {
    try {
      Javonet.getType("AbsoluteTimeDateFormatter").set("DateAndTimeDateFormat", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getIso8601TimeDateFormat() {
    try {
      java.lang.String res =
          Javonet.getType("AbsoluteTimeDateFormatter").get("Iso8601TimeDateFormat");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setIso8601TimeDateFormat(java.lang.String param) {
    try {
      Javonet.getType("AbsoluteTimeDateFormatter").set("Iso8601TimeDateFormat", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AbsoluteTimeDateFormatter() {
    try {
      javonetHandle = Javonet.New("log4net.DateFormatter.AbsoluteTimeDateFormatter");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AbsoluteTimeDateFormatter(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void FormatDate(DateTime dateToFormat, TextWriter writer) {
    try {
      javonetHandle
          .explicitInterface("log4net.DateFormatter.IDateFormatter")
          .invoke("FormatDate", dateToFormat, writer);
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
