package jetbrains.mps.lang.dataFlow.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.StatementList;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EmitTryFinallyStatement extends EmitStatement {
  public static final String concept = "jetbrains.mps.lang.dataFlow.structure.EmitTryFinallyStatement";
  public static final String TRY_PART = "tryPart";
  public static final String FINALLY_PART = "finallyPart";

  public EmitTryFinallyStatement(SNode node) {
    super(node);
  }

  public StatementList getTryPart() {
    return (StatementList)this.getChild(StatementList.class, EmitTryFinallyStatement.TRY_PART);
  }

  public void setTryPart(StatementList node) {
    super.setChild(EmitTryFinallyStatement.TRY_PART, node);
  }

  public StatementList getFinallyPart() {
    return (StatementList)this.getChild(StatementList.class, EmitTryFinallyStatement.FINALLY_PART);
  }

  public void setFinallyPart(StatementList node) {
    super.setChild(EmitTryFinallyStatement.FINALLY_PART, node);
  }


  public static EmitTryFinallyStatement newInstance(SModel sm, boolean init) {
    return (EmitTryFinallyStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.dataFlow.structure.EmitTryFinallyStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EmitTryFinallyStatement newInstance(SModel sm) {
    return EmitTryFinallyStatement.newInstance(sm, false);
  }

}
