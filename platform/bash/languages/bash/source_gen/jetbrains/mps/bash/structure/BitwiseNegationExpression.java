package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BitwiseNegationExpression extends UnaryArithmeticExpression {
  public static final String concept = "jetbrains.mps.bash.structure.BitwiseNegationExpression";

  public BitwiseNegationExpression(SNode node) {
    super(node);
  }

  public static BitwiseNegationExpression newInstance(SModel sm, boolean init) {
    return (BitwiseNegationExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.BitwiseNegationExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BitwiseNegationExpression newInstance(SModel sm) {
    return BitwiseNegationExpression.newInstance(sm, false);
  }
}
