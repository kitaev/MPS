package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_GetModelOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Node_GetModelOperation";

  public Node_GetModelOperation(SNode node) {
    super(node);
  }

  public static Node_GetModelOperation newInstance(SModel sm, boolean init) {
    return (Node_GetModelOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_GetModelOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_GetModelOperation newInstance(SModel sm) {
    return Node_GetModelOperation.newInstance(sm, false);
  }
}
