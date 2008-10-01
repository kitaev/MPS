package jetbrains.mps.regexp.dataFlow;

/*Generated by MPS */

import jetbrains.mps.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class FindMatchStatement_DataFlow extends DataFlowBuilder {

  public FindMatchStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "expr", true));
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "regexp", true));
    _context.getBuilder().emitLabel("begin");
    _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "body", true));
    _context.getBuilder().emitIfJump(_context.getBuilder().label(_context.getNode(), "begin"));
  }

}
