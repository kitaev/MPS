package jetbrains.mps.lang.typesystem.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_TypeofExpression_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {

  public check_TypeofExpression_NonTypesystemRule() {
  }

  public void applyRule(final SNode typeOfExpression, final TypeCheckingContext typeCheckingContext) {
    if (!(RulesUtil.withinInferenceItem(typeOfExpression))) {
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.reportTypeError(typeOfExpression, "TYPEOF should be used only within inference rules", "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.helgins)", "1195217231011", intentionProvider);
    }
    if (!(!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(typeOfExpression, "term", true), "jetbrains.mps.lang.typesystem.structure.TypeVarReference")))) {
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.reportTypeError(typeOfExpression, "type of a type has little sense", "r:00000000-0000-4000-0000-011c895902b1(jetbrains.mps.lang.typesystem.helgins)", "1204815653385", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.typesystem.structure.TypeOfExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
