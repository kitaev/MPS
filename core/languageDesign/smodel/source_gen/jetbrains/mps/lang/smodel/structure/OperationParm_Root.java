package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OperationParm_Root extends AbstractOperationParameter {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.OperationParm_Root";

  public OperationParm_Root(SNode node) {
    super(node);
  }

  public static OperationParm_Root newInstance(SModel sm, boolean init) {
    return (OperationParm_Root)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.OperationParm_Root", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OperationParm_Root newInstance(SModel sm) {
    return OperationParm_Root.newInstance(sm, false);
  }
}
