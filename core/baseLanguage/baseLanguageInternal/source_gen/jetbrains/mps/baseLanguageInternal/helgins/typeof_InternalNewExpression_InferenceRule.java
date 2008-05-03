package jetbrains.mps.baseLanguageInternal.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_InternalNewExpression_InferenceRule implements InferenceRule_Runtime {

  public typeof_InternalNewExpression_InferenceRule() {
  }

  public void applyRule(final SNode internalNewExpression) {
    SNode type;
    if ((SLinkOperations.getTarget(internalNewExpression, "type", true) != null)) {
      type = SLinkOperations.getTarget(internalNewExpression, "type", true);
    } else {
      type = new QuotationClass_().createNode();
    }
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(internalNewExpression, "jetbrains.mps.baseLanguageInternal.helgins", "1196525371898", true), type, internalNewExpression, null, "jetbrains.mps.baseLanguageInternal.helgins", "1196525371896");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguageInternal.structure.InternalNewExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
