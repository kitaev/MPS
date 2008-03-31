package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class TryStatement_DataFlow extends DataFlowBuilder {

  public  TryStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().emitTry();
    _context.getBuilder().build(SLinkOperations.getTarget(_context.getNode(), "body", true));
    _context.getBuilder().emitFinally();
    _context.getBuilder().build(SLinkOperations.getTarget(_context.getNode(), "finallyBody", true));
    _context.getBuilder().emitEndTry();
  }

}
