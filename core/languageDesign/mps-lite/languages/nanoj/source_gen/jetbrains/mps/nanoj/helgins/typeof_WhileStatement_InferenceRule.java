package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_WhileStatement_InferenceRule implements InferenceRule_Runtime {

  public  typeof_WhileStatement_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "condition", true), "jetbrains.mps.nanoj.helgins", "1197638406334", true), SConceptOperations.createNewNode("jetbrains.mps.nanoj.structure.BooleanType", null), nodeToCheck, null, "jetbrains.mps.nanoj.helgins", "1197638406333");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.WhileStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
