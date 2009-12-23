package jetbrains.mps.baseLanguage.closures.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ClosureControlStatement_DataFlow extends DataFlowBuilder {
  public ClosureControlStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "controlClosure", true));
    for (SNode ap : SLinkOperations.getTargets(_context.getNode(), "actualParameter", true)) {
      _context.getBuilder().build((SNode) ap);
    }
  }
}
