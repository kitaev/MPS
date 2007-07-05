package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ReverseOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_ReverseOperation_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    SNode inputElementType = RulesFunctions_Collections.get_inputListType_elementType(argument);
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_22().createNode(inputElementType), argument);
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ReverseOperation";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
