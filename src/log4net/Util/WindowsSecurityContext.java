package log4net.Util;

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
import log4net.Util.*;
import jio.System.*;

public class WindowsSecurityContext extends SecurityContext implements IOptionHandler {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setCredentials(WindowsSecurityContext.ImpersonationMode value) {
    try {
      javonetHandle.set("Credentials", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public WindowsSecurityContext.ImpersonationMode getCredentials() {
    try {
      Object res = javonetHandle.<NEnum>get("Credentials");
      if (res == null) return null;
      return WindowsSecurityContext.ImpersonationMode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setUserName(java.lang.String value) {
    try {
      javonetHandle.set("UserName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getUserName() {
    try {
      java.lang.String res = javonetHandle.get("UserName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDomainName(java.lang.String value) {
    try {
      javonetHandle.set("DomainName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDomainName() {
    try {
      java.lang.String res = javonetHandle.get("DomainName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setPassword(java.lang.String value) {
    try {
      javonetHandle.set("Password", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public WindowsSecurityContext() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Util.WindowsSecurityContext");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public WindowsSecurityContext(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void ActivateOptions() {
    try {
      javonetHandle.explicitInterface("log4net.Core.IOptionHandler").invoke("ActivateOptions");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IDisposable Impersonate(Object state) {
    try {
      Object res = javonetHandle.invoke("Impersonate", state);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public enum ImpersonationMode {
    User(0L),
    Process(1L),
    ;
    private long numVal;

    ImpersonationMode(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
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
