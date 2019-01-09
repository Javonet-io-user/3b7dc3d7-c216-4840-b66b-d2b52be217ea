package log4net.Repository;

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
import log4net.Core.*;
import log4net.Appender.*;
import jio.System.*;
import log4net.ObjectRenderer.*;
import log4net.Plugin.*;
import log4net.Util.*;

public abstract class LoggerRepositorySkeleton implements ILoggerRepository {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setName(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("log4net.Repository.ILoggerRepository")
          .invoke("set_Name", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("log4net.Repository.ILoggerRepository")
              .invoke("get_Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setThreshold(Level value) {
    try {
      javonetHandle
          .explicitInterface("log4net.Repository.ILoggerRepository")
          .invoke("set_Threshold", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Level getThreshold() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Repository.ILoggerRepository")
              .invoke("get_Threshold");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public RendererMap getRendererMap() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Repository.ILoggerRepository")
              .invoke("get_RendererMap");
      if (res == null) return null;
      return new RendererMap((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PluginMap getPluginMap() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Repository.ILoggerRepository")
              .invoke("get_PluginMap");
      if (res == null) return null;
      return new PluginMap((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public LevelMap getLevelMap() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Repository.ILoggerRepository")
              .invoke("get_LevelMap");
      if (res == null) return null;
      return new LevelMap((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setConfigured(java.lang.Boolean value) {
    try {
      javonetHandle
          .explicitInterface("log4net.Repository.ILoggerRepository")
          .invoke("set_Configured", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getConfigured() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("log4net.Repository.ILoggerRepository")
              .invoke("get_Configured");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public PropertiesDictionary getProperties() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Repository.ILoggerRepository")
              .invoke("get_Properties");
      if (res == null) return null;
      return new PropertiesDictionary((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public LoggerRepositorySkeleton(NObject handle) {
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

  public void AddRenderer(jio.System.Type typeToRender, IObjectRenderer rendererInstance) {
    try {
      javonetHandle.invoke("AddRenderer", typeToRender, rendererInstance);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void RaiseConfigurationChanged(EventArgs e) {
    try {
      javonetHandle.invoke("RaiseConfigurationChanged", e);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<LoggerRepositoryShutdownEventHandler> _ShutdownEventListeners =
      new java.util.ArrayList<LoggerRepositoryShutdownEventHandler>();

  public void addShutdownEvent(LoggerRepositoryShutdownEventHandler toAdd) {
    _ShutdownEventListeners.add(toAdd);
  }

  public void removeShutdownEvent(LoggerRepositoryShutdownEventHandler toRemove) {
    _ShutdownEventListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<LoggerRepositoryConfigurationResetEventHandler>
      _ConfigurationResetListeners =
          new java.util.ArrayList<LoggerRepositoryConfigurationResetEventHandler>();

  public void addConfigurationReset(LoggerRepositoryConfigurationResetEventHandler toAdd) {
    _ConfigurationResetListeners.add(toAdd);
  }

  public void removeConfigurationReset(LoggerRepositoryConfigurationResetEventHandler toRemove) {
    _ConfigurationResetListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<LoggerRepositoryConfigurationChangedEventHandler>
      _ConfigurationChangedListeners =
          new java.util.ArrayList<LoggerRepositoryConfigurationChangedEventHandler>();

  public void addConfigurationChanged(LoggerRepositoryConfigurationChangedEventHandler toAdd) {
    _ConfigurationChangedListeners.add(toAdd);
  }

  public void removeConfigurationChanged(
      LoggerRepositoryConfigurationChangedEventHandler toRemove) {
    _ConfigurationChangedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
