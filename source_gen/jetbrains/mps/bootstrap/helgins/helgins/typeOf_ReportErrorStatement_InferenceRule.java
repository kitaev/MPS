package jetbrains.mps.bootstrap.helgins.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_ReportErrorStatement_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_ReportErrorStatement_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "errorString", true), "jetbrains.mps.bootstrap.helgins.helgins", "1185805422170", true), new QuotationClass_12().createNode(), SLinkOperations.getTarget(argument, "errorString", true), null, "jetbrains.mps.bootstrap.helgins.helgins", "1185805429689");
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "nodeToReport", true), "jetbrains.mps.bootstrap.helgins.helgins", "1185805452077", true), new QuotationClass_13().createNode(), SLinkOperations.getTarget(argument, "nodeToReport", true), null, "jetbrains.mps.bootstrap.helgins.helgins", "1185805461349");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.helgins.structure.ReportErrorStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
