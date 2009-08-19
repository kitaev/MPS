package jetbrains.mps.lang.constraints.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class NodeReferentConstraint_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode call_getApplicableConcept_1213877399322(SNode thisNode) {
    if (SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.behavior.structure.ConceptBehavior", false, false) != null) {
      return SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.behavior.structure.ConceptBehavior", false, false), "jetbrains.mps.lang.behavior.structure.ConceptBehavior"), "concept", false);
    }
    if (SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.constraints.structure.ConceptConstraints", false, false) != null) {
      return SLinkOperations.getTarget(SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.constraints.structure.ConceptConstraints", false, false), "concept", false);
    }
    return null;
  }
}
