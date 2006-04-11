package jetbrains.mps.ide;

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodeProxy;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;

import javax.swing.*;

public interface IEditor {
  JComponent getComponent();

  void rebuildEditorContent();
  void relayout();

  IOperationContext getOperationContext();

  EditorContext getEditorContext();

  EditorCell getSelectedCell();
  EditorCell getRootCell();

  SNode getSNode();
  SNodeProxy getSNodeProxy();

  void selectNode(SNode node);

  void clear();
}
