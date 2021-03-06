package jetbrains.mps.ui.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RemoveUIObjectStatement extends Statement {
  public static final String concept = "jetbrains.mps.ui.structure.RemoveUIObjectStatement";
  public static final String ARGUMENT = "argument";

  public RemoveUIObjectStatement(SNode node) {
    super(node);
  }

  public Expression getArgument() {
    return (Expression) this.getChild(Expression.class, RemoveUIObjectStatement.ARGUMENT);
  }

  public void setArgument(Expression node) {
    super.setChild(RemoveUIObjectStatement.ARGUMENT, node);
  }

  public static RemoveUIObjectStatement newInstance(SModel sm, boolean init) {
    return (RemoveUIObjectStatement) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.RemoveUIObjectStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RemoveUIObjectStatement newInstance(SModel sm) {
    return RemoveUIObjectStatement.newInstance(sm, false);
  }
}
