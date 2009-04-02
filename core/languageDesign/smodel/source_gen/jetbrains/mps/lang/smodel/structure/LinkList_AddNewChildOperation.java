package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.structure.SNodeOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LinkList_AddNewChildOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.LinkList_AddNewChildOperation";
  public static final String CONCEPT = "concept";

  public LinkList_AddNewChildOperation(SNode node) {
    super(node);
  }

  public ConceptDeclaration getConcept() {
    return (ConceptDeclaration)this.getReferent(ConceptDeclaration.class, LinkList_AddNewChildOperation.CONCEPT);
  }

  public void setConcept(ConceptDeclaration node) {
    super.setReferent(LinkList_AddNewChildOperation.CONCEPT, node);
  }


  public static LinkList_AddNewChildOperation newInstance(SModel sm, boolean init) {
    return (LinkList_AddNewChildOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.LinkList_AddNewChildOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LinkList_AddNewChildOperation newInstance(SModel sm) {
    return LinkList_AddNewChildOperation.newInstance(sm, false);
  }

}
