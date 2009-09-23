package jetbrains.mps.lang.refactoring.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class RefactoringParameterReference_refactoringParameter_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public RefactoringParameterReference_refactoringParameter_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.refactoring.structure.RefactoringParameterReference", "refactoringParameter", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.refactoring.structure.RefactoringParameterReference", "refactoringParameter");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return SLinkOperations.getTargets(SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.refactoring.structure.Refactoring", false, false), "parameter", true);
  }
}
