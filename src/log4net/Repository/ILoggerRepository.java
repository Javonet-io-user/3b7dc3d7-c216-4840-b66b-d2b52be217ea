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

public interface ILoggerRepository {
  public ILogger Exists(java.lang.String name);

  public ILogger[] GetCurrentLoggers(Class<?> returnArrayType);

  public ILogger GetLogger(java.lang.String name);

  public void Shutdown();

  public void ResetConfiguration();

  public void Log(LoggingEvent logEvent);

  public IAppender[] GetAppenders(Class<?> returnArrayType);
}
