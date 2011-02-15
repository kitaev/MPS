package jetbrains.mps.runConfigurations.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {
  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.runConfigurations.structure.CommandExpression", new CommandExpression_DataFlow());
    manager.register("jetbrains.mps.runConfigurations.structure.CommandPart", new CommandPart_DataFlow());
    manager.register("jetbrains.mps.runConfigurations.structure.ExecuteConfiguration_Function", new ExecuteConfiguration_Function_DataFlow());
    manager.register("jetbrains.mps.runConfigurations.structure.ReportConfigurationErrorStatement", new ReportConfigurationErrorStatement_DataFlow());
  }
}
