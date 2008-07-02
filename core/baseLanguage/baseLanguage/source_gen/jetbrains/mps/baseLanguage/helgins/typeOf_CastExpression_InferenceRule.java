package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_CastExpression_InferenceRule implements InferenceRule_Runtime {

  public typeOf_CastExpression_InferenceRule() {
  }

  public void applyRule(final SNode castExpression) {
    if ((SLinkOperations.getTarget(castExpression, "type", true) != null)) {
      TypeChecker.getInstance().getRuntimeSupport().givetype(SLinkOperations.getTarget(castExpression, "type", true), castExpression, "jetbrains.mps.baseLanguage.helgins", "1178271952457");
      {
        SNode _nodeToCheck_1029348928467 = castExpression;
        TypeChecker.getInstance().getRuntimeSupport().createComparableEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(castExpression, "expression", true), "jetbrains.mps.baseLanguage.helgins", "1178271928128", true), SLinkOperations.getTarget(castExpression, "type", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins", "1178271928127");
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.CastExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
