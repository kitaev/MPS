package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.SubtypingRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class supertypesOf_SConceptType_SNodeType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {

  public  supertypesOf_SConceptType_SNodeType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode conceptType) {
    SNode concept = SLinkOperations.getTarget(conceptType, "conceptDeclaraton", false);
    if(concept != null) {
      if(SNodeOperations.isInstanceOf(concept, "jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration")) {
        return new QuotationClass_33().createNode();
      }
      return new QuotationClass_34().createNode();
    }
    return new QuotationClass_35().createNode();
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

}
