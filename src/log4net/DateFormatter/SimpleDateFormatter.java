package log4net.DateFormatter;

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
import log4net.DateFormatter.*;
import jio.System.*;
import jio.System.IO.*;

public class SimpleDateFormatter implements IDateFormatter {
  protected NObject javonetHandle;

  public SimpleDateFormatter(java.lang.String format) {
    try {
      javonetHandle = Javonet.New("log4net.DateFormatter.SimpleDateFormatter", format);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SimpleDateFormatter(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void FormatDate(DateTime dateToFormat, TextWriter writer) {
    try {
      javonetHandle
          .explicitInterface("log4net.DateFormatter.IDateFormatter")
          .invoke("FormatDate", dateToFormat, writer);
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
