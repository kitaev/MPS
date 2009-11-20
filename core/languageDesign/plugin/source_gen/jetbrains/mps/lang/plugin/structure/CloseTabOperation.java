package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CloseTabOperation extends TabbedToolOperation {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.CloseTabOperation";
  public static final String COMPONENT_EXPRESSION = "componentExpression";

  public CloseTabOperation(SNode node) {
    super(node);
  }

  public Expression getComponentExpression() {
    return (Expression)this.getChild(Expression.class, CloseTabOperation.COMPONENT_EXPRESSION);
  }

  public void setComponentExpression(Expression node) {
    super.setChild(CloseTabOperation.COMPONENT_EXPRESSION, node);
  }

  public static CloseTabOperation newInstance(SModel sm, boolean init) {
    return (CloseTabOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.CloseTabOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CloseTabOperation newInstance(SModel sm) {
    return CloseTabOperation.newInstance(sm, false);
  }
}
