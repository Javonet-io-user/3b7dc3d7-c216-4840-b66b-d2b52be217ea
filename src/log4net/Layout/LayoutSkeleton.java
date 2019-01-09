package log4net.Layout;

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
import log4net.Layout.*;
import jio.System.IO.*;
import log4net.Core.*;

public abstract class LayoutSkeleton implements ILayout, IOptionHandler {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.String getContentType() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("log4net.Layout.ILayout").invoke("get_ContentType");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setHeader(java.lang.String value) {
    try {
      javonetHandle.set("Header", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getHeader() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("log4net.Layout.ILayout").invoke("get_Header");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setFooter(java.lang.String value) {
    try {
      javonetHandle.set("Footer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getFooter() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("log4net.Layout.ILayout").invoke("get_Footer");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setIgnoresException(java.lang.Boolean value) {
    try {
      javonetHandle.set("IgnoresException", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIgnoresException() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("log4net.Layout.ILayout").invoke("get_IgnoresException");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public LayoutSkeleton(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Format(TextWriter writer, LoggingEvent loggingEvent) {
    try {
      javonetHandle
          .explicitInterface("log4net.Layout.ILayout")
          .invoke("Format", writer, loggingEvent);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ActivateOptions() {
    try {
      javonetHandle.explicitInterface("log4net.Core.IOptionHandler").invoke("ActivateOptions");
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
