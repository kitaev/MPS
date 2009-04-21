package jetbrains.mps.lang.smodel.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.behavior.SModelLanguageUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.behavior.SNodeOperation_Behavior;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;

public class SConceptPropertyAccess_conceptProperty_ReferentConstraint extends BaseNodeReferenceSearchScopeProvider implements IModelConstraints {

  public SConceptPropertyAccess_conceptProperty_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.lang.smodel.structure.SConceptPropertyAccess", "conceptProperty", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.lang.smodel.structure.SConceptPropertyAccess", "conceptProperty");
  }

  public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    // concept properties from hierarchy
    SNode operandConcept = SModelLanguageUtil.getConcept(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true));
    if ((operandConcept == null)) {
      SNode leftType = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true));
      if (SNodeOperations.isInstanceOf(leftType, "jetbrains.mps.lang.smodel.structure.SConceptType")) {
        operandConcept = SLinkOperations.getTarget(SNodeOperations.cast(leftType, "jetbrains.mps.lang.smodel.structure.SConceptType"), "conceptDeclaraton", false);
      } else
      {
        operandConcept = SNodeOperation_Behavior.getLeftNodeConcept_1213877508847(SNodeOperations.cast(_context.getEnclosingNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"));
      }
    }
    return AbstractConceptDeclaration_Behavior.call_getConceptPropertyDeclarations_1213877394562(operandConcept);
  }

}
