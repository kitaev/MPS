package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PreDecExpression extends PreVariableExpression {
  public static final String concept = "jetbrains.mps.bash.structure.PreDecExpression";

  public PreDecExpression(SNode node) {
    super(node);
  }

  public static PreDecExpression newInstance(SModel sm, boolean init) {
    return (PreDecExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.PreDecExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PreDecExpression newInstance(SModel sm) {
    return PreDecExpression.newInstance(sm, false);
  }
}
