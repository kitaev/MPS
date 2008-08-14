package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_InsertNextSiblingOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNextSiblingOperation";
  public static String INSERTED_NODE = "insertedNode";

  public Node_InsertNextSiblingOperation(SNode node) {
    super(node);
  }

  public Expression getInsertedNode() {
    return (Expression)this.getChild(Node_InsertNextSiblingOperation.INSERTED_NODE);
  }

  public void setInsertedNode(Expression node) {
    super.setChild(Node_InsertNextSiblingOperation.INSERTED_NODE, node);
  }


  public static Node_InsertNextSiblingOperation newInstance(SModel sm, boolean init) {
    return (Node_InsertNextSiblingOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNextSiblingOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_InsertNextSiblingOperation newInstance(SModel sm) {
    return Node_InsertNextSiblingOperation.newInstance(sm, false);
  }

}
