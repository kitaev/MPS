package jetbrains.mps.lang.refactoring.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class MPSParameterType_Behavior {
  private static Class[] PARAMETERS_4413749148913760555 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode call_getCreatorMethod_4413749148913760555(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.refactoring.structure.MPSParameterType"), "virtual_getCreatorMethod_4413749148913760555", PARAMETERS_4413749148913760555);
  }

  public static SNode callSuper_getCreatorMethod_4413749148913760555(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.refactoring.structure.MPSParameterType"), callerConceptFqName, "virtual_getCreatorMethod_4413749148913760555", PARAMETERS_4413749148913760555);
  }
}
