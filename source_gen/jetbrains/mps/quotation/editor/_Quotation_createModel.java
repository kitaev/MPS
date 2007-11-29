package jetbrains.mps.quotation.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import java.awt.event.KeyEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class _Quotation_createModel extends EditorCellKeyMap {

  public  _Quotation_createModel() {
    this.setApplicableToEveryModel(false);
    EditorCellKeyMapAction action;
    action = new _Quotation_createModel._Quotation_createModel_Action0();
    this.putAction("any", "[", action);
  }
  public static class _Quotation_createModel_Action0 extends EditorCellKeyMapAction {

    public  _Quotation_createModel_Action0() {
      super.setCaretPolicy(EditorCellKeyMapAction.CARET_AT_LAST_POSITION);
      this.setShownInPopupMenu(false);
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(KeyEvent keyEvent, EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if(contextNode == null) {
        return false;
      }
      if(contextNode.isInstanceOfConcept("jetbrains.mps.quotation.structure.Quotation")) {
        return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
      }
      return false;
    }

    public void execute(KeyEvent keyEvent, EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(KeyEvent keyEvent, EditorContext editorContext, SNode node, List<SNode> selectedNodes) {
      return SLinkOperations.getTarget(node, "modelToCreate", true) == null;
    }

    private void execute_internal(KeyEvent keyEvent, EditorContext editorContext, SNode node, List<SNode> selectedNodes) {
      SLinkOperations.setNewChild(node, "modelToCreate", "jetbrains.mps.baseLanguage.structure.Expression");
    }

    public String getKeyStroke() {
      return " [";
    }

}

}
