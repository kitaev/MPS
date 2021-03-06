package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RightShiftAssingmentExpression extends BaseAssingmentExpression {
  public static final String concept = "jetbrains.mps.bash.structure.RightShiftAssingmentExpression";

  public RightShiftAssingmentExpression(SNode node) {
    super(node);
  }

  public static RightShiftAssingmentExpression newInstance(SModel sm, boolean init) {
    return (RightShiftAssingmentExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.RightShiftAssingmentExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RightShiftAssingmentExpression newInstance(SModel sm) {
    return RightShiftAssingmentExpression.newInstance(sm, false);
  }
}
