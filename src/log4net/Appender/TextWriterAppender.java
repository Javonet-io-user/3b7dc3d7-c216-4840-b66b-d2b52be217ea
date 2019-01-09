package log4net.Appender;

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
import log4net.Appender.*;
import jio.System.IO.*;
import log4net.Core.*;
import log4net.Layout.*;

public class TextWriterAppender extends AppenderSkeleton
    implements IBulkAppender, IAppender, IOptionHandler {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setImmediateFlush(java.lang.Boolean value) {
    try {
      javonetHandle.set("ImmediateFlush", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getImmediateFlush() {
    try {
      java.lang.Boolean res = javonetHandle.get("ImmediateFlush");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setWriter(TextWriter value) {
    try {
      javonetHandle.set("Writer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public TextWriter getWriter() {
    try {
      Object res = javonetHandle.<NObject>get("Writer");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setErrorHandlerAsTextWriterAppender(IErrorHandler value) {
    try {
      javonetHandle.set("ErrorHandler", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public IErrorHandler getErrorHandlerAsTextWriterAppender() {
    try {
      Object res = javonetHandle.<NObject>get("ErrorHandler");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public TextWriterAppender() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Appender.TextWriterAppender");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TextWriterAppender(ILayout layout, Stream os) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Appender.TextWriterAppender", layout, os);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TextWriterAppender(ILayout layout, TextWriter writer) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Appender.TextWriterAppender", layout, writer);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TextWriterAppender(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
