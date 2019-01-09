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

public class DefaultRenderer implements IObjectRenderer {
  protected NObject javonetHandle;

  public DefaultRenderer() {
    try {
      javonetHandle = Javonet.New("log4net.ObjectRenderer.DefaultRenderer");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DefaultRenderer(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void RenderObject(RendererMap rendererMap, Object obj, TextWriter writer) {
    try {
      javonetHandle
          .explicitInterface("log4net.ObjectRenderer.IObjectRenderer")
          .invoke("RenderObject", rendererMap, obj, writer);
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
