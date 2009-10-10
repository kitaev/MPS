package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.smodel.SModelUtil_new;

public class supertypesOf_DequeType_DequeType_withWildcard_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public supertypesOf_DequeType_DequeType_withWildcard_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode dequeType, TypeCheckingContext typeCheckingContext) {
    return new _Quotations.QuotationClass_181().createNode(typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.DequeType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

  public boolean surelyKeepsConcept() {
    return true;
  }
}
