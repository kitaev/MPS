package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InstanceOfExpression extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.InstanceOfExpression";
  public static final String LEFT_EXPRESSION = "leftExpression";
  public static final String CLASS_TYPE = "classType";

  public InstanceOfExpression(SNode node) {
    super(node);
  }

  public Expression getLeftExpression() {
    return (Expression) this.getChild(Expression.class, InstanceOfExpression.LEFT_EXPRESSION);
  }

  public void setLeftExpression(Expression node) {
    super.setChild(InstanceOfExpression.LEFT_EXPRESSION, node);
  }

  public Type getClassType() {
    return (Type) this.getChild(Type.class, InstanceOfExpression.CLASS_TYPE);
  }

  public void setClassType(Type node) {
    super.setChild(InstanceOfExpression.CLASS_TYPE, node);
  }

  public static InstanceOfExpression newInstance(SModel sm, boolean init) {
    return (InstanceOfExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceOfExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InstanceOfExpression newInstance(SModel sm) {
    return InstanceOfExpression.newInstance(sm, false);
  }
}
