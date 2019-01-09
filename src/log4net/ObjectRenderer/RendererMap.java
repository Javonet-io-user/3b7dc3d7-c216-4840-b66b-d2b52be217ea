package log4net.ObjectRenderer;

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
import log4net.ObjectRenderer.*;
import jio.System.*;
import jio.System.IO.*;

public class RendererMap {
  protected NObject javonetHandle;
  /** GetProperty */
  public IObjectRenderer getDefaultRenderer() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultRenderer");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public RendererMap() {
    try {
      javonetHandle = Javonet.New("log4net.ObjectRenderer.RendererMap");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RendererMap(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String FindAndRender(Object obj) {
    try {
      java.lang.String res = javonetHandle.invoke("FindAndRender", obj);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void FindAndRender(Object obj, TextWriter writer) {
    try {
      javonetHandle.invoke("FindAndRender", obj, writer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IObjectRenderer Get(Object obj) {
    try {
      Object res = javonetHandle.invoke("Get", obj);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IObjectRenderer Get(jio.System.Type type) {
    try {
      Object res = javonetHandle.invoke("Get", type);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Clear() {
    try {
      javonetHandle.invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Put(jio.System.Type typeToRender, IObjectRenderer renderer) {
    try {
      javonetHandle.invoke("Put", typeToRender, renderer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
