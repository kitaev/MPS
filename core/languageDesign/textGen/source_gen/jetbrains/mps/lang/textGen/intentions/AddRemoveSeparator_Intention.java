package jetbrains.mps.lang.textGen.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class AddRemoveSeparator_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.lang.textGen.structure.CollectionAppendPart";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return (SPropertyOperations.getBoolean(node, "withSeparator") ?
      "Remove separator" :
      "Add separator"
    );
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    if (SPropertyOperations.getBoolean(node, "withSeparator")) {
      SPropertyOperations.set(node, "separator", "");
    }
    SPropertyOperations.set(node, "withSeparator", "" + !(SPropertyOperations.getBoolean(node, "withSeparator")));
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.textGen.intentions";
  }

}
