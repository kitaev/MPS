package jetbrains.mps.bootstrap.structureLanguage.editor;

/*Generated by MPS Jun 13, 2006 4:50:50 PM */


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Basic;

public class ConceptLinkDeclaration_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createErrorCell(context, node);
  }
  public EditorCell createErrorCell(EditorContext context, SNode node) {
    EditorCell_Error editorCell = EditorCell_Error.create(context, node, "<choose link type>");
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1137532945724");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
}
