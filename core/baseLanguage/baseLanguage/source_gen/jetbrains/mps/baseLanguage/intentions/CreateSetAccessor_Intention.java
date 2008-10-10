package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class CreateSetAccessor_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.GetAccessor";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Create set accessor";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return (SLinkOperations.getTarget(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.CustomPropertyImplementation", false, false), "setAccessor", true) == null);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SLinkOperations.setNewChild(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.CustomPropertyImplementation", false, false), "setAccessor", "jetbrains.mps.baseLanguage.structure.SetAccessor");
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
