package jetbrains.mps.bash.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bash.behavior.ExternalCommandCall_Behavior;

public class OptionWithParamReference_optionWithParam_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public OptionWithParamReference_optionWithParam_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.bash.structure.OptionWithParamReference", "optionWithParam", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.bash.structure.OptionWithParamReference", "optionWithParam");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    SNode call = SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.bash.structure.ExternalCommandCall");
    return ExternalCommandCall_Behavior.call_getUnusedOptionsWithParam_3263637656468078237(call);
  }
}
