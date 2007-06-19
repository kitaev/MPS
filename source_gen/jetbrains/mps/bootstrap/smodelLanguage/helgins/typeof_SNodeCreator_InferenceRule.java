package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SNodeCreator_InferenceRule implements InferenceRule_Runtime {

  public  typeof_SNodeCreator_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    SNode createdType = SLinkOperations.getTarget(argument, "createdType", true);
    if(createdType != null) {
      if(SLinkOperations.getTarget(createdType, "concept", false) == null) {
        TypeChecker.getInstance().reportTypeError(createdType, "concrete node type is expected");
        return;
      }
      if(SLinkOperations.getTarget(argument, "prototypeNode", true) != null) {
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().checkedTypeOf(SLinkOperations.getTarget(argument, "prototypeNode", true)), new QuotationClass_67().createNode(), SLinkOperations.getTarget(argument, "prototypeNode", true), null);
      }
      TypeChecker.getInstance().getRuntimeSupport().givetype(createdType, argument);
    }
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
