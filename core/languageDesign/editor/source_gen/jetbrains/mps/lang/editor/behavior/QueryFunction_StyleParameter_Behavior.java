package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class QueryFunction_StyleParameter_Behavior {
  private static Class[] PARAMETERS_1221482178305 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getQueryMethodName_1221482178305(SNode thisNode) {
    return "_StyleParameter_QueryFunction_" + thisNode.getId();
  }

  public static String call_getQueryMethodName_1221482178305(SNode thisNode) {
    return (String)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.editor.structure.QueryFunction_StyleParameter"), "virtual_getQueryMethodName_1221482178305", PARAMETERS_1221482178305);
  }

  public static String callSuper_getQueryMethodName_1221482178305(SNode thisNode, String callerConceptFqName) {
    return (String)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.editor.structure.QueryFunction_StyleParameter"), callerConceptFqName, "virtual_getQueryMethodName_1221482178305", PARAMETERS_1221482178305);
  }

}
