package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_VariableDeclaration_InferenceRule implements InferenceRule_Runtime {

  public  typeof_VariableDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "jetbrains.mps.nanoj.helgins", "1197638406534", true), SLinkOperations.getTarget(nodeToCheck, "type", true), nodeToCheck, null, "jetbrains.mps.nanoj.helgins", "1197638406533");
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "initializer", true), "jetbrains.mps.nanoj.helgins", "1197638406541", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "jetbrains.mps.nanoj.helgins", "1197638406546", true), SLinkOperations.getTarget(nodeToCheck, "initializer", true), null, "jetbrains.mps.nanoj.helgins", "1197638406539", false);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.VariableDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
