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
import jio.System.*;
import jio.System.Xml.*;
import jio.System.Configuration.*;

public class Log4NetConfigurationSectionHandler implements IConfigurationSectionHandler {
  protected NObject javonetHandle;

  public Log4NetConfigurationSectionHandler() {
    try {
      javonetHandle = Javonet.New("log4net.Config.Log4NetConfigurationSectionHandler");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Log4NetConfigurationSectionHandler(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Object Create(Object parent, Object configContext, XmlNode section) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Configuration.IConfigurationSectionHandler")
              .invoke("Create", parent, configContext, section);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
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
