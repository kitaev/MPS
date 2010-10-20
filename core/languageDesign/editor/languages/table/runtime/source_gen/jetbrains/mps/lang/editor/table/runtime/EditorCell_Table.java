package jetbrains.mps.lang.editor.table.runtime;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Table;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.TableComponent;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import java.awt.Graphics;
import java.awt.Color;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class EditorCell_Table extends EditorCell_Collection {
  private TableModel myModel;

  public EditorCell_Table(EditorContext editorContext, SNode node, CellLayout cellLayout, TableModel model) {
    super(editorContext, node, new CellLayout_Table(), null);
    myModel = model;
    this.setSelectable(false);
    this.getStyle().set(StyleAttributes.TABLE_COMPONENT, TableComponent.VERTICAL_COLLECTION);
    createChildrenCells();
  }

  public void createChildrenCells() {
    for (int row = 0; row < myModel.getRowsNumber(); row++) {
      EditorCell_Collection rowCell = this.createRowCell(row);
      final int finalRow = row;
      for (int column = 0; column < myModel.getColumnsNumber(); column++) {
        final int finalColumn = column;
        SNode value = myModel.getValueAt(row, column);
        EditorCell editorCell;
        if (value != null) {
          editorCell = getEditorContext().createNodeCell(value);
          editorCell.setAction(CellActionType.DELETE, new EditorCellAction() {
            public void execute(EditorContext editorContext) {
            }
          });
        } else {
          editorCell = new EditorCell_Constant(getEditorContext(), getSNode(), "");
          editorCell.setAction(CellActionType.INSERT, new EditorCellAction() {
            public void execute(EditorContext editorContext) {
              myModel.createElement(finalRow, finalColumn);
            }
          });
        }
        editorCell.setLeftGap(4);
        editorCell.setRightGap(4);

        rowCell.addEditorCell(editorCell);
      }

      EditorCell_Constant lastCell = new EditorCell_Constant(getEditorContext(), getSNode(), "");
      lastCell.setAction(CellActionType.INSERT, new EditorCellAction() {
        public void execute(EditorContext p0) {
          myModel.insertRow(finalRow + 1);
        }
      });
      rowCell.addEditorCell(lastCell);
      this.addEditorCell(rowCell);
    }
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    graphics.setColor(Color.GRAY);
    List<Integer> positions = ListSequence.fromList(new ArrayList<Integer>());
    for (EditorCell row : getCells()) {
      EditorCell[] rowCells = ((EditorCell_Collection) row).getCells();
      int rowLastLine = rowCells[rowCells.length - 1].getX();
      graphics.drawLine(getX(), row.getY(), rowLastLine, row.getY());
      graphics.drawLine(getX(), row.getY() + row.getHeight(), rowLastLine, row.getY() + row.getHeight());
      int index = 0;
      for (EditorCell cell : rowCells) {
        int x = cell.getX();
        if (index >= ListSequence.fromList(positions).count()) {
          ListSequence.fromList(positions).addElement(x);
        } else {
          ListSequence.fromList(positions).setElement(index, Math.min(x, ListSequence.fromList(positions).getElement(index)));
        }
        index++;
      }
    }
    for (int x : ListSequence.fromList(positions)) {
      graphics.drawLine(x, getY(), x, getY() + getHeight());
    }
  }

  private EditorCell_Collection createRowCell(final int row) {
    EditorCell_Collection rowCell = EditorCell_Collection.create(getEditorContext(), getSNode(), new CellLayout_Table(), null);
    rowCell.getStyle().set(StyleAttributes.TABLE_COMPONENT, TableComponent.HORIZONTAL_COLLECTION);
    rowCell.setAction(CellActionType.DELETE, new EditorCellAction() {
      public void execute(EditorContext p0) {
        myModel.deleteRow(row);
      }
    });
    return rowCell;
  }

  public static EditorCell_Collection createTable(EditorContext editorContext, SNode node, final TableModel model) {
    return new EditorCell_Table(editorContext, node, new CellLayout_Table(), model);
  }
}
