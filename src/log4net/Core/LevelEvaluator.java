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

public class LevelEvaluator implements ITriggeringEventEvaluator {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setThreshold(Level value) {
    try {
      javonetHandle.set("Threshold", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Level getThreshold() {
    try {
      Object res = javonetHandle.<NObject>get("Threshold");
      if (res == null) return null;
      return new Level((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public LevelEvaluator() {
    try {
      javonetHandle = Javonet.New("log4net.Core.LevelEvaluator");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LevelEvaluator(Level threshold) {
    try {
      javonetHandle = Javonet.New("log4net.Core.LevelEvaluator", threshold);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LevelEvaluator(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean IsTriggeringEvent(LoggingEvent loggingEvent) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("log4net.Core.ITriggeringEventEvaluator")
              .invoke("IsTriggeringEvent", loggingEvent);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
