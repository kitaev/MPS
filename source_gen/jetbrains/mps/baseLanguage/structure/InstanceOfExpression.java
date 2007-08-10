package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InstanceOfExpression extends Expression {
  public static String LEFT_EXPRESSION = "leftExpression";
  public static String CLASS_TYPE = "classType";

  public  InstanceOfExpression(SNode node) {
    super(node);
  }

  public static InstanceOfExpression newInstance(SModel sm, boolean init) {
    return (InstanceOfExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceOfExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InstanceOfExpression newInstance(SModel sm) {
    return InstanceOfExpression.newInstance(sm, false);
  }


  public Expression getLeftExpression() {
    return (Expression)this.getChild(InstanceOfExpression.LEFT_EXPRESSION);
  }

  public void setLeftExpression(Expression node) {
    super.setChild(InstanceOfExpression.LEFT_EXPRESSION, node);
  }

  public ClassifierType getClassType() {
    return (ClassifierType)this.getChild(InstanceOfExpression.CLASS_TYPE);
  }

  public void setClassType(ClassifierType node) {
    super.setChild(InstanceOfExpression.CLASS_TYPE, node);
  }

}
