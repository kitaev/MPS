package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TypeOfExpression extends Expression {
  public static final String concept = "jetbrains.mps.bootstrap.helgins.structure.TypeOfExpression";
  public static String TERM = "term";

  public  TypeOfExpression(SNode node) {
    super(node);
  }

  public static TypeOfExpression newInstance(SModel sm, boolean init) {
    return (TypeOfExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.structure.TypeOfExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TypeOfExpression newInstance(SModel sm) {
    return TypeOfExpression.newInstance(sm, false);
  }


  public Expression getTerm() {
    return (Expression)this.getChild(TypeOfExpression.TERM);
  }

  public void setTerm(Expression node) {
    super.setChild(TypeOfExpression.TERM, node);
  }

}
