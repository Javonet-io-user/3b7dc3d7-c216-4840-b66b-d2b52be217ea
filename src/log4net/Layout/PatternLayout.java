package log4net.Layout;

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
import log4net.Layout.*;
import jio.System.IO.*;
import log4net.Core.*;
import jio.System.*;

public class PatternLayout extends LayoutSkeleton implements ILayout, IOptionHandler {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setConversionPattern(java.lang.String value) {
    try {
      javonetHandle.set("ConversionPattern", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getConversionPattern() {
    try {
      java.lang.String res = javonetHandle.get("ConversionPattern");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetFiled */

  public static java.lang.String getDefaultConversionPattern() {
    try {
      java.lang.String res = Javonet.getType("PatternLayout").get("DefaultConversionPattern");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setDefaultConversionPattern(java.lang.String param) {
    try {
      Javonet.getType("PatternLayout").set("DefaultConversionPattern", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getDetailConversionPattern() {
    try {
      java.lang.String res = Javonet.getType("PatternLayout").get("DetailConversionPattern");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setDetailConversionPattern(java.lang.String param) {
    try {
      Javonet.getType("PatternLayout").set("DetailConversionPattern", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PatternLayout() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Layout.PatternLayout");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PatternLayout(java.lang.String pattern) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Layout.PatternLayout", pattern);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PatternLayout(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Format(TextWriter writer, LoggingEvent loggingEvent) {
    try {
      javonetHandle
          .explicitInterface("log4net.Layout.ILayout")
          .invoke("Format", writer, loggingEvent);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
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

  public void AddConverter(PatternLayout.ConverterInfo converterInfo) {
    try {
      javonetHandle.invoke("AddConverter", converterInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void AddConverter(java.lang.String name, jio.System.Type type) {
    try {
      javonetHandle.invoke("AddConverter", name, type);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public static class ConverterInfo {
    protected NObject javonetHandle;
    /** SetProperty */
    public void setName(java.lang.String value) {
      try {
        javonetHandle.set("Name", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    public java.lang.String getName() {
      try {
        java.lang.String res = javonetHandle.get("Name");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetProperty */

    public void setType(jio.System.Type value) {
      try {
        javonetHandle.set("Type", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    public jio.System.Type getType() {
      try {
        Object res = javonetHandle.<NObject>get("Type");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public ConverterInfo() {
      try {
        javonetHandle = Javonet.New("log4net.Layout.PatternLayout+ConverterInfo");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ConverterInfo(NObject handle) {
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
