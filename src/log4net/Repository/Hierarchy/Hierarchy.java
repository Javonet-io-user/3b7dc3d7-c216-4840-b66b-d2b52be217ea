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
import log4net.Repository.*;
import log4net.Repository.Hierarchy.*;
import log4net.Core.*;
import log4net.Appender.*;
import log4net.Util.*;
import jio.System.*;
import jio.System.Xml.*;

public class Hierarchy extends LoggerRepositorySkeleton
    implements ILoggerRepository, IBasicRepositoryConfigurator, IXmlRepositoryConfigurator {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setEmittedNoAppenderWarning(java.lang.Boolean value) {
    try {
      javonetHandle.set("EmittedNoAppenderWarning", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getEmittedNoAppenderWarning() {
    try {
      java.lang.Boolean res = javonetHandle.get("EmittedNoAppenderWarning");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public Logger getRoot() {
    try {
      Object res = javonetHandle.<NObject>get("Root");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setLoggerFactory(ILoggerFactory value) {
    try {
      javonetHandle.set("LoggerFactory", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ILoggerFactory getLoggerFactory() {
    try {
      Object res = javonetHandle.<NObject>get("LoggerFactory");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Hierarchy() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Repository.Hierarchy.Hierarchy");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "LoggerCreatedEvent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (LoggerCreationEventHandler handler : _LoggerCreatedEventListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LoggerCreationEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hierarchy(PropertiesDictionary properties) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Repository.Hierarchy.Hierarchy", properties);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "LoggerCreatedEvent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (LoggerCreationEventHandler handler : _LoggerCreatedEventListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LoggerCreationEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hierarchy(ILoggerFactory loggerFactory) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Repository.Hierarchy.Hierarchy", loggerFactory);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "LoggerCreatedEvent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (LoggerCreationEventHandler handler : _LoggerCreatedEventListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LoggerCreationEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hierarchy(PropertiesDictionary properties, ILoggerFactory loggerFactory) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("log4net.Repository.Hierarchy.Hierarchy", properties, loggerFactory);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "LoggerCreatedEvent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (LoggerCreationEventHandler handler : _LoggerCreatedEventListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LoggerCreationEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hierarchy(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public ILogger Exists(java.lang.String name) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Repository.ILoggerRepository")
              .invoke("Exists", name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ILogger[] GetCurrentLoggers(Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("log4net.Repository.ILoggerRepository")
              .invoke("GetCurrentLoggers");
      if (res == null) return null;
      return (ILogger[]) Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ILogger GetLogger(java.lang.String name) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Repository.ILoggerRepository")
              .invoke("GetLogger", name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Shutdown() {
    try {
      javonetHandle.explicitInterface("log4net.Repository.ILoggerRepository").invoke("Shutdown");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ResetConfiguration() {
    try {
      javonetHandle
          .explicitInterface("log4net.Repository.ILoggerRepository")
          .invoke("ResetConfiguration");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Log(LoggingEvent logEvent) {
    try {
      javonetHandle
          .explicitInterface("log4net.Repository.ILoggerRepository")
          .invoke("Log", logEvent);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IAppender[] GetAppenders(Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("log4net.Repository.ILoggerRepository")
              .invoke("GetAppenders");
      if (res == null) return null;
      return (IAppender[]) Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean IsDisabled(Level level) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsDisabled", level);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
  /** Method */

  public Logger Hierarchy___GetLogger(java.lang.String name, ILoggerFactory factory) {
    try {
      Object res = javonetHandle.invoke("GetLogger", name, factory);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Configure(IAppender appender) {
    try {
      javonetHandle
          .explicitInterface("log4net.Repository.IBasicRepositoryConfigurator")
          .invoke("Configure", appender);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Configure(XmlElement element) {
    try {
      javonetHandle
          .explicitInterface("log4net.Repository.IXmlRepositoryConfigurator")
          .invoke("Configure", element);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<LoggerCreationEventHandler> _LoggerCreatedEventListeners =
      new java.util.ArrayList<LoggerCreationEventHandler>();

  public void addLoggerCreatedEvent(LoggerCreationEventHandler toAdd) {
    _LoggerCreatedEventListeners.add(toAdd);
  }

  public void removeLoggerCreatedEvent(LoggerCreationEventHandler toRemove) {
    _LoggerCreatedEventListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
