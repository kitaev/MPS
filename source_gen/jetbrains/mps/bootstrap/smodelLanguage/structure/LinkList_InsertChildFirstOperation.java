package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class LinkList_InsertChildFirstOperation extends SNodeOperation {
  public static String PARAMETER = "parameter";

  public  LinkList_InsertChildFirstOperation(SNode node) {
    super(node);
  }

  public static LinkList_InsertChildFirstOperation newInstance(SModel sm, boolean init) {
    return (LinkList_InsertChildFirstOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.LinkList_InsertChildFirstOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static LinkList_InsertChildFirstOperation newInstance(SModel sm) {
    return LinkList_InsertChildFirstOperation.newInstance(sm, false);
  }

  public Expression getParameter() {
    return (Expression)this.getChild(LinkList_InsertChildFirstOperation.PARAMETER);
  }
  public void setParameter(Expression node) {
    super.setChild(LinkList_InsertChildFirstOperation.PARAMETER, node);
  }
}
