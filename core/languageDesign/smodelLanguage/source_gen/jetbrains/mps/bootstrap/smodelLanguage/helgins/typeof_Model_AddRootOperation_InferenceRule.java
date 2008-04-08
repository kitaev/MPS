package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Model_AddRootOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_Model_AddRootOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(op, "nodeArgument", true), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206484129815", true), new QuotationClass_81().createNode(), SLinkOperations.getTarget(op, "nodeArgument", true), null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206484150884", false);
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206484335084", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(op, "nodeArgument", true), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206484354108", true), op, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206484350009");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Model_AddRootOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
