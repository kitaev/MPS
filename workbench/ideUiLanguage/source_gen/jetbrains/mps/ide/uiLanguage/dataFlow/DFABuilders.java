package jetbrains.mps.ide.uiLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;
import jetbrains.mps.ide.uiLanguage.dataFlow.ReportErrorExpression_DataFlow;

public class DFABuilders extends DataFlowBuilders {

  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.ide.uiLanguage.structure.ReportErrorExpression", new ReportErrorExpression_DataFlow());
  }

}
