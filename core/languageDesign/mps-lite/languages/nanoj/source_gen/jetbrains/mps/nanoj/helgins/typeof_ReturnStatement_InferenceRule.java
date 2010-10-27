package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ReturnStatement_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ReturnStatement_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    SNode method = SNodeOperations.getAncestor(nodeToCheck, "jetbrains.mps.nanoj.structure.BaseMethod", false, false);
    if (method != null) {
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        BaseQuickFixProvider intentionProvider = null;
        typeCheckingContext.createLessThanInequationStrong(typeCheckingContext.typeOf(SLinkOperations.getTarget(nodeToCheck, "expression", true), "r:00000000-0000-4000-0000-011c895905de(jetbrains.mps.nanoj.helgins)", "1197638406361", true), SLinkOperations.getTarget(method, "type", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895905de(jetbrains.mps.nanoj.helgins)", "1197638406359", false, 0, intentionProvider);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.ReturnStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
