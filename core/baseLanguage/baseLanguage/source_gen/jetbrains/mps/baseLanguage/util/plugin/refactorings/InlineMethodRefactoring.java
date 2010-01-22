package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.dataFlow.framework.Program;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.dataFlow.DataFlowManager;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Map;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;
import jetbrains.mps.lang.dataFlow.framework.instructions.WriteInstruction;
import jetbrains.mps.baseLanguage.search.LocalVariablesScope;
import jetbrains.mps.util.Condition;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.baseLanguage.search.VisibilityUtil;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class InlineMethodRefactoring {
  private SNode myReturnType;
  private Program myMethodProgram;
  private boolean myHasManyReturns;
  private SNode myMethodCall;
  private SNode myMethodDeclaration;
  private List<SNode> myArguments;
  private SNode myOperand;

  public InlineMethodRefactoring(SNode methodCall) {
    MethodCallAdapter methodCallAdapter = new MethodCallAdapter(methodCall);
    this.myMethodDeclaration = methodCallAdapter.getMethodDeclaration();
    this.myArguments = new MethodCallAdapter(methodCall).getMethodArguments();
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(methodCall), "jetbrains.mps.baseLanguage.structure.DotExpression")) {
      this.myMethodCall = SNodeOperations.getParent(methodCall);
      this.myOperand = SLinkOperations.getTarget(SNodeOperations.cast(this.myMethodCall, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true);
    } else {
      this.myMethodCall = methodCall;
    }
    this.myMethodProgram = DataFlowManager.getInstance().buildProgramFor(this.myMethodDeclaration);
    List<SNode> returns = SNodeOperations.getDescendants(this.myMethodDeclaration, "jetbrains.mps.baseLanguage.structure.ReturnStatement", false, new String[]{});
    this.myHasManyReturns = ListSequence.fromList(returns).count() > 1;
    this.myReturnType = SLinkOperations.getTarget(this.myMethodDeclaration, "returnType", true);
  }

  public void doRefactor() {
    SNode body = SNodeOperations.copyNode(SLinkOperations.getTarget(this.myMethodDeclaration, "body", true));
    Map<SNode, SNode> paramsMap = this.compareParameters();
    SNode callStatement = SNodeOperations.getAncestor(this.myMethodCall, "jetbrains.mps.baseLanguage.structure.Statement", false, false);
    SNode returnVar = null;
    if (!(SNodeOperations.isInstanceOf(this.myReturnType, "jetbrains.mps.baseLanguage.structure.VoidType"))) {
      this.addLastReturnStatement(body);
    }
    if (this.myHasManyReturns && !(SNodeOperations.isInstanceOf(this.myReturnType, "jetbrains.mps.baseLanguage.structure.VoidType"))) {
      returnVar = this.createLocalVariableDeclaration(callStatement, "result", this.myReturnType);
      SNode stat = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement", null);
      SLinkOperations.setTarget(stat, "localVariableDeclaration", returnVar, true);
      SNodeOperations.insertPrevSiblingChild(callStatement, stat);
    }
    this.replaceParameters(body, paramsMap);
    if (this.myOperand != null) {
      this.replaceThisByOperand(body);
    }
    this.replaceReturnSatements(body, returnVar, callStatement);
    if (returnVar != null) {
      SNode ref = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableReference", null);
      SLinkOperations.setTarget(ref, "variableDeclaration", returnVar, false);
      SNodeOperations.replaceWithAnother(this.myMethodCall, ref);
      SNodeOperations.insertNextSiblingChild(callStatement, SNodeOperations.copyNode(callStatement));
    }
    if (SNodeOperations.getAncestor(this.myMethodDeclaration, "jetbrains.mps.baseLanguage.structure.Classifier", false, false) != SNodeOperations.getAncestor(this.myMethodCall, "jetbrains.mps.baseLanguage.structure.Classifier", false, false)) {
      this.replaceLocalStaticMethodCalls(body);
    }
    for (SNode statement : ListSequence.fromList(SLinkOperations.getTargets(body, "statement", true))) {
      SNodeOperations.insertPrevSiblingChild(callStatement, statement);
    }
    SNodeOperations.deleteNode(callStatement);
  }

  public void addLastReturnStatement(SNode body) {
    SNode last = ListSequence.fromList(SLinkOperations.getTargets(body, "statement", true)).last();
    if (SNodeOperations.isInstanceOf(last, "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
      SNodeOperations.replaceWithAnother(last, new InlineMethodRefactoring.QuotationClass_3318_0().createNode(SLinkOperations.getTarget(SNodeOperations.cast(last, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), "expression", true)));
    }
  }

  private void replaceReturnSatements(SNode body, SNode returnVar, SNode callStatement) {
    for (SNode returnStatement : ListSequence.fromList(SNodeOperations.getDescendants(body, "jetbrains.mps.baseLanguage.structure.ReturnStatement", false, new String[]{}))) {
      SNode returnExpression = SLinkOperations.getTarget(returnStatement, "expression", true);
      if (returnVar == null) {
        if (returnExpression != null) {
          SNodeOperations.replaceWithAnother(this.myMethodCall, SNodeOperations.copyNode(returnExpression));
          SNodeOperations.insertNextSiblingChild(callStatement, SNodeOperations.copyNode(callStatement));
        }
        SNodeOperations.deleteNode(returnStatement);
      } else {
        SNode statement = this.createAssignmentExpression(returnVar, returnExpression);
        SNodeOperations.replaceWithAnother(returnStatement, statement);
      }
    }
  }

  private void replaceThisByOperand(SNode body) {
    if (!(SNodeOperations.isInstanceOf(this.myOperand, "jetbrains.mps.baseLanguage.structure.IThisExpression") || SNodeOperations.isInstanceOf(this.myOperand, "jetbrains.mps.baseLanguage.structure.VariableReference") || SNodeOperations.isInstanceOf(this.myOperand, "jetbrains.mps.baseLanguage.structure.StringLiteral"))) {
      SNode statement = SNodeOperations.getAncestor(this.myMethodCall, "jetbrains.mps.baseLanguage.structure.Statement", false, false);
      SNode t = this.getClassifierType(SNodeOperations.cast(SNodeOperations.getParent(this.myMethodDeclaration), "jetbrains.mps.baseLanguage.structure.Classifier"));
      this.myOperand = this.createVariable(statement, "instance", t, this.myOperand);
    }
    for (SNode thisExpr : ListSequence.fromList(SNodeOperations.getDescendants(body, "jetbrains.mps.baseLanguage.structure.IThisExpression", false, new String[]{}))) {
      SNodeOperations.replaceWithAnother(thisExpr, SNodeOperations.copyNode(this.myOperand));
    }
  }

  private SNode getClassifierType(SNode c) {
    SNode type = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
    SLinkOperations.setTarget(type, "classifier", c, false);
    return type;
  }

  private SNode createAssignmentExpression(SNode returnVar, SNode returnExpression) {
    SNode expression = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.AssignmentExpression", null);
    SNode ref = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableReference", null);
    SLinkOperations.setTarget(expression, "lValue", ref, true);
    SLinkOperations.setTarget(ref, "variableDeclaration", returnVar, false);
    SLinkOperations.setTarget(expression, "rValue", SNodeOperations.copyNode(returnExpression), true);
    SNode statement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null);
    SLinkOperations.setTarget(statement, "expression", expression, true);
    return statement;
  }

  private void replaceLocalStaticMethodCalls(SNode body) {
    SNode c = SNodeOperations.getAncestor(this.myMethodDeclaration, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    for (SNode localCall : ListSequence.fromList(SNodeOperations.getDescendants(body, "jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall", false, new String[]{}))) {
      SNode newCall = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StaticMethodCall", null);
      SLinkOperations.setTarget(newCall, "classConcept", c, false);
      SLinkOperations.setTarget(newCall, "baseMethodDeclaration", SLinkOperations.getTarget(localCall, "baseMethodDeclaration", false), false);
      SNodeOperations.replaceWithAnother(localCall, newCall);
    }
  }

  private void replaceParameters(SNode returnExpression, Map<SNode, SNode> parameters) {
    for (SNode ref : ListSequence.fromList(SNodeOperations.getDescendants(returnExpression, "jetbrains.mps.baseLanguage.structure.ParameterReference", false, new String[]{}))) {
      if (MapSequence.fromMap(parameters).containsKey(SLinkOperations.getTarget(ref, "variableDeclaration", false))) {
        SNode e = SNodeOperations.copyNode(MapSequence.fromMap(parameters).get(SLinkOperations.getTarget(ref, "variableDeclaration", false)));
        SNodeOperations.replaceWithAnother(ref, e);
      }
    }
  }

  private Map<SNode, SNode> compareParameters() {
    SNode statement = SNodeOperations.getAncestor(this.myMethodCall, "jetbrains.mps.baseLanguage.structure.Statement", false, false);
    Map<SNode, SNode> map = MapSequence.fromMap(new HashMap<SNode, SNode>());
    List<SNode> parameters = SLinkOperations.getTargets(this.myMethodDeclaration, "parameter", true);
    for (int i = 0; i < ListSequence.fromList(this.myArguments).count(); i++) {
      SNode parameterDeclaration = ListSequence.fromList(parameters).getElement(i);
      SNode argument = ListSequence.fromList(this.myArguments).getElement(i);
      if (this.canSubstituteParameter(argument, parameterDeclaration)) {
        MapSequence.fromMap(map).put(parameterDeclaration, argument);
      } else {
        String name = SPropertyOperations.getString(parameterDeclaration, "name");
        SNode type = SLinkOperations.getTarget(parameterDeclaration, "type", true);
        SNode ref = this.createVariable(statement, name, type, argument);
        MapSequence.fromMap(map).put(parameterDeclaration, ref);
      }
    }
    return map;
  }

  private boolean canSubstituteParameter(SNode e, SNode parameterDeclaration) {
    if (SNodeOperations.isInstanceOf(e, "jetbrains.mps.baseLanguage.structure.VariableReference")) {
      return !(this.variableWriting(parameterDeclaration));
    }
    if (SNodeOperations.isInstanceOf(e, "jetbrains.mps.baseLanguage.structure.IntegerConstant")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(e, "jetbrains.mps.baseLanguage.structure.FloatingPointConstant")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(e, "jetbrains.mps.baseLanguage.structure.CharConstant")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(e, "jetbrains.mps.baseLanguage.structure.StringLiteral")) {
      return true;
    }
    return false;
  }

  private boolean variableWriting(SNode parameterDeclaration) {
    for (Instruction instruction : ListSequence.fromList(this.myMethodProgram.getInstructions())) {
      if (instruction instanceof WriteInstruction) {
        WriteInstruction write = (WriteInstruction) instruction;
        SNode node = ((SNode) write.getSource());
        if (write.getVariable() == parameterDeclaration && !(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration"))) {
          return true;
        }
      }
    }
    return false;
  }

  private SNode createVariable(SNode statement, String name, SNode type, SNode argument) {
    SNode declaration = this.createLocalVariableDeclaration(statement, name, type);
    SNode stat = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement", null);
    SLinkOperations.setTarget(stat, "localVariableDeclaration", declaration, true);
    SLinkOperations.setTarget(declaration, "initializer", argument, true);
    SNodeOperations.insertPrevSiblingChild(statement, stat);
    SNode ref = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableReference", null);
    SLinkOperations.setTarget(ref, "variableDeclaration", declaration, false);
    return ref;
  }

  private SNode createLocalVariableDeclaration(SNode statement, String name, SNode type) {
    SNode declaration = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration", null);
    SPropertyOperations.set(declaration, "name", this.findName(statement, name));
    SLinkOperations.setTarget(declaration, "type", SNodeOperations.copyNode(type), true);
    return declaration;
  }

  private String findName(SNode statement, String name) {
    if (this.isNameGood(statement, name)) {
      return name;
    }
    int i = 1;
    while (!(this.isNameGood(statement, name + i))) {
      i++;
    }
    return name + i;
  }

  private boolean isNameGood(SNode statement, final String name) {
    SNode list = SNodeOperations.cast(SNodeOperations.getParent(statement), "jetbrains.mps.baseLanguage.structure.StatementList");
    int start = ListSequence.fromList(SLinkOperations.getTargets(list, "statement", true)).indexOf(statement);
    for (int i = start; i < ListSequence.fromList(SLinkOperations.getTargets(list, "statement", true)).count(); i++) {
      SNode st = ListSequence.fromList(ListSequence.fromList(SLinkOperations.getTargets(list, "statement", true)).toListSequence()).getElement(i);
      for (SNode declaration : ListSequence.fromList(SNodeOperations.getDescendants(st, "jetbrains.mps.baseLanguage.structure.VariableDeclaration", false, new String[]{}))) {
        if (SPropertyOperations.getString(declaration, "name").equals(name)) {
          return false;
        }
      }
    }
    LocalVariablesScope scope = new LocalVariablesScope(statement);
    List<SNode> nodes = scope.getNodes(((Condition<SNode>) new Condition<SNode>() {
      public boolean met(SNode obj) {
        return name.equals(SPropertyOperations.getString(SNodeOperations.cast(obj, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"), "name"));
      }
    }));
    boolean vars = ListSequence.fromList(nodes).isNotEmpty();
    if (vars) {
      return false;
    }
    SNode declaration = SNodeOperations.getAncestor(statement, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", false, false);
    for (SNode param : ListSequence.fromList(SLinkOperations.getTargets(declaration, "parameter", true))) {
      if (name.equals(SPropertyOperations.getString(param, "name"))) {
        return false;
      }
    }
    return true;
  }

  public String getProblems() {
    StringBuffer buff = new StringBuffer();
    Set<SNode> nodesToCheck = ClassRefactoringUtils.getClassMemberRefernce(SLinkOperations.getTarget(this.myMethodDeclaration, "body", true));
    String end = SNodeOperations.getParent(this.myMethodDeclaration) + "." + this.myMethodDeclaration;
    for (SNode node : SetSequence.fromSet(nodesToCheck)) {
      SNode classifier = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
      if (!(VisibilityUtil.isVisible(this.myMethodCall, node))) {
        String start = "";
        if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")) {
          start = "Method ";
        }
        if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.VariableDeclaration")) {
          start = "Field ";
        }
        buff.append(start).append(classifier).append(".").append(node);
        buff.append(" that is used in inlined method is not accessible from ");
        buff.append("call site(s) in method " + end + "\n");
      }
    }
    return buff.toString();
  }

  public static class QuotationClass_3318_0 {
    public QuotationClass_3318_0() {
    }

    public SNode createNode(Object parameter_3318_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3318_0 = null;
      SNode quotedNode_3318_1 = null;
      {
        quotedNode_3318_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ReturnStatement", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3318_0 = quotedNode_3318_0;
        {
          quotedNode_3318_1 = (SNode) parameter_3318_0;
          SNode quotedNode1_8;
          if (_parameterValues_129834374.contains(quotedNode_3318_1)) {
            quotedNode1_8 = CopyUtil.copy(quotedNode_3318_1);
          } else {
            _parameterValues_129834374.add(quotedNode_3318_1);
            quotedNode1_8 = quotedNode_3318_1;
          }
          if (quotedNode1_8 != null) {
            quotedNode_3318_0.addChild("expression", HUtil.copyIfNecessary(quotedNode1_8));
          }
        }
        result = quotedNode1_3318_0;
      }
      return result;
    }
  }
}
