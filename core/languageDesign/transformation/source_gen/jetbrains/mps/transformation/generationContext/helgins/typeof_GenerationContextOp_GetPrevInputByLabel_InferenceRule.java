package jetbrains.mps.transformation.generationContext.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_GenerationContextOp_GetPrevInputByLabel_InferenceRule implements InferenceRule_Runtime {

  public typeof_GenerationContextOp_GetPrevInputByLabel_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "jetbrains.mps.transformation.generationContext.helgins", "1217882185571", true), new QuotationClass_4().createNode(SLinkOperations.getTarget(SLinkOperations.getTarget(op, "label", false), "sourceConcept", false)), _nodeToCheck_1029348928467, null, "jetbrains.mps.transformation.generationContext.helgins", "1217882185560", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetPrevInputByLabel";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
