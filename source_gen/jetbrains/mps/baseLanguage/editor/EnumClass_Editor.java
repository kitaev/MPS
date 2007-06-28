package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class EnumClass_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myImplementedInterfaceListHandler_implementedInterfaceList_;
  /* package */AbstractCellListHandler myEnumConstantListHandler_enumConstantList_;
  /* package */AbstractCellListHandler myFieldListHandler_fieldList_;
  /* package */AbstractCellListHandler myConstructorListHandler_constructorList_;
  /* package */AbstractCellListHandler myMethodListHandler_methodList_;
  /* package */AbstractCellListHandler myStaticMethodListHandler_staticMethodList_;

  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483277585");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_NameCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483277586");
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169763676999");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ImplementedInterfaceList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169763677000");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483277587");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_RowCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483277584");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483277589");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_EnumConstantList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483277590");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_RowCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483277588");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1138307589269");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483273079");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_FieldList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483273080");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_RowCell2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483273078");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell9(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1138307592880");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell10(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483457771");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstructorList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483457772");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_RowCell3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483457770");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell12(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1138307596445");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell13(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483457775");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_MethodList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483457776");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_RowCell4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483457774");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell15(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1138307599041");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell16(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483457779");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_StaticMethodList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483457780");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_RowCell5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483457778");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ConstantCell18(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483277593");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_ColumnCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1085483277583");
    editorCell.setDrawBorder(false);
  }
  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
  }
  private static void setupLabel_NameCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
  }
  private static void setupLabel_ImplementedInterfaceList(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell3(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell4(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_EnumConstantList(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell6(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell7(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_FieldList(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell9(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell10(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstructorList(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell12(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell13(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_MethodList(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell15(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell16(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_StaticMethodList(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell18(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createColumnCell(context, node);
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    EnumClass_Editor.setupBasic_RowCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell(context, node, "enum"));
    editorCell.addEditorCell(this.createNameCell(context, node));
    editorCell.addEditorCell(this.createConstantCell1(context, node, "implements"));
    editorCell.addEditorCell(this.createImplementedInterfaceList(context, node));
    editorCell.addEditorCell(this.createConstantCell3(context, node, "{"));
    return editorCell;
  }
  public EditorCell createRowCell1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    EnumClass_Editor.setupBasic_RowCell1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell4(context, node, "    "));
    editorCell.addEditorCell(this.createEnumConstantList(context, node));
    return editorCell;
  }
  public EditorCell createRowCell2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    EnumClass_Editor.setupBasic_RowCell2(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell7(context, node, "    "));
    editorCell.addEditorCell(this.createFieldList(context, node));
    return editorCell;
  }
  public EditorCell createRowCell3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    EnumClass_Editor.setupBasic_RowCell3(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell10(context, node, "    "));
    editorCell.addEditorCell(this.createConstructorList(context, node));
    return editorCell;
  }
  public EditorCell createRowCell4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    EnumClass_Editor.setupBasic_RowCell4(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell13(context, node, "    "));
    editorCell.addEditorCell(this.createMethodList(context, node));
    return editorCell;
  }
  public EditorCell createRowCell5(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    EnumClass_Editor.setupBasic_RowCell5(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell16(context, node, "    "));
    editorCell.addEditorCell(this.createStaticMethodList(context, node));
    return editorCell;
  }
  public EditorCell createColumnCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    EnumClass_Editor.setupBasic_ColumnCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRowCell(context, node));
    editorCell.addEditorCell(this.createRowCell1(context, node));
    editorCell.addEditorCell(this.createConstantCell6(context, node, ""));
    editorCell.addEditorCell(this.createRowCell2(context, node));
    editorCell.addEditorCell(this.createConstantCell9(context, node, ""));
    editorCell.addEditorCell(this.createRowCell3(context, node));
    editorCell.addEditorCell(this.createConstantCell12(context, node, ""));
    editorCell.addEditorCell(this.createRowCell4(context, node));
    editorCell.addEditorCell(this.createConstantCell15(context, node, ""));
    editorCell.addEditorCell(this.createRowCell5(context, node));
    editorCell.addEditorCell(this.createConstantCell18(context, node, "}"));
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    EnumClass_Editor.setupBasic_ConstantCell(editorCell, node, context);
    EnumClass_Editor.setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    EnumClass_Editor.setupBasic_ConstantCell1(editorCell, node, context);
    EnumClass_Editor.setupLabel_ConstantCell1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    EnumClass_Editor.setupBasic_ConstantCell3(editorCell, node, context);
    EnumClass_Editor.setupLabel_ConstantCell3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    EnumClass_Editor.setupBasic_ConstantCell4(editorCell, node, context);
    EnumClass_Editor.setupLabel_ConstantCell4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    EnumClass_Editor.setupBasic_ConstantCell6(editorCell, node, context);
    EnumClass_Editor.setupLabel_ConstantCell6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    EnumClass_Editor.setupBasic_ConstantCell7(editorCell, node, context);
    EnumClass_Editor.setupLabel_ConstantCell7(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    EnumClass_Editor.setupBasic_ConstantCell9(editorCell, node, context);
    EnumClass_Editor.setupLabel_ConstantCell9(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell10(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    EnumClass_Editor.setupBasic_ConstantCell10(editorCell, node, context);
    EnumClass_Editor.setupLabel_ConstantCell10(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell12(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    EnumClass_Editor.setupBasic_ConstantCell12(editorCell, node, context);
    EnumClass_Editor.setupLabel_ConstantCell12(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell13(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    EnumClass_Editor.setupBasic_ConstantCell13(editorCell, node, context);
    EnumClass_Editor.setupLabel_ConstantCell13(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell15(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    EnumClass_Editor.setupBasic_ConstantCell15(editorCell, node, context);
    EnumClass_Editor.setupLabel_ConstantCell15(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell16(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    EnumClass_Editor.setupBasic_ConstantCell16(editorCell, node, context);
    EnumClass_Editor.setupLabel_ConstantCell16(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell18(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    EnumClass_Editor.setupBasic_ConstantCell18(editorCell, node, context);
    EnumClass_Editor.setupLabel_ConstantCell18(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createImplementedInterfaceList(EditorContext context, SNode node) {
    if(this.myImplementedInterfaceListHandler_implementedInterfaceList_ == null) {
      this.myImplementedInterfaceListHandler_implementedInterfaceList_ = new EnumClass_Editor_ImplementedInterfaceListHandler_implementedInterfaceList_(node, "implementedInterface", context);
    }
    EditorCell_Collection editorCell = this.myImplementedInterfaceListHandler_implementedInterfaceList_.createCells(context, new CellLayout_Vertical(), false);
    EnumClass_Editor.setupBasic_ImplementedInterfaceList(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myImplementedInterfaceListHandler_implementedInterfaceList_.getElementRole());
    return editorCell;
  }
  public EditorCell createEnumConstantList(EditorContext context, SNode node) {
    if(this.myEnumConstantListHandler_enumConstantList_ == null) {
      this.myEnumConstantListHandler_enumConstantList_ = new EnumClass_Editor_EnumConstantListHandler_enumConstantList_(node, "enumConstant", context);
    }
    EditorCell_Collection editorCell = this.myEnumConstantListHandler_enumConstantList_.createCells(context, new CellLayout_Vertical(), false);
    EnumClass_Editor.setupBasic_EnumConstantList(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myEnumConstantListHandler_enumConstantList_.getElementRole());
    return editorCell;
  }
  public EditorCell createFieldList(EditorContext context, SNode node) {
    if(this.myFieldListHandler_fieldList_ == null) {
      this.myFieldListHandler_fieldList_ = new EnumClass_Editor_FieldListHandler_fieldList_(node, "field", context);
    }
    EditorCell_Collection editorCell = this.myFieldListHandler_fieldList_.createCells(context, new CellLayout_Vertical(), false);
    EnumClass_Editor.setupBasic_FieldList(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myFieldListHandler_fieldList_.getElementRole());
    return editorCell;
  }
  public EditorCell createConstructorList(EditorContext context, SNode node) {
    if(this.myConstructorListHandler_constructorList_ == null) {
      this.myConstructorListHandler_constructorList_ = new EnumClass_Editor_ConstructorListHandler_constructorList_(node, "constructor", context);
    }
    EditorCell_Collection editorCell = this.myConstructorListHandler_constructorList_.createCells(context, new CellLayout_Vertical(), false);
    EnumClass_Editor.setupBasic_ConstructorList(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myConstructorListHandler_constructorList_.getElementRole());
    return editorCell;
  }
  public EditorCell createMethodList(EditorContext context, SNode node) {
    if(this.myMethodListHandler_methodList_ == null) {
      this.myMethodListHandler_methodList_ = new EnumClass_Editor_MethodListHandler_methodList_(node, "method", context);
    }
    EditorCell_Collection editorCell = this.myMethodListHandler_methodList_.createCells(context, new CellLayout_Vertical(), false);
    EnumClass_Editor.setupBasic_MethodList(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myMethodListHandler_methodList_.getElementRole());
    return editorCell;
  }
  public EditorCell createStaticMethodList(EditorContext context, SNode node) {
    if(this.myStaticMethodListHandler_staticMethodList_ == null) {
      this.myStaticMethodListHandler_staticMethodList_ = new EnumClass_Editor_StaticMethodListHandler_staticMethodList_(node, "staticMethod", context);
    }
    EditorCell_Collection editorCell = this.myStaticMethodListHandler_staticMethodList_.createCells(context, new CellLayout_Vertical(), false);
    EnumClass_Editor.setupBasic_StaticMethodList(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myStaticMethodListHandler_staticMethodList_.getElementRole());
    return editorCell;
  }
  public EditorCell createNameCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    EnumClass_Editor.setupBasic_NameCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      EnumClass_Editor.setupLabel_NameCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }
  public EditorCell createNameCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createNameCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
}
