package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Node_InsertNewPrevSiblingOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_Node_InsertNewPrevSiblingOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    RulesUtil.checkAppliedCorrectly_generic(op);
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_14().createNode(SLinkOperations.getTarget(op, "concept", false)), op, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1178318841596");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNewPrevSiblingOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
