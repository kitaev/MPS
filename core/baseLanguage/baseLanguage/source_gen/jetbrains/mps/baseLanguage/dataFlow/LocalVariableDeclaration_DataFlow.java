package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.behavior.Expression_Behavior;

public class LocalVariableDeclaration_DataFlow extends DataFlowBuilder {
  public LocalVariableDeclaration_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().emitNop();
    if ((SLinkOperations.getTarget(_context.getNode(), "initializer", true) != null)) {
      _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "initializer", true));
      _context.getBuilder().emitWrite(_context.getNode(), Expression_Behavior.call_getNullableState_1230540989695(SLinkOperations.getTarget(_context.getNode(), "initializer", true)));
    }
  }
}
