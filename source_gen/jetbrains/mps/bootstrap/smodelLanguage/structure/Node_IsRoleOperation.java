package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration;

public class Node_IsRoleOperation extends SNodeOperation {
  public static String CONCEPT_OF_PARENT = "conceptOfParent";
  public static String LINK_IN_PARENT = "linkInParent";

  public  Node_IsRoleOperation(SNode node) {
    super(node);
  }

  public static Node_IsRoleOperation newInstance(SModel sm, boolean init) {
    return (Node_IsRoleOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.Node_IsRoleOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static Node_IsRoleOperation newInstance(SModel sm) {
    return Node_IsRoleOperation.newInstance(sm, false);
  }

  public AbstractConceptDeclaration getConceptOfParent() {
    return (AbstractConceptDeclaration)this.getReferent(Node_IsRoleOperation.CONCEPT_OF_PARENT);
  }
  public void setConceptOfParent(AbstractConceptDeclaration node) {
    super.setReferent(Node_IsRoleOperation.CONCEPT_OF_PARENT, node);
  }
  public LinkDeclaration getLinkInParent() {
    return (LinkDeclaration)this.getReferent(Node_IsRoleOperation.LINK_IN_PARENT);
  }
  public void setLinkInParent(LinkDeclaration node) {
    super.setReferent(Node_IsRoleOperation.LINK_IN_PARENT, node);
  }
}
