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
import jetbrains.mps.baseLanguage.search.ClassifierAndSuperClassifiersScope;
import jetbrains.mps.baseLanguage.structure.Classifier;
import jetbrains.mps.baseLanguage.search.IClassifiersSearchScope;
import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;
import jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import javax.swing.SwingUtilities;
import jetbrains.mps.baseLanguage.plugin.uiActions.OverrideMethodDialog;
import jetbrains.mps.baseLanguage.plugin.uiActions.ImplementMethodDialog;

public class MethodHierarchy_KeyMap extends EditorCellKeyMap {
  public MethodHierarchy_KeyMap() {
    this.setApplicableToEveryModel(true);
    EditorCellKeyMapAction action;
    action = new MethodHierarchy_KeyMap.MethodHierarchy_KeyMap_Action0();
    this.putAction("ctrl", "VK_U", action);
    action = new MethodHierarchy_KeyMap.MethodHierarchy_KeyMap_Action1();
    this.putAction("ctrl", "VK_O", action);
    action = new MethodHierarchy_KeyMap.MethodHierarchy_KeyMap_Action2();
    this.putAction("ctrl", "VK_I", action);
  }
  public static class MethodHierarchy_KeyMap_Action0 extends EditorCellKeyMapAction {
    public MethodHierarchy_KeyMap_Action0() {
      this.setShownInPopupMenu(true);
    }

    public String getDescriptionText() {
      return "Go To Overriden Method";
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
      return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      return (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", true, false) != null);
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode method = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", true, false);
      SNode declClassifier = SNodeOperations.getAncestor(method, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
      if ((declClassifier != null)) {
        ClassifierAndSuperClassifiersScope scope = new ClassifierAndSuperClassifiersScope(((Classifier)SNodeOperations.getAdapter(declClassifier)), IClassifiersSearchScope.INSTANCE_METHOD);
        List<BaseMethodDeclaration> list = scope.getOverriddenMethods(((InstanceMethodDeclaration)SNodeOperations.getAdapter(method)));
        SNode overriden = SNodeOperations.cast(BaseAdapter.fromAdapter(ListSequence.fromList(list).first()), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
        if (overriden != null) {
          IOperationContext context = editorContext.getOperationContext();
          context.getComponent(MPSEditorOpener.class).editNode(overriden, context);
        }
      }
    }

    public String getKeyStroke() {
      return "ctrl U";
    }
  }

  public static class MethodHierarchy_KeyMap_Action1 extends EditorCellKeyMapAction {
    public MethodHierarchy_KeyMap_Action1() {
      this.setShownInPopupMenu(true);
    }

    public String getDescriptionText() {
      return "Override Method...";
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
      return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      return (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", true, false) != null);
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          new OverrideMethodDialog(node, editorContext, editorContext.getOperationContext().getMainFrame()).showDialog();
        }
      });
    }

    public String getKeyStroke() {
      return "ctrl O";
    }
  }

  public static class MethodHierarchy_KeyMap_Action2 extends EditorCellKeyMapAction {
    public MethodHierarchy_KeyMap_Action2() {
      this.setShownInPopupMenu(true);
    }

    public String getDescriptionText() {
      return "Implement Method...";
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
      return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      return (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", true, false) != null);
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          new ImplementMethodDialog(node, editorContext, editorContext.getOperationContext().getMainFrame()).showDialog();
        }
      });
    }

    public String getKeyStroke() {
      return "ctrl I";
    }
  }
}
