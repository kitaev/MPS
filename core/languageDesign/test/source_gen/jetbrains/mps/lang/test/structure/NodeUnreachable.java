package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.lang.test.structure.NodeProperty;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodeUnreachable extends NodeProperty {
  public static final String concept = "jetbrains.mps.lang.test.structure.NodeUnreachable";

  public NodeUnreachable(SNode node) {
    super(node);
  }

  public static NodeUnreachable newInstance(SModel sm, boolean init) {
    return (NodeUnreachable)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.test.structure.NodeUnreachable", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeUnreachable newInstance(SModel sm) {
    return NodeUnreachable.newInstance(sm, false);
  }

}
