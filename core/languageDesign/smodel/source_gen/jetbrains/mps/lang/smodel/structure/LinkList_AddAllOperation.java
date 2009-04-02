package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.structure.SNodeOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LinkList_AddAllOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.LinkList_AddAllOperation";
  public static final String CHILD_NODES = "childNodes";

  public LinkList_AddAllOperation(SNode node) {
    super(node);
  }

  public Expression getChildNodes() {
    return (Expression)this.getChild(Expression.class, LinkList_AddAllOperation.CHILD_NODES);
  }

  public void setChildNodes(Expression node) {
    super.setChild(LinkList_AddAllOperation.CHILD_NODES, node);
  }


  public static LinkList_AddAllOperation newInstance(SModel sm, boolean init) {
    return (LinkList_AddAllOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.LinkList_AddAllOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LinkList_AddAllOperation newInstance(SModel sm) {
    return LinkList_AddAllOperation.newInstance(sm, false);
  }

}
