package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IsSubtypeExpression extends Expression {
  public static final String concept = "jetbrains.mps.bootstrap.helgins.structure.IsSubtypeExpression";
  public static String SUBTYPE_EXPRESSION = "subtypeExpression";
  public static String SUPERTYPE_EXPRESSION = "supertypeExpression";

  public  IsSubtypeExpression(SNode node) {
    super(node);
  }

  public static IsSubtypeExpression newInstance(SModel sm, boolean init) {
    return (IsSubtypeExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.structure.IsSubtypeExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IsSubtypeExpression newInstance(SModel sm) {
    return IsSubtypeExpression.newInstance(sm, false);
  }


  public Expression getSubtypeExpression() {
    return (Expression)this.getChild(IsSubtypeExpression.SUBTYPE_EXPRESSION);
  }

  public void setSubtypeExpression(Expression node) {
    super.setChild(IsSubtypeExpression.SUBTYPE_EXPRESSION, node);
  }

  public Expression getSupertypeExpression() {
    return (Expression)this.getChild(IsSubtypeExpression.SUPERTYPE_EXPRESSION);
  }

  public void setSupertypeExpression(Expression node) {
    super.setChild(IsSubtypeExpression.SUPERTYPE_EXPRESSION, node);
  }

}
