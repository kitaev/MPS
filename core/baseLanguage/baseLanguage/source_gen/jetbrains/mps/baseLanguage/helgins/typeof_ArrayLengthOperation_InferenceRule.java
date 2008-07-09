package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ArrayLengthOperation_InferenceRule implements InferenceRule_Runtime {

  public typeof_ArrayLengthOperation_InferenceRule() {
  }

  public void applyRule(final SNode lengthOperation) {
    {
      SNode _nodeToCheck_1029348928467 = lengthOperation;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1215614096410", true), new QuotationClass_86().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1215614096407");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ArrayLengthOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
