package jetbrains.mps.bootstrap.helgins.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_TypeCheckerAccess_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_TypeCheckerAccess_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_5().createNode(), argument, "jetbrains.mps.bootstrap.helgins.helgins", "1175595994022");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.helgins.structure.TypeCheckerAccessExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
