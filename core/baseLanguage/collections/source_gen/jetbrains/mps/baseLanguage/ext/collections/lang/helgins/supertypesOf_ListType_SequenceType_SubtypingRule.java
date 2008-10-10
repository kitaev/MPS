package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class supertypesOf_ListType_SequenceType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public supertypesOf_ListType_SequenceType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode type) {
    return new QuotationClass_36().createNode(SLinkOperations.getTarget(type, "elementType", true));
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
