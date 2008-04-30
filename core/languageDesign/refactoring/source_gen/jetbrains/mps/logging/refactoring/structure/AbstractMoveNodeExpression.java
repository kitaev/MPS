package jetbrains.mps.logging.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractMoveNodeExpression extends AbstractMoveExpression {
  public static final String concept = "jetbrains.mps.logging.refactoring.structure.AbstractMoveNodeExpression";

  public AbstractMoveNodeExpression(SNode node) {
    super(node);
  }

  public static AbstractMoveNodeExpression newInstance(SModel sm, boolean init) {
    return (AbstractMoveNodeExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.logging.refactoring.structure.AbstractMoveNodeExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractMoveNodeExpression newInstance(SModel sm) {
    return AbstractMoveNodeExpression.newInstance(sm, false);
  }

}
