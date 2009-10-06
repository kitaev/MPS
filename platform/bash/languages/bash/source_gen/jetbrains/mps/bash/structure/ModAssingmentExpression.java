package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ModAssingmentExpression extends BaseAssingmentExpression {
  public static final String concept = "jetbrains.mps.bash.structure.ModAssingmentExpression";

  public ModAssingmentExpression(SNode node) {
    super(node);
  }

  public static ModAssingmentExpression newInstance(SModel sm, boolean init) {
    return (ModAssingmentExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.ModAssingmentExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ModAssingmentExpression newInstance(SModel sm) {
    return ModAssingmentExpression.newInstance(sm, false);
  }
}
