package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SkipOperation_InferenceRule implements InferenceRule_Runtime {

  public typeof_SkipOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(op, "elementsToSkip", true);
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins@34_0", "1215709899118", true), new QuotationClass_6().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins@34_0", "1215709899115", false, 0);
    }
    RulesFunctions_Collections.setInputSequenceType(op, op);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SkipOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
