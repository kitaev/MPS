package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ReturnStatement_InferenceRule implements InferenceRule_Runtime {

  public  typeof_ReturnStatement_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    SNode method = SNodeOperations.getAncestor(argument, "jetbrains.mps.nanoj.structure.BaseMethod", false, false);
    if(method != null) {
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "expression", true), "jetbrains.mps.nanoj.helgins", "1197391871120", true), SLinkOperations.getTarget(method, "type", true), SLinkOperations.getTarget(argument, "expression", true), null, "jetbrains.mps.nanoj.helgins", "1197391871118");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.ReturnStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
