package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SymlinkConditionalExpression extends UnaryConditionalExpression {
  public static final String concept = "jetbrains.mps.bash.structure.SymlinkConditionalExpression";

  public SymlinkConditionalExpression(SNode node) {
    super(node);
  }

  public static SymlinkConditionalExpression newInstance(SModel sm, boolean init) {
    return (SymlinkConditionalExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.SymlinkConditionalExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SymlinkConditionalExpression newInstance(SModel sm) {
    return SymlinkConditionalExpression.newInstance(sm, false);
  }
}
