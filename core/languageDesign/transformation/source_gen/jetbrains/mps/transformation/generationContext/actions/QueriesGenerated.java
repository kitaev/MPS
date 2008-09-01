package jetbrains.mps.transformation.generationContext.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstitutePreconditionContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.NodeSetupContext;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import java.util.ArrayList;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.smodel.action.ChildSubstituteActionsHelper;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_IOperation_1216861714162(final IOperationContext operationContext, final NodeSubstitutePreconditionContext _context) {
    return SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getParentNode(), "operand", true)), "jetbrains.mps.transformation.generationContext.structure.GenerationContextType");
  }

  public static void nodeFactory_NodeSetup_GenerationContextOp_GetOutputByLabel_1216861604198(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput")) {
      SLinkOperations.setTarget(_context.getNewNode(), "label", SLinkOperations.getTarget(_context.getSampleNode(), "label", false), false);
    }
  }

  public static void nodeFactory_NodeSetup_GenerationContextOp_GetOutputByLabelAndInput_1216861604216(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetOutputByLabel")) {
      SLinkOperations.setTarget(_context.getNewNode(), "label", SLinkOperations.getTarget(_context.getSampleNode(), "label", false), false);
    }
  }

  public static void nodeFactory_NodeSetup_GenerationContextOp_SessionObjectAccess_1217895102264(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_UserObjectAccessBase")) {
      SLinkOperations.setTarget(_context.getNewNode(), "userKey", SLinkOperations.getTarget(_context.getSampleNode(), "userKey", true), true);
    }
  }

  public static void nodeFactory_NodeSetup_GenerationContextOp_StepObjectAccess_1217895169605(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_UserObjectAccessBase")) {
      SLinkOperations.setTarget(_context.getNewNode(), "userKey", SLinkOperations.getTarget(_context.getSampleNode(), "userKey", true), true);
    }
  }

  public static void nodeFactory_NodeSetup_GenerationContextOp_TransientObjectAccess_1217895187935(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_UserObjectAccessBase")) {
      SLinkOperations.setTarget(_context.getNewNode(), "userKey", SLinkOperations.getTarget(_context.getSampleNode(), "userKey", true), true);
    }
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_IOperation_1216861714161(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = new ArrayList<INodeSubstituteAction>();
    {
      Calculable calc = new Calculable() {

        public Object calculate() {
          return ListSequence.fromList(SConceptOperations.getAllSubConcepts(SConceptOperations.findConceptDeclaration("jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_Base"), _context.getModel(), operationContext.getScope())).where(new IWhereFilter <SNode>() {

            public boolean accept(SNode it) {
              return !(SConceptPropertyOperations.getBoolean(it, "abstract"));
            }

          }).toListSequence();
        }

      };
      Iterable queryResult = (Iterable)calc.calculate();
      if (queryResult != null) {
        for(Object item : queryResult) {
          List<INodeSubstituteAction> defaultActions = ChildSubstituteActionsHelper.createDefaultActions((SNode)item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext);
          result.addAll(defaultActions);
        }
      }
    }
    return result;
  }

}
