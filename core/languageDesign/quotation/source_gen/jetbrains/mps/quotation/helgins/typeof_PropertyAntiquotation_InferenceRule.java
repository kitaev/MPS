package jetbrains.mps.quotation.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_PropertyAntiquotation_InferenceRule implements InferenceRule_Runtime {

  public typeof_PropertyAntiquotation_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "expression", true), "jetbrains.mps.quotation.helgins", "1196866830959", true), new QuotationClass_4().createNode(), SLinkOperations.getTarget(nodeToCheck, "expression", true), null, "jetbrains.mps.quotation.helgins", "1196866840326", false);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.quotation.structure.PropertyAntiquotation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
