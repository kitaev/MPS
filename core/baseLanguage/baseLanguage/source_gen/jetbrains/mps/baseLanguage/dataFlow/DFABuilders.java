package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;
import jetbrains.mps.baseLanguage.dataFlow.IfStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.WhileStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.Statement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.Expression_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.ExpressionStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.BlockStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.StatementList_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.AssignmentExpression_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.CastExpression_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.BinaryOperation_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.ReturnStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.ForStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.ForeachStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.DoWhileStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.AssertStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.ThrowStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.BreakStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.ContinueStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.ElsifClause_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.VariableDeclaration_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.TernaryOperatorExpression_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.SynchronizedStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.TryStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.TryCatchStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.ParenthesizedExpression_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.DotExpression_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.IMethodCall_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.ArrayAccessExpression_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.ArrayLiteral_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.DimensionExpression_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.InstanceOfExpression_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.LocalVariableDeclarationStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.LocalVariableDeclaration_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.BaseMethodDeclaration_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.StaticMethodCall_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.NotExpression_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.CatchClause_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.InstanceMethodCallOperation_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.ArrayCreator_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.ArrayCreatorWithInitializer_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.InstanceInitializer_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.SwitchStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.SwitchCase_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.GenericNewExpression_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.RemarkStatement_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.AnonymousClassCreator_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.BaseAssignmentExpression_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.BaseMethodCall_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.ParameterDeclaration_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.StaticInitializer_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.ConceptFunction_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.LocalVariableReference_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.ParameterReference_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.Closure_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.SubstringExpression_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.BitwiseNotExpression_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.CommentedStatementsBlock_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.SuperConstructorInvocation_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.TupleExpression_DataFlow;
import jetbrains.mps.baseLanguage.dataFlow.AbstractUnaryNumberOperation_DataFlow;

public class DFABuilders extends DataFlowBuilders {

  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.baseLanguage.structure.IfStatement", new IfStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.WhileStatement", new WhileStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.Statement", new Statement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.Expression", new Expression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ExpressionStatement", new ExpressionStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.BlockStatement", new BlockStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.StatementList", new StatementList_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.AssignmentExpression", new AssignmentExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.CastExpression", new CastExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.BinaryOperation", new BinaryOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ReturnStatement", new ReturnStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ForStatement", new ForStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ForeachStatement", new ForeachStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.DoWhileStatement", new DoWhileStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.AssertStatement", new AssertStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ThrowStatement", new ThrowStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.BreakStatement", new BreakStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ContinueStatement", new ContinueStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ElsifClause", new ElsifClause_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.VariableDeclaration", new VariableDeclaration_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression", new TernaryOperatorExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.SynchronizedStatement", new SynchronizedStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.TryStatement", new TryStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.TryCatchStatement", new TryCatchStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ParenthesizedExpression", new ParenthesizedExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.DotExpression", new DotExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.IMethodCall", new IMethodCall_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ArrayAccessExpression", new ArrayAccessExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ArrayLiteral", new ArrayLiteral_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.DimensionExpression", new DimensionExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.InstanceOfExpression", new InstanceOfExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement", new LocalVariableDeclarationStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration", new LocalVariableDeclaration_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", new BaseMethodDeclaration_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.StaticMethodCall", new StaticMethodCall_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.NotExpression", new NotExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.CatchClause", new CatchClause_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", new InstanceMethodCallOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ArrayCreator", new ArrayCreator_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ArrayCreatorWithInitializer", new ArrayCreatorWithInitializer_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.InstanceInitializer", new InstanceInitializer_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.SwitchStatement", new SwitchStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.SwitchCase", new SwitchCase_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.GenericNewExpression", new GenericNewExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.RemarkStatement", new RemarkStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.AnonymousClassCreator", new AnonymousClassCreator_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression", new BaseAssignmentExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.BaseMethodCall", new BaseMethodCall_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", new ParameterDeclaration_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.StaticInitializer", new StaticInitializer_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ConceptFunction", new ConceptFunction_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.LocalVariableReference", new LocalVariableReference_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.ParameterReference", new ParameterReference_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.Closure", new Closure_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.SubstringExpression", new SubstringExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.BitwiseNotExpression", new BitwiseNotExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock", new CommentedStatementsBlock_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation", new SuperConstructorInvocation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.TupleExpression", new TupleExpression_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.structure.AbstractUnaryNumberOperation", new AbstractUnaryNumberOperation_DataFlow());
  }

}
