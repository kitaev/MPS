package jetbrains.mps.lang.generator.generationContext.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class GenerationContextOp_PropertyPatternRef_propertyPatternVar_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {
  public GenerationContextOp_PropertyPatternRef_propertyPatternVar_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_PropertyPatternRef", "propertyPatternVar", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_PropertyPatternRef", "propertyPatternVar");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    SNode rule = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.generator.structure.PatternReduction_MappingRule", false, false);
    if ((rule != null) && (SLinkOperations.getTarget(rule, "pattern", true) != null)) {
      ListSequence.fromList(result).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(SLinkOperations.getTarget(rule, "pattern", true), "jetbrains.mps.lang.pattern.structure.PropertyPatternVariableDeclaration", false, new String[]{})));
    }
    return result;
  }
}
