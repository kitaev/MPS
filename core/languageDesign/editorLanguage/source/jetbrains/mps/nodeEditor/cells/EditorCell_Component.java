package jetbrains.mps.nodeEditor.cells;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.text.TextBuilder;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.AbstractEditorComponent;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EditorCell_Component extends EditorCell_Basic {
  private JComponent myComponent;

  public EditorCell_Component(EditorContext editorContext, SNode node, JComponent component) {
    super(editorContext, node);
    final AbstractEditorComponent nodeEditorComponent = editorContext.getNodeEditorComponent();
    myComponent = component;
    myJComponents.add(component);

    myComponent.addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        nodeEditorComponent.sendKeyEvent(e);
      }

      public void keyReleased(KeyEvent e) {
        nodeEditorComponent.sendKeyEvent(e);
      }
    });
  }

  public void setX(int x) {
    myComponent.setLocation(x, myComponent.getY());
    super.setX(x);
  }

  public void setY(int y) {
    myComponent.setLocation(myComponent.getX(), y);
    super.setY(y);
  }

  public void moveTo(int x, int y) {
    super.moveTo(x, y);
    myComponent.setLocation(myX, myY);
  }

  public void relayoutImpl() {
    Dimension preferredSize = myComponent.getPreferredSize();
    myComponent.setSize(preferredSize);
    setWidth(myComponent.getWidth());
    setHeight(myComponent.getHeight());
  }

  public boolean isDrawBorder() {
    return false;
  }

  public JComponent getComponent() {
    return myComponent;
  }

  public void paintContent(Graphics g) {
  }

  public int getAscent() {
    if (myComponent == null) {
      LOG.errorWithTrace("my component is null");
      return myHeight;
    }
    FontMetrics metrics = myComponent.getFontMetrics(myComponent.getFont());
    int ascent = metrics.getAscent();
    Border border = myComponent.getBorder();
    if (border != null) {
      ascent += border.getBorderInsets(myComponent).top;
    }
    return ascent;
  }

  public static EditorCell createComponentCell(EditorContext context, SNode node, JComponent component, String cellId) {
    EditorCell_Component editorCell_component = new EditorCell_Component(context, node, component);
    editorCell_component.putUserObject(CELL_ID, node.getId() + "_" + cellId);
    return editorCell_component;
  }

  public TextBuilder renderText() {
    return TextBuilder.fromString("[JComponent " + myComponent.toString() +  " ]");
  }

  protected boolean isSelectionPainted() {
    return false;
  }

  public void paintSelection(Graphics g) {
    paintSelection(g, getSelectionColor());
  }

  public String toString() {
    return "ComponentCell";
  }
}
