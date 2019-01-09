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
import jio.System.*;
import jio.System.Collections.*;

public class NullDictionaryEnumerator implements IDictionaryEnumerator, IEnumerator {
  protected NObject javonetHandle;
  /** GetProperty */
  public static NullDictionaryEnumerator getInstance() {
    try {
      Object res = Javonet.getType("NullDictionaryEnumerator").<NObject>get("Instance");
      if (res == null) return null;
      return new NullDictionaryEnumerator((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Object getCurrent() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerator")
              .invoke("get_Current");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Object getKey() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionaryEnumerator")
              .invoke("get_Key");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Object getValue() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionaryEnumerator")
              .invoke("get_Value");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public DictionaryEntry getEntry() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionaryEnumerator")
              .invoke("get_Entry");
      if (res == null) return null;
      return new DictionaryEntry((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public NullDictionaryEnumerator(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean MoveNext() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Collections.IEnumerator").invoke("MoveNext");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void Reset() {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IEnumerator").invoke("Reset");
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
