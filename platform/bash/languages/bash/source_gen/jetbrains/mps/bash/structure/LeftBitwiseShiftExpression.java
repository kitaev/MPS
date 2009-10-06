package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LeftBitwiseShiftExpression extends BinaryArithmeticExpression {
  public static final String concept = "jetbrains.mps.bash.structure.LeftBitwiseShiftExpression";

  public LeftBitwiseShiftExpression(SNode node) {
    super(node);
  }

  public static LeftBitwiseShiftExpression newInstance(SModel sm, boolean init) {
    return (LeftBitwiseShiftExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.LeftBitwiseShiftExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LeftBitwiseShiftExpression newInstance(SModel sm) {
    return LeftBitwiseShiftExpression.newInstance(sm, false);
  }
}
