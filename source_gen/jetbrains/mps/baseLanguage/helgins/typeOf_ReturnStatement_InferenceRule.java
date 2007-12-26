package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_ReturnStatement_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_ReturnStatement_InferenceRule() {
  }

  public void applyRule(final SNode returnStatement) {
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(returnStatement, "jetbrains.mps.baseLanguage.helgins", "1176898207955", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(returnStatement, "expression", true), "jetbrains.mps.baseLanguage.helgins", "1176898215727", true), returnStatement, null, "jetbrains.mps.baseLanguage.helgins", "1176898213115");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ReturnStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
