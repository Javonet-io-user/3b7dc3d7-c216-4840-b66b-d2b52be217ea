package log4net.Config;

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
import log4net.Config.*;
import jio.System.Reflection.*;
import log4net.Repository.*;
import jio.System.*;
import jio.System.Runtime.InteropServices.*;

public class SecurityContextProviderAttribute extends ConfiguratorAttribute
    implements _Attribute, IComparable {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setProviderType(jio.System.Type value) {
    try {
      javonetHandle.set("ProviderType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public jio.System.Type getProviderType() {
    try {
      Object res = javonetHandle.<NObject>get("ProviderType");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SecurityContextProviderAttribute(jio.System.Type providerType) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("log4net.Config.SecurityContextProviderAttribute", providerType);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SecurityContextProviderAttribute(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Configure(Assembly sourceAssembly, ILoggerRepository targetRepository) {
    try {
      javonetHandle.invoke("Configure", sourceAssembly, targetRepository);
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
