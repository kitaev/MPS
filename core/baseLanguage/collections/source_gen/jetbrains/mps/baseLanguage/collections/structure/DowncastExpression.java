package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DowncastExpression extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.DowncastExpression";
  public static final String EXPRESSION = "expression";

  public DowncastExpression(SNode node) {
    super(node);
  }

  public Expression getExpression() {
    return (Expression)this.getChild(DowncastExpression.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(DowncastExpression.EXPRESSION, node);
  }


  public static DowncastExpression newInstance(SModel sm, boolean init) {
    return (DowncastExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.DowncastExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DowncastExpression newInstance(SModel sm) {
    return DowncastExpression.newInstance(sm, false);
  }

}
