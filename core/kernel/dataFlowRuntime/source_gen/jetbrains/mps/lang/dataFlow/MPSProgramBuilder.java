package jetbrains.mps.lang.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.framework.StructuralProgramBuilder;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;
import jetbrains.mps.lang.dataFlow.framework.instructions.EndTryInstruction;

public class MPSProgramBuilder extends StructuralProgramBuilder<SNode> {
  private DataFlowManager myDataFlowManager;
  private boolean myMayBeUnreachable = false;

  public MPSProgramBuilder(DataFlowManager dataFlowManager) {
    this.myDataFlowManager = dataFlowManager;
  }

  protected void doBuild(SNode node) {
    if (node == null) {
      return;
    }
    SNode snode = (SNode) node;
    List<SNode> conceptAndSuperConcepts = SModelUtil_new.getConceptAndSuperConcepts(snode.getConceptDeclarationNode());
    for (SNode concept : conceptAndSuperConcepts) {
      DataFlowBuilder builder = this.myDataFlowManager.getBuilderFor(NameUtil.nodeFQName(concept));
      if (builder != null) {
        builder.build(null, new DataFlowBuilderContext(snode, MPSProgramBuilder.this));
        break;
      }
    }
  }

  public void emitMayBeUnreachable(Runnable r) {
    boolean oldMayBeUnreachable = this.myMayBeUnreachable;
    this.myMayBeUnreachable = true;
    try {
      r.run();
    } finally {
      this.myMayBeUnreachable = oldMayBeUnreachable;
    }
  }

  protected void onInstructionEmitted(Instruction instruction) {
    super.onInstructionEmitted(instruction);
    if (this.myMayBeUnreachable || instruction instanceof EndTryInstruction) {
      instruction.putUserObject(DataFlow.MAY_BE_UNREACHABLE, true);
    }
  }
}
