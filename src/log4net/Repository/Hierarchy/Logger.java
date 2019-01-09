package log4net.Repository.Hierarchy;

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
import log4net.Repository.Hierarchy.*;
import log4net.Appender.*;
import jio.System.*;
import log4net.Core.*;
import log4net.Repository.*;

public abstract class Logger implements IAppenderAttachable, ILogger {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setParent(Logger value) {
    try {
      javonetHandle.set("Parent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Logger getParent() {
    try {
      Object res = javonetHandle.<NObject>get("Parent");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setAdditivity(java.lang.Boolean value) {
    try {
      javonetHandle.set("Additivity", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getAdditivity() {
    try {
      java.lang.Boolean res = javonetHandle.get("Additivity");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public Level getEffectiveLevel() {
    try {
      Object res = javonetHandle.<NObject>get("EffectiveLevel");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setHierarchy(Hierarchy value) {
    try {
      javonetHandle.set("Hierarchy", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Hierarchy getHierarchy() {
    try {
      Object res = javonetHandle.<NObject>get("Hierarchy");
      if (res == null) return null;
      return new Hierarchy((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setLevel(Level value) {
    try {
      javonetHandle.set("Level", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

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
  /** GetProperty */

  public AppenderCollection getAppenders() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Core.IAppenderAttachable")
              .invoke("get_Appenders");
      if (res == null) return null;
      return new AppenderCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getName() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("log4net.Core.ILogger").invoke("get_Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public ILoggerRepository getRepository() {
    try {
      Object res = javonetHandle.explicitInterface("log4net.Core.ILogger").invoke("get_Repository");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Logger(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void AddAppender(IAppender newAppender) {
    try {
      javonetHandle
          .explicitInterface("log4net.Core.IAppenderAttachable")
          .invoke("AddAppender", newAppender);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IAppender GetAppender(java.lang.String name) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Core.IAppenderAttachable")
              .invoke("GetAppender", name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void RemoveAllAppenders() {
    try {
      javonetHandle
          .explicitInterface("log4net.Core.IAppenderAttachable")
          .invoke("RemoveAllAppenders");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IAppender RemoveAppender(IAppender appender) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Core.IAppenderAttachable")
              .invoke("RemoveAppender", appender);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IAppender RemoveAppender(java.lang.String name) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Core.IAppenderAttachable")
              .invoke("RemoveAppender", name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Log(
      jio.System.Type callerStackBoundaryDeclaringType,
      Level level,
      Object message,
      jio.System.Exception exception) {
    try {
      javonetHandle
          .explicitInterface("log4net.Core.ILogger")
          .invoke("Log", callerStackBoundaryDeclaringType, level, message, exception);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Log(LoggingEvent logEvent) {
    try {
      javonetHandle.explicitInterface("log4net.Core.ILogger").invoke("Log", logEvent);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean IsEnabledFor(Level level) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("log4net.Core.ILogger").invoke("IsEnabledFor", level);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void CloseNestedAppenders() {
    try {
      javonetHandle.invoke("CloseNestedAppenders");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Log(Level level, Object message, jio.System.Exception exception) {
    try {
      javonetHandle.invoke("Log", level, message, exception);
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
