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
import jio.System.Xml.*;

public class Transform {
  protected NObject javonetHandle;

  public Transform(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static void WriteEscapedXmlString(
      XmlWriter writer, java.lang.String textData, java.lang.String invalidCharReplacement) {
    try {
      Javonet.getType("Transform")
          .invoke("WriteEscapedXmlString", writer, textData, invalidCharReplacement);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.String MaskXmlInvalidCharacters(
      java.lang.String textData, java.lang.String mask) {
    try {
      java.lang.String res =
          Javonet.getType("Transform").invoke("MaskXmlInvalidCharacters", textData, mask);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
