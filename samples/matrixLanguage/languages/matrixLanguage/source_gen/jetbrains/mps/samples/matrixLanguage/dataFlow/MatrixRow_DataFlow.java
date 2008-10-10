package jetbrains.mps.samples.matrixLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class MatrixRow_DataFlow extends DataFlowBuilder {

  public MatrixRow_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    for(SNode item : SLinkOperations.getTargets(_context.getNode(), "items", true)) {
      _context.getBuilder().build((SNode)item);
    }
  }

}
