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
import log4net.Layout.*;
import log4net.Core.*;
import log4net.Util.*;

public class ColoredConsoleAppender extends AppenderSkeleton
    implements IBulkAppender, IAppender, IOptionHandler {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setTarget(java.lang.String value) {
    try {
      javonetHandle.set("Target", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getTarget() {
    try {
      java.lang.String res = javonetHandle.get("Target");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetFiled */

  public static java.lang.String getConsoleOut() {
    try {
      java.lang.String res = Javonet.getType("ColoredConsoleAppender").get("ConsoleOut");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setConsoleOut(java.lang.String param) {
    try {
      Javonet.getType("ColoredConsoleAppender").set("ConsoleOut", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getConsoleError() {
    try {
      java.lang.String res = Javonet.getType("ColoredConsoleAppender").get("ConsoleError");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setConsoleError(java.lang.String param) {
    try {
      Javonet.getType("ColoredConsoleAppender").set("ConsoleError", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ColoredConsoleAppender() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Appender.ColoredConsoleAppender");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ColoredConsoleAppender(ILayout layout) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Appender.ColoredConsoleAppender", layout);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ColoredConsoleAppender(ILayout layout, java.lang.Boolean writeToErrorStream) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("log4net.Appender.ColoredConsoleAppender", layout, writeToErrorStream);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ColoredConsoleAppender(NObject handle) {
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

  public void AddMapping(ColoredConsoleAppender.LevelColors mapping) {
    try {
      javonetHandle.invoke("AddMapping", mapping);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public enum Colors {
    Blue(1L),
    Green(2L),
    Cyan(3L),
    Red(4L),
    Purple(5L),
    Yellow(6L),
    White(7L),
    HighIntensity(8L),
    ;
    private long numVal;

    Colors(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  public static class LevelColors extends LevelMappingEntry implements IOptionHandler {
    protected NObject javonetHandle;
    /** SetProperty */
    public void setForeColor(ColoredConsoleAppender.Colors value) {
      try {
        javonetHandle.set("ForeColor", NEnum.fromJavaEnum(value));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    public ColoredConsoleAppender.Colors getForeColor() {
      try {
        Object res = javonetHandle.<NEnum>get("ForeColor");
        if (res == null) return null;
        return ColoredConsoleAppender.Colors.valueOf(((NEnum) res).getValueName());
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetProperty */

    public void setBackColor(ColoredConsoleAppender.Colors value) {
      try {
        javonetHandle.set("BackColor", NEnum.fromJavaEnum(value));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    public ColoredConsoleAppender.Colors getBackColor() {
      try {
        Object res = javonetHandle.<NEnum>get("BackColor");
        if (res == null) return null;
        return ColoredConsoleAppender.Colors.valueOf(((NEnum) res).getValueName());
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public LevelColors() {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("log4net.Appender.ColoredConsoleAppender+LevelColors");
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public LevelColors(NObject handle) {
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
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
