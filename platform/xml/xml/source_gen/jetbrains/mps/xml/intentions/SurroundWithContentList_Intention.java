package jetbrains.mps.xml.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class SurroundWithContentList_Intention extends BaseIntention {

  public SurroundWithContentList_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.xml.structure.Content";
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
    return "Surround with Content List";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode contentList = SConceptOperations.createNewNode("jetbrains.mps.xml.structure.ContentList", null);
    List<SNode> selectedNodes = editorContext.getNodeEditorComponent().getNodeRangeSelection().getNodes();
    if (ListSequence.fromList(selectedNodes).isEmpty()) {
      ListSequence.fromList(selectedNodes).addElement(editorContext.getSelectedNode());
    }
    SNode first = ListSequence.fromList(selectedNodes).getElement(0);
    SNodeOperations.insertPrevSiblingChild(first, contentList);
    for(SNode selectedNode : ListSequence.fromList(selectedNodes)) {
      SLinkOperations.addChild(contentList, "content", SNodeOperations.cast(selectedNode, "jetbrains.mps.xml.structure.Content"));
    }
    SLinkOperations.addNewChild(contentList, "content", "jetbrains.mps.xml.structure.Content");
  }

  public String getLocationString() {
    return "jetbrains.mps.xml.intentions";
  }

}
