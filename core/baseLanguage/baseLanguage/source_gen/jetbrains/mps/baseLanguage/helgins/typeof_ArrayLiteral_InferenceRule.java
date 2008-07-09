package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ArrayLiteral_InferenceRule implements InferenceRule_Runtime {

  public typeof_ArrayLiteral_InferenceRule() {
  }

  public void applyRule(final SNode arrayLiteral) {
    final SNode elementType_typevar_1188221443596 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    for(SNode item : SLinkOperations.getTargets(arrayLiteral, "item", true)) {
      {
        SNode _nodeToCheck_1029348928467 = item;
        TypeChecker.getInstance().getRuntimeSupport().createGreaterThanInequation(TypeChecker.getInstance().getEquationManager().getRepresentator(elementType_typevar_1188221443596), TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1215619085425", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1215619085422", false, 0);
      }
    }
    {
      SNode _nodeToCheck_1029348928467 = arrayLiteral;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins@5_0", "1215619085430", true), new QuotationClass_68().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(elementType_typevar_1188221443596)), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1215619085427");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ArrayLiteral";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
