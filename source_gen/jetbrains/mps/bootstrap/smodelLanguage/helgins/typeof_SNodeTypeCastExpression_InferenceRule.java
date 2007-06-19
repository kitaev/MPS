package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SNodeTypeCastExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_SNodeTypeCastExpression_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    SNode leftType = TypeChecker.getInstance().getRuntimeSupport().checkedTypeOf(SLinkOperations.getTarget(argument, "leftExpression", true));
    if(TypeChecker.getInstance().getSubtypingManager().isSubtype(leftType, new QuotationClass_1().createNode(), false, false)) {
      TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_().createNode(SLinkOperations.getTarget(argument, "concept", false)), argument);
    } else
    {
      TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_2().createNode(SLinkOperations.getTarget(argument, "concept", false)), argument);
    }
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
