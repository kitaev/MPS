package jetbrains.mps.lang.plugin.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.baseLanguage.behavior.IStatementListContainer_Behavior;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.StatementList_Behavior;

public class CommandClosureLiteral_DataFlow extends DataFlowBuilder {

  public CommandClosureLiteral_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    if (IStatementListContainer_Behavior.call_isExecuteSynchronous_1230212745736(_context.getNode())) {
      _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "body", true));
    } else
    {
      for(SNode var : StatementList_Behavior.call_getExternalVariablesDeclarations_1214501165480(SLinkOperations.getTarget(_context.getNode(), "body", true))) {
        _context.getBuilder().emitRead(var);
      }
    }
  }

}
