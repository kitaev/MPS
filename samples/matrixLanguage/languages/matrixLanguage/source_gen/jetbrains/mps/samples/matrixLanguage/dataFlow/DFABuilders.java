package jetbrains.mps.samples.matrixLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.dataFlow.DataFlowBuilders;
import jetbrains.mps.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {

  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.samples.matrixLanguage.structure.ForEachMatrixElement", new ForEachMatrixElement_DataFlow());
    manager.register("jetbrains.mps.samples.matrixLanguage.structure.DeterminantExpression", new DeterminantExpression_DataFlow());
    manager.register("jetbrains.mps.samples.matrixLanguage.structure.TransposeExpression", new TransposeExpression_DataFlow());
    manager.register("jetbrains.mps.samples.matrixLanguage.structure.MatrixLiteral", new MatrixLiteral_DataFlow());
    manager.register("jetbrains.mps.samples.matrixLanguage.structure.MatrixRow", new MatrixRow_DataFlow());
  }

}
