package jetbrains.mps.lang.dataFlow.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AfterPosition extends RelativePosition {
  public static final String concept = "jetbrains.mps.lang.dataFlow.structure.AfterPosition";

  public AfterPosition(SNode node) {
    super(node);
  }

  public static AfterPosition newInstance(SModel sm, boolean init) {
    return (AfterPosition)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.dataFlow.structure.AfterPosition", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AfterPosition newInstance(SModel sm) {
    return AfterPosition.newInstance(sm, false);
  }

}
