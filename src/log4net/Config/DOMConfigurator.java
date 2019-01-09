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
import log4net.Repository.*;
import jio.System.Xml.*;
import jio.System.IO.*;

public class DOMConfigurator {
  protected NObject javonetHandle;

  public DOMConfigurator(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static void Configure() {
    try {
      Javonet.getType("DOMConfigurator").invoke("Configure");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Configure(ILoggerRepository repository) {
    try {
      Javonet.getType("DOMConfigurator").invoke("Configure", repository);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Configure(XmlElement element) {
    try {
      Javonet.getType("DOMConfigurator").invoke("Configure", element);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Configure(ILoggerRepository repository, XmlElement element) {
    try {
      Javonet.getType("DOMConfigurator").invoke("Configure", repository, element);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Configure(FileInfo configFile) {
    try {
      Javonet.getType("DOMConfigurator").invoke("Configure", configFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Configure(Stream configStream) {
    try {
      Javonet.getType("DOMConfigurator").invoke("Configure", configStream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Configure(ILoggerRepository repository, FileInfo configFile) {
    try {
      Javonet.getType("DOMConfigurator").invoke("Configure", repository, configFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void Configure(ILoggerRepository repository, Stream configStream) {
    try {
      Javonet.getType("DOMConfigurator").invoke("Configure", repository, configStream);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void ConfigureAndWatch(FileInfo configFile) {
    try {
      Javonet.getType("DOMConfigurator").invoke("ConfigureAndWatch", configFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void ConfigureAndWatch(ILoggerRepository repository, FileInfo configFile) {
    try {
      Javonet.getType("DOMConfigurator").invoke("ConfigureAndWatch", repository, configFile);
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
