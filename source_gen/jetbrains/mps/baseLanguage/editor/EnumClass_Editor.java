package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCellListHandler;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.PropertyAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteProperty;

public class EnumClass_Editor extends DefaultNodeEditor {

  EditorCellListHandler myEnumConstantListHandler;
  EditorCellListHandler myFieldListHandler;
  EditorCellListHandler myConstructorListHandler;
  EditorCellListHandler myMethodListHandler;
  EditorCellListHandler myStaticMethodListHandler;

  public EditorCell createEditorCell(EditorContext context, SemanticNode node) {
    return this.createColumnCell(context, node);
  }
  public EditorCell createColumnCell(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createRowCell(context, node));
    editorCell.addEditorCell(this.createRowCell1(context, node));
    editorCell.addEditorCell(this.createRowCell2(context, node));
    editorCell.addEditorCell(this.createRowCell3(context, node));
    editorCell.addEditorCell(this.createRowCell4(context, node));
    editorCell.addEditorCell(this.createRowCell5(context, node));
    editorCell.addEditorCell(this.createConstantCell12(context, node, "}"));
    return editorCell;
  }
  public EditorCell createRowCell(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstantCell(context, node, "enum"));
    editorCell.addEditorCell(this.createNameCell(context, node));
    editorCell.addEditorCell(this.createConstantCell1(context, node, "{"));
    return editorCell;
  }
  public EditorCell createRowCell1(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstantCell2(context, node, "    "));
    editorCell.addEditorCell(this.createEnumConstantList(context, node));
    return editorCell;
  }
  public EditorCell createRowCell2(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstantCell4(context, node, "    "));
    editorCell.addEditorCell(this.createFieldList(context, node));
    return editorCell;
  }
  public EditorCell createRowCell3(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstantCell6(context, node, "    "));
    editorCell.addEditorCell(this.createConstructorList(context, node));
    return editorCell;
  }
  public EditorCell createRowCell4(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstantCell8(context, node, "    "));
    editorCell.addEditorCell(this.createMethodList(context, node));
    return editorCell;
  }
  public EditorCell createRowCell5(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstantCell10(context, node, "    "));
    editorCell.addEditorCell(this.createStaticMethodList(context, node));
    return editorCell;
  }
  public EditorCell createConstantCell12(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell4(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell6(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell8(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell10(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createNameCell(EditorContext context, SemanticNode node) {
    PropertyAccessor propertyAccessor = new PropertyAccessor(node, "name", false, false);
    EditorCell_Property editorCell = EditorCell_Property.create(context, propertyAccessor, node);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(true);
    editorCell.setDefaultText("");
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteProperty(node, "name"));
    return editorCell;
  }
  public EditorCell createEnumConstantList(EditorContext context, SemanticNode node) {
    if(this.myEnumConstantListHandler == null) {
      this.myEnumConstantListHandler = new EnumClass_Editor_EnumConstantListHandler(node, "enumConstant", true);
    }
    EditorCell_Collection editorCell = null;
    editorCell = this.myEnumConstantListHandler.createCells_Vertical(context);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    return editorCell;
  }
  public EditorCell createFieldList(EditorContext context, SemanticNode node) {
    if(this.myFieldListHandler == null) {
      this.myFieldListHandler = new EnumClass_Editor_FieldListHandler(node, "field", true);
    }
    EditorCell_Collection editorCell = null;
    editorCell = this.myFieldListHandler.createCells_Vertical(context);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    return editorCell;
  }
  public EditorCell createConstructorList(EditorContext context, SemanticNode node) {
    if(this.myConstructorListHandler == null) {
      this.myConstructorListHandler = new EnumClass_Editor_ConstructorListHandler(node, "constructor", true);
    }
    EditorCell_Collection editorCell = null;
    editorCell = this.myConstructorListHandler.createCells_Vertical(context);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    return editorCell;
  }
  public EditorCell createMethodList(EditorContext context, SemanticNode node) {
    if(this.myMethodListHandler == null) {
      this.myMethodListHandler = new EnumClass_Editor_MethodListHandler(node, "method", true);
    }
    EditorCell_Collection editorCell = null;
    editorCell = this.myMethodListHandler.createCells_Vertical(context);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    return editorCell;
  }
  public EditorCell createStaticMethodList(EditorContext context, SemanticNode node) {
    if(this.myStaticMethodListHandler == null) {
      this.myStaticMethodListHandler = new EnumClass_Editor_StaticMethodListHandler(node, "staticMethod", true);
    }
    EditorCell_Collection editorCell = null;
    editorCell = this.myStaticMethodListHandler.createCells_Vertical(context);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    return editorCell;
  }
}
