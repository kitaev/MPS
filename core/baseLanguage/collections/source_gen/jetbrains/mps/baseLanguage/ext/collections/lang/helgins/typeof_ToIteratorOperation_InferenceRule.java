package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ToIteratorOperation_InferenceRule implements InferenceRule_Runtime {

  public typeof_ToIteratorOperation_InferenceRule() {
  }

  public void applyRule(final SNode toIteratorOperation) {
    SNode input = RulesFunctions_Collections.getInput(toIteratorOperation);
    final SNode elementType_typevar_1207236221835 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = input;
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins@34_0", "1215709903001", true), new QuotationClass_65().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(elementType_typevar_1207236221835)), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins@34_0", "1215709902998", false, 0);
    }
    {
      SNode _nodeToCheck_1029348928467 = toIteratorOperation;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins@34_0", "1215709903006", true), new QuotationClass_66().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(elementType_typevar_1207236221835)), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins@34_0", "1215709903003");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ToIteratorOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
