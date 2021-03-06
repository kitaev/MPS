package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OptnameStringConditionalExpression extends UnaryConditionalExpression {
  public static final String concept = "jetbrains.mps.bash.structure.OptnameStringConditionalExpression";

  public OptnameStringConditionalExpression(SNode node) {
    super(node);
  }

  public static OptnameStringConditionalExpression newInstance(SModel sm, boolean init) {
    return (OptnameStringConditionalExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.OptnameStringConditionalExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OptnameStringConditionalExpression newInstance(SModel sm) {
    return OptnameStringConditionalExpression.newInstance(sm, false);
  }
}
