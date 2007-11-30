package jetbrains.mps.bootstrap.helgins.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_TypeOfExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_TypeOfExpression_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "term", true), "jetbrains.mps.bootstrap.helgins.helgins", "1178192158210", true), new QuotationClass_6().createNode(), SLinkOperations.getTarget(argument, "term", true), null, "jetbrains.mps.bootstrap.helgins.helgins", "1178192184638");
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_7().createNode(), argument, "jetbrains.mps.bootstrap.helgins.helgins", "1176909555189");
    TypeChecker.getInstance().getRuntimeSupport().addEffect(TypeChecker.getInstance().getRuntimeSupport().typeOf(argument, "jetbrains.mps.bootstrap.helgins.helgins", "1186407253533", true), RulesUtil.MAY_BE_VARIABLE);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.helgins.structure.TypeOfExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
