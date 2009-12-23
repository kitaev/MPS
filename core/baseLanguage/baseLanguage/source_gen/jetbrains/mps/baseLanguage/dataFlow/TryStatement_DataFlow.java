package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class TryStatement_DataFlow extends DataFlowBuilder {
  public TryStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().emitTry();
    for (SNode c : SLinkOperations.getTargets(_context.getNode(), "catchClause", true)) {
      _context.getBuilder().emitIfJump(_context.getBuilder().before(c));
    }
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "body", true));
    _context.getBuilder().emitMayBeUnreachable(new Runnable() {
      public void run() {
        _context.getBuilder().emitJump(_context.getBuilder().label(_context.getNode(), "afterCatches"));
      }
    });
    for (SNode c : SLinkOperations.getTargets(_context.getNode(), "catchClause", true)) {
      _context.getBuilder().build((SNode) c);
      _context.getBuilder().emitMayBeUnreachable(new Runnable() {
        public void run() {
          _context.getBuilder().emitJump(_context.getBuilder().label(_context.getNode(), "afterCatches"));
        }
      });
    }
    _context.getBuilder().emitLabel("afterCatches");
    _context.getBuilder().emitFinally();
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "finallyBody", true));
    _context.getBuilder().emitEndTry();
  }
}
