package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ActionParameter_Behavior {
  private static Class[] PARAMETERS_1171743928471337193 = {SNode.class};
  private static Class[] PARAMETERS_1171743928471867409 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode call_getType_1171743928471337193(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.ActionParameter"), "virtual_getType_1171743928471337193", PARAMETERS_1171743928471337193);
  }

  public static SNode call_getFieldDeclaration_1171743928471867409(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.ActionParameter"), "virtual_getFieldDeclaration_1171743928471867409", PARAMETERS_1171743928471867409);
  }

  public static SNode callSuper_getType_1171743928471337193(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.ActionParameter"), callerConceptFqName, "virtual_getType_1171743928471337193", PARAMETERS_1171743928471337193);
  }

  public static SNode callSuper_getFieldDeclaration_1171743928471867409(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.plugin.structure.ActionParameter"), callerConceptFqName, "virtual_getFieldDeclaration_1171743928471867409", PARAMETERS_1171743928471867409);
  }
}
