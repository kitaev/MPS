package jetbrains.mps.lang.editor.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ChangeOrientationAlternation_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.lang.editor.structure.CellModel_Alternation";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return (SPropertyOperations.getBoolean(node, "vertical") ?
      "Make horizontal" :
      "Make vertical"
    );
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SPropertyOperations.set(node, "vertical", "" + !(SPropertyOperations.getBoolean(node, "vertical")));
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.editor.intentions";
  }

}
