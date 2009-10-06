package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LessThanOrEqualNumber extends BinaryConditionalExpression {
  public static final String concept = "jetbrains.mps.bash.structure.LessThanOrEqualNumber";

  public LessThanOrEqualNumber(SNode node) {
    super(node);
  }

  public static LessThanOrEqualNumber newInstance(SModel sm, boolean init) {
    return (LessThanOrEqualNumber)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.LessThanOrEqualNumber", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LessThanOrEqualNumber newInstance(SModel sm) {
    return LessThanOrEqualNumber.newInstance(sm, false);
  }
}
