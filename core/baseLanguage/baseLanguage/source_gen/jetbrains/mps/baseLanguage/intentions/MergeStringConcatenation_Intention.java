package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import java.util.Map;
import java.util.HashMap;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class MergeStringConcatenation_Intention extends BaseIntention implements Intention {

  private Map<String, Object[]> myMap = new HashMap<String, Object[]>();

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.PlusExpression";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, EditorContext editorContext) {
    return "Merge string concatination";
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "leftExpression", true), "jetbrains.mps.baseLanguage.structure.StringLiteral") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "rightExpression", true), "jetbrains.mps.baseLanguage.structure.StringLiteral");
  }

  public void execute(SNode node, EditorContext editorContext) {
    SNode stringLiteral = SNodeOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.structure.StringLiteral");
    String left = SPropertyOperations.getString(SLinkOperations.getTarget(node, "leftExpression", true), "value");
    String right = SPropertyOperations.getString(SLinkOperations.getTarget(node, "rightExpression", true), "value");
    SPropertyOperations.set(stringLiteral, "value", left + right);
    editorContext.selectAndSetCaret(stringLiteral, left.length() + 1);
  }

  public Object[] getField(String key) {
    Object[] value = this.myMap.get(key);
    if (value == null) {
      value = new Object[1];
      this.myMap.put(key, value);
    }
    return value;
  }

  public void putArgument(String key, Object argument) {
    this.getField(key)[0] = argument;
  }

  public String getSourceModelUID() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
