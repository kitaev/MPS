package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.baseLanguage.behavior.BaseMethodDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.typesystem.DataFlowUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_BaseMethodDeclaration_UnreachableStatements_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_BaseMethodDeclaration_UnreachableStatements_NonTypesystemRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    if (!(BaseMethodDeclaration_Behavior.call_isDataFlowChecked_1227714048980(nodeToCheck))) {
      return;
    }
    if ((SLinkOperations.getTarget(nodeToCheck, "body", true) != null)) {
      DataFlowUtil.checkDataFlow(typeCheckingContext, SLinkOperations.getTarget(nodeToCheck, "body", true));
    }
    SNode parent = SNodeOperations.getAncestor(nodeToCheck, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    if (!(SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.Interface"))) {
      if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(nodeToCheck, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType")) && !(BaseMethodDeclaration_Behavior.call_isReturnsVoid_1234359555698(nodeToCheck)) && (SLinkOperations.getTarget(nodeToCheck, "body", true) != null)) {
        if (!(BaseMethodDeclaration_Behavior.call_isAbstract_1232982539764(nodeToCheck))) {
          DataFlowUtil.checkReturns(typeCheckingContext, SLinkOperations.getTarget(nodeToCheck, "body", true));
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
