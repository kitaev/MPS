package jetbrains.mps.logging.refactoring.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_AbstractMoveNodeExpression_InferenceRule implements InferenceRule_Runtime {

  public typeof_AbstractMoveNodeExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "whatToMove", true), "jetbrains.mps.logging.refactoring.helgins", "1199620247218", true), new QuotationClass_4().createNode(), SLinkOperations.getTarget(nodeToCheck, "whatToMove", true), null, "jetbrains.mps.logging.refactoring.helgins", "1199620247213", false);
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "jetbrains.mps.logging.refactoring.helgins", "1199621080697", true), new QuotationClass_12().createNode(), nodeToCheck, null, "jetbrains.mps.logging.refactoring.helgins", "1199621083981");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.logging.refactoring.structure.AbstractMoveNodeExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
