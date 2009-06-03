package jetbrains.mps.lang.constraints.constraints;

/*Generated by MPS */

import jetbrains.mps.lang.constraints.behavior.NodeReferentConstraint_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;

public class NodeReferentConstraint_applicableLink_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {

  public NodeReferentConstraint_applicableLink_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.constraints.structure.NodeReferentConstraint", "applicableLink", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.constraints.structure.NodeReferentConstraint", "applicableLink");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    // links declared in specified concept
    SNode applicableConcept = NodeReferentConstraint_Behavior.call_getApplicableConcept_1213877399322(_context.getReferenceNode());
    if (applicableConcept == null) {
      SNode root = SNodeOperations.getContainingRoot(_context.getEnclosingNode());
      if (SNodeOperations.isInstanceOf(root, "jetbrains.mps.lang.constraints.structure.ConceptConstraints")) {
        applicableConcept = SLinkOperations.getTarget(SNodeOperations.cast(root, "jetbrains.mps.lang.constraints.structure.ConceptConstraints"), "concept", false);
      } else
      {
        applicableConcept = SLinkOperations.getTarget(SNodeOperations.cast(root, "jetbrains.mps.lang.behavior.structure.ConceptBehavior"), "concept", false);
      }
    }
    return AbstractConceptDeclaration_Behavior.call_getReferenceLinkDeclarations_1213877394496(applicableConcept);
  }

}
