package jetbrains.mps.regexp.dataFlow;

/*Generated by MPS */

import jetbrains.mps.dataFlow.DataFlowBuilders;
import jetbrains.mps.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {

  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.regexp.structure.MatchRegexpStatement", new MatchRegexpStatement_DataFlow());
  }

}
