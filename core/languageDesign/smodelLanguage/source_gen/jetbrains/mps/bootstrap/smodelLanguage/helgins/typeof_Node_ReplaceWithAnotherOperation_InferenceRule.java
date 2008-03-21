package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Node_ReplaceWithAnotherOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_Node_ReplaceWithAnotherOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    RulesUtil.checkAppliedCorrectly_generic(op);
    SNode parameter = SLinkOperations.getTarget(op, "parameter", true);
    if (!((parameter == null))) {
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(parameter, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186057036825", true), new QuotationClass_16().createNode(), parameter, "incompatible type: snode expected", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186057036823");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithAnotherOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
