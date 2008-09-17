package webr.xml.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import webr.xml.behavior.ContentList_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class MakeElementVertical_Intention extends BaseIntention {

  public String getConcept() {
    return "webr.xml.structure.Element";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Make element vertical";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return ContentList_Behavior.call_isHorizontal_1221256530294(SLinkOperations.getTarget(node, "contentList", true));
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SPropertyOperations.set(SLinkOperations.getTarget(node, "contentList", true), "isHorizontal", "" + (false));
  }

  public String getLocationString() {
    return "webr.xml.intentions";
  }

}
