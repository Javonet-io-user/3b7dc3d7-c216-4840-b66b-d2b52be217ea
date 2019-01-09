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
import jio.System.Runtime.InteropServices.*;

public class TypeConverterAttribute extends Attribute implements _Attribute {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setConverterTypeName(java.lang.String value) {
    try {
      javonetHandle.set("ConverterTypeName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getConverterTypeName() {
    try {
      java.lang.String res = javonetHandle.get("ConverterTypeName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public TypeConverterAttribute() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Util.TypeConverters.TypeConverterAttribute");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TypeConverterAttribute(java.lang.String typeName) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Util.TypeConverters.TypeConverterAttribute", typeName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TypeConverterAttribute(jio.System.Type converterType) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("log4net.Util.TypeConverters.TypeConverterAttribute", converterType);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TypeConverterAttribute(NObject handle) {
    super(handle);
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
