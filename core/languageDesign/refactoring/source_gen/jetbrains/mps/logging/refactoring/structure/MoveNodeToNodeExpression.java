package jetbrains.mps.logging.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class MoveNodeToNodeExpression extends AbstractMoveNodeExpression {
  public static final String concept = "jetbrains.mps.logging.refactoring.structure.MoveNodeToNodeExpression";
  public static String ROLE_IN_TARGET = "roleInTarget";

  public MoveNodeToNodeExpression(SNode node) {
    super(node);
  }

  public static MoveNodeToNodeExpression newInstance(SModel sm, boolean init) {
    return (MoveNodeToNodeExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.logging.refactoring.structure.MoveNodeToNodeExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MoveNodeToNodeExpression newInstance(SModel sm) {
    return MoveNodeToNodeExpression.newInstance(sm, false);
  }


  public Expression getRoleInTarget() {
    return (Expression)this.getChild(MoveNodeToNodeExpression.ROLE_IN_TARGET);
  }

  public void setRoleInTarget(Expression node) {
    super.setChild(MoveNodeToNodeExpression.ROLE_IN_TARGET, node);
  }

}
