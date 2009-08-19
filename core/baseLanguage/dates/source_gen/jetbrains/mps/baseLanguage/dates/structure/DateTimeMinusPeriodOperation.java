package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DateTimeMinusPeriodOperation extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.DateTimeMinusPeriodOperation";
  public static final String LEFT_VALUE = "leftValue";
  public static final String RIGHT_VALUE = "rightValue";

  public DateTimeMinusPeriodOperation(SNode node) {
    super(node);
  }

  public Expression getLeftValue() {
    return (Expression)this.getChild(Expression.class, DateTimeMinusPeriodOperation.LEFT_VALUE);
  }

  public void setLeftValue(Expression node) {
    super.setChild(DateTimeMinusPeriodOperation.LEFT_VALUE, node);
  }

  public Expression getRightValue() {
    return (Expression)this.getChild(Expression.class, DateTimeMinusPeriodOperation.RIGHT_VALUE);
  }

  public void setRightValue(Expression node) {
    super.setChild(DateTimeMinusPeriodOperation.RIGHT_VALUE, node);
  }

  public static DateTimeMinusPeriodOperation newInstance(SModel sm, boolean init) {
    return (DateTimeMinusPeriodOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeMinusPeriodOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DateTimeMinusPeriodOperation newInstance(SModel sm) {
    return DateTimeMinusPeriodOperation.newInstance(sm, false);
  }
}
