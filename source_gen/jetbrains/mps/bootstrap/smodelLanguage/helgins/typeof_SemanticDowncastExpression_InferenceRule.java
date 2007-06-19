package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SemanticDowncastExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_SemanticDowncastExpression_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().check(SLinkOperations.getTarget(argument, "leftExpression", true));
    if((SLinkOperations.getTarget(argument, "leftExpression", true) != null)) {
      SNode leftType = TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "leftExpression", true));
      if(SNodeOperations.isInstanceOf(leftType, "jetbrains.mps.bootstrap.smodelLanguage.structure.SModelType")) {
        TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_22().createNode(), argument);
        return;
      }
      if(SNodeOperations.isInstanceOf(leftType, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType")) {
        TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_23().createNode(), argument);
        return;
      }
      if(SNodeOperations.isInstanceOf(leftType, "jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType")) {
        TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_24().createNode(), argument);
        return;
      }
      TypeChecker.getInstance().getRuntimeSupport().givetype(leftType, argument);
    }
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
