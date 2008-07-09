package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ValueParameter_InferenceRule implements InferenceRule_Runtime {

  public typeof_ValueParameter_InferenceRule() {
  }

  public void applyRule(final SNode valueParameter) {
    {
      SNode _nodeToCheck_1029348928467 = valueParameter;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1215619086599", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SNodeOperations.getAncestor(valueParameter, "jetbrains.mps.baseLanguage.structure.Property", false, false), "jetbrains.mps.baseLanguage.helgins@5_0", "1215619086593", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1215619086591");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ValueParameter";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
