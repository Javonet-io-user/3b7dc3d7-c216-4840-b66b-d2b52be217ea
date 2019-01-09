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
import log4net.Appender.*;
import log4net.Core.*;

public class AppenderAttachedImpl implements IAppenderAttachable {
  protected NObject javonetHandle;
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

  public AppenderAttachedImpl() {
    try {
      javonetHandle = Javonet.New("log4net.Util.AppenderAttachedImpl");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AppenderAttachedImpl(NObject handle) {
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

  public java.lang.Integer AppendLoopOnAppenders(LoggingEvent loggingEvent) {
    try {
      java.lang.Integer res = javonetHandle.invoke("AppendLoopOnAppenders", loggingEvent);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer AppendLoopOnAppenders(LoggingEvent[] loggingEvents) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("AppendLoopOnAppenders", new Object[] {loggingEvents});
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
