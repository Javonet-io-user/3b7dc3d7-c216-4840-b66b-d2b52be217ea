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
import jio.System.*;
import log4net.Core.*;

public interface ILog extends ILoggerWrapper {
  public void Debug(Object message);

  public void Debug(Object message, jio.System.Exception exception);

  public void ILog_DebugFormat(java.lang.String format, Object[] args);

  public void ILog_DebugFormat(java.lang.String format, Object arg0);

  public void DebugFormat(java.lang.String format, Object arg0, Object arg1);

  public void DebugFormat(java.lang.String format, Object arg0, Object arg1, Object arg2);

  public void DebugFormat(IFormatProvider provider, java.lang.String format, Object[] args);

  public void Info(Object message);

  public void Info(Object message, jio.System.Exception exception);

  public void ILog_InfoFormat(java.lang.String format, Object[] args);

  public void ILog_InfoFormat(java.lang.String format, Object arg0);

  public void InfoFormat(java.lang.String format, Object arg0, Object arg1);

  public void InfoFormat(java.lang.String format, Object arg0, Object arg1, Object arg2);

  public void InfoFormat(IFormatProvider provider, java.lang.String format, Object[] args);

  public void Warn(Object message);

  public void Warn(Object message, jio.System.Exception exception);

  public void ILog_WarnFormat(java.lang.String format, Object[] args);

  public void ILog_WarnFormat(java.lang.String format, Object arg0);

  public void WarnFormat(java.lang.String format, Object arg0, Object arg1);

  public void WarnFormat(java.lang.String format, Object arg0, Object arg1, Object arg2);

  public void WarnFormat(IFormatProvider provider, java.lang.String format, Object[] args);

  public void Error(Object message);

  public void Error(Object message, jio.System.Exception exception);

  public void ILog_ErrorFormat(java.lang.String format, Object[] args);

  public void ILog_ErrorFormat(java.lang.String format, Object arg0);

  public void ErrorFormat(java.lang.String format, Object arg0, Object arg1);

  public void ErrorFormat(java.lang.String format, Object arg0, Object arg1, Object arg2);

  public void ErrorFormat(IFormatProvider provider, java.lang.String format, Object[] args);

  public void Fatal(Object message);

  public void Fatal(Object message, jio.System.Exception exception);

  public void ILog_FatalFormat(java.lang.String format, Object[] args);

  public void ILog_FatalFormat(java.lang.String format, Object arg0);

  public void FatalFormat(java.lang.String format, Object arg0, Object arg1);

  public void FatalFormat(java.lang.String format, Object arg0, Object arg1, Object arg2);

  public void FatalFormat(IFormatProvider provider, java.lang.String format, Object[] args);
}
