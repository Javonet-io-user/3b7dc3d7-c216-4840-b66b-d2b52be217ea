package log4net;

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
import log4net.*;
import jio.System.Reflection.*;
import jio.System.*;
import log4net.Repository.*;

public class LogManager {
  protected NObject javonetHandle;

  public LogManager(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static ILog Exists(java.lang.String name) {
    try {
      Object res = Javonet.getType("LogManager").invoke("Exists", name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILog Exists(java.lang.String repository, java.lang.String name) {
    try {
      Object res = Javonet.getType("LogManager").invoke("Exists", repository, name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILog Exists(Assembly repositoryAssembly, java.lang.String name) {
    try {
      Object res = Javonet.getType("LogManager").invoke("Exists", repositoryAssembly, name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILog[] GetCurrentLoggers(Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("LogManager").invoke("GetCurrentLoggers");
      if (res == null) return null;
      return (ILog[]) Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILog[] GetCurrentLoggers(java.lang.String repository, Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("LogManager").invoke("GetCurrentLoggers", repository);
      if (res == null) return null;
      return (ILog[]) Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILog[] GetCurrentLoggers(Assembly repositoryAssembly, Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("LogManager").invoke("GetCurrentLoggers", repositoryAssembly);
      if (res == null) return null;
      return (ILog[]) Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILog GetLogger(java.lang.String name) {
    try {
      Object res = Javonet.getType("LogManager").invoke("GetLogger", name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILog GetLogger(java.lang.String repository, java.lang.String name) {
    try {
      Object res = Javonet.getType("LogManager").invoke("GetLogger", repository, name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILog GetLogger(Assembly repositoryAssembly, java.lang.String name) {
    try {
      Object res = Javonet.getType("LogManager").invoke("GetLogger", repositoryAssembly, name);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILog GetLogger(jio.System.Type type) {
    try {
      Object res = Javonet.getType("LogManager").invoke("GetLogger", type);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILog GetLogger(java.lang.String repository, jio.System.Type type) {
    try {
      Object res = Javonet.getType("LogManager").invoke("GetLogger", repository, type);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILog GetLogger(Assembly repositoryAssembly, jio.System.Type type) {
    try {
      Object res = Javonet.getType("LogManager").invoke("GetLogger", repositoryAssembly, type);
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
      Javonet.getType("LogManager").invoke("Shutdown");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void ShutdownRepository() {
    try {
      Javonet.getType("LogManager").invoke("ShutdownRepository");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void ShutdownRepository(java.lang.String repository) {
    try {
      Javonet.getType("LogManager").invoke("ShutdownRepository", repository);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void ShutdownRepository(Assembly repositoryAssembly) {
    try {
      Javonet.getType("LogManager").invoke("ShutdownRepository", repositoryAssembly);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void ResetConfiguration() {
    try {
      Javonet.getType("LogManager").invoke("ResetConfiguration");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void ResetConfiguration(java.lang.String repository) {
    try {
      Javonet.getType("LogManager").invoke("ResetConfiguration", repository);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void ResetConfiguration(Assembly repositoryAssembly) {
    try {
      Javonet.getType("LogManager").invoke("ResetConfiguration", repositoryAssembly);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static ILoggerRepository GetLoggerRepository() {
    try {
      Object res = Javonet.getType("LogManager").invoke("GetLoggerRepository");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILoggerRepository GetLoggerRepository(java.lang.String repository) {
    try {
      Object res = Javonet.getType("LogManager").invoke("GetLoggerRepository", repository);
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
      Object res = Javonet.getType("LogManager").invoke("GetLoggerRepository", repositoryAssembly);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILoggerRepository GetRepository() {
    try {
      Object res = Javonet.getType("LogManager").invoke("GetRepository");
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
      Object res = Javonet.getType("LogManager").invoke("GetRepository", repository);
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
      Object res = Javonet.getType("LogManager").invoke("GetRepository", repositoryAssembly);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILoggerRepository CreateDomain(jio.System.Type repositoryType) {
    try {
      Object res = Javonet.getType("LogManager").invoke("CreateDomain", repositoryType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILoggerRepository CreateRepository(jio.System.Type repositoryType) {
    try {
      Object res = Javonet.getType("LogManager").invoke("CreateRepository", repositoryType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ILoggerRepository CreateDomain(java.lang.String repository) {
    try {
      Object res = Javonet.getType("LogManager").invoke("CreateDomain", repository);
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
      Object res = Javonet.getType("LogManager").invoke("CreateRepository", repository);
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
      Object res = Javonet.getType("LogManager").invoke("CreateDomain", repository, repositoryType);
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
          Javonet.getType("LogManager").invoke("CreateRepository", repository, repositoryType);
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
          Javonet.getType("LogManager").invoke("CreateDomain", repositoryAssembly, repositoryType);
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
          Javonet.getType("LogManager")
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
      Object[] res = Javonet.getType("LogManager").invoke("GetAllRepositories");
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
