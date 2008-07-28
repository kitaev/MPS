package jetbrains.mps.logging.refactoring.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;

public class typeof_RequiredAdditionalArgument_InferenceRule implements InferenceRule_Runtime {

  public typeof_RequiredAdditionalArgument_InferenceRule() {
  }

  public void applyRule(final SNode requiredAdditionalArgument) {
    {
      SNode _nodeToCheck_1029348928467 = requiredAdditionalArgument;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(requiredAdditionalArgument, "jetbrains.mps.logging.refactoring.helgins", "1190728902837", true), SLinkOperations.getTarget(requiredAdditionalArgument, "argumentType", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.logging.refactoring.helgins", "1190728908074", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.logging.refactoring.structure.RequiredAdditionalArgument";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
