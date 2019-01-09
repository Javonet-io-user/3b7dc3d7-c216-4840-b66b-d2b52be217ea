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
import log4net.Util.*;
import jio.System.IO.*;
import jio.System.*;
import log4net.Core.*;

public class PatternString implements IOptionHandler {
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

  public PatternString() {
    try {
      javonetHandle = Javonet.New("log4net.Util.PatternString");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PatternString(java.lang.String pattern) {
    try {
      javonetHandle = Javonet.New("log4net.Util.PatternString", pattern);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PatternString(NObject handle) {
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

  public void Format(TextWriter writer) {
    try {
      javonetHandle.invoke("Format", writer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String Format() {
    try {
      java.lang.String res = javonetHandle.invoke("Format");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void AddConverter(PatternString.ConverterInfo converterInfo) {
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
        javonetHandle = Javonet.New("log4net.Util.PatternString+ConverterInfo");
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
