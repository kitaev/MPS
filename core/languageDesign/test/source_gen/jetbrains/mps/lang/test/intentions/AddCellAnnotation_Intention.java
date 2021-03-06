package jetbrains.mps.lang.test.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.inspector.InspectorEditorComponent;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.selection.Selection;
import jetbrains.mps.nodeEditor.selection.NodeRangeSelection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class AddCellAnnotation_Intention extends BaseIntention implements Intention {
  public AddCellAnnotation_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
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
    return "Add Editor Annotation";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return SNodeOperations.getAncestor(node, "jetbrains.mps.lang.test.structure.EditorTestCase", false, false) != null;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode ancessor = node;
    while (ancessor != null && !(SNodeOperations.isInstanceOf(SNodeOperations.getParent(ancessor), "jetbrains.mps.lang.test.structure.EditorTestCase"))) {
      ancessor = SNodeOperations.getParent(ancessor);
    }
    for (SNode oldAnnotation : SNodeOperations.getDescendants(ancessor, "jetbrains.mps.lang.test.structure.AnonymousCellAnnotation", false, new String[]{})) {
      SNodeOperations.deleteNode(oldAnnotation);
    }
    SNode newAnnotation = SNodeFactoryOperations.createNewNode("jetbrains.mps.lang.test.structure.AnonymousCellAnnotation", null);
    EditorCell contextCell = editorContext.getContextCell();
    if (contextCell.getEditor() instanceof InspectorEditorComponent) {
      SPropertyOperations.set(newAnnotation, "isInInspector", "" + true);
    }
    if (contextCell instanceof EditorCell_Label) {
      EditorCell_Label label = (EditorCell_Label) contextCell;
      int caretPosition = label.getCaretPosition();
      if (caretPosition == label.getText().length()) {
        SPropertyOperations.set(newAnnotation, "isLastPosition", "" + true);
      } else {
        SPropertyOperations.set(newAnnotation, "caretPosition", "" + caretPosition);
      }
      SPropertyOperations.set(newAnnotation, "useLabelSelection", "" + true);
      SPropertyOperations.set(newAnnotation, "selectionStart", "" + label.getSelectionStart());
      SPropertyOperations.set(newAnnotation, "selectionEnd", "" + label.getSelectionEnd());
    } else {
      SPropertyOperations.set(newAnnotation, "caretPosition", "" + 0);
    }
    SPropertyOperations.set(newAnnotation, "cellId", contextCell.getCellId());
    Selection selection = editorContext.getNodeEditorComponent().getSelectionManager().getSelection();
    if (selection instanceof NodeRangeSelection) {
      NodeRangeSelection nodeRangeSelection = (NodeRangeSelection) selection;
      SLinkOperations.setTarget(newAnnotation, "nodeRangeSelectionStart", nodeRangeSelection.getFirstNode(), false);
      SLinkOperations.setTarget(newAnnotation, "nodeRangeSelectionEnd", nodeRangeSelection.getLastNode(), false);
    }
    AttributeOperations.setAttribute(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.test.structure.INodeAnnotattion")), newAnnotation);
    editorContext.select(newAnnotation);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.test.intentions";
  }
}
