package jetbrains.mps.lang.dataFlow.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EmitJumpStatement extends BaseEmitJumpStatement {
  public static final String concept = "jetbrains.mps.lang.dataFlow.structure.EmitJumpStatement";

  public EmitJumpStatement(SNode node) {
    super(node);
  }

  public static EmitJumpStatement newInstance(SModel sm, boolean init) {
    return (EmitJumpStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.dataFlow.structure.EmitJumpStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EmitJumpStatement newInstance(SModel sm) {
    return EmitJumpStatement.newInstance(sm, false);
  }
}
