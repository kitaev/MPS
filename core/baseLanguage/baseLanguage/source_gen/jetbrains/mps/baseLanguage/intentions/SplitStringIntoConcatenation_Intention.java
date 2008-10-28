package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class SplitStringIntoConcatenation_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.StringLiteral";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Split string into concatenation";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    EditorCell_Property ecProperty = (EditorCell_Property)editorContext.getContextCell();
    int caretPosition = ecProperty.getCaretPosition();
    String s1 = SPropertyOperations.getString(node, "value").substring(0, caretPosition);
    String s2 = SPropertyOperations.getString(node, "value").substring(caretPosition);
    SNode plusExpression = SNodeOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.structure.PlusExpression");
    SPropertyOperations.set(SLinkOperations.setNewChild(plusExpression, "leftExpression", "jetbrains.mps.baseLanguage.structure.StringLiteral"), "value", s1);
    SPropertyOperations.set(SLinkOperations.setNewChild(plusExpression, "rightExpression", "jetbrains.mps.baseLanguage.structure.StringLiteral"), "value", s2);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
