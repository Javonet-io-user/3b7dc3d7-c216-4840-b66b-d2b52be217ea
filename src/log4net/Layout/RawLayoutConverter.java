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
import jio.System.*;
import log4net.Util.TypeConverters.*;

public class RawLayoutConverter implements IConvertFrom {
  protected NObject javonetHandle;

  public RawLayoutConverter() {
    try {
      javonetHandle = Javonet.New("log4net.Layout.RawLayoutConverter");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RawLayoutConverter(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean CanConvertFrom(jio.System.Type sourceType) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("log4net.Util.TypeConverters.IConvertFrom")
              .invoke("CanConvertFrom", sourceType);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public Object ConvertFrom(Object source) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("log4net.Util.TypeConverters.IConvertFrom")
              .invoke("ConvertFrom", source);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
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
