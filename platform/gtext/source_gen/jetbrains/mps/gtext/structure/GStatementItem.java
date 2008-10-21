package jetbrains.mps.gtext.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.StatementList;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GStatementItem extends GItem {
  public static final String concept = "jetbrains.mps.gtext.structure.GStatementItem";
  public static String STATEMENT_LIST = "statementList";

  public GStatementItem(SNode node) {
    super(node);
  }

  public StatementList getStatementList() {
    return (StatementList)this.getChild(GStatementItem.STATEMENT_LIST);
  }

  public void setStatementList(StatementList node) {
    super.setChild(GStatementItem.STATEMENT_LIST, node);
  }


  public static GStatementItem newInstance(SModel sm, boolean init) {
    return (GStatementItem)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.gtext.structure.GStatementItem", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GStatementItem newInstance(SModel sm) {
    return GStatementItem.newInstance(sm, false);
  }

}
