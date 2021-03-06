package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodeProperty extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.test.structure.NodeProperty";

  public NodeProperty(SNode node) {
    super(node);
  }

  public static NodeProperty newInstance(SModel sm, boolean init) {
    return (NodeProperty) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.test.structure.NodeProperty", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeProperty newInstance(SModel sm) {
    return NodeProperty.newInstance(sm, false);
  }
}
