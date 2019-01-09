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

public class FormattingInfo {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setMin(java.lang.Integer value) {
    try {
      javonetHandle.set("Min", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getMin() {
    try {
      java.lang.Integer res = javonetHandle.get("Min");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setMax(java.lang.Integer value) {
    try {
      javonetHandle.set("Max", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getMax() {
    try {
      java.lang.Integer res = javonetHandle.get("Max");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setLeftAlign(java.lang.Boolean value) {
    try {
      javonetHandle.set("LeftAlign", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getLeftAlign() {
    try {
      java.lang.Boolean res = javonetHandle.get("LeftAlign");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public FormattingInfo() {
    try {
      javonetHandle = Javonet.New("log4net.Util.FormattingInfo");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormattingInfo(java.lang.Integer min, java.lang.Integer max, java.lang.Boolean leftAlign) {
    try {
      javonetHandle = Javonet.New("log4net.Util.FormattingInfo", min, max, leftAlign);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FormattingInfo(NObject handle) {
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
