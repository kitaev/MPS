package jetbrains.mps.quickQueryLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {
  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.quickQueryLanguage.structure.ModelQuery", new ModelQuery_DataFlow());
    manager.register("jetbrains.mps.quickQueryLanguage.structure.ReplaceModelQuery", new ReplaceModelQuery_DataFlow());
  }
}
