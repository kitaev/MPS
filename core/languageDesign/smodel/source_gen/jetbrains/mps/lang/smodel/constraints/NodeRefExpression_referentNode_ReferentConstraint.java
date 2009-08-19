package jetbrains.mps.lang.smodel.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.SModelSearchUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class NodeRefExpression_referentNode_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public NodeRefExpression_referentNode_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.smodel.structure.NodeRefExpression", "referentNode", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.smodel.structure.NodeRefExpression", "referentNode");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    // roots only
    return SModelSearchUtil.createModelAndImportedModelsScope(SNodeOperations.getModel(_context.getReferenceNode()), true, operationContext.getScope());
  }
}
