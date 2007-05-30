package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.helgins.QuotationClass_47;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_InstanceOfExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_InstanceOfExpression_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().createComparableEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "leftExpression", true)), SLinkOperations.getTarget(argument, "classType", true), argument, null);
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(argument), new QuotationClass_47().createNode(), argument);
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.InstanceOfExpression";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
