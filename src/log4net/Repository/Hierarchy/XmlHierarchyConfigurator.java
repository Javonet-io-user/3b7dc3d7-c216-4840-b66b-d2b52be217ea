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
import log4net.Repository.Hierarchy.*;
import jio.System.Xml.*;

public class XmlHierarchyConfigurator {
  protected NObject javonetHandle;

  public XmlHierarchyConfigurator(Hierarchy hierarchy) {
    try {
      javonetHandle =
          Javonet.New("log4net.Repository.Hierarchy.XmlHierarchyConfigurator", hierarchy);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public XmlHierarchyConfigurator(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Configure(XmlElement element) {
    try {
      javonetHandle.invoke("Configure", element);
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
