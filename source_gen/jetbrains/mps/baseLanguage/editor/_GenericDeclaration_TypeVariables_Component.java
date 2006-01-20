package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Jan 20, 2006 12:33:57 AM */


import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.EditorCellListHandler;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.CellLayout_Horizontal;

public class _GenericDeclaration_TypeVariables_Component extends AbstractCellProvider {

  public EditorCellListHandler myTypeVariableDeclarationListHandler;

  public _GenericDeclaration_TypeVariables_Component(SNode node) {
    super(node);
  }

  public EditorCell createEditorCell(EditorContext context) {
    return this.createEditorCell(context, this.getSNode());
  }
  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCellAlternation(context, node);
  }
  public EditorCell createCellAlternation(EditorContext context, SNode node) {
    boolean alternationCondition = Queries.semanticNodeCondition_GenericDeclaration_HasTypeVariables(node);
    EditorCell editorCell = null;
    if(alternationCondition) {
      editorCell = this.createRowCell(context, node);
    } else 
    {
      editorCell = this.createConstantCell2(context, node, "");
    }
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1109280119303");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addKeyMap(new _GenericDeclaration_Delete_KeyMap());
    editorCell.addEditorCell(this.createConstantCell(context, node, "<"));
    editorCell.addEditorCell(this.createTypeVariableDeclarationList(context, node));
    editorCell.addEditorCell(this.createConstantCell1(context, node, ">"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1109280205087");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(true);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addKeyMap(new _GenericDeclaration_AddTypeVariable_KeyMap());
    editorCell.putUserObject(EditorCell.CELL_ID, "1109280404592");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1109280296588");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1109280296590");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createTypeVariableDeclarationList(EditorContext context, SNode node) {
    if(this.myTypeVariableDeclarationListHandler == null) {
      this.myTypeVariableDeclarationListHandler = new _GenericDeclaration_TypeVariables_Component_TypeVariableDeclarationListHandler(node, "typeVariableDeclaration", context);
    }
    EditorCell_Collection editorCell = this.myTypeVariableDeclarationListHandler.createCells(context, new CellLayout_Horizontal());
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addKeyMap(new _GenericDeclaration_TypeVariables_KeyMap());
    editorCell.putUserObject(EditorCell.ROLE, "typeVariableDeclaration");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
}
