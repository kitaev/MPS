package jetbrains.mps.gtext.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class GItem_Behavior {
  private static Class[] PARAMETERS_1213877298853 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isComplex_1213877298853(SNode thisNode) {
    return false;
  }

  public static boolean call_isComplex_1213877298853(SNode thisNode) {
    return (Boolean) BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.gtext.structure.GItem"), "virtual_isComplex_1213877298853", PARAMETERS_1213877298853);
  }

  public static boolean callSuper_isComplex_1213877298853(SNode thisNode, String callerConceptFqName) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.gtext.structure.GItem"), callerConceptFqName, "virtual_isComplex_1213877298853", PARAMETERS_1213877298853);
  }
}
