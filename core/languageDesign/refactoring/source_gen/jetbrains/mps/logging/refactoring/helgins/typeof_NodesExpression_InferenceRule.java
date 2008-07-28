package jetbrains.mps.logging.refactoring.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;

public class typeof_NodesExpression_InferenceRule implements InferenceRule_Runtime {

  public typeof_NodesExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    {
      SNode _nodeToCheck_1029348928467 = nodeToCheck;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "jetbrains.mps.logging.refactoring.helgins", "1214999943606", true), new QuotationClass_18().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.logging.refactoring.helgins", "1214999948266", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.logging.refactoring.structure.NodesExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
