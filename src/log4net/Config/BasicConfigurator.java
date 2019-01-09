package log4net.Config;

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
import log4net.Config.*;
import log4net.Appender.*;
import log4net.Repository.*;

public class BasicConfigurator {
  protected NObject javonetHandle;

  public BasicConfigurator(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static void Configure() {
    try {
      Javonet.getType("BasicConfigurator").invoke("Configure");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Configure(IAppender appender) {
    try {
      Javonet.getType("BasicConfigurator").invoke("Configure", appender);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Configure(ILoggerRepository repository) {
    try {
      Javonet.getType("BasicConfigurator").invoke("Configure", repository);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Configure(ILoggerRepository repository, IAppender appender) {
    try {
      Javonet.getType("BasicConfigurator").invoke("Configure", repository, appender);
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
