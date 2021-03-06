package jetbrains.mps.lang.plugin.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {
  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.lang.plugin.structure.ActionConstructionParameterDeclaration", new ActionConstructionParameterDeclaration_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.ActionConstructorParameterReferenceOperation", new ActionConstructorParameterReferenceOperation_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.ActionDataParameterDeclaration", new ActionDataParameterDeclaration_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.ActionDataParameterReferenceOperation", new ActionDataParameterReferenceOperation_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.ActionInstance", new ActionInstance_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.ActionParameterDeclaration", new ActionParameterDeclaration_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.ActionParameterReferenceOperation", new ActionParameterReferenceOperation_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.AddElementStatement", new AddElementStatement_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.AddStatement", new AddStatement_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.AddTabOperation", new AddTabOperation_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.AskStatement", new AskStatement_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.BaseExecuteCommandStatement", new BaseExecuteCommandStatement_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.BaseExecuteCommandStatementSync", new BaseExecuteCommandStatementSync_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.CommandClosureLiteral", new CommandClosureLiteral_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.CreateRunConfigStatement", new CreateRunConfigStatement_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.DisposeConsoleBlock", new DisposeConsoleBlock_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.ExecutionConsoleStatement", new ExecutionConsoleStatement_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.ProcessHandlerStatement", new ProcessHandlerStatement_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.ProcessStatement", new ProcessStatement_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.RunConfigPropertyInstance", new RunConfigPropertyInstance_DataFlow());
    manager.register("jetbrains.mps.lang.plugin.structure.ToolTab", new ToolTab_DataFlow());
  }
}
