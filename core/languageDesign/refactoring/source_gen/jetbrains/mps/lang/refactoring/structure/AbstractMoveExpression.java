package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractMoveExpression extends Expression implements RefactoringAction {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.AbstractMoveExpression";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String WHAT_TO_MOVE = "whatToMove";
  public static final String DESTINATION = "destination";

  public AbstractMoveExpression(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(AbstractMoveExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(AbstractMoveExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(AbstractMoveExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(AbstractMoveExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(AbstractMoveExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(AbstractMoveExpression.VIRTUAL_PACKAGE, value);
  }

  public Expression getWhatToMove() {
    return (Expression) this.getChild(Expression.class, AbstractMoveExpression.WHAT_TO_MOVE);
  }

  public void setWhatToMove(Expression node) {
    super.setChild(AbstractMoveExpression.WHAT_TO_MOVE, node);
  }

  public Expression getDestination() {
    return (Expression) this.getChild(Expression.class, AbstractMoveExpression.DESTINATION);
  }

  public void setDestination(Expression node) {
    super.setChild(AbstractMoveExpression.DESTINATION, node);
  }

  public static AbstractMoveExpression newInstance(SModel sm, boolean init) {
    return (AbstractMoveExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.AbstractMoveExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractMoveExpression newInstance(SModel sm) {
    return AbstractMoveExpression.newInstance(sm, false);
  }
}
