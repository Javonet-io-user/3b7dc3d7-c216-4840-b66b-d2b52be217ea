package jio.System.Collections;

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
import jio.System.Collections.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;

public class Hashtable
    implements IDictionary,
        ICollection,
        IEnumerable,
        ISerializable,
        IDeserializationCallback,
        ICloneable,
        Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.IDictionary_GetEnumerator();
  }
  /** SetProperty */

  public void set_Item(Object key, Object value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.IDictionary")
          .invoke("set_Item", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Object get_Item(Object key) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("get_Item", key);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsReadOnly() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("get_IsReadOnly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsFixedSize() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("get_IsFixedSize");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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

  public ICollection getKeys() {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Collections.IDictionary").invoke("get_Keys");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public ICollection getValues() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("get_Values");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  public Hashtable() {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(java.lang.Integer capacity) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", capacity);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(java.lang.Integer capacity, java.lang.Float loadFactor) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", capacity, loadFactor);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(
      java.lang.Integer capacity,
      java.lang.Float loadFactor,
      IHashCodeProvider hcp,
      IComparer comparer) {
    try {
      javonetHandle =
          Javonet.New("System.Collections.Hashtable", capacity, loadFactor, hcp, comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(
      java.lang.Integer capacity, java.lang.Float loadFactor, IEqualityComparer equalityComparer) {
    try {
      javonetHandle =
          Javonet.New("System.Collections.Hashtable", capacity, loadFactor, equalityComparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(IHashCodeProvider hcp, IComparer comparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", hcp, comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(IEqualityComparer equalityComparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", equalityComparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(java.lang.Integer capacity, IHashCodeProvider hcp, IComparer comparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", capacity, hcp, comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(java.lang.Integer capacity, IEqualityComparer equalityComparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", capacity, equalityComparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(IDictionary d) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", d);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(IDictionary d, java.lang.Float loadFactor) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", d, loadFactor);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(IDictionary d, IHashCodeProvider hcp, IComparer comparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", d, hcp, comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(IDictionary d, IEqualityComparer equalityComparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", d, equalityComparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(
      IDictionary d, java.lang.Float loadFactor, IHashCodeProvider hcp, IComparer comparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", d, loadFactor, hcp, comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(IDictionary d, java.lang.Float loadFactor, IEqualityComparer equalityComparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.Hashtable", d, loadFactor, equalityComparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Hashtable(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Add(Object key, Object value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.IDictionary")
          .invoke("Add", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Clear() {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IDictionary").invoke("Clear");
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

  public java.lang.Boolean Contains(Object key) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("Contains", key);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean ContainsKey(Object key) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("ContainsKey", key);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean ContainsValue(Object value) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("ContainsValue", value);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void CopyTo(java.lang.reflect.Array array, java.lang.Integer arrayIndex) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.ICollection")
          .invoke("CopyTo", array, arrayIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IDictionaryEnumerator IDictionary_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Remove(Object key) {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IDictionary").invoke("Remove", key);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static Hashtable Synchronized(Hashtable table) {
    try {
      Object res = Javonet.getType("Hashtable").invoke("Synchronized", table);
      if (res == null) return null;
      return new Hashtable((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void GetObjectData(SerializationInfo info, StreamingContext context) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
          .invoke("GetObjectData", info, context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void OnDeserialization(Object sender) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.IDeserializationCallback")
          .invoke("OnDeserialization", sender);
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
