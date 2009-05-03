package jetbrains.mps.lang.dataFlow.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EmitReadStatement extends BaseEmitVariableStatement {
  public static final String concept = "jetbrains.mps.lang.dataFlow.structure.EmitReadStatement";

  public EmitReadStatement(SNode node) {
    super(node);
  }

  public static EmitReadStatement newInstance(SModel sm, boolean init) {
    return (EmitReadStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.dataFlow.structure.EmitReadStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EmitReadStatement newInstance(SModel sm) {
    return EmitReadStatement.newInstance(sm, false);
  }

}
