package jetbrains.mps.xmlQuery.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AccessArbitraryChildrenOperation extends XMLElementOperation {
  public static final String concept = "jetbrains.mps.xmlQuery.structure.AccessArbitraryChildrenOperation";
  public static final String CHILD_NAME_EXPRESSION = "childNameExpression";

  public AccessArbitraryChildrenOperation(SNode node) {
    super(node);
  }

  public Expression getChildNameExpression() {
    return (Expression) this.getChild(Expression.class, AccessArbitraryChildrenOperation.CHILD_NAME_EXPRESSION);
  }

  public void setChildNameExpression(Expression node) {
    super.setChild(AccessArbitraryChildrenOperation.CHILD_NAME_EXPRESSION, node);
  }

  public static AccessArbitraryChildrenOperation newInstance(SModel sm, boolean init) {
    return (AccessArbitraryChildrenOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlQuery.structure.AccessArbitraryChildrenOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AccessArbitraryChildrenOperation newInstance(SModel sm) {
    return AccessArbitraryChildrenOperation.newInstance(sm, false);
  }
}
