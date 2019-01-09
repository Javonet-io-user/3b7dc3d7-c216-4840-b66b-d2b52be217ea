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

public interface IRepositorySelector {
  public ILoggerRepository GetRepository(Assembly assembly);

  public ILoggerRepository GetRepository(java.lang.String repositoryName);

  public ILoggerRepository CreateRepository(Assembly assembly, jio.System.Type repositoryType);

  public ILoggerRepository CreateRepository(
      java.lang.String repositoryName, jio.System.Type repositoryType);

  public java.lang.Boolean ExistsRepository(java.lang.String repositoryName);

  public ILoggerRepository[] GetAllRepositories(Class<?> returnArrayType);
}
