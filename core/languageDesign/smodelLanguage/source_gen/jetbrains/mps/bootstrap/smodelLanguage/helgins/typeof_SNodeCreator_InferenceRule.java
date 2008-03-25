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

  public void applyRule(final SNode creator) {
    SNode createdType = SLinkOperations.getTarget(creator, "createdType", true);
    if (createdType != null) {
      if (SLinkOperations.getTarget(createdType, "concept", false) == null) {
        TypeChecker.getInstance().reportTypeError(createdType, "concrete node type is expected", "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1181944909006");
        return;
      }
      if (SLinkOperations.getTarget(creator, "prototypeNode", true) != null) {
        TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(creator, "prototypeNode", true), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186061742845", true), new QuotationClass_59().createNode(), SLinkOperations.getTarget(creator, "prototypeNode", true), null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1181945011354", false);
      }
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(creator, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712073963", true), createdType, creator, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712073961");
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
