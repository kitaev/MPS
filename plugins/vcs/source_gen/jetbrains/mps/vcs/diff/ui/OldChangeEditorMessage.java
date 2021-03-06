package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultEditorMessage;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.vcs.diff.oldchanges.OldChange;
import jetbrains.mps.smodel.SNode;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorMessageOwner;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.EditorMessage;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.nodeEditor.cells.PropertyAccessor;
import java.awt.Graphics;

public class OldChangeEditorMessage extends DefaultEditorMessage {
  private String myProperty;
  private String myRole;
  @NotNull
  private OldChange myChange;

  public OldChangeEditorMessage(OldChange change, SNode node, Color color, String message, EditorMessageOwner owner) {
    super(node, color, message, owner);
    myChange = change;
  }

  @Override
  public boolean isBackground() {
    return true;
  }

  @Override
  public boolean acceptCell(EditorCell cell, EditorComponent editor) {
    if (cell == null) {
      return false;
    }
    boolean accept = acceptCellInternal(cell, editor);
    return accept;
  }

  @Override
  public boolean sameAs(EditorMessage o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OldChangeEditorMessage message = (OldChangeEditorMessage) o;
    return myChange.equals(message.myChange);
  }

  private boolean acceptCellInternal(EditorCell cell, EditorComponent editor) {
    if (!((editor.isValid(cell) && cell.getSNode() == getNode()))) {
      return false;
    }
    if (myProperty != null) {
      if (!((cell instanceof EditorCell_Property))) {
        return false;
      }
      ModelAccessor modelAccessor = ((EditorCell_Property) cell).getModelAccessor();
      if (modelAccessor instanceof PropertyAccessor) {
        return myProperty.equals(((PropertyAccessor) modelAccessor).getPropertyName());
      }
      return true;
    }
    if (myRole != null) {
      return myRole.equals(cell.getRole());
    }
    return cell.isBigCell();
  }

  @Override
  public void paint(Graphics g, EditorComponent editorComponent, EditorCell cell) {
    if (getColor() != null) {
      cell.paintSelection(g, getColor(), false);
    }
  }

  public void setProperty(String property) {
    myProperty = property;
  }

  public void setRole(String role) {
    myRole = role;
  }

  @NotNull
  public OldChange getChange() {
    return myChange;
  }
}
