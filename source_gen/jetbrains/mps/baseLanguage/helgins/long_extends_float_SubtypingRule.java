package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;

public class long_extends_float_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public  long_extends_float_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode type) {
    return new QuotationClass_55().createNode();
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.LongType";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean isSupertyping() {
    return false;
  }
  public boolean isWeak() {
    return false;
  }
}
