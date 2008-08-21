package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class supertypesOf_SNodeListType_SNodeListType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public supertypesOf_SNodeListType_SNodeListType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode type) {
    List<SNode> supertypes = ListSequence.<SNode>fromArray();
    SNode elementConcept = SLinkOperations.getTarget(type, "elementConcept", false);
    if (elementConcept != null) {
      List<SNode> superConcepts = SConceptOperations.getDirectSuperConcepts(elementConcept, false);
      for(SNode superConcept : superConcepts) {
        ListSequence.fromList(supertypes).addElement(new QuotationClass_24().createNode(superConcept));
      }
      // ==========
      ListSequence.fromList(supertypes).addElement(new QuotationClass_25().createNode());
    }
    return supertypes;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
