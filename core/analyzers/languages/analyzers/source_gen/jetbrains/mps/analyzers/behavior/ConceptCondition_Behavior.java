package jetbrains.mps.analyzers.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class ConceptCondition_Behavior {
  private static Class[] PARAMETERS_4943044633101739075 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getApplicableConcept_4413230749907681652(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "concept", false);
  }

  public static SNode call_getApplicableConcept_4943044633101739075(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.analyzers.structure.ConceptCondition"), "virtual_getApplicableConcept_4413230749907681652", PARAMETERS_4943044633101739075);
  }

  public static SNode callSuper_getApplicableConcept_4943044633101739075(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.analyzers.structure.ConceptCondition"), callerConceptFqName, "virtual_getApplicableConcept_4413230749907681652", PARAMETERS_4943044633101739075);
  }
}
