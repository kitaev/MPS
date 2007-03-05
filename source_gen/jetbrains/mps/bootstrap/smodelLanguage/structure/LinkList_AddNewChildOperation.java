package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;

public class LinkList_AddNewChildOperation extends SNodeOperation {
  public static String CONCEPT = "concept";

  public  LinkList_AddNewChildOperation(SNode node) {
    super(node);
  }

  public static LinkList_AddNewChildOperation newInstance(SModel sm, boolean init) {
    return (LinkList_AddNewChildOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.LinkList_AddNewChildOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static LinkList_AddNewChildOperation newInstance(SModel sm) {
    return LinkList_AddNewChildOperation.newInstance(sm, false);
  }

  public ConceptDeclaration getConcept() {
    return (ConceptDeclaration)this.getReferent(LinkList_AddNewChildOperation.CONCEPT);
  }
  public void setConcept(ConceptDeclaration node) {
    super.setReferent(LinkList_AddNewChildOperation.CONCEPT, node);
  }
}
