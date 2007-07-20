package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import java.awt.event.KeyEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.ParenthesizedExpression;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class CloseParenthesis_KeyMap extends EditorCellKeyMap {

  public  CloseParenthesis_KeyMap() {
    this.setApplicableToEveryModel(false);
    EditorCellKeyMapAction action;
    this.putAction("ctrl+shift", "VK_RIGHT", new CloseParenthesis_KeyMap.CloseParenthesis_KeyMap_Action0());
    this.putAction("ctrl+shift", "VK_LEFT", new CloseParenthesis_KeyMap.CloseParenthesis_KeyMap_Action1());
  }
  public static class CloseParenthesis_KeyMap_Action0 extends EditorCellKeyMapAction {

    public  CloseParenthesis_KeyMap_Action0() {
      this.setShownInPopupMenu(false);
    }

    public String getDescriptionText() {
      return "move closing parenthesis to the right";
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
      if(contextNode.isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.ParenthesizedExpression", editorContext.getOperationContext().getScope())) {
        return true;
      }
      return false;
    }
    public void execute(KeyEvent keyEvent, EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode());
    }
    public void execute_internal(KeyEvent keyEvent, EditorContext editorContext, SNode node) {
      ParenthesisUtil.moveParenthesisToTheRight(((ParenthesizedExpression)SNodeOperations.getAdapter(node)), editorContext);
    }
    public String getKeyStroke() {
      return "ctrl shift RIGHT";
    }
}
  public static class CloseParenthesis_KeyMap_Action1 extends EditorCellKeyMapAction {

    public  CloseParenthesis_KeyMap_Action1() {
      this.setShownInPopupMenu(false);
    }

    public String getDescriptionText() {
      return "move closing parenthesis to the left";
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
      if(contextNode.isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.ParenthesizedExpression", editorContext.getOperationContext().getScope())) {
        return true;
      }
      return false;
    }
    public void execute(KeyEvent keyEvent, EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode());
    }
    public void execute_internal(KeyEvent keyEvent, EditorContext editorContext, SNode node) {
      ParenthesisUtil.moveParenthesisToTheLeftInside(((ParenthesizedExpression)SNodeOperations.getAdapter(node)), editorContext);
    }
    public String getKeyStroke() {
      return "ctrl shift LEFT";
    }
}

}
