package jetbrains.mps.lang.actions.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ConceptFunctionParameter_result_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ConceptFunctionParameter_result_InferenceRule() {
  }

  public void applyRule(final SNode result, final TypeCheckingContext typeCheckingContext) {
    SNode conceptOfResult = SLinkOperations.getTarget(SNodeOperations.getAncestor(result, "jetbrains.mps.lang.actions.structure.ConceptRightTransformPart", false, false), "concept", false);
    {
      SNode _nodeToCheck_1029348928467 = result;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(result, "r:00000000-0000-4000-0000-011c895902a6(jetbrains.mps.lang.actions.typesystem)", "1219184766217", true), (SNode)new _Quotations.QuotationClass_1().createNode(conceptOfResult, typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902a6(jetbrains.mps.lang.actions.typesystem)", "1219184766215", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_result";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
