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
import jio.System.*;
import log4net.*;

public class LogImpl extends LoggerWrapperImpl implements ILoggerWrapper, ILog {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Boolean getIsDebugEnabled() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("log4net.ILog").invoke("get_IsDebugEnabled");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsInfoEnabled() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("log4net.ILog").invoke("get_IsInfoEnabled");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsWarnEnabled() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("log4net.ILog").invoke("get_IsWarnEnabled");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsErrorEnabled() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("log4net.ILog").invoke("get_IsErrorEnabled");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsFatalEnabled() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("log4net.ILog").invoke("get_IsFatalEnabled");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public LogImpl(ILogger logger) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Core.LogImpl", logger);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LogImpl(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Debug(Object message) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("Debug", message);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Debug(Object message, jio.System.Exception exception) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("Debug", message, exception);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ILog_DebugFormat(java.lang.String format, Object[] args) {
    try {
      javonetHandle
          .explicitInterface("log4net.ILog")
          .invoke("DebugFormat", format, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ILog_DebugFormat(java.lang.String format, Object arg0) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("DebugFormat", format, arg0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DebugFormat(java.lang.String format, Object arg0, Object arg1) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("DebugFormat", format, arg0, arg1);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DebugFormat(java.lang.String format, Object arg0, Object arg1, Object arg2) {
    try {
      javonetHandle
          .explicitInterface("log4net.ILog")
          .invoke("DebugFormat", format, arg0, arg1, arg2);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DebugFormat(IFormatProvider provider, java.lang.String format, Object[] args) {
    try {
      javonetHandle
          .explicitInterface("log4net.ILog")
          .invoke("DebugFormat", provider, format, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Info(Object message) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("Info", message);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Info(Object message, jio.System.Exception exception) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("Info", message, exception);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ILog_InfoFormat(java.lang.String format, Object[] args) {
    try {
      javonetHandle
          .explicitInterface("log4net.ILog")
          .invoke("InfoFormat", format, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ILog_InfoFormat(java.lang.String format, Object arg0) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("InfoFormat", format, arg0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void InfoFormat(java.lang.String format, Object arg0, Object arg1) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("InfoFormat", format, arg0, arg1);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void InfoFormat(java.lang.String format, Object arg0, Object arg1, Object arg2) {
    try {
      javonetHandle
          .explicitInterface("log4net.ILog")
          .invoke("InfoFormat", format, arg0, arg1, arg2);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void InfoFormat(IFormatProvider provider, java.lang.String format, Object[] args) {
    try {
      javonetHandle
          .explicitInterface("log4net.ILog")
          .invoke("InfoFormat", provider, format, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Warn(Object message) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("Warn", message);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Warn(Object message, jio.System.Exception exception) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("Warn", message, exception);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ILog_WarnFormat(java.lang.String format, Object[] args) {
    try {
      javonetHandle
          .explicitInterface("log4net.ILog")
          .invoke("WarnFormat", format, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ILog_WarnFormat(java.lang.String format, Object arg0) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("WarnFormat", format, arg0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void WarnFormat(java.lang.String format, Object arg0, Object arg1) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("WarnFormat", format, arg0, arg1);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void WarnFormat(java.lang.String format, Object arg0, Object arg1, Object arg2) {
    try {
      javonetHandle
          .explicitInterface("log4net.ILog")
          .invoke("WarnFormat", format, arg0, arg1, arg2);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void WarnFormat(IFormatProvider provider, java.lang.String format, Object[] args) {
    try {
      javonetHandle
          .explicitInterface("log4net.ILog")
          .invoke("WarnFormat", provider, format, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Error(Object message) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("Error", message);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Error(Object message, jio.System.Exception exception) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("Error", message, exception);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ILog_ErrorFormat(java.lang.String format, Object[] args) {
    try {
      javonetHandle
          .explicitInterface("log4net.ILog")
          .invoke("ErrorFormat", format, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ILog_ErrorFormat(java.lang.String format, Object arg0) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("ErrorFormat", format, arg0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ErrorFormat(java.lang.String format, Object arg0, Object arg1) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("ErrorFormat", format, arg0, arg1);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ErrorFormat(java.lang.String format, Object arg0, Object arg1, Object arg2) {
    try {
      javonetHandle
          .explicitInterface("log4net.ILog")
          .invoke("ErrorFormat", format, arg0, arg1, arg2);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ErrorFormat(IFormatProvider provider, java.lang.String format, Object[] args) {
    try {
      javonetHandle
          .explicitInterface("log4net.ILog")
          .invoke("ErrorFormat", provider, format, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Fatal(Object message) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("Fatal", message);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Fatal(Object message, jio.System.Exception exception) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("Fatal", message, exception);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ILog_FatalFormat(java.lang.String format, Object[] args) {
    try {
      javonetHandle
          .explicitInterface("log4net.ILog")
          .invoke("FatalFormat", format, new Object[] {args});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ILog_FatalFormat(java.lang.String format, Object arg0) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("FatalFormat", format, arg0);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void FatalFormat(java.lang.String format, Object arg0, Object arg1) {
    try {
      javonetHandle.explicitInterface("log4net.ILog").invoke("FatalFormat", format, arg0, arg1);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void FatalFormat(java.lang.String format, Object arg0, Object arg1, Object arg2) {
    try {
      javonetHandle
          .explicitInterface("log4net.ILog")
          .invoke("FatalFormat", format, arg0, arg1, arg2);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void FatalFormat(IFormatProvider provider, java.lang.String format, Object[] args) {
    try {
      javonetHandle
          .explicitInterface("log4net.ILog")
          .invoke("FatalFormat", provider, format, new Object[] {args});
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
