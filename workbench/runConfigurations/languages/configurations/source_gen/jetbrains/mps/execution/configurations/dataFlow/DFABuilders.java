package jetbrains.mps.execution.configurations.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {
  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.execution.configurations.structure.StartProcessHandlerStatement", new StartProcessHandlerStatement_DataFlow());
  }
}
