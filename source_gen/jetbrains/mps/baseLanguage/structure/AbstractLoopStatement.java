package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractLoopStatement extends Statement {
  public static String BODY = "body";

  public  AbstractLoopStatement(SNode node) {
    super(node);
  }

  public static AbstractLoopStatement newInstance(SModel sm, boolean init) {
    return (AbstractLoopStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.AbstractLoopStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static AbstractLoopStatement newInstance(SModel sm) {
    return AbstractLoopStatement.newInstance(sm, false);
  }

  public StatementList getBody() {
    return (StatementList)this.getChild(AbstractLoopStatement.BODY);
  }
  public void setBody(StatementList node) {
    super.setChild(AbstractLoopStatement.BODY, node);
  }
}
