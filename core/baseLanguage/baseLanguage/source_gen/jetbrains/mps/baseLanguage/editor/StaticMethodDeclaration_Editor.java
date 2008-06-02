package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteNode;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.DefaultChildSubstituteInfo;

public class StaticMethodDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_Component_Visibility1;
  /* package */AbstractCellProvider myBaseMethodDeclaration_NameCellComponent2;
  /* package */AbstractCellProvider my_GenericDeclaration_TypeVariables_Component3;
  /* package */AbstractCellListHandler myListHandler_19808_0;
  /* package */AbstractCellListHandler myListHandler_19808_01;
  /* package */AbstractCellListHandler myListHandler_19808_02;
  /* package */AbstractCellListHandler myListHandler_19808_03;

  private static void setupBasic_CollectionCell19808_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell19808_0");
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell19808_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell19808_0");
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    _BaseMethodDeclaration_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_CollectionCell19808_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell19808_01");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell19808_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell19808_01");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_bodyRefNodeCell19808_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_CollectionCell19808_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell19808_02");
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_returnTypeRefNodeCell19808_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setDrawBorder(false);
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_FOCUS);
    }
  }

  private static void setupBasic_ConstantCell19808_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell19808_02");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell19808_03(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell19808_03");
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell19808_04(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell19808_04");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_parameterRefNodeListCell19808_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_parameterRefNodeListCell19808_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_AlternationCell19808_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_AlternationCell19808_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell19808_06(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell19808_06");
    editorCell.setDrawBorder(false);
    editorCell.addKeyMap(new InsertFirstStatement_KeyMap());
  }

  private static void setupBasic_CollectionCell19808_03(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell19808_03");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_throwsItemRefNodeListCell19808_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_throwsItemRefNodeListCell19808_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell19808_07(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell19808_07");
    editorCell.setDrawBorder(false);
    editorCell.addKeyMap(new InsertFirstStatement_KeyMap());
  }

  private static void setupBasic_ConstantCell19808_08(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell19808_08");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic__Component_VisibilityComponentCell19808_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "__Component_VisibilityComponentCell19808_0");
  }

  private static void setupBasic_BaseMethodDeclaration_NameCellComponentComponentCell19808_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_BaseMethodDeclaration_NameCellComponentComponentCell19808_0");
  }

  private static void setupBasic_CollectionCell19808_04(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell19808_04");
  }

  private static void setupBasic_CollectionCell19808_05(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell19808_05");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_annotationRefNodeListCell19808_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_annotationRefNodeListCell19808_0");
  }

  private static void setupBasic_CollectionCell19808_06(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell19808_06");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_ConstantCell19808_09(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell19808_09");
  }

  private static void setupBasic_annotationRefNodeListCell19808_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_annotationRefNodeListCell19808_01");
  }

  private static void setupBasic__GenericDeclaration_TypeVariables_ComponentComponentCell19808_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "__GenericDeclaration_TypeVariables_ComponentComponentCell19808_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell19808_010(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell19808_010");
  }

  private static void setupLabel_ConstantCell19808_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell19808_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_bodyRefNodeCell19808_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_returnTypeRefNodeCell19808_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell19808_02(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell19808_03(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setEditable(true);
  }

  private static void setupLabel_ConstantCell19808_04(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
  }

  private static void setupLabel_parameterRefNodeListCell19808_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell19808_06(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_throwsItemRefNodeListCell19808_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell19808_07(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell19808_08(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
  }

  private static void setupLabel_annotationRefNodeListCell19808_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell19808_09(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_annotationRefNodeListCell19808_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell19808_010(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition19808_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "throwsItem") > 0;
  }

  public static boolean renderingCondition19808_01(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "annotation") > 0;
  }

  public static boolean renderingCondition19808_02(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "typeVariableDeclaration") > 0;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell19808_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.create_CollectionCell19808_04(context, node);
  }

  public EditorCell create_AlternationCell19808_0(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = StaticMethodDeclaration_Editor.renderingCondition19808_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.create_CollectionCell19808_03(context, node);
    } else
    {
      editorCell = this.create_ConstantCell19808_06(context, node, "{");
    }
    setupBasic_AlternationCell19808_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell create_CollectionCell19808_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_CollectionCell19808_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition19808_01(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.create_CollectionCell19808_05(context, node));
    }
    editorCell.addEditorCell(this.create_CollectionCell19808_02(context, node));
    editorCell.addEditorCell(this.create_CollectionCell19808_01(context, node));
    editorCell.addEditorCell(this.create_ConstantCell19808_03(context, node, "}"));
    editorCell.addEditorCell(this.create_ConstantCell19808_010(context, node, ""));
    return editorCell;
  }

  public EditorCell create_CollectionCell19808_01(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell19808_01(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell19808_01(context, node, "  "));
    editorCell.addEditorCell(this.create_bodyRefNodeCell19808_0(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell19808_02(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell19808_02(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create__Component_VisibilityComponentCell19808_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell19808_04(context, node, "static"));
    if (renderingCondition19808_02(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.create__GenericDeclaration_TypeVariables_ComponentComponentCell19808_0(context, node));
    }
    editorCell.addEditorCell(this.create_returnTypeRefNodeCell19808_0(context, node));
    editorCell.addEditorCell(this.create_BaseMethodDeclaration_NameCellComponentComponentCell19808_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell19808_02(context, node, "("));
    editorCell.addEditorCell(this.create_parameterRefNodeListCell19808_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell19808_0(context, node, ")"));
    editorCell.addEditorCell(this.create_AlternationCell19808_0(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell19808_03(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell19808_03(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell19808_08(context, node, "throws"));
    editorCell.addEditorCell(this.create_throwsItemRefNodeListCell19808_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell19808_07(context, node, "{"));
    return editorCell;
  }

  public EditorCell create_CollectionCell19808_04(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_CollectionCell19808_04(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_CollectionCell19808_06(context, node));
    editorCell.addEditorCell(this.create_annotationRefNodeListCell19808_01(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell19808_05(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_CollectionCell19808_05(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_annotationRefNodeListCell19808_0(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell19808_06(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell19808_06(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell19808_09(context, node, "annotations:"));
    return editorCell;
  }

  public EditorCell create__Component_VisibilityComponentCell19808_0(EditorContext context, SNode node) {
    if (this.my_Component_Visibility1 == null) {
      this.my_Component_Visibility1 = new _Component_Visibility(node);
    }
    EditorCell editorCell = this.my_Component_Visibility1.createEditorCell(context);
    setupBasic__Component_VisibilityComponentCell19808_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell create_BaseMethodDeclaration_NameCellComponentComponentCell19808_0(EditorContext context, SNode node) {
    if (this.myBaseMethodDeclaration_NameCellComponent2 == null) {
      this.myBaseMethodDeclaration_NameCellComponent2 = new BaseMethodDeclaration_NameCellComponent(node);
    }
    EditorCell editorCell = this.myBaseMethodDeclaration_NameCellComponent2.createEditorCell(context);
    setupBasic_BaseMethodDeclaration_NameCellComponentComponentCell19808_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell create__GenericDeclaration_TypeVariables_ComponentComponentCell19808_0(EditorContext context, SNode node) {
    if (this.my_GenericDeclaration_TypeVariables_Component3 == null) {
      this.my_GenericDeclaration_TypeVariables_Component3 = new _GenericDeclaration_TypeVariables_Component(node);
    }
    EditorCell editorCell = this.my_GenericDeclaration_TypeVariables_Component3.createEditorCell(context);
    setupBasic__GenericDeclaration_TypeVariables_ComponentComponentCell19808_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell create_ConstantCell19808_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell19808_0(editorCell, node, context);
    setupLabel_ConstantCell19808_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell19808_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell19808_01(editorCell, node, context);
    setupLabel_ConstantCell19808_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell19808_02(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell19808_02(editorCell, node, context);
    setupLabel_ConstantCell19808_02(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell19808_03(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell19808_03(editorCell, node, context);
    setupLabel_ConstantCell19808_03(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell19808_04(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell19808_04(editorCell, node, context);
    setupLabel_ConstantCell19808_04(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell19808_06(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell19808_06(editorCell, node, context);
    setupLabel_ConstantCell19808_06(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell19808_07(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell19808_07(editorCell, node, context);
    setupLabel_ConstantCell19808_07(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell19808_08(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell19808_08(editorCell, node, context);
    setupLabel_ConstantCell19808_08(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell19808_09(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell19808_09(editorCell, node, context);
    setupLabel_ConstantCell19808_09(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell19808_010(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell19808_010(editorCell, node, context);
    setupLabel_ConstantCell19808_010(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_parameterRefNodeListCell19808_0(EditorContext context, SNode node) {
    if (this.myListHandler_19808_0 == null) {
      this.myListHandler_19808_0 = new StaticMethodDeclaration_Editor.parameterListHandler_19808_0(node, "parameter", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_19808_0.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_parameterRefNodeListCell19808_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_19808_0.getElementRole());
    return editorCell;
  }

  public EditorCell create_throwsItemRefNodeListCell19808_0(EditorContext context, SNode node) {
    if (this.myListHandler_19808_01 == null) {
      this.myListHandler_19808_01 = new StaticMethodDeclaration_Editor.throwsItemListHandler_19808_0(node, "throwsItem", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_19808_01.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_throwsItemRefNodeListCell19808_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_19808_01.getElementRole());
    return editorCell;
  }

  public EditorCell create_annotationRefNodeListCell19808_0(EditorContext context, SNode node) {
    if (this.myListHandler_19808_02 == null) {
      this.myListHandler_19808_02 = new StaticMethodDeclaration_Editor.annotationListHandler_19808_0(node, "annotation", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_19808_02.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_annotationRefNodeListCell19808_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_19808_02.getElementRole());
    return editorCell;
  }

  public EditorCell create_annotationRefNodeListCell19808_01(EditorContext context, SNode node) {
    if (this.myListHandler_19808_03 == null) {
      this.myListHandler_19808_03 = new StaticMethodDeclaration_Editor.annotationListHandler_19808_01(node, "annotation", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_19808_03.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_annotationRefNodeListCell19808_01(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_19808_03.getElementRole());
    return editorCell;
  }

  public EditorCell create_bodyRefNodeCell19808_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_bodyRefNodeCell19808_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_bodyRefNodeCell19808_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_bodyRefNodeCell19808_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("body");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_bodyRefNodeCell19808_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_returnTypeRefNodeCell19808_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_returnTypeRefNodeCell19808_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_returnTypeRefNodeCell19808_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_returnTypeRefNodeCell19808_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("returnType");
    provider.setNoTargetText("<no type>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_returnTypeRefNodeCell19808_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class parameterListHandler_19808_0 extends RefNodeListHandler {

    public parameterListHandler_19808_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    private static void setupBasic_ConstantCell19808_05(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell19808_05");
      editorCell.setSelectable(true);
      editorCell.setDrawBorder(false);
    }

    private static void setupLabel_ConstantCell19808_05(EditorCell_Label editorCell, SNode node, EditorContext context) {
      editorCell.setEditable(true);
    }


    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = this.createEmptyCell_internal(context, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public EditorCell createEmptyCell_internal(EditorContext context, SNode node) {
      return this.create_ConstantCell19808_05(context, node, "");
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(elementNode));
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, ","));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), ",");
        editorCell.setSelectable(false);
        editorCell.setLayoutConstraint("");
        return editorCell;
      }
    }

    public EditorCell create_ConstantCell19808_05(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_ConstantCell19808_05(editorCell, node, context);
      setupLabel_ConstantCell19808_05(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }

}
  public static class throwsItemListHandler_19808_0 extends RefNodeListHandler {

    public throwsItemListHandler_19808_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(context);
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(elementNode));
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, ","));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), ",");
        editorCell.setSelectable(false);
        editorCell.setLayoutConstraint("");
        return editorCell;
      }
    }

}
  public static class annotationListHandler_19808_0 extends RefNodeListHandler {

    public annotationListHandler_19808_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(context);
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      return super.createSeparatorCell(context);
    }

}
  public static class annotationListHandler_19808_01 extends RefNodeListHandler {

    public annotationListHandler_19808_01(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(context);
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      return super.createSeparatorCell(context);
    }

}

}
