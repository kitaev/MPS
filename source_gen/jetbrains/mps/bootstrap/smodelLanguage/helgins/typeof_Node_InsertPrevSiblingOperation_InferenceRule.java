package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Node_InsertPrevSiblingOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_Node_InsertPrevSiblingOperation_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    RulesUtil.checkAppliedCorrectly_generic(argument);
    SNode parameter = SLinkOperations.getTarget(argument, "parameter", true);
    if(!((parameter == null))) {
      TypeChecker.getInstance().getRuntimeSupport().check(parameter);
      if(!(!((TypeChecker.getInstance().getRuntimeSupport().typeOf(parameter) == null)))) {
        TypeChecker.getInstance().reportTypeError(parameter, "no type");
      }
      if(!(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getRuntimeSupport().typeOf(parameter), new QuotationClass_16().createNode()))) {
        TypeChecker.getInstance().reportTypeError(parameter, "incompatible type: snode expected");
      }
    }
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertPrevSiblingOperation";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return true;
  }
}
