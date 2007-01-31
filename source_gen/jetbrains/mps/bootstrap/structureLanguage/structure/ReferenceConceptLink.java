package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.core.structure.BaseConcept;

public class ReferenceConceptLink extends ConceptLink {
  public static String TARGET = "target";

  public  ReferenceConceptLink(SNode node) {
    super(node);
  }

  public BaseConcept getTarget() {
    return (BaseConcept)this.getReferent(ReferenceConceptLink.TARGET);
  }
  public void setTarget(BaseConcept node) {
    super.setReferent(ReferenceConceptLink.TARGET, node);
  }
  public ReferenceConceptLinkDeclaration getReferenceConceptLinkDeclaration() {
    return (ReferenceConceptLinkDeclaration)this.getConceptLinkDeclaration();
  }
  public void setReferenceConceptLinkDeclaration(ReferenceConceptLinkDeclaration node) {
    this.setConceptLinkDeclaration(node);
  }
}
