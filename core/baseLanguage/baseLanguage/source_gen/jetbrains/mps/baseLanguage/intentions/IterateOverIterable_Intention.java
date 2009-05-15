package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;

public class IterateOverIterable_Intention extends BaseIntention {

  public IterateOverIterable_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ExpressionStatement";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Iterate Over Iterable";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return (TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "expression", true)), new _Patterns.Pattern_1(), true) != null);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    {
      _Patterns.Pattern_0 pattern_0 = new _Patterns.Pattern_0();
      SNode coercedNode_0 = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "expression", true)), pattern_0);
      if (coercedNode_0 != null) {
        SNode foreachStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ForeachStatement", null);
        SNode variableDeclaration = SLinkOperations.setNewChild(foreachStatement, "variable", "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
        SLinkOperations.setTarget(variableDeclaration, "type", SNodeOperations.copyNode(pattern_0.PatternVar0), true);
        SPropertyOperations.set(variableDeclaration, "name", NameUtil.toValidIdentifier(BaseConcept_Behavior.call_getPresentation_1213877396640(pattern_0.PatternVar0)));
        SLinkOperations.setTarget(foreachStatement, "iterable", SNodeOperations.copyNode(SLinkOperations.getTarget(node, "expression", true)), true);
        SNodeOperations.insertNextSiblingChild(node, foreachStatement);
        SNodeOperations.deleteNode(node);
      } else
      {
      }
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
