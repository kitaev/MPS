package jetbrains.mps.bootstrap.helgins.generator.quotation.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.SourceSubstituteMacro_Node_ParameterObject;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class QueriesGenerated {

  public static SNode sourceNodeQuery_1196356047870(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "quotedNode", true);
  }

  public static SNode sourceNodeQuery_1196356130049(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "expression", true);
  }

  public static SNode sourceNodeQuery_1196356200447(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "expression", true);
  }

  public static SNode sourceNodeQuery_1196356235526(final IOperationContext operationContext, final SourceSubstituteMacro_Node_ParameterObject _parameterObject) {
    return SLinkOperations.getTarget(_parameterObject.getNode(), "expression", true);
  }

}
