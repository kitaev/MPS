package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.IfStatement_Behavior;

public class ConvertElseToElseIf_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.IfStatement";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Convert else block to else if";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return (SLinkOperations.getTarget(node, "ifFalseStatement", true) != null);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    IfStatement_Behavior.call_convertElseToElseIf_1217845914183(node);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
