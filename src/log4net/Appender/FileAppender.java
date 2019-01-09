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
import jio.System.Text.*;
import log4net.Core.*;
import log4net.Layout.*;
import jio.System.IO.*;

public class FileAppender extends TextWriterAppender
    implements IBulkAppender, IAppender, IOptionHandler {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setFile(java.lang.String value) {
    try {
      javonetHandle.set("File", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getFile() {
    try {
      java.lang.String res = javonetHandle.get("File");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAppendToFile(java.lang.Boolean value) {
    try {
      javonetHandle.set("AppendToFile", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getAppendToFile() {
    try {
      java.lang.Boolean res = javonetHandle.get("AppendToFile");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setEncoding(Encoding value) {
    try {
      javonetHandle.set("Encoding", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Encoding getEncoding() {
    try {
      Object res = javonetHandle.<NObject>get("Encoding");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSecurityContext(SecurityContext value) {
    try {
      javonetHandle.set("SecurityContext", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public SecurityContext getSecurityContext() {
    try {
      Object res = javonetHandle.<NObject>get("SecurityContext");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setLockingModel(FileAppender.LockingModelBase value) {
    try {
      javonetHandle.set("LockingModel", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public FileAppender.LockingModelBase getLockingModel() {
    try {
      Object res = javonetHandle.<NObject>get("LockingModel");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public FileAppender() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Appender.FileAppender");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileAppender(ILayout layout, java.lang.String filename, java.lang.Boolean append) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Appender.FileAppender", layout, filename, append);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileAppender(ILayout layout, java.lang.String filename) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Appender.FileAppender", layout, filename);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public FileAppender(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void ActivateOptions() {
    try {
      javonetHandle.explicitInterface("log4net.Core.IOptionHandler").invoke("ActivateOptions");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public abstract static class LockingModelBase {
    protected NObject javonetHandle;
    /** SetProperty */
    public void setCurrentAppender(FileAppender value) {
      try {
        javonetHandle.set("CurrentAppender", value);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetProperty */

    public FileAppender getCurrentAppender() {
      try {
        Object res = javonetHandle.<NObject>get("CurrentAppender");
        if (res == null) return null;
        return new FileAppender((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public LockingModelBase(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public void OpenFile(java.lang.String filename, java.lang.Boolean append, Encoding encoding) {
      try {
        javonetHandle.invoke("OpenFile", filename, append, encoding);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public void CloseFile() {
      try {
        javonetHandle.invoke("CloseFile");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public Stream AcquireLock() {
      try {
        Object res = javonetHandle.invoke("AcquireLock");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public void ReleaseLock() {
      try {
        javonetHandle.invoke("ReleaseLock");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
  }

  public static class ExclusiveLock extends FileAppender.LockingModelBase {
    protected NObject javonetHandle;

    public ExclusiveLock() {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("log4net.Appender.FileAppender+ExclusiveLock");
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ExclusiveLock(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public void OpenFile(java.lang.String filename, java.lang.Boolean append, Encoding encoding) {
      try {
        javonetHandle.invoke("OpenFile", filename, append, encoding);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public void CloseFile() {
      try {
        javonetHandle.invoke("CloseFile");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public Stream AcquireLock() {
      try {
        Object res = javonetHandle.invoke("AcquireLock");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public void ReleaseLock() {
      try {
        javonetHandle.invoke("ReleaseLock");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
  }

  public static class MinimalLock extends FileAppender.LockingModelBase {
    protected NObject javonetHandle;

    public MinimalLock() {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("log4net.Appender.FileAppender+MinimalLock");
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public MinimalLock(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public void OpenFile(java.lang.String filename, java.lang.Boolean append, Encoding encoding) {
      try {
        javonetHandle.invoke("OpenFile", filename, append, encoding);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public void CloseFile() {
      try {
        javonetHandle.invoke("CloseFile");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public Stream AcquireLock() {
      try {
        Object res = javonetHandle.invoke("AcquireLock");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public void ReleaseLock() {
      try {
        javonetHandle.invoke("ReleaseLock");
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
