package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BitwiseOrExpression extends BinaryArithmeticExpression {
  public static final String concept = "jetbrains.mps.bash.structure.BitwiseOrExpression";

  public BitwiseOrExpression(SNode node) {
    super(node);
  }

  public static BitwiseOrExpression newInstance(SModel sm, boolean init) {
    return (BitwiseOrExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.BitwiseOrExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BitwiseOrExpression newInstance(SModel sm) {
    return BitwiseOrExpression.newInstance(sm, false);
  }
}
