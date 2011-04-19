package jetbrains.mps.execution.configurations.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class QueriesGenerated {
  public static boolean nodeSubstituteActionsBuilder_Precondition_ConfigurationFromExecutorReference_2186841766260429985(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getContainingRoot(_context.getParentNode()), "jetbrains.mps.execution.configurations.structure.ComplexRunConfigurationExecutor");
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_ConfigurationFromExecutorReference_7806358006983765719(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.execution.configurations.structure.ConfigurationFromExecutorReference");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Calculable calc = new Calculable() {
          public Object calculate() {
            return ListSequence.fromListAndArray(new ArrayList<String>(), SPropertyOperations.getString(SNodeOperations.cast(SNodeOperations.getContainingRoot(_context.getParentNode()), "jetbrains.mps.execution.configurations.structure.ComplexRunConfigurationExecutor"), "configurationName"));
          }
        };
        Iterable<String> queryResult = (Iterable) calc.calculate();
        if (queryResult != null) {
          for (final String item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                return SNodeFactoryOperations.createNewNode("jetbrains.mps.execution.configurations.structure.ConfigurationFromExecutorReference", null);
              }
            });
          }
        }
      }
    }
    return result;
  }
}
