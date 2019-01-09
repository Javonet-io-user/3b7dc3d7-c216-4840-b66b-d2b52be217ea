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

public class ReaderWriterLock {
  protected NObject javonetHandle;

  public ReaderWriterLock() {
    try {
      javonetHandle = Javonet.New("log4net.Util.ReaderWriterLock");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ReaderWriterLock(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void AcquireReaderLock() {
    try {
      javonetHandle.invoke("AcquireReaderLock");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ReleaseReaderLock() {
    try {
      javonetHandle.invoke("ReleaseReaderLock");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void AcquireWriterLock() {
    try {
      javonetHandle.invoke("AcquireWriterLock");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ReleaseWriterLock() {
    try {
      javonetHandle.invoke("ReleaseWriterLock");
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
