package jetbrains.mps.bootstrap.helgins.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_TypeVarDeclaration_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_TypeVarDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(argument, "jetbrains.mps.bootstrap.helgins.helgins", "1185878023858"), new QuotationClass_15().createNode(), argument, null, "jetbrains.mps.bootstrap.helgins.helgins", "1185878029189");
    TypeChecker.getInstance().getRuntimeSupport().addEffect(TypeChecker.getInstance().getRuntimeSupport().typeOf(argument, "jetbrains.mps.bootstrap.helgins.helgins", "1186407321485"), RulesUtil.MAY_BE_VARIABLE);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.helgins.structure.TypeVarDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
