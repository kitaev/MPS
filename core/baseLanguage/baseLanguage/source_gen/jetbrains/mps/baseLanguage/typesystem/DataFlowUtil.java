package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.dependencies.CheckingMethod;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.dataFlow.DataFlow;
import jetbrains.mps.lang.dataFlow.DataflowBuilderException;
import java.util.Set;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.baseLanguage.behavior.ILocalDeclaration_Behavior;
import jetbrains.mps.baseLanguage.behavior.ILocalReference_Behavior;
import jetbrains.mps.baseLanguage.behavior.IVariableAssignment_Behavior;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.dataFlow.runtime.NullableAnalysisResult;

public class DataFlowUtil {
  public DataFlowUtil() {
  }

  @CheckingMethod
  public static void checkDataFlow(final TypeCheckingContext typeCheckingContext, SNode statementList) {
    checkDataFlow(typeCheckingContext, statementList, false);
  }

  @CheckingMethod
  public static void checkDataFlow(final TypeCheckingContext typeCheckingContext, SNode statementList, boolean checkReturns) {
    if (statementList == null) {
      return;
    }
    try {
      Program program = DataFlow.buildProgram(statementList);
      checkUnreachable(typeCheckingContext, program);
      checkUninitializedReads(typeCheckingContext, program);
      checkUnusedAssignments(typeCheckingContext, program);
      checkUnusedVariables(typeCheckingContext, statementList, program);
      if (checkReturns) {
        checkReturns(typeCheckingContext, program);
      }
      // <node> 
    } catch (DataflowBuilderException e) {
      throw new RuntimeException("Building dataflow for node: " + statementList.getId() + " model: " + statementList.getModel(), e);
    }
  }

  @CheckingMethod
  public static void checkReturns(final TypeCheckingContext typeCheckingContext, Program program) {
    Set<SNode> expectedReturns = DataFlow.getExpectedReturns(program);
    for (SNode n : expectedReturns) {
      if (n != null) {
        SNode nodeToSelect;
        SNode sl = SNodeOperations.getAncestor(n, "jetbrains.mps.baseLanguage.structure.StatementList", true, false);
        if ((sl != null) && ListSequence.fromList(SLinkOperations.getTargets(sl, "statement", true)).isNotEmpty()) {
          nodeToSelect = SNodeOperations.getAncestor(n, "jetbrains.mps.baseLanguage.structure.Statement", true, false);
        } else {
          nodeToSelect = SNodeOperations.getAncestor(n, "jetbrains.mps.baseLanguage.structure.StatementList", true, false);
        }
        if (nodeToSelect != null) {
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(nodeToSelect, "Return expected", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1223640343628", intentionProvider, errorTarget);
          }
        } else {
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(n, "Return expected", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1223640343636", intentionProvider, errorTarget);
          }
        }
      }
    }
  }

  @CheckingMethod
  public static void checkReturns(final TypeCheckingContext typeCheckingContext, SNode node) {
    checkReturns(typeCheckingContext, DataFlow.buildProgram(node));
  }

  @CheckingMethod
  private static void checkUnreachable(final TypeCheckingContext typeCheckingContext, Program program) {
    Set<SNode> unreachable = DataFlow.getUnreachableNodes(program);
    for (SNode n : unreachable) {
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(n, "Unreachable node", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1223640538234", intentionProvider, errorTarget);
      }
    }
  }

  @CheckingMethod
  private static void checkUninitializedReads(final TypeCheckingContext typeCheckingContext, Program program) {
    Set<SNode> uninitializedReads = DataFlow.getUninitializedReads(program);
    for (SNode read : uninitializedReads) {
      SNode localReference = null;
      if (SNodeOperations.isInstanceOf(read, "jetbrains.mps.baseLanguage.structure.ILocalReference")) {
        localReference = SNodeOperations.cast(read, "jetbrains.mps.baseLanguage.structure.ILocalReference");
      }
      if (SNodeOperations.isInstanceOf(read, "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(read, "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression"), "lValue", true), "jetbrains.mps.baseLanguage.structure.ILocalReference")) {
        localReference = SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.cast(read, "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression"), "lValue", true), "jetbrains.mps.baseLanguage.structure.ILocalReference");
      }
      if (localReference != null && !(ILocalDeclaration_Behavior.call_isReferencedInClosure_3262277503800823422(ILocalReference_Behavior.call_getDeclaration_3262277503800831941(localReference)))) {
        {
          BaseIntentionProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(read, "Variable used before it is initialized", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3652446454730672493", intentionProvider, errorTarget);
        }
      }
    }
  }

