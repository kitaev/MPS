package jetbrains.mps.transformation.generationContext.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_GenerationContextOp_GetOutputByLabelAndInput_InferenceRule implements InferenceRule_Runtime {

  public typeof_GenerationContextOp_GetOutputByLabelAndInput_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "jetbrains.mps.transformation.generationContext.helgins", "1216860931352", true), new QuotationClass_2().createNode(SLinkOperations.getTarget(SLinkOperations.getTarget(op, "label", false), "targetConcept", false)), _nodeToCheck_1029348928467, null, "jetbrains.mps.transformation.generationContext.helgins", "1216860931341", intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(op, "inputNode", true), "jetbrains.mps.transformation.generationContext.helgins", "1216860931356", true), new QuotationClass_3().createNode(SLinkOperations.getTarget(SLinkOperations.getTarget(op, "label", false), "sourceConcept", false)), _nodeToCheck_1029348928467, null, "jetbrains.mps.transformation.generationContext.helgins", "1216860931354", false, 0, intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
