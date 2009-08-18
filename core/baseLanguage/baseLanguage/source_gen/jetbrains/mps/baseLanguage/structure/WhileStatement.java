package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class WhileStatement extends AbstractLoopStatement {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.WhileStatement";
  public static final String CONDITION = "condition";

  public WhileStatement(SNode node) {
    super(node);
  }


  public Expression getCondition() {
    return (Expression)this.getChild(Expression.class, WhileStatement.CONDITION);
  }

  public void setCondition(Expression node) {
    super.setChild(WhileStatement.CONDITION, node);
  }


  public static WhileStatement newInstance(SModel sm, boolean init) {
    return (WhileStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.WhileStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static WhileStatement newInstance(SModel sm) {
    return WhileStatement.newInstance(sm, false);
  }
}
