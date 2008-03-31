package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.constraints.ConceptFunction_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.constraints.StatementList_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ConceptFunction_NonTypesystemRule implements NonTypesystemRule_Runtime {

  public  check_ConceptFunction_NonTypesystemRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    if (ConceptFunction_Behavior.call_getExpectedReturnType_1178571276073(nodeToCheck) != null && !(SNodeOperations.isInstanceOf(ConceptFunction_Behavior.call_getExpectedReturnType_1178571276073(nodeToCheck), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
      StatementList_Behavior.call_checkReturns_1206989696423(SLinkOperations.getTarget(nodeToCheck, "body", true));
    }
    StatementList_Behavior.call_checkDataFlow_1206985459773(SLinkOperations.getTarget(nodeToCheck, "body", true));
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ConceptFunction";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
