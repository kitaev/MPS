package jetbrains.mps.baseLanguage.classifiers.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class BaseClassifierType_Behavior {
  private static Class[] PARAMETERS_1213877402148 = {SNode.class ,SNode.class};

  public static void init(SNode thisNode) {
  }

  public static List<SNode> call_getMembers_1213877402148(SNode thisNode, SNode contextNode) {
    return (List<SNode>) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType"), "virtual_getMembers_1213877402148", PARAMETERS_1213877402148, contextNode);
  }

  public static List<SNode> callSuper_getMembers_1213877402148(SNode thisNode, String callerConceptFqName, SNode contextNode) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType"), callerConceptFqName, "virtual_getMembers_1213877402148", PARAMETERS_1213877402148, contextNode);
  }
}
