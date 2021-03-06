package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.AbstractAdditionalPainter;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JComponent;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorComponent;
import java.awt.Graphics;

public class OldChangesBlock extends AbstractAdditionalPainter<OldChangesBlock> {
  private List<OldChangeEditorMessage> myChanges = new ArrayList<OldChangeEditorMessage>();
  private int myMinY = 0;
  private int myMaxY = 0;
  private JComponent myRollbackIcon;

  public OldChangesBlock() {
  }

  public void addChange(OldChangeEditorMessage message, EditorCell cell) {
    if (myChanges.isEmpty()) {
      myMinY = cell.getY();
      myMaxY = cell.getY() + cell.getHeight();
    } else {
      if (myMinY > cell.getY()) {
        myMinY = cell.getY();
      }
      if (myMaxY < cell.getY() + cell.getHeight()) {
        myMaxY = cell.getY() + cell.getHeight();
      }
    }
    myChanges.add(message);
  }

  public void setRollbackButton(JComponent rollbackIcon) {
    myRollbackIcon = rollbackIcon;
  }

  public int getMinY() {
    return myMinY;
  }

  public int getMaxY() {
    return myMaxY;
  }

  public void paint(Graphics2D g, Dimension size) {
    g.setColor(Color.GRAY);
    g.drawLine(0, myMinY, (int) size.getWidth(), myMinY);
    g.drawLine(0, myMaxY, (int) size.getWidth(), myMaxY);
  }

  public void addTo(EditorComponent component) {
    component.addAdditionalPainter(this);
    if (myRollbackIcon != null) {
      component.add(myRollbackIcon);
      myRollbackIcon.setLocation(1, myMinY + 1);
    }
  }

  public List<OldChangeEditorMessage> getChanges() {
    return myChanges;
  }

  protected void revert() {
  }

  public void removeFrom(EditorComponent component) {
    component.removeAdditionalPainter(this);
    if (myRollbackIcon != null) {
      component.remove(myRollbackIcon);
    }
  }

  public void paint(Graphics g, EditorComponent editorComponent) {
    paint((Graphics2D) g, editorComponent.getSize());
  }

  public boolean paintsAbove() {
    return true;
  }

  public boolean paintsBackground() {
    return false;
  }

  public void paintBackground(Graphics g, EditorComponent editorComponent) {
  }

  public OldChangesBlock getItem() {
    return this;
  }
}
