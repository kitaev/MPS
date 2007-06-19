package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class Node_InsertNextSiblingOperation extends SNodeOperation {
  public static String PARAMETER = "parameter";

  public  Node_InsertNextSiblingOperation(SNode node) {
    super(node);
  }

  public static Node_InsertNextSiblingOperation newInstance(SModel sm, boolean init) {
    return (Node_InsertNextSiblingOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.Node_InsertNextSiblingOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static Node_InsertNextSiblingOperation newInstance(SModel sm) {
    return Node_InsertNextSiblingOperation.newInstance(sm, false);
  }

  public Expression getParameter() {
    return (Expression)this.getChild(Node_InsertNextSiblingOperation.PARAMETER);
  }
  public void setParameter(Expression node) {
    super.setChild(Node_InsertNextSiblingOperation.PARAMETER, node);
  }
}
