package jetbrains.mpslite.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import java.awt.Color;
import jetbrains.mps.nodeEditor.CellLayout_Horizontal;

public class Line_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myLinePartListHandler_linePartList_;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createRowCell(context, node);
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createLinePartList(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1182511256407");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createLinePartList(EditorContext context, SNode node) {
    if(this.myLinePartListHandler_linePartList_ == null) {
      this.myLinePartListHandler_linePartList_ = new Line_Editor_LinePartListHandler_linePartList_(node, "linePart", context);
    }
    EditorCell_Collection editorCell = this.myLinePartListHandler_linePartList_.createCells(context, new CellLayout_Horizontal(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myLinePartListHandler_linePartList_.getElementRole());
    editorCell.setLayoutConstraint("");
    editorCell.addKeyMap(new _Line_Actions());
    return editorCell;
  }
}
