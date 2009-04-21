package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class supertypesOf_SNodeListType_ListType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public supertypesOf_SNodeListType_ListType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode type) {
    SNode elementConcept = SLinkOperations.getTarget(type, "elementConcept", false);
    return new _Quotations.QuotationClass_69().createNode(elementConcept);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.SNodeListType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
