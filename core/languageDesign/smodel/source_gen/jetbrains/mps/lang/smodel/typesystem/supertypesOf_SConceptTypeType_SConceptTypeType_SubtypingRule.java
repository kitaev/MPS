package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class supertypesOf_SConceptTypeType_SConceptTypeType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public supertypesOf_SConceptTypeType_SConceptTypeType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode type) {
    List<SNode> list = ListSequence.fromList(new ArrayList<SNode>());
    SNode concept = SLinkOperations.getTarget(type, "conceptDeclaraton", false);
    if (SNodeOperations.isInstanceOf(concept, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration")) {
      List<SNode> superConcepts = SConceptOperations.getDirectSuperConcepts(concept, false);
      for(SNode superConcept : ListSequence.fromList(superConcepts)) {
        ListSequence.fromList(list).addElement(new _Quotations.QuotationClass_71().createNode(superConcept));
      }
      ListSequence.fromList(list).addElement(new _Quotations.QuotationClass_72().createNode());
    }
    return list;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.SConceptType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
