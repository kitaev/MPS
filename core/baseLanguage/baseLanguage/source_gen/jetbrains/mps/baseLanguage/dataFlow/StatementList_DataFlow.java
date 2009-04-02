package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.LastStatementUtil;
import jetbrains.mps.project.GlobalScope;

public class StatementList_DataFlow extends DataFlowBuilder {

  public StatementList_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")) {
      SNode bmd = SNodeOperations.cast(SNodeOperations.getParent(_context.getNode()), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
      for(SNode param : ListSequence.fromList(SLinkOperations.getTargets(bmd, "parameter", true))) {
        _context.getBuilder().build((SNode)param);
      }
    }
    _context.getBuilder().emitNop();
    for(SNode s : SLinkOperations.getTargets(_context.getNode(), "statement", true)) {
      _context.getBuilder().build((SNode)s);
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "statement", true)).isNotEmpty()) {
      SNode lastStatement = ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "statement", true)).last();
      if (LastStatementUtil.canMakeReturnStatement(lastStatement, GlobalScope.getInstance())) {
        _context.getBuilder().emitRet();
      }
    }
  }

}
