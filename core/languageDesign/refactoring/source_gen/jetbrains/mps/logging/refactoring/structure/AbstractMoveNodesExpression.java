package jetbrains.mps.logging.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractMoveNodesExpression extends AbstractMoveExpression {
  public static final String concept = "jetbrains.mps.logging.refactoring.structure.AbstractMoveNodesExpression";

  public AbstractMoveNodesExpression(SNode node) {
    super(node);
  }

  public static AbstractMoveNodesExpression newInstance(SModel sm, boolean init) {
    return (AbstractMoveNodesExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.logging.refactoring.structure.AbstractMoveNodesExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractMoveNodesExpression newInstance(SModel sm) {
    return AbstractMoveNodesExpression.newInstance(sm, false);
  }

}
