package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StaticInitializer extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.StaticInitializer";
  public static final String STATEMENT_LIST = "statementList";

  public StaticInitializer(SNode node) {
    super(node);
  }


  public StatementList getStatementList() {
    return (StatementList)this.getChild(StatementList.class, StaticInitializer.STATEMENT_LIST);
  }

  public void setStatementList(StatementList node) {
    super.setChild(StaticInitializer.STATEMENT_LIST, node);
  }


  public static StaticInitializer newInstance(SModel sm, boolean init) {
    return (StaticInitializer)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticInitializer", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StaticInitializer newInstance(SModel sm) {
    return StaticInitializer.newInstance(sm, false);
  }
}
