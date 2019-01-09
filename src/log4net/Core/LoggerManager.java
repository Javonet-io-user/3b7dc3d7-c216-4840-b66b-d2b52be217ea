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
import log4net.Repository.*;
import jio.System.Reflection.*;
import jio.System.*;

public class LoggerManager {
  protected NObject javonetHandle;
  /** SetProperty */
  public static void setRepositorySelector(IRepositorySelector value) {
    try {
      Javonet.getType("LoggerManager").set("RepositorySelector", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public static IRepositorySelector getRepositorySelector() {
    try {
      Object res = Javonet.getType("LoggerManager").<NObject>get("RepositorySelector");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public LoggerManager(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static ILoggerRepository GetLoggerRepository(java.lang.String repository) {
    try {
      Object res = Javonet.getType("LoggerManager").invoke("GetLoggerRepository", repository);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILoggerRepository GetLoggerRepository(Assembly repositoryAssembly) {
    try {
      Object res =
          Javonet.getType("LoggerManager").invoke("GetLoggerRepository", repositoryAssembly);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILoggerRepository GetRepository(java.lang.String repository) {
    try {
      Object res = Javonet.getType("LoggerManager").invoke("GetRepository", repository);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILoggerRepository GetRepository(Assembly repositoryAssembly) {
    try {
      Object res = Javonet.getType("LoggerManager").invoke("GetRepository", repositoryAssembly);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILogger Exists(java.lang.String repository, java.lang.String name) {
    try {
      Object res = Javonet.getType("LoggerManager").invoke("Exists", repository, name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILogger Exists(Assembly repositoryAssembly, java.lang.String name) {
    try {
      Object res = Javonet.getType("LoggerManager").invoke("Exists", repositoryAssembly, name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILogger[] GetCurrentLoggers(java.lang.String repository, Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("LoggerManager").invoke("GetCurrentLoggers", repository);
      if (res == null) return null;
      return (ILogger[]) Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILogger[] GetCurrentLoggers(Assembly repositoryAssembly, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("LoggerManager").invoke("GetCurrentLoggers", repositoryAssembly);
      if (res == null) return null;
      return (ILogger[]) Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILogger GetLogger(java.lang.String repository, java.lang.String name) {
    try {
      Object res = Javonet.getType("LoggerManager").invoke("GetLogger", repository, name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILogger GetLogger(Assembly repositoryAssembly, java.lang.String name) {
    try {
      Object res = Javonet.getType("LoggerManager").invoke("GetLogger", repositoryAssembly, name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILogger GetLogger(java.lang.String repository, jio.System.Type type) {
    try {
      Object res = Javonet.getType("LoggerManager").invoke("GetLogger", repository, type);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILogger GetLogger(Assembly repositoryAssembly, jio.System.Type type) {
    try {
      Object res = Javonet.getType("LoggerManager").invoke("GetLogger", repositoryAssembly, type);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static void Shutdown() {
    try {
      Javonet.getType("LoggerManager").invoke("Shutdown");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void ShutdownRepository(java.lang.String repository) {
    try {
      Javonet.getType("LoggerManager").invoke("ShutdownRepository", repository);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void ShutdownRepository(Assembly repositoryAssembly) {
    try {
      Javonet.getType("LoggerManager").invoke("ShutdownRepository", repositoryAssembly);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void ResetConfiguration(java.lang.String repository) {
    try {
      Javonet.getType("LoggerManager").invoke("ResetConfiguration", repository);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void ResetConfiguration(Assembly repositoryAssembly) {
    try {
      Javonet.getType("LoggerManager").invoke("ResetConfiguration", repositoryAssembly);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static ILoggerRepository CreateDomain(java.lang.String repository) {
    try {
      Object res = Javonet.getType("LoggerManager").invoke("CreateDomain", repository);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILoggerRepository CreateRepository(java.lang.String repository) {
    try {
      Object res = Javonet.getType("LoggerManager").invoke("CreateRepository", repository);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILoggerRepository CreateDomain(
      java.lang.String repository, jio.System.Type repositoryType) {
    try {
      Object res =
          Javonet.getType("LoggerManager").invoke("CreateDomain", repository, repositoryType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILoggerRepository CreateRepository(
      java.lang.String repository, jio.System.Type repositoryType) {
    try {
      Object res =
          Javonet.getType("LoggerManager").invoke("CreateRepository", repository, repositoryType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILoggerRepository CreateDomain(
      Assembly repositoryAssembly, jio.System.Type repositoryType) {
    try {
      Object res =
          Javonet.getType("LoggerManager")
              .invoke("CreateDomain", repositoryAssembly, repositoryType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILoggerRepository CreateRepository(
      Assembly repositoryAssembly, jio.System.Type repositoryType) {
    try {
      Object res =
          Javonet.getType("LoggerManager")
              .invoke("CreateRepository", repositoryAssembly, repositoryType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILoggerRepository[] GetAllRepositories(Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("LoggerManager").invoke("GetAllRepositories");
      if (res == null) return null;
      return (ILoggerRepository[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
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
