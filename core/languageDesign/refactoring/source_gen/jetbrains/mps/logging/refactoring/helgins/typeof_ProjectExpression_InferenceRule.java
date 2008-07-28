package jetbrains.mps.logging.refactoring.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;

public class typeof_ProjectExpression_InferenceRule implements InferenceRule_Runtime {

  public typeof_ProjectExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "jetbrains.mps.logging.refactoring.helgins", "1215084519803", true), new QuotationClass_22().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.logging.refactoring.helgins", "1215084525369", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.logging.refactoring.structure.ProjectExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
