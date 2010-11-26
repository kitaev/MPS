package jetbrains.mps.make.facet.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SNodePointer;

public class ForeignParametersExpression_target_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public ForeignParametersExpression_target_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.make.facet.structure.ForeignParametersExpression", "target", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.make.facet.structure.ForeignParametersExpression", "target");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    final SNode td = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.make.facet.structure.TargetDeclaration", false, false);
    return ListSequence.fromList(SLinkOperations.getTargets(td, "dependency", true)).<SNode>select(new ISelector<SNode, SNode>() {
      public SNode select(SNode d) {
        return SLinkOperations.getTarget(d, "dependsOn", false);
      }
    }).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode td) {
        return (td != null);
      }
    });
  }

  public SNodePointer getSearchScopeValidatorNodePointer() {
    return new SNodePointer("r:6df86908-c97f-4644-97f0-5eff375e8e15(jetbrains.mps.make.facet.constraints)", "3344436107830239604");
  }
}
