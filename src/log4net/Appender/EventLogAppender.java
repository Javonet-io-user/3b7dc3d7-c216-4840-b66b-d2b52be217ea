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
import log4net.Core.*;
import log4net.Layout.*;
import log4net.Util.*;
import jio.System.Diagnostics.*;

public class EventLogAppender extends AppenderSkeleton
    implements IBulkAppender, IAppender, IOptionHandler {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setLogName(java.lang.String value) {
    try {
      javonetHandle.set("LogName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getLogName() {
    try {
      java.lang.String res = javonetHandle.get("LogName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setApplicationName(java.lang.String value) {
    try {
      javonetHandle.set("ApplicationName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getApplicationName() {
    try {
      java.lang.String res = javonetHandle.get("ApplicationName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMachineName(java.lang.String value) {
    try {
      javonetHandle.set("MachineName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMachineName() {
    try {
      java.lang.String res = javonetHandle.get("MachineName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setSecurityContext(SecurityContext value) {
    try {
      javonetHandle.set("SecurityContext", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public SecurityContext getSecurityContext() {
    try {
      Object res = javonetHandle.<NObject>get("SecurityContext");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public EventLogAppender() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Appender.EventLogAppender");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EventLogAppender(ILayout layout) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Appender.EventLogAppender", layout);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EventLogAppender(NObject handle) {
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

  public void AddMapping(EventLogAppender.Level2EventLogEntryType mapping) {
    try {
      javonetHandle.invoke("AddMapping", mapping);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public static class Level2EventLogEntryType extends LevelMappingEntry implements IOptionHandler {
    protected NObject javonetHandle;
    /** SetProperty */
    public void setEventLogEntryType(EventLogEntryType value) {
      try {
        javonetHandle.set("EventLogEntryType", NEnum.fromJavaEnum(value));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    public EventLogEntryType getEventLogEntryType() {
      try {
        Object res = javonetHandle.<NEnum>get("EventLogEntryType");
        if (res == null) return null;
        return EventLogEntryType.valueOf(((NEnum) res).getValueName());
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public Level2EventLogEntryType() {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("log4net.Appender.EventLogAppender+Level2EventLogEntryType");
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public Level2EventLogEntryType(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
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
