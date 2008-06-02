package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class InstanceInitializer_Editor extends DefaultNodeEditor {

  private static void setupBasic_AlternationCell7809_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_AlternationCell7809_0");
  }

  private static void setupBasic_CollectionCell7809_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell7809_0");
  }

  private static void setupBasic_ConstantCell7809_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell7809_0");
  }

  private static void setupBasic_CollectionCell7809_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell7809_01");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_IndentCell7809_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_IndentCell7809_0");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_statementListRefNodeCell7809_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_ConstantCell7809_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell7809_01");
  }

  private static void setupBasic_CollectionCell7809_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell7809_02");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_statementListRefNodeCell7809_01(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_ConstantCell7809_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell7809_02");
  }

  private static void setupBasic_ConstantCell7809_03(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell7809_03");
  }

  private static void setupLabel_ConstantCell7809_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_statementListRefNodeCell7809_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell7809_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_statementListRefNodeCell7809_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell7809_02(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell7809_03(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition7809_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(SLinkOperations.getTarget(node, "statementList", true), "statement") > 1;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_AlternationCell7809_0(context, node);
  }

  public EditorCell create_AlternationCell7809_0(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = InstanceInitializer_Editor.renderingCondition7809_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.create_CollectionCell7809_0(context, node);
    } else
    {
      editorCell = this.create_CollectionCell7809_02(context, node);
    }
    setupBasic_AlternationCell7809_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell create_CollectionCell7809_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_CollectionCell7809_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell7809_0(context, node, "{"));
    editorCell.addEditorCell(this.create_CollectionCell7809_01(context, node));
    editorCell.addEditorCell(this.create_ConstantCell7809_01(context, node, "}"));
    return editorCell;
  }

  public EditorCell create_CollectionCell7809_01(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell7809_01(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell4(context, node));
    editorCell.addEditorCell(this.create_statementListRefNodeCell7809_0(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell7809_02(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell7809_02(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell7809_02(context, node, "{"));
    editorCell.addEditorCell(this.create_statementListRefNodeCell7809_01(context, node));
    editorCell.addEditorCell(this.create_ConstantCell7809_03(context, node, "}"));
    return editorCell;
  }

  public EditorCell create_ConstantCell7809_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell7809_0(editorCell, node, context);
    setupLabel_ConstantCell7809_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell7809_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell7809_01(editorCell, node, context);
    setupLabel_ConstantCell7809_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell7809_02(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell7809_02(editorCell, node, context);
    setupLabel_ConstantCell7809_02(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell7809_03(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell7809_03(editorCell, node, context);
    setupLabel_ConstantCell7809_03(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createIndentCell4(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell create_statementListRefNodeCell7809_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_statementListRefNodeCell7809_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_statementListRefNodeCell7809_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_statementListRefNodeCell7809_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("statementList");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_statementListRefNodeCell7809_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_statementListRefNodeCell7809_01_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_statementListRefNodeCell7809_01(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_statementListRefNodeCell7809_01((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_statementListRefNodeCell7809_01(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("statementList");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_statementListRefNodeCell7809_01_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

}
