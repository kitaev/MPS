package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.helgins.QuotationClass_13;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_equalsExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_equalsExpression_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().createComparableEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "leftExpression", true)), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "rightExpression", true)), argument, null);
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_13().createNode(), argument);
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.EqualsExpression";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
