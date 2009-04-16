package jetbrains.mps.lang.editor.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.editor.behavior.CellModel_ListWithRole_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class ChangeOrientationList_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.lang.editor.structure.CellModel_ListWithRole";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return (CellModel_ListWithRole_Behavior.call_isVertical_1239873472748(node) ?
      "Make Horizontal" :
      "Make Vertical"
    );
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Horizontal") || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Vertical");
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    if (CellModel_ListWithRole_Behavior.call_isVertical_1239873472748(node)) {
      SLinkOperations.setTarget(node, "cellLayout", SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.CellLayout_Horizontal", null), true);
    } else
    {
      SLinkOperations.setTarget(node, "cellLayout", SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.CellLayout_Vertical", null), true);
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.editor.intentions";
  }

}
