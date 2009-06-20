package jetbrains.mps.lang.smodel.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class SNodeOperation_DataFlow extends DataFlowBuilder {

  public SNodeOperation_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    for(SNode expr : ListSequence.fromList(SNodeOperations.getChildren(_context.getNode()))) {
      if (SNodeOperations.isInstanceOf(expr, "jetbrains.mps.baseLanguage.structure.Expression")) {
        _context.getBuilder().build((SNode)expr);
      }
    }
  }

}
