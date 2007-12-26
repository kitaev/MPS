package jetbrains.mps.bootstrap.actionsLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ConceptFunctionParameter_currentTargetNode_InferenceRule implements InferenceRule_Runtime {

  public  typeof_ConceptFunctionParameter_currentTargetNode_InferenceRule() {
  }

  public void applyRule(final SNode node) {
    SNode builder = SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder", false, false);
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_2().createNode(SLinkOperations.getTarget(builder, "applicableConcept", false)), node, "jetbrains.mps.bootstrap.actionsLanguage.helgins", "1180046146718");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_currentTargetNode";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
