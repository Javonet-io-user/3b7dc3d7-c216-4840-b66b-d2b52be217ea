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
import jio.System.Runtime.Serialization.*;
import jio.System.IO.*;
import jio.System.*;
import log4net.Util.*;
import log4net.Repository.*;

public class LoggingEvent implements ISerializable {
  protected NObject javonetHandle;
  /** GetProperty */
  public static DateTime getStartTime() {
    try {
      Object res = Javonet.getType("LoggingEvent").<NObject>get("StartTime");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Level getLevel() {
    try {
      Object res = javonetHandle.<NObject>get("Level");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public DateTime getTimeStamp() {
    try {
      Object res = javonetHandle.<NObject>get("TimeStamp");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getLoggerName() {
    try {
      java.lang.String res = javonetHandle.get("LoggerName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public LocationInfo getLocationInformation() {
    try {
      Object res = javonetHandle.<NObject>get("LocationInformation");
      if (res == null) return null;
      return new LocationInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Object getMessageObject() {
    try {
      Object res = javonetHandle.<NObject>get("MessageObject");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public jio.System.Exception getExceptionObject() {
    try {
      Object res = javonetHandle.<NObject>get("ExceptionObject");
      if (res == null) return null;
      return new jio.System.Exception((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public ILoggerRepository getRepository() {
    try {
      Object res = javonetHandle.<NObject>get("Repository");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getRenderedMessage() {
    try {
      java.lang.String res = javonetHandle.get("RenderedMessage");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getThreadName() {
    try {
      java.lang.String res = javonetHandle.get("ThreadName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
  /** GetProperty */

  public java.lang.String getIdentity() {
    try {
      java.lang.String res = javonetHandle.get("Identity");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getDomain() {
    try {
      java.lang.String res = javonetHandle.get("Domain");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertiesDictionary getProperties() {
    try {
      Object res = javonetHandle.<NObject>get("Properties");
      if (res == null) return null;
      return new PropertiesDictionary((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFix(FixFlags value) {
    try {
      javonetHandle.set("Fix", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public FixFlags getFix() {
    try {
      Object res = javonetHandle.<NEnum>get("Fix");
      if (res == null) return null;
      return FixFlags.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  public static java.lang.String getHostNameProperty() {
    try {
      java.lang.String res = Javonet.getType("LoggingEvent").get("HostNameProperty");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setHostNameProperty(java.lang.String param) {
    try {
      Javonet.getType("LoggingEvent").set("HostNameProperty", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getIdentityProperty() {
    try {
      java.lang.String res = Javonet.getType("LoggingEvent").get("IdentityProperty");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setIdentityProperty(java.lang.String param) {
    try {
      Javonet.getType("LoggingEvent").set("IdentityProperty", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getUserNameProperty() {
    try {
      java.lang.String res = Javonet.getType("LoggingEvent").get("UserNameProperty");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setUserNameProperty(java.lang.String param) {
    try {
      Javonet.getType("LoggingEvent").set("UserNameProperty", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LoggingEvent(
      jio.System.Type callerStackBoundaryDeclaringType,
      ILoggerRepository repository,
      java.lang.String loggerName,
      Level level,
      Object message,
      jio.System.Exception exception) {
    try {
      javonetHandle =
          Javonet.New(
              "log4net.Core.LoggingEvent",
              callerStackBoundaryDeclaringType,
              repository,
              loggerName,
              level,
              message,
              exception);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LoggingEvent(
      jio.System.Type callerStackBoundaryDeclaringType,
      ILoggerRepository repository,
      LoggingEventData data,
      FixFlags fixedData) {
    try {
      javonetHandle =
          Javonet.New(
              "log4net.Core.LoggingEvent",
              callerStackBoundaryDeclaringType,
              repository,
              data,
              NEnum.fromJavaEnum(fixedData));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LoggingEvent(
      jio.System.Type callerStackBoundaryDeclaringType,
      ILoggerRepository repository,
      LoggingEventData data) {
    try {
      javonetHandle =
          Javonet.New(
              "log4net.Core.LoggingEvent", callerStackBoundaryDeclaringType, repository, data);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LoggingEvent(LoggingEventData data) {
    try {
      javonetHandle = Javonet.New("log4net.Core.LoggingEvent", data);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LoggingEvent(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void GetObjectData(SerializationInfo info, StreamingContext context) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
          .invoke("GetObjectData", info, context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void WriteRenderedMessage(TextWriter writer) {
    try {
      javonetHandle.invoke("WriteRenderedMessage", writer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public LoggingEventData GetLoggingEventData() {
    try {
      Object res = javonetHandle.invoke("GetLoggingEventData");
      if (res == null) return null;
      return new LoggingEventData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LoggingEventData GetLoggingEventData(FixFlags fixFlags) {
    try {
      Object res = javonetHandle.invoke("GetLoggingEventData", NEnum.fromJavaEnum(fixFlags));
      if (res == null) return null;
      return new LoggingEventData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String GetExceptionStrRep() {
    try {
      java.lang.String res = javonetHandle.invoke("GetExceptionStrRep");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String GetExceptionString() {
    try {
      java.lang.String res = javonetHandle.invoke("GetExceptionString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void FixVolatileData() {
    try {
      javonetHandle.invoke("FixVolatileData");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void FixVolatileData(java.lang.Boolean fastButLoose) {
    try {
      javonetHandle.invoke("FixVolatileData", fastButLoose);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object LookupProperty(java.lang.String key) {
    try {
      Object res = javonetHandle.invoke("LookupProperty", key);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public PropertiesDictionary GetProperties() {
    try {
      Object res = javonetHandle.invoke("GetProperties");
      if (res == null) return null;
      return new PropertiesDictionary((NObject) res);
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
