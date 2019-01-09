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
import jio.System.Reflection.*;
import log4net.Repository.*;
import jio.System.*;

public class DefaultRepositorySelector implements IRepositorySelector {
  protected NObject javonetHandle;

  public DefaultRepositorySelector(jio.System.Type defaultRepositoryType) {
    try {
      javonetHandle = Javonet.New("log4net.Core.DefaultRepositorySelector", defaultRepositoryType);
      javonetHandle.addEventListener(
          "LoggerRepositoryCreatedEvent",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (LoggerRepositoryCreationEventHandler handler :
                  _LoggerRepositoryCreatedEventListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], LoggerRepositoryCreationEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DefaultRepositorySelector(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public ILoggerRepository GetRepository(Assembly repositoryAssembly) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Core.IRepositorySelector")
              .invoke("GetRepository", repositoryAssembly);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ILoggerRepository GetRepository(java.lang.String repositoryName) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Core.IRepositorySelector")
              .invoke("GetRepository", repositoryName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ILoggerRepository CreateRepository(
      Assembly repositoryAssembly, jio.System.Type repositoryType) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Core.IRepositorySelector")
              .invoke("CreateRepository", repositoryAssembly, repositoryType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ILoggerRepository CreateRepository(
      java.lang.String repositoryName, jio.System.Type repositoryType) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Core.IRepositorySelector")
              .invoke("CreateRepository", repositoryName, repositoryType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean ExistsRepository(java.lang.String repositoryName) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("log4net.Core.IRepositorySelector")
              .invoke("ExistsRepository", repositoryName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public ILoggerRepository[] GetAllRepositories(Class<?> returnArrayType) {
    try {
      Object[] res =
          javonetHandle
              .explicitInterface("log4net.Core.IRepositorySelector")
              .invoke("GetAllRepositories");
      if (res == null) return null;
      return (ILoggerRepository[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ILoggerRepository CreateRepository(
      Assembly repositoryAssembly,
      jio.System.Type repositoryType,
      java.lang.String repositoryName,
      java.lang.Boolean readAssemblyAttributes) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateRepository",
              repositoryAssembly,
              repositoryType,
              repositoryName,
              readAssemblyAttributes);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void AliasRepository(
      java.lang.String repositoryAlias, ILoggerRepository repositoryTarget) {
    try {
      javonetHandle.invoke("AliasRepository", repositoryAlias, repositoryTarget);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<LoggerRepositoryCreationEventHandler>
      _LoggerRepositoryCreatedEventListeners =
          new java.util.ArrayList<LoggerRepositoryCreationEventHandler>();

  public void addLoggerRepositoryCreatedEvent(LoggerRepositoryCreationEventHandler toAdd) {
    _LoggerRepositoryCreatedEventListeners.add(toAdd);
  }

  public void removeLoggerRepositoryCreatedEvent(LoggerRepositoryCreationEventHandler toRemove) {
    _LoggerRepositoryCreatedEventListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
