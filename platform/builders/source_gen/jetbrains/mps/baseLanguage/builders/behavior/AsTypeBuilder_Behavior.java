package jetbrains.mps.baseLanguage.builders.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class AsTypeBuilder_Behavior {
  private static Class[] PARAMETERS_5389689214216563780 = {SNode.class};
  private static Class[] PARAMETERS_5389689214216563784 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getCreatorExpression_7057666463730727863(SNode thisNode) {
    throw new UnsupportedOperationException();
  }

  public static SNode virtual_getResultType_7057666463730718251(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "type", true);
  }

  public static SNode call_getCreatorExpression_5389689214216563780(SNode thisNode) {
    return (SNode)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.AsTypeBuilder"), "virtual_getCreatorExpression_7057666463730727863", PARAMETERS_5389689214216563780);
  }

  public static SNode call_getResultType_5389689214216563784(SNode thisNode) {
    return (SNode)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.AsTypeBuilder"), "virtual_getResultType_7057666463730718251", PARAMETERS_5389689214216563784);
  }

  public static SNode callSuper_getCreatorExpression_5389689214216563780(SNode thisNode, String callerConceptFqName) {
    return (SNode)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.AsTypeBuilder"), callerConceptFqName, "virtual_getCreatorExpression_7057666463730727863", PARAMETERS_5389689214216563780);
  }

  public static SNode callSuper_getResultType_5389689214216563784(SNode thisNode, String callerConceptFqName) {
    return (SNode)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.AsTypeBuilder"), callerConceptFqName, "virtual_getResultType_7057666463730718251", PARAMETERS_5389689214216563784);
  }
}
