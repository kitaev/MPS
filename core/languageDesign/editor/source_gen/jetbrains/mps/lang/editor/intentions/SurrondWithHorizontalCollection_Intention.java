package jetbrains.mps.lang.editor.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class SurrondWithHorizontalCollection_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.lang.editor.structure.EditorCellModel";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Surround with Horizontal Collection";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return ListSequence.fromList(((List<SNode>)editorContext.getSelectedNodes())).isNotEmpty();
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode result = SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.CellModel_Collection", null);
    SLinkOperations.setTarget(result, "cellLayout", SConceptOperations.createNewNode("jetbrains.mps.lang.editor.structure.CellLayout_Horizontal", null), true);
    List<SNode> nodes = editorContext.getSelectedNodes();
    SNodeOperations.insertNextSiblingChild(ListSequence.fromList(nodes).last(), result);
    for(SNode sn : nodes) {
      SLinkOperations.addChild(result, "childCellModel", SNodeOperations.cast(sn, "jetbrains.mps.lang.editor.structure.EditorCellModel"));
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.editor.intentions";
  }

}
