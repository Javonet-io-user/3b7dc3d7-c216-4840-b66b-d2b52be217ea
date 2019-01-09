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
import log4net.Util.*;

public class AnsiColorTerminalAppender extends AppenderSkeleton
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
      java.lang.String res = Javonet.getType("AnsiColorTerminalAppender").get("ConsoleOut");
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
      Javonet.getType("AnsiColorTerminalAppender").set("ConsoleOut", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getConsoleError() {
    try {
      java.lang.String res = Javonet.getType("AnsiColorTerminalAppender").get("ConsoleError");
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
      Javonet.getType("AnsiColorTerminalAppender").set("ConsoleError", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AnsiColorTerminalAppender() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Appender.AnsiColorTerminalAppender");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AnsiColorTerminalAppender(NObject handle) {
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

  public void AddMapping(AnsiColorTerminalAppender.LevelColors mapping) {
    try {
      javonetHandle.invoke("AddMapping", mapping);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public enum AnsiAttributes {
    Bright(1L),
    Dim(2L),
    Underscore(4L),
    Blink(8L),
    Reverse(16L),
    Hidden(32L),
    Strikethrough(64L),
    ;
    private long numVal;

    AnsiAttributes(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  public enum AnsiColor {
    Black(0L),
    Red(1L),
    Green(2L),
    Yellow(3L),
    Blue(4L),
    Magenta(5L),
    Cyan(6L),
    White(7L),
    ;
    private long numVal;

    AnsiColor(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  public static class LevelColors extends LevelMappingEntry implements IOptionHandler {
    protected NObject javonetHandle;
    /** SetProperty */
    public void setForeColor(AnsiColorTerminalAppender.AnsiColor value) {
      try {
        javonetHandle.set("ForeColor", NEnum.fromJavaEnum(value));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    public AnsiColorTerminalAppender.AnsiColor getForeColor() {
      try {
        Object res = javonetHandle.<NEnum>get("ForeColor");
        if (res == null) return null;
        return AnsiColorTerminalAppender.AnsiColor.valueOf(((NEnum) res).getValueName());
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetProperty */

    public void setBackColor(AnsiColorTerminalAppender.AnsiColor value) {
      try {
        javonetHandle.set("BackColor", NEnum.fromJavaEnum(value));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    public AnsiColorTerminalAppender.AnsiColor getBackColor() {
      try {
        Object res = javonetHandle.<NEnum>get("BackColor");
        if (res == null) return null;
        return AnsiColorTerminalAppender.AnsiColor.valueOf(((NEnum) res).getValueName());
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** SetProperty */

    public void setAttributes(AnsiColorTerminalAppender.AnsiAttributes value) {
      try {
        javonetHandle.set("Attributes", NEnum.fromJavaEnum(value));
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    public AnsiColorTerminalAppender.AnsiAttributes getAttributes() {
      try {
        Object res = javonetHandle.<NEnum>get("Attributes");
        if (res == null) return null;
        return AnsiColorTerminalAppender.AnsiAttributes.valueOf(((NEnum) res).getValueName());
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public LevelColors() {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("log4net.Appender.AnsiColorTerminalAppender+LevelColors");
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
