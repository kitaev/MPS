package jetbrains.mps.lang.smodel.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ChangeAsCast_Intention extends BaseIntention {

  public ChangeAsCast_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    if (SPropertyOperations.getBoolean(node, "asCast")) {
      return "Convert to Regular Cast";
    } else
    {
      return "Convert to 'as' Cast";
    }
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SPropertyOperations.set(node, "asCast", "" + !(SPropertyOperations.getBoolean(node, "asCast")));
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.smodel.intentions";
  }

}
