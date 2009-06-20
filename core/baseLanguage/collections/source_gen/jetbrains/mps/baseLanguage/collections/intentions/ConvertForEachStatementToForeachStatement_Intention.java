package jetbrains.mps.baseLanguage.collections.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class ConvertForEachStatementToForeachStatement_Intention extends BaseIntention {

  public ConvertForEachStatementToForeachStatement_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.collections.structure.ForEachStatement";
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
    return "Convert to 'for (Type var: iterable)'";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    final SNode oldVariable = SLinkOperations.getTarget(node, "variable", true);
    SNode variableType = SNodeOperations.cast(SNodeOperations.copyNode(TypeChecker.getInstance().getTypeOf(oldVariable)), "jetbrains.mps.baseLanguage.structure.Type");
    SNode foreachStatement = SNodeOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.structure.ForeachStatement");
    SLinkOperations.setTarget(foreachStatement, "body", SLinkOperations.getTarget(node, "body", true), true);
    SLinkOperations.setTarget(foreachStatement, "iterable", SLinkOperations.getTarget(node, "inputSequence", true), true);
    SPropertyOperations.set(foreachStatement, "label", SPropertyOperations.getString(node, "label"));
    SNode newVariable = SLinkOperations.setNewChild(foreachStatement, "variable", "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
    SPropertyOperations.set(newVariable, "name", SPropertyOperations.getString(oldVariable, "name"));
    SLinkOperations.setTarget(newVariable, "type", variableType, true);
    for(SNode oldRef : ListSequence.fromList(SNodeOperations.getDescendants(SLinkOperations.getTarget(foreachStatement, "body", true), "jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference", false)).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return SLinkOperations.getTarget(it, "variable", false) == oldVariable;
      }
    })) {
      SLinkOperations.setTarget(SNodeOperations.replaceWithNewChild(oldRef, "jetbrains.mps.baseLanguage.structure.LocalVariableReference"), "variableDeclaration", newVariable, false);
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.collections.intentions";
  }

}
