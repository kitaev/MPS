package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class AddAnnotation_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.HasAnnotation";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, EditorContext editorContext) {
    return "Add annotation";
  }

  public boolean isApplicable(SNode node, EditorContext editorContext) {
    return ListSequence.fromList(SLinkOperations.getTargets(node, "annotation", true)).isEmpty();
  }

  public void execute(SNode node, EditorContext editorContext) {
    SNode annotationInstance = SLinkOperations.addNewChild(node, "annotation", "jetbrains.mps.baseLanguage.structure.AnnotationInstance");
    editorContext.select(annotationInstance);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
