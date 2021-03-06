package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_ReplaceWithAnotherOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Node_ReplaceWithAnotherOperation";
  public static final String REPLACEMENT_NODE = "replacementNode";

  public Node_ReplaceWithAnotherOperation(SNode node) {
    super(node);
  }

  public Expression getReplacementNode() {
    return (Expression) this.getChild(Expression.class, Node_ReplaceWithAnotherOperation.REPLACEMENT_NODE);
  }

  public void setReplacementNode(Expression node) {
    super.setChild(Node_ReplaceWithAnotherOperation.REPLACEMENT_NODE, node);
  }

  public static Node_ReplaceWithAnotherOperation newInstance(SModel sm, boolean init) {
    return (Node_ReplaceWithAnotherOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_ReplaceWithAnotherOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_ReplaceWithAnotherOperation newInstance(SModel sm) {
    return Node_ReplaceWithAnotherOperation.newInstance(sm, false);
  }
}
