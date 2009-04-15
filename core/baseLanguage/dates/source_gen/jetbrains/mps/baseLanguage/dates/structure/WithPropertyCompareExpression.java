package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeProperty;
import jetbrains.mps.baseLanguage.structure.BinaryCompareOperation;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class WithPropertyCompareExpression extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.WithPropertyCompareExpression";
  public static final String CLNK_DefaultDatetimeProperty = "defaultDatetimeProperty";
  public static final String DATETIME_PROPERTY = "datetimeProperty";
  public static final String OPERATION = "operation";

  public WithPropertyCompareExpression(SNode node) {
    super(node);
  }

  public DateTimeProperty getDatetimeProperty() {
    return (DateTimeProperty)this.getReferent(DateTimeProperty.class, WithPropertyCompareExpression.DATETIME_PROPERTY);
  }

  public void setDatetimeProperty(DateTimeProperty node) {
    super.setReferent(WithPropertyCompareExpression.DATETIME_PROPERTY, node);
  }

  public BinaryCompareOperation getOperation() {
    return (BinaryCompareOperation)this.getChild(BinaryCompareOperation.class, WithPropertyCompareExpression.OPERATION);
  }

  public void setOperation(BinaryCompareOperation node) {
    super.setChild(WithPropertyCompareExpression.OPERATION, node);
  }


  public static WithPropertyCompareExpression newInstance(SModel sm, boolean init) {
    return (WithPropertyCompareExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.WithPropertyCompareExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static WithPropertyCompareExpression newInstance(SModel sm) {
    return WithPropertyCompareExpression.newInstance(sm, false);
  }

}
