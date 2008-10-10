package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class AddInstanceInitializer_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Add Instance Initializer";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return (SLinkOperations.getTarget(node, "instanceInitializer", true) == null);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SLinkOperations.setNewChild(node, "instanceInitializer", "jetbrains.mps.baseLanguage.structure.InstanceInitializer");
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
