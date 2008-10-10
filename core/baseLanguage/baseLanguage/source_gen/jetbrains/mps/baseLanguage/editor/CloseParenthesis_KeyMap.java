package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import java.awt.event.KeyEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.baseLanguage.structure.ParenthesizedExpression;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class CloseParenthesis_KeyMap extends EditorCellKeyMap {

  public CloseParenthesis_KeyMap() {
    this.setApplicableToEveryModel(false);
    EditorCellKeyMapAction action;
    action = new CloseParenthesis_KeyMap.CloseParenthesis_KeyMap_Action0();
    this.putAction("ctrl+shift", "VK_RIGHT", action);
    action = new CloseParenthesis_KeyMap.CloseParenthesis_KeyMap_Action1();
    this.putAction("ctrl+shift", "VK_LEFT", action);
  }
  public static class CloseParenthesis_KeyMap_Action0 extends EditorCellKeyMapAction {

    public CloseParenthesis_KeyMap_Action0() {
      this.setShownInPopupMenu(false);
    }

    public String getDescriptionText() {
      return "move closing parenthesis to the right";
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
      if (contextNode.isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.ParenthesizedExpression")) {
        return true;
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      ParenthesisUtil.moveParenthesisToTheRight(((ParenthesizedExpression)SNodeOperations.getAdapter(node)), editorContext);
    }

    public String getKeyStroke() {
      return "ctrl shift RIGHT";
    }

}
  public static class CloseParenthesis_KeyMap_Action1 extends EditorCellKeyMapAction {

    public CloseParenthesis_KeyMap_Action1() {
      this.setShownInPopupMenu(false);
    }

    public String getDescriptionText() {
      return "move closing parenthesis to the left";
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
      if (contextNode.isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.ParenthesizedExpression")) {
        return true;
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      ParenthesisUtil.moveParenthesisToTheLeftInside(((ParenthesizedExpression)SNodeOperations.getAdapter(node)), editorContext);
    }

    public String getKeyStroke() {
      return "ctrl shift LEFT";
    }

}

}
