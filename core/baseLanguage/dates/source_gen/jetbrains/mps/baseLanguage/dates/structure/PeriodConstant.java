package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeProperty;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PeriodConstant extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.PeriodConstant";
  public static final String DATE_TIME_PROPERTY = "dateTimeProperty";
  public static final String COUNT = "count";

  public PeriodConstant(SNode node) {
    super(node);
  }

  public DateTimeProperty getDateTimeProperty() {
    return (DateTimeProperty)this.getReferent(DateTimeProperty.class, PeriodConstant.DATE_TIME_PROPERTY);
  }

  public void setDateTimeProperty(DateTimeProperty node) {
    super.setReferent(PeriodConstant.DATE_TIME_PROPERTY, node);
  }

  public Expression getCount() {
    return (Expression)this.getChild(Expression.class, PeriodConstant.COUNT);
  }

  public void setCount(Expression node) {
    super.setChild(PeriodConstant.COUNT, node);
  }

  public static PeriodConstant newInstance(SModel sm, boolean init) {
    return (PeriodConstant)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.PeriodConstant", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PeriodConstant newInstance(SModel sm) {
    return PeriodConstant.newInstance(sm, false);
  }
}
