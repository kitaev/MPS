package jetbrains.mps.lang.constraints.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class NodeDefaultSearchScope_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode call_getReferentConcept_1213877261403(SNode thisNode) {
    if ((SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.constraints.structure.ConceptBehavior", false, false) != null)) {
      return SLinkOperations.getTarget(SNodeOperations.getContainingRoot(thisNode), "concept", false);
    }
    if ((SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.constraints.structure.ConceptConstraints", false, false) != null)) {
      return SLinkOperations.getTarget(SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.constraints.structure.ConceptConstraints", false, false), "concept", false);
    }
    return null;
  }

}
