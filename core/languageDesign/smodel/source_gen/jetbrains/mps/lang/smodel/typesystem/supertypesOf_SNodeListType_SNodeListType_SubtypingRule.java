package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class supertypesOf_SNodeListType_SNodeListType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public supertypesOf_SNodeListType_SNodeListType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode type, TypeCheckingContext typeCheckingContext) {
    List<SNode> supertypes = ListSequence.fromList(new ArrayList<SNode>());
    SNode elementConcept = SLinkOperations.getTarget(type, "elementConcept", false);
    if (elementConcept != null) {
      List<SNode> superConcepts = SConceptOperations.getDirectSuperConcepts(elementConcept, false);
      for(SNode superConcept : ListSequence.fromList(superConcepts)) {
        ListSequence.fromList(supertypes).addElement(new _Quotations.QuotationClass_24().createNode(superConcept, typeCheckingContext));
      }
      // ==========
      ListSequence.fromList(supertypes).addElement(new _Quotations.QuotationClass_25().createNode(typeCheckingContext));
    }
    return supertypes;
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
