package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.behavior.BreakStatement_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class BreakStatement_DataFlow extends DataFlowBuilder {
  public BreakStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    SNode statement = BreakStatement_Behavior.call_getLoopOrSwitch_1213877377041(_context.getNode());
    if ((statement != null) && SNodeOperations.getAncestor(statement, "jetbrains.mps.baseLanguage.structure.IStatementListContainer", false, false) == SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.IStatementListContainer", false, false)) {
      _context.getBuilder().emitJump(_context.getBuilder().after(statement));
    } else {
      _context.getBuilder().emitNop();
    }
  }
}
