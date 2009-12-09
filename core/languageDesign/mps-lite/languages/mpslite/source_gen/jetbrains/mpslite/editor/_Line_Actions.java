package jetbrains.mpslite.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import java.awt.event.KeyEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class _Line_Actions extends EditorCellKeyMap {
  public _Line_Actions() {
    this.setApplicableToEveryModel(false);
    EditorCellKeyMapAction action;
    action = new _Line_Actions._Line_Actions_Action0();
    this.putAction("none", "VK_ENTER", action);
    action = new _Line_Actions._Line_Actions_Action1();
    this.putAction("none", "VK_ENTER", action);
    action = new _Line_Actions._Line_Actions_Action2();
    this.putAction("none", "VK_ENTER", action);
  }

  public static class _Line_Actions_Action0 extends EditorCellKeyMapAction {
    public _Line_Actions_Action0() {
      super.setCaretPolicy(EditorCellKeyMapAction.CARET_AT_LAST_POSITION);
      this.setShownInPopupMenu(false);
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (contextNode.isInstanceOfConcept("jetbrains.mpslite.structure.Line")) {
        return true;
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNodeOperations.insertNextSiblingChild(node, SConceptOperations.createNewNode("jetbrains.mpslite.structure.Line", null));
    }

    public String getKeyStroke() {
      return "none ENTER";
    }
  }

  public static class _Line_Actions_Action1 extends EditorCellKeyMapAction {
    public _Line_Actions_Action1() {
      super.setCaretPolicy(EditorCellKeyMapAction.CARET_AT_FIRST_POSITION);
      this.setShownInPopupMenu(false);
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (contextNode.isInstanceOfConcept("jetbrains.mpslite.structure.Line")) {
        return true;
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNodeOperations.insertPrevSiblingChild(node, SConceptOperations.createNewNode("jetbrains.mpslite.structure.Line", null));
    }

    public String getKeyStroke() {
      return "none ENTER";
    }
  }

  public static class _Line_Actions_Action2 extends EditorCellKeyMapAction {
    public _Line_Actions_Action2() {
      super.setCaretPolicy(EditorCellKeyMapAction.CARET_AT_INTERMEDIATE_POSITION);
      this.setShownInPopupMenu(false);
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (contextNode.isInstanceOfConcept("jetbrains.mpslite.structure.Line")) {
        return true;
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode selectedNode = editorContext.getSelectedNode();
      SNode linePart = SNodeOperations.getAncestor(selectedNode, "jetbrains.mpslite.structure.LinePart", true, false);
      SNode prevLinePart = null;
      while (linePart != null) {
        prevLinePart = linePart;
        linePart = SNodeOperations.getAncestor(linePart, "jetbrains.mpslite.structure.LinePart", false, false);
      }
      if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(prevLinePart), "jetbrains.mpslite.structure.Line")) {
        SNode line = SNodeOperations.cast(SNodeOperations.getParent(prevLinePart), "jetbrains.mpslite.structure.Line");
        SNode nextLine = SNodeOperations.insertNextSiblingChild(line, SConceptOperations.createNewNode("jetbrains.mpslite.structure.Line", null));
        SNode sibling = SNodeOperations.cast(SNodeOperations.getNextSibling(prevLinePart), "jetbrains.mpslite.structure.LinePart");
        while (sibling != null) {
          SNode currentSibling = sibling;
          sibling = SNodeOperations.cast(SNodeOperations.getNextSibling(sibling), "jetbrains.mpslite.structure.LinePart");
          line.removeChild(currentSibling);
          ListSequence.fromList(SLinkOperations.getTargets(nextLine, "linePart", true)).addElement(currentSibling);
        }
      }
    }

    public String getKeyStroke() {
      return "none ENTER";
    }
  }
}
