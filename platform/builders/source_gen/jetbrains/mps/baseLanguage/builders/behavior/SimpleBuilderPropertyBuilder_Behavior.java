package jetbrains.mps.baseLanguage.builders.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class SimpleBuilderPropertyBuilder_Behavior {
  private static Class[] PARAMETERS_5389689214217569806 = {SNode.class};
  private static Class[] PARAMETERS_5389689214217665421 = {SNode.class};
  private static Class[] PARAMETERS_5389689214217665417 = {SNode.class};
  private static Class[] PARAMETERS_5389689214217667234 = {SNode.class ,SNode.class ,SNode.class ,SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isLeaf_7057666463730595159(SNode thisNode) {
    return true;
  }

  public static SNode virtual_getResultType_7057666463730718251(SNode thisNode) {
    return new _Quotations.QuotationClass_2().createNode();
  }

  public static SNode virtual_getCreatorExpression_7057666463730727863(SNode thisNode) {
    return SNodeOperations.copyNode(SLinkOperations.getTarget(thisNode, "value", true));
  }

  public static SNode virtual_getAttachStatementChild_4797501453850305563(SNode thisNode, SNode parentBuilder, SNode parentRef, SNode childRef) {

    SNode result = SNodeOperations.copyNode(SLinkOperations.getTarget(SLinkOperations.getTarget(thisNode, "declaration", false), "set", true));
    for (SNode p : SNodeOperations.getDescendants(result, "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyParent", false, new String[]{})) {
      SNodeOperations.replaceWithAnother(p, SNodeOperations.copyNode(parentRef));
    }
    for (SNode v : SNodeOperations.getDescendants(result, "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyValue", false, new String[]{})) {
      SNodeOperations.replaceWithAnother(v, SNodeOperations.copyNode(childRef));
    }
    return result;
  }

  public static boolean call_isLeaf_5389689214217569806(SNode thisNode) {
    return (Boolean)BehaviorManager.getInstance().invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyBuilder"), "virtual_isLeaf_7057666463730595159", PARAMETERS_5389689214217569806);
  }

  public static SNode call_getResultType_5389689214217665421(SNode thisNode) {
    return (SNode)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyBuilder"), "virtual_getResultType_7057666463730718251", PARAMETERS_5389689214217665421);
  }

  public static SNode call_getCreatorExpression_5389689214217665417(SNode thisNode) {
    return (SNode)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyBuilder"), "virtual_getCreatorExpression_7057666463730727863", PARAMETERS_5389689214217665417);
  }

  public static SNode call_getAttachStatementChild_5389689214217667234(SNode thisNode, SNode parentBuilder, SNode parentRef, SNode childRef) {
    return (SNode)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyBuilder"), "virtual_getAttachStatementChild_4797501453850305563", PARAMETERS_5389689214217667234, parentBuilder, parentRef, childRef);
  }

  public static boolean callSuper_isLeaf_5389689214217569806(SNode thisNode, String callerConceptFqName) {
    return (Boolean)BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyBuilder"), callerConceptFqName, "virtual_isLeaf_7057666463730595159", PARAMETERS_5389689214217569806);
  }

  public static SNode callSuper_getResultType_5389689214217665421(SNode thisNode, String callerConceptFqName) {
    return (SNode)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyBuilder"), callerConceptFqName, "virtual_getResultType_7057666463730718251", PARAMETERS_5389689214217665421);
  }

  public static SNode callSuper_getCreatorExpression_5389689214217665417(SNode thisNode, String callerConceptFqName) {
    return (SNode)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyBuilder"), callerConceptFqName, "virtual_getCreatorExpression_7057666463730727863", PARAMETERS_5389689214217665417);
  }

  public static SNode callSuper_getAttachStatementChild_5389689214217667234(SNode thisNode, String callerConceptFqName, SNode parentBuilder, SNode parentRef, SNode childRef) {
    return (SNode)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyBuilder"), callerConceptFqName, "virtual_getAttachStatementChild_4797501453850305563", PARAMETERS_5389689214217667234, parentBuilder, parentRef, childRef);
  }
}
