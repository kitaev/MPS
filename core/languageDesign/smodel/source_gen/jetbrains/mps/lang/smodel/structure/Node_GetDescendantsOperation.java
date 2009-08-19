package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_GetDescendantsOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Node_GetDescendantsOperation";

  public Node_GetDescendantsOperation(SNode node) {
    super(node);
  }

  public static Node_GetDescendantsOperation newInstance(SModel sm, boolean init) {
    return (Node_GetDescendantsOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_GetDescendantsOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_GetDescendantsOperation newInstance(SModel sm) {
    return Node_GetDescendantsOperation.newInstance(sm, false);
  }
}
