package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BitwiseXorExpression extends BinaryArithmeticExpression {
  public static final String concept = "jetbrains.mps.bash.structure.BitwiseXorExpression";

  public BitwiseXorExpression(SNode node) {
    super(node);
  }

  public static BitwiseXorExpression newInstance(SModel sm, boolean init) {
    return (BitwiseXorExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.BitwiseXorExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BitwiseXorExpression newInstance(SModel sm) {
    return BitwiseXorExpression.newInstance(sm, false);
  }
}
