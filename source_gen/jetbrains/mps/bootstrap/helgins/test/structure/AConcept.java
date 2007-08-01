package jetbrains.mps.bootstrap.helgins.test.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class AConcept extends BaseConcept {
  public static String EXPRESSION = "expression";

  public  AConcept(SNode node) {
    super(node);
  }

  public static AConcept newInstance(SModel sm, boolean init) {
    return (AConcept)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.test.AConcept", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AConcept newInstance(SModel sm) {
    return AConcept.newInstance(sm, false);
  }


  public Expression getExpression() {
    return (Expression)this.getChild(AConcept.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(AConcept.EXPRESSION, node);
  }

}
