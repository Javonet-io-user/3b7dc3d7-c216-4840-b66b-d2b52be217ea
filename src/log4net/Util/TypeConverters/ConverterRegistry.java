package log4net.Util.TypeConverters;

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
import log4net.Util.TypeConverters.*;
import jio.System.*;

public class ConverterRegistry {
  protected NObject javonetHandle;

  public ConverterRegistry(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static void AddConverter(jio.System.Type destinationType, Object converter) {
    try {
      Javonet.getType("ConverterRegistry").invoke("AddConverter", destinationType, converter);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static void AddConverter(jio.System.Type destinationType, jio.System.Type converterType) {
    try {
      Javonet.getType("ConverterRegistry").invoke("AddConverter", destinationType, converterType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static IConvertTo GetConvertTo(
      jio.System.Type sourceType, jio.System.Type destinationType) {
    try {
      Object res =
          Javonet.getType("ConverterRegistry").invoke("GetConvertTo", sourceType, destinationType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static IConvertFrom GetConvertFrom(jio.System.Type destinationType) {
    try {
      Object res = Javonet.getType("ConverterRegistry").invoke("GetConvertFrom", destinationType);
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
