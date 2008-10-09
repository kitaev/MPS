package jetbrains.mps.patterns.dataFlow;

/*Generated by MPS */

import jetbrains.mps.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class PatternExpression_DataFlow extends DataFlowBuilder {

  public PatternExpression_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    for(SNode antiquotation : SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.lang.quotation.structure.AbstractAntiquotation", false)) {
      _context.getBuilder().build((SNode)antiquotation);
    }
    for(SNode patternVar : SNodeOperations.getDescendantsWhereConceptInList(_context.getNode(), new String[]{"jetbrains.mps.patterns.structure.PatternVariableDeclaration","jetbrains.mps.patterns.structure.PropertyPatternVariableDeclaration"}, false)) {
      _context.getBuilder().build((SNode)patternVar);
    }
  }

}
