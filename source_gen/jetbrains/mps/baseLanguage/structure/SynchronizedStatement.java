package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SynchronizedStatement extends Statement {
  public static String EXPRESSION = "expression";
  public static String BLOCK = "block";

  public  SynchronizedStatement(SNode node) {
    super(node);
  }

  public static SynchronizedStatement newInstance(SModel sm, boolean init) {
    return (SynchronizedStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.SynchronizedStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SynchronizedStatement newInstance(SModel sm) {
    return SynchronizedStatement.newInstance(sm, false);
  }


  public Expression getExpression() {
    return (Expression)this.getChild(SynchronizedStatement.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(SynchronizedStatement.EXPRESSION, node);
  }

  public StatementList getBlock() {
    return (StatementList)this.getChild(SynchronizedStatement.BLOCK);
  }

  public void setBlock(StatementList node) {
    super.setChild(SynchronizedStatement.BLOCK, node);
  }

}
