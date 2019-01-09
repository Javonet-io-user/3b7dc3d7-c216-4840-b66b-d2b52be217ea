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
import jio.System.*;
import jio.System.Collections.*;

public class AppenderCollection
    implements IList, ICollection, IEnumerable, ICloneable, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.GetEnumerator();
  }
  /** GetProperty */

  public java.lang.Integer getCount() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Collections.ICollection").invoke("get_Count");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsSynchronized() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("get_IsSynchronized");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public Object getSyncRoot() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("get_SyncRoot");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void set_ItemProperty(java.lang.Integer index, IAppender value) {
    try {
      javonetHandle.invoke("set_Item", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public IAppender get_ItemProperty(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("get_Item", index);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsFixedSize() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("get_IsFixedSize");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsReadOnly() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("get_IsReadOnly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setCapacity(java.lang.Integer value) {
    try {
      javonetHandle.set("Capacity", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getCapacity() {
    try {
      java.lang.Integer res = javonetHandle.get("Capacity");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetFiled */

  public static AppenderCollection getEmptyCollection() {
    try {
      Object res = Javonet.getType("AppenderCollection").<NObject>get("EmptyCollection");
      if (res == null) return null;
      return new AppenderCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public static void setEmptyCollection(AppenderCollection param) {
    try {
      Javonet.getType("AppenderCollection").set("EmptyCollection", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AppenderCollection() {
    try {
      javonetHandle = Javonet.New("log4net.Appender.AppenderCollection");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AppenderCollection(java.lang.Integer capacity) {
    try {
      javonetHandle = Javonet.New("log4net.Appender.AppenderCollection", capacity);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AppenderCollection(AppenderCollection c) {
    try {
      javonetHandle = Javonet.New("log4net.Appender.AppenderCollection", c);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AppenderCollection(IAppender[] a) {
    try {
      javonetHandle = Javonet.New("log4net.Appender.AppenderCollection", new Object[] {a});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AppenderCollection(ICollection col) {
    try {
      javonetHandle = Javonet.New("log4net.Appender.AppenderCollection", col);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AppenderCollection(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Clear() {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object Clone() {
    try {
      Object res = javonetHandle.explicitInterface("jio.System.ICloneable").invoke("Clone");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static AppenderCollection ReadOnly(AppenderCollection list) {
    try {
      Object res = Javonet.getType("AppenderCollection").invoke("ReadOnly", list);
      if (res == null) return null;
      return new AppenderCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void CopyTo(IAppender[] array) {
    try {
      javonetHandle.invoke("CopyTo", new Object[] {array});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CopyTo(IAppender[] array, java.lang.Integer start) {
    try {
      javonetHandle.invoke("CopyTo", new Object[] {array}, start);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer Add(IAppender item) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Add", item);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Boolean Contains(IAppender item) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Contains", item);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Integer IndexOf(IAppender item) {
    try {
      java.lang.Integer res = javonetHandle.invoke("IndexOf", item);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void Insert(java.lang.Integer index, IAppender item) {
    try {
      javonetHandle.invoke("Insert", index, item);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Remove(IAppender item) {
    try {
      javonetHandle.invoke("Remove", item);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void RemoveAt(java.lang.Integer index) {
    try {
      javonetHandle.invoke("RemoveAt", index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IAppenderCollectionEnumerator GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer AddRange(AppenderCollection x) {
    try {
      java.lang.Integer res = javonetHandle.invoke("AddRange", x);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer AddRange(IAppender[] x) {
    try {
      java.lang.Integer res = javonetHandle.invoke("AddRange", new Object[] {x});
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer AddRange(ICollection col) {
    try {
      java.lang.Integer res = javonetHandle.invoke("AddRange", col);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void TrimToSize() {
    try {
      javonetHandle.invoke("TrimToSize");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IAppender[] ToArray(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("ToArray");
      if (res == null) return null;
      return (IAppender[]) Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object get_Item(java.lang.Integer i) {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("get_Item", i);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void set_Item(java.lang.Integer i, Object value) {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("set_Item", i, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer Add(Object x) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("Add", x);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Boolean Contains(Object x) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("Contains", x);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Integer IndexOf(Object x) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("IndexOf", x);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void Insert(java.lang.Integer pos, Object x) {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("Insert", pos, x);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Remove(Object x) {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("Remove", x);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void IList_RemoveAt(java.lang.Integer pos) {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("RemoveAt", pos);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CopyTo(java.lang.reflect.Array array, java.lang.Integer start) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.ICollection")
          .invoke("CopyTo", array, start);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public abstract static class IAppenderCollectionEnumerator {
    protected NObject javonetHandle;
    /** GetProperty */
    public IAppender getCurrent() {
      try {
        Object res = javonetHandle.<NObject>get("Current");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public IAppenderCollectionEnumerator(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public java.lang.Boolean MoveNext() {
      try {
        java.lang.Boolean res = javonetHandle.invoke("MoveNext");
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
        javonetHandle.invoke("Reset");
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
