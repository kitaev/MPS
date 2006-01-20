package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Jan 20, 2006 12:33:53 AM */


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCellListHandler;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.PropertyAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteProperty;
import jetbrains.mps.annotations.PropertyAttributeConcept;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.CellLayout_Vertical;

public class EnumClass_Editor extends DefaultNodeEditor {

  public EditorCellListHandler myEnumConstantListHandler;
  public EditorCellListHandler myFieldListHandler;
  public EditorCellListHandler myConstructorListHandler;
  public EditorCellListHandler myMethodListHandler;
  public EditorCellListHandler myStaticMethodListHandler;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createColumnCell(context, node);
  }
  public EditorCell createColumnCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createRowCell(context, node));
    editorCell.addEditorCell(this.createRowCell1(context, node));
    editorCell.addEditorCell(this.createRowCell2(context, node));
    editorCell.addEditorCell(this.createRowCell3(context, node));
    editorCell.addEditorCell(this.createRowCell4(context, node));
    editorCell.addEditorCell(this.createRowCell5(context, node));
    editorCell.addEditorCell(this.createConstantCell12(context, node, "}"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1085483277583");
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
    editorCell.addEditorCell(this.createConstantCell(context, node, "enum"));
    editorCell.addEditorCell(this.createNameCell(context, node));
    editorCell.addEditorCell(this.createConstantCell1(context, node, "{"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1085483277584");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRowCell1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createConstantCell2(context, node, "    "));
    editorCell.addEditorCell(this.createEnumConstantList(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1085483277588");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRowCell2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createConstantCell4(context, node, "    "));
    editorCell.addEditorCell(this.createFieldList(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1085483273078");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRowCell3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createConstantCell6(context, node, "    "));
    editorCell.addEditorCell(this.createConstructorList(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1085483457770");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRowCell4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createConstantCell8(context, node, "    "));
    editorCell.addEditorCell(this.createMethodList(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1085483457774");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRowCell5(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createConstantCell10(context, node, "    "));
    editorCell.addEditorCell(this.createStaticMethodList(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1085483457778");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell12(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1085483277593");
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
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
    editorCell.putUserObject(EditorCell.CELL_ID, "1085483277585");
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
    editorCell.putUserObject(EditorCell.CELL_ID, "1085483277587");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1085483277589");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1085483273079");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1085483457771");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1085483457775");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell10(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1085483457779");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createNameCellinternal(EditorContext context, SNode node) {
    String propertyName = "name";
    PropertyAccessor propertyAccessor = new PropertyAccessor(node, propertyName, false, false, context);
    EditorCell_Property editorCell = EditorCell_Property.create(context, propertyAccessor, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(true);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteProperty(node, "name"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1085483277586");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createNameCell(EditorContext context, SNode node) {
    String propertyName = "name";
    EditorCell propertyCell = this.createNameCellinternal(context, node);
    PropertyAttributeConcept propertyAttributeConcept = node.getPropertyAttribute(propertyName);
    if(propertyAttributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createPropertyAttributeCell(context, propertyAttributeConcept, propertyCell);
    } else 
    return propertyCell;
  }
  public EditorCell createEnumConstantList(EditorContext context, SNode node) {
    if(this.myEnumConstantListHandler == null) {
      this.myEnumConstantListHandler = new EnumClass_Editor_EnumConstantListHandler(node, "enumConstant", context);
    }
    EditorCell_Collection editorCell = this.myEnumConstantListHandler.createCells(context, new CellLayout_Vertical());
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.ROLE, "enumConstant");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createFieldList(EditorContext context, SNode node) {
    if(this.myFieldListHandler == null) {
      this.myFieldListHandler = new EnumClass_Editor_FieldListHandler(node, "field", context);
    }
    EditorCell_Collection editorCell = this.myFieldListHandler.createCells(context, new CellLayout_Vertical());
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.ROLE, "field");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstructorList(EditorContext context, SNode node) {
    if(this.myConstructorListHandler == null) {
      this.myConstructorListHandler = new EnumClass_Editor_ConstructorListHandler(node, "constructor", context);
    }
    EditorCell_Collection editorCell = this.myConstructorListHandler.createCells(context, new CellLayout_Vertical());
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.ROLE, "constructor");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createMethodList(EditorContext context, SNode node) {
    if(this.myMethodListHandler == null) {
      this.myMethodListHandler = new EnumClass_Editor_MethodListHandler(node, "method", context);
    }
    EditorCell_Collection editorCell = this.myMethodListHandler.createCells(context, new CellLayout_Vertical());
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.ROLE, "method");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createStaticMethodList(EditorContext context, SNode node) {
    if(this.myStaticMethodListHandler == null) {
      this.myStaticMethodListHandler = new EnumClass_Editor_StaticMethodListHandler(node, "staticMethod", context);
    }
    EditorCell_Collection editorCell = this.myStaticMethodListHandler.createCells(context, new CellLayout_Vertical());
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.ROLE, "staticMethod");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
}
