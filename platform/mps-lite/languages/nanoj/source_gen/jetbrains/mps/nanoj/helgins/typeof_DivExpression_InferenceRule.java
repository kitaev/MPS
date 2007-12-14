package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_DivExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_DivExpression_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "leftPart", true), "jetbrains.mps.nanoj.helgins", "1197637188120", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(argument, "jetbrains.mps.nanoj.helgins", "1197637188125", true), SLinkOperations.getTarget(argument, "leftPart", true), null, "jetbrains.mps.nanoj.helgins", "1197637188118");
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "rightPart", true), "jetbrains.mps.nanoj.helgins", "1197637188129", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(argument, "jetbrains.mps.nanoj.helgins", "1197637188134", true), SLinkOperations.getTarget(argument, "rightPart", true), null, "jetbrains.mps.nanoj.helgins", "1197637188127");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.DivExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
