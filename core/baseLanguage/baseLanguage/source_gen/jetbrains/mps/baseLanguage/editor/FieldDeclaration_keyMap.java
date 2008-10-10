package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import java.awt.event.KeyEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.FieldDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class FieldDeclaration_keyMap extends EditorCellKeyMap {

  public FieldDeclaration_keyMap() {
    this.setApplicableToEveryModel(false);
    EditorCellKeyMapAction action;
    action = new FieldDeclaration_keyMap.FieldDeclaration_keyMap_Action0();
    this.putAction("alt", "VK_INSERT", action);
    this.putAction("alt", "VK_HELP", action);
    action = new FieldDeclaration_keyMap.FieldDeclaration_keyMap_Action1();
    this.putAction("alt", "VK_INSERT", action);
    this.putAction("alt", "VK_HELP", action);
  }
  public static class FieldDeclaration_keyMap_Action0 extends EditorCellKeyMapAction {

    public FieldDeclaration_keyMap_Action0() {
      this.setShownInPopupMenu(true);
    }

    public String getDescriptionText() {
      return "Generate getter";
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
      if (contextNode.isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.FieldDeclaration")) {
        return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode classConcept = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
      return (classConcept != null) && !(FieldDeclaration_Behavior.call_hasGetter_1213877243808(node, classConcept));
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode g;
      g = new QuotationClass_0().createNode(SNodeOperations.copyNode(SLinkOperations.getTarget(node, "type", true)), node, FieldDeclaration_Behavior.call_getGetterName_1213877243782(node));
      SLinkOperations.addChild(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false), "method", g);
    }

    public String getKeyStroke() {
      return "alt INSERT";
    }

}
  public static class FieldDeclaration_keyMap_Action1 extends EditorCellKeyMapAction {

    public FieldDeclaration_keyMap_Action1() {
      this.setShownInPopupMenu(true);
    }

    public String getDescriptionText() {
      return "Generate setter";
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
      if (contextNode.isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.FieldDeclaration")) {
        return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode classConcept = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
      return (classConcept != null) && !(FieldDeclaration_Behavior.call_hasSetter_1213877243871(node, classConcept));
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode s;
      s = new QuotationClass_1().createNode(node, FieldDeclaration_Behavior.call_getSetterName_1213877243861(node), SNodeOperations.copyNode(SLinkOperations.getTarget(node, "type", true)), SPropertyOperations.getString(node, "name"));
      SLinkOperations.addChild(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false), "method", s);
    }

    public String getKeyStroke() {
      return "alt INSERT";
    }

}

}
