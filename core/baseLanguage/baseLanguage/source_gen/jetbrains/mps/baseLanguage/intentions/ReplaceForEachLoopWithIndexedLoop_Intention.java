package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ReplaceForEachLoopWithIndexedLoop_Intention extends BaseIntention implements Intention {
  public ReplaceForEachLoopWithIndexedLoop_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ForeachStatement";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Replace Foreach Loop with Indexed Loop";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "iterable", true)), "jetbrains.mps.baseLanguage.structure.ArrayType") || SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "iterable", true)), "jetbrains.mps.baseLanguage.collections.structure.ListType");
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode iterable = SLinkOperations.getTarget(node, "iterable", true);
    SNode forStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ForStatement", null);
    SPropertyOperations.set(forStatement, "label", SPropertyOperations.getString(node, "label"));

    SNode forVariableDeclaration = SLinkOperations.setNewChild(forStatement, "variable", "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
    boolean containsDefault = false;
    String name = "i";
    List<SNode> localVariableDeclarations = SNodeOperations.getDescendants(SLinkOperations.getTarget(node, "body", true), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration", false, new String[]{});
    ListSequence.fromList(localVariableDeclarations).addElement(SLinkOperations.getTarget(node, "variable", true));
    for (SNode localVar : localVariableDeclarations) {
      String varName = SPropertyOperations.getString(localVar, "name");
      if (varName.equals(name)) {
        containsDefault = true;
      }
    }
    int nameSuffix = 0;
    while (containsDefault) {
      nameSuffix++;
      containsDefault = false;
      for (SNode localVar : localVariableDeclarations) {
        String varName = SPropertyOperations.getString(localVar, "name");
        if (varName.equals(name + nameSuffix)) {
          containsDefault = true;
        }
      }
    }
    SPropertyOperations.set(forVariableDeclaration, "name", (nameSuffix == 0 ?
      name :
      name + nameSuffix
    ));
    SLinkOperations.setTarget(forVariableDeclaration, "type", new ReplaceForEachLoopWithIndexedLoop_Intention.QuotationClass_nfmyw1_a2a31a7().createNode(), true);
    SLinkOperations.setNewChild(forVariableDeclaration, "initializer", "jetbrains.mps.baseLanguage.structure.IntegerConstant");
    SPropertyOperations.set(SNodeOperations.cast(SLinkOperations.getTarget(forVariableDeclaration, "initializer", true), "jetbrains.mps.baseLanguage.structure.IntegerConstant"), "value", "" + (0));

    SNode forCondition = SLinkOperations.setNewChild(forStatement, "condition", "jetbrains.mps.baseLanguage.structure.LessThanExpression");
    SLinkOperations.setNewChild(forCondition, "leftExpression", "jetbrains.mps.baseLanguage.structure.LocalVariableReference");
    SLinkOperations.setTarget(SNodeOperations.cast(SLinkOperations.getTarget(forCondition, "leftExpression", true), "jetbrains.mps.baseLanguage.structure.LocalVariableReference"), "variableDeclaration", forVariableDeclaration, false);
    if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "iterable", true)), "jetbrains.mps.baseLanguage.structure.ArrayType")) {
      SLinkOperations.setNewChild(SLinkOperations.setNewChild(forCondition, "rightExpression", "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", "jetbrains.mps.baseLanguage.structure.ArrayLengthOperation");
    } else if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "iterable", true)), "jetbrains.mps.baseLanguage.collections.structure.ListType")) {
      SLinkOperations.setNewChild(SLinkOperations.setNewChild(forCondition, "rightExpression", "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", "jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation");
    } else {
      return;
    }
    SLinkOperations.setTarget(SNodeOperations.cast(SLinkOperations.getTarget(forCondition, "rightExpression", true), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", SNodeOperations.copyNode(iterable), true);

    SNode iterationExpr = SLinkOperations.setNewChild(forStatement, "iteration", "jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression");
    SLinkOperations.setNewChild(iterationExpr, "expression", "jetbrains.mps.baseLanguage.structure.LocalVariableReference");
    SLinkOperations.setTarget(SNodeOperations.cast(SLinkOperations.getTarget(iterationExpr, "expression", true), "jetbrains.mps.baseLanguage.structure.LocalVariableReference"), "variableDeclaration", forVariableDeclaration, false);

    SNode firstStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement", null);
    final SNode variable = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration", null);
    SLinkOperations.setTarget(firstStatement, "localVariableDeclaration", variable, true);
    SPropertyOperations.set(variable, "name", SPropertyOperations.getString(SLinkOperations.getTarget(node, "variable", true), "name"));
    SLinkOperations.setTarget(variable, "type", SLinkOperations.getTarget(SLinkOperations.getTarget(node, "variable", true), "type", true), true);

    SNode iteratorReference = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableReference", null);
    SLinkOperations.setTarget(iteratorReference, "variableDeclaration", forVariableDeclaration, false);
    if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "iterable", true)), "jetbrains.mps.baseLanguage.structure.ArrayType")) {
      SNode arrayAccess = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ArrayAccessExpression", null);
      SLinkOperations.setTarget(arrayAccess, "array", SNodeOperations.copyNode(SLinkOperations.getTarget(node, "iterable", true)), true);
      SLinkOperations.setTarget(arrayAccess, "index", iteratorReference, true);
      SLinkOperations.setTarget(variable, "initializer", arrayAccess, true);
    } else if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "iterable", true)), "jetbrains.mps.baseLanguage.collections.structure.ListType")) {
      SNode listAccess = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.collections.structure.ListElementAccessExpression", null);
      SLinkOperations.setTarget(listAccess, "list", SNodeOperations.copyNode(SLinkOperations.getTarget(node, "iterable", true)), true);
      SLinkOperations.setTarget(listAccess, "index", listAccess, true);
      SLinkOperations.setTarget(variable, "initializer", listAccess, true);
    }

    final SNode fake_node = node;
    ListSequence.fromList(SNodeOperations.getDescendants(SLinkOperations.getTarget(node, "body", true), null, false, new String[]{})).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, "jetbrains.mps.baseLanguage.structure.LocalVariableReference");
      }
    }).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        if (SLinkOperations.getTarget(SNodeOperations.cast(it, "jetbrains.mps.baseLanguage.structure.LocalVariableReference"), "variableDeclaration", false) == SLinkOperations.getTarget(fake_node, "variable", true)) {
          SNode itemReference = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableReference", null);
          SLinkOperations.setTarget(itemReference, "variableDeclaration", variable, false);
          SNodeOperations.replaceWithAnother(it, itemReference);
        }
      }
    });
    SLinkOperations.setTarget(forStatement, "body", SLinkOperations.getTarget(node, "body", true), true);
    ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(forStatement, "body", true), "statement", true)).insertElement(0, firstStatement);
    // 
    SNodeOperations.replaceWithAnother(node, forStatement);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

  public static class QuotationClass_nfmyw1_a2a31a7 {
    public QuotationClass_nfmyw1_a2a31a7() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
