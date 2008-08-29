package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.core.behavior.BaseConcept_Behavior;
import java.lang.reflect.Method;
import jetbrains.mps.project.IModule;
import jetbrains.mps.reloading.ReflectionUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class BaseMethodDeclaration_Behavior {

  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    StringBuilder result = new StringBuilder();
    String name = SPropertyOperations.getString(thisNode, "name");
    if (name != null) {
      result.append(name);
    } else
    {
      result.append("<no name>");
    }
    result.append(BaseMethodDeclaration_Behavior.call_getParametersPresentation_1213877350304(thisNode));
    result.append(":");
    if (SLinkOperations.getTarget(thisNode, "returnType", true) != null) {
      result.append(BaseConcept_Behavior.call_getPresentation_1213877396640(SLinkOperations.getTarget(thisNode, "returnType", true)));
    } else
    {
      result.append("???");
    }
    return result.toString();
  }

  public static String call_getParametersPresentation_1213877350304(SNode thisNode) {
    StringBuilder result = new StringBuilder();
    result.append("(");
    boolean first = true;
    for(SNode parm : SLinkOperations.getTargets(thisNode, "parameter", true)) {
      if (!(first)) {
        result.append(",");
      }
      first = false;
      if (SLinkOperations.getTarget(parm, "type", true) != null) {
        result.append(BaseConcept_Behavior.call_getPresentation_1213877396640(SLinkOperations.getTarget(parm, "type", true)));
      } else
      {
        result.append("???");
      }
      /*
        if (SPropertyOperations.getString(parm, "name") != null) {
          result.append(" ").append(SPropertyOperations.getString(parm, "name"));
        }
      */
    }
    result.append(")");
    return result.toString();
  }

  public static Method call_getMethod_1213877350393(SNode thisNode, IModule module) {
    return ReflectionUtil.getMethod(module, SNodeOperations.getParent(thisNode), SPropertyOperations.getString(thisNode, "name"), BaseMethodDeclaration_Behavior.call_getParameterTypes_1213877350411(thisNode, module));
  }

  public static Class[] call_getParameterTypes_1213877350411(SNode thisNode, final IModule module) {
    return ListSequence.fromIterable(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true)).select(new ISelector <SNode, Class>() {

      public Class select(SNode it) {
        return Type_Behavior.call_getClass_1213877337327(SLinkOperations.getTarget(it, "type", true), module);
      }

    })).toGenericArray(Class.class);
  }

  public static boolean call_hasSameSignature_1213877350435(SNode thisNode, SNode checked) {
    if (SPropertyOperations.getString(thisNode, "name").equals(SPropertyOperations.getString(checked, "name")) && SLinkOperations.getCount(thisNode, "parameter") == SLinkOperations.getCount(checked, "parameter")) {
      boolean same = true;
      for(int i = 0 ; i < SLinkOperations.getCount(thisNode, "parameter") ; i = i + 1) {
        String searchedParamType = Type_Behavior.call_getErasureSignature_1213877337313(SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(checked, "parameter", true)).getElement(i), "type", true));
        String foundParamType = Type_Behavior.call_getErasureSignature_1213877337313(SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true)).getElement(i), "type", true));
        if (!(foundParamType.equals(searchedParamType))) {
          same = false;
        }
      }
      return same;
    }
    return false;
  }

}
