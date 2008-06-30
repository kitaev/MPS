package jetbrains.mps.logging.refactoring.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MoveNodesToNodeExpression_InferenceRule implements InferenceRule_Runtime {

  public typeof_MoveNodesToNodeExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "destination", true), "jetbrains.mps.logging.refactoring.helgins", "1199621033926", true), new QuotationClass_10().createNode(), SLinkOperations.getTarget(nodeToCheck, "destination", true), null, "jetbrains.mps.logging.refactoring.helgins", "1199621033921", false, 0);
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "roleInTarget", true), "jetbrains.mps.logging.refactoring.helgins", "1199621033935", true), new QuotationClass_11().createNode(), SLinkOperations.getTarget(nodeToCheck, "roleInTarget", true), null, "jetbrains.mps.logging.refactoring.helgins", "1199621033930", false, 0);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.logging.refactoring.structure.MoveNodesToNodeExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
