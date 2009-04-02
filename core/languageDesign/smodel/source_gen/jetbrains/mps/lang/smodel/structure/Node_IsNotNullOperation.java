package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.structure.SNodeOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_IsNotNullOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation";

  public Node_IsNotNullOperation(SNode node) {
    super(node);
  }

  public static Node_IsNotNullOperation newInstance(SModel sm, boolean init) {
    return (Node_IsNotNullOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_IsNotNullOperation newInstance(SModel sm) {
    return Node_IsNotNullOperation.newInstance(sm, false);
  }

}
