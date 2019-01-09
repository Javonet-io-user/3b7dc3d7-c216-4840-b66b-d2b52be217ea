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
import jio.System.*;
import log4net.Util.TypeConverters.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class ConversionNotSupportedException extends ApplicationException
    implements ISerializable, _Exception {
  protected NObject javonetHandle;

  public ConversionNotSupportedException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Util.TypeConverters.ConversionNotSupportedException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ConversionNotSupportedException(java.lang.String message) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("log4net.Util.TypeConverters.ConversionNotSupportedException", message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ConversionNotSupportedException(
      java.lang.String message, jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "log4net.Util.TypeConverters.ConversionNotSupportedException",
              message,
              innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ConversionNotSupportedException(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static ConversionNotSupportedException Create(
      jio.System.Type destinationType, Object sourceValue) {
    try {
      Object res =
          Javonet.getType("ConversionNotSupportedException")
              .invoke("Create", destinationType, sourceValue);
      if (res == null) return null;
      return new ConversionNotSupportedException((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static ConversionNotSupportedException Create(
      jio.System.Type destinationType, Object sourceValue, jio.System.Exception innerException) {
    try {
      Object res =
          Javonet.getType("ConversionNotSupportedException")
              .invoke("Create", destinationType, sourceValue, innerException);
      if (res == null) return null;
      return new ConversionNotSupportedException((NObject) res);
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