  @CheckingMethod
  private static void checkUnusedAssignments(final TypeCheckingContext typeCheckingContext, Program program) {
    Set<SNode> unusedAssignments = DataFlow.getUnusedAssignments(program);
    for (SNode write : unusedAssignments) {
      if (SNodeOperations.isInstanceOf(write, "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression")) {
        SNode assignment = SNodeOperations.cast(write, "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression");
        if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(assignment, "lValue", true), "jetbrains.mps.baseLanguage.structure.LocalVariableReference") || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(assignment, "lValue", true), "jetbrains.mps.baseLanguage.structure.ParameterReference")) {
          {
            BaseIntentionProvider intentionProvider = null;
            intentionProvider = new BaseIntentionProvider("jetbrains.mps.baseLanguage.constraints.RemoveUnusedAssignment_QuickFix", false);
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(assignment, "Unused assignment", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1223642282236", intentionProvider, errorTarget);
          }
        }
      }
      if (SNodeOperations.isInstanceOf(write, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration")) {
        SNode variableAssignment = SNodeOperations.cast(write, "jetbrains.mps.baseLanguage.structure.IVariableAssignment");
        if (IVariableAssignment_Behavior.call_isCanBeUnused_1223985713603(variableAssignment)) {
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(write, "Unused parameter", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1225278748067", intentionProvider, errorTarget);
          }
        }
      }
      if (SNodeOperations.isInstanceOf(write, "jetbrains.mps.baseLanguage.structure.IVariableAssignment")) {
        SNode variableAssignment = SNodeOperations.cast(write, "jetbrains.mps.baseLanguage.structure.IVariableAssignment");
        if (IVariableAssignment_Behavior.call_isCanBeUnused_1223985713603(variableAssignment)) {
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(write, "Unused assignment", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1225278681706", intentionProvider, errorTarget);
          }
        }
      }
    }
  }

  @CheckingMethod
  public static void checkUnusedVariables(final TypeCheckingContext typeCheckingContext, @NotNull SNode statementList, Program program) {
    Set<SNode> usedVariables = DataFlow.getUsedVariables(program, statementList);
    for (SNode var : SNodeOperations.getDescendants(statementList, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration", false, new String[]{})) {
      if (program.getInstructionsFor(var).isEmpty()) {
        continue;
      }
      if (!(SNodeOperations.isInstanceOf(SNodeOperations.getParent(var), "jetbrains.mps.baseLanguage.structure.CatchClause")) && SNodeOperations.getAncestor(var, "jetbrains.mps.lang.quotation.structure.Quotation", false, false) == null) {
        if (SLinkOperations.getTarget(var, "initializer", true) == null && !(SetSequence.fromSet(usedVariables).contains(var))) {
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(var, "Unused variable", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "8937659523942275424", intentionProvider, errorTarget);
          }
        }
      }
    }
  }

  @CheckingMethod
  public static void checkNullable(final TypeCheckingContext typeCheckingContext, SNode statementList) {
    NullableAnalysisResult result = new NullableAnalysisResult(statementList);
    for (SNode problemNode : ListSequence.fromList(result.checkNodes(statementList))) {
      if (SNodeOperations.isInstanceOf(problemNode, "jetbrains.mps.baseLanguage.structure.AssignmentExpression")) {
        {
          BaseIntentionProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(problemNode, "Assign nullable value to not nullable.", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1235234110878", intentionProvider, errorTarget);
        }
      } else if (SNodeOperations.isInstanceOf(problemNode, "jetbrains.mps.baseLanguage.structure.Expression")) {
        {
          BaseIntentionProvider intentionProvider = null;
          IErrorTarget errorTarget = new NodeErrorTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(problemNode, "Expression may be null.", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1235234157876", intentionProvider, errorTarget);
        }
      }
    }
  }
}
