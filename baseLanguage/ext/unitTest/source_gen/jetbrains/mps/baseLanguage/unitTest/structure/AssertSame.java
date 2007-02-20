package jetbrains.mps.baseLanguage.unitTest.structure;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class AssertSame extends Statement {
  public static String EXPECTED = "expected";
  public static String ACTUAL = "actual";

  public  AssertSame(SNode node) {
    super(node);
  }

  public static AssertSame newInstance(SModel sm, boolean init) {
    return (AssertSame)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.unitTest.AssertSame", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static AssertSame newInstance(SModel sm) {
    return AssertSame.newInstance(sm, false);
  }

  public Expression getExpected() {
    return (Expression)this.getChild(AssertSame.EXPECTED);
  }
  public void setExpected(Expression node) {
    super.setChild(AssertSame.EXPECTED, node);
  }
  public Expression getActual() {
    return (Expression)this.getChild(AssertSame.ACTUAL);
  }
  public void setActual(Expression node) {
    super.setChild(AssertSame.ACTUAL, node);
  }
}
