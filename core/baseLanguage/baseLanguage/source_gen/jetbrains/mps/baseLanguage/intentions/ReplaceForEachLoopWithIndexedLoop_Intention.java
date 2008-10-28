package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.IVisitor;

public class ReplaceForEachLoopWithIndexedLoop_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ForeachStatement";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Replace for each loop with indexed loop";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    boolean array = SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "iterable", true)), "jetbrains.mps.baseLanguage.structure.ArrayType");
    if (!(array)) {
      return false;
    }
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    // TODO: expression as iterable - make a variable
    final SNode iterable = SLinkOperations.getTarget(node, "iterable", true);
    // 
    SNode forStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ForStatement", null);
    // 
    SPropertyOperations.set(forStatement, "label", SPropertyOperations.getString(node, "label"));
    // 
    final SNode forVariableDeclaration = SLinkOperations.setNewChild(forStatement, "variable", "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
    SPropertyOperations.set(forVariableDeclaration, "name", "i");
    SLinkOperations.setTarget(forVariableDeclaration, "type", new _Quotations.QuotationClass_2().createNode(), true);
    SLinkOperations.setNewChild(forVariableDeclaration, "initializer", "jetbrains.mps.baseLanguage.structure.IntegerConstant");
    SPropertyOperations.set(SLinkOperations.getTarget(forVariableDeclaration, "initializer", true), "value", "" + (0));
    // 
    SNode forCondition = SLinkOperations.setNewChild(forStatement, "condition", "jetbrains.mps.baseLanguage.structure.LessThanExpression");
    SLinkOperations.setNewChild(forCondition, "leftExpression", "jetbrains.mps.baseLanguage.structure.LocalVariableReference");
    SLinkOperations.setTarget(SLinkOperations.getTarget(forCondition, "leftExpression", true), "variableDeclaration", forVariableDeclaration, false);
    SLinkOperations.setNewChild(SLinkOperations.setNewChild(forCondition, "rightExpression", "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", "jetbrains.mps.baseLanguage.structure.ArrayLengthOperation");
    SLinkOperations.setTarget(SLinkOperations.getTarget(forCondition, "rightExpression", true), "operand", SNodeOperations.copyNode(iterable), true);
    // 
    SNode iterationExpr = SLinkOperations.setNewChild(forStatement, "iteration", "jetbrains.mps.baseLanguage.structure.AssignmentExpression");
    SLinkOperations.setNewChild(iterationExpr, "lValue", "jetbrains.mps.baseLanguage.structure.LocalVariableReference");
    SLinkOperations.setTarget(SLinkOperations.getTarget(iterationExpr, "lValue", true), "variableDeclaration", forVariableDeclaration, false);
    SLinkOperations.setNewChild(iterationExpr, "rValue", "jetbrains.mps.baseLanguage.structure.PlusExpression");
    SLinkOperations.setTarget(SLinkOperations.getTarget(iterationExpr, "rValue", true), "leftExpression", SNodeOperations.copyNode(SLinkOperations.getTarget(iterationExpr, "lValue", true)), true);
    SLinkOperations.setNewChild(SLinkOperations.getTarget(iterationExpr, "rValue", true), "rightExpression", "jetbrains.mps.baseLanguage.structure.IntegerConstant");
    SPropertyOperations.set(SLinkOperations.getTarget(SLinkOperations.getTarget(iterationExpr, "rValue", true), "rightExpression", true), "value", "" + (1));
    // 
    final SNode fake_node = node;
    ListSequence.fromList(SNodeOperations.getDescendants(SLinkOperations.getTarget(node, "body", true), null, false)).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.LocalVariableReference");
      }

    }).visitAll(new IVisitor <SNode>() {

      public void visit(SNode it) {
        if (SLinkOperations.getTarget(it, "variableDeclaration", false) == SLinkOperations.getTarget(fake_node, "variable", true)) {
          SNode arrayElement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ArrayAccessExpression", null);
          SLinkOperations.setTarget(arrayElement, "array", iterable, true);
          SLinkOperations.setNewChild(arrayElement, "index", "jetbrains.mps.baseLanguage.structure.LocalVariableReference");
          SLinkOperations.setTarget(SLinkOperations.getTarget(arrayElement, "index", true), "variableDeclaration", forVariableDeclaration, false);
          SNodeOperations.replaceWithAnother(it, arrayElement);
        }
      }

    });
    SLinkOperations.setTarget(forStatement, "body", SLinkOperations.getTarget(node, "body", true), true);
    // 
    SNodeOperations.replaceWithAnother(node, forStatement);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
