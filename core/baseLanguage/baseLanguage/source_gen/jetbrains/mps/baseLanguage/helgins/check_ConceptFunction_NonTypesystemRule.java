package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_ConceptFunction_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_ConceptFunction_NonTypesystemRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    if (SLinkOperations.getTarget(nodeToCheck, "body", true) != null) {
      if (ConceptFunction_Behavior.call_getExpectedReturnType_1213877374441(nodeToCheck) != null && !(SNodeOperations.isInstanceOf(ConceptFunction_Behavior.call_getExpectedReturnType_1213877374441(nodeToCheck), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
        DataFlowUtil.checkReturns(typeCheckingContext, SLinkOperations.getTarget(nodeToCheck, "body", true));
      }
      DataFlowUtil.checkDataFlow(typeCheckingContext, SLinkOperations.getTarget(nodeToCheck, "body", true));
    }
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
