package jetbrains.mps.baseLanguage.logging.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ToggleExceptionSection_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.logging.structure.LogStatement";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return (SPropertyOperations.getBoolean(node, "hasException") ?
      "Hide Exception Section" :
      "Show Exception Section"
    );
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SPropertyOperations.set(node, "hasException", "" + (!(SPropertyOperations.getBoolean(node, "hasException"))));
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.logging.intentions";
  }

}
