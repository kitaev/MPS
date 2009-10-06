package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PipeConditionalExpression extends UnaryConditionalExpression {
  public static final String concept = "jetbrains.mps.bash.structure.PipeConditionalExpression";

  public PipeConditionalExpression(SNode node) {
    super(node);
  }

  public static PipeConditionalExpression newInstance(SModel sm, boolean init) {
    return (PipeConditionalExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.PipeConditionalExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PipeConditionalExpression newInstance(SModel sm) {
    return PipeConditionalExpression.newInstance(sm, false);
  }
}
