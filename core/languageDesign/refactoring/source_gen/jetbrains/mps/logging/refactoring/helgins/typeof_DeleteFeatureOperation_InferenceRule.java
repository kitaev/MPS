package jetbrains.mps.logging.refactoring.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;

public class typeof_DeleteFeatureOperation_InferenceRule implements InferenceRule_Runtime {

  public typeof_DeleteFeatureOperation_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "feature", true), "jetbrains.mps.logging.refactoring.helgins", "1204723224494", true), new QuotationClass_14().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.logging.refactoring.helgins", "1204723224489", false, 0, intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.logging.refactoring.structure.DeleteFeatureOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
