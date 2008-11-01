package jetbrains.mps.lang.actions.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;

public class IncludeRightTransformForNodePart_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1180111544812(context, node);
  }

  public EditorCell createCollection1180111544812(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11801115448121180111544812(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1180111544813(context, node));
    editorCell.addEditorCell(this.createCollection1180111544815(context, node));
    return editorCell;
  }

  public EditorCell createCollection1180111544813(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11801115448131180111544813(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1180111544814(context, node, "include transform menu for"));
    return editorCell;
  }

  public EditorCell createCollection1180111544815(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11801115448151180111544815(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell0746_0(context, node));
    editorCell.addEditorCell(this.createRefNode1180111544817(context, node));
    return editorCell;
  }

  public EditorCell createConstant1180111544814(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11801115448141180111544814(editorCell, node, context);
    setupLabel_Constant_1180111544814_1180111544814(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createIndentCell0746_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createRefNode1180111544817_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_nodeBlock1180111544817(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_nodeBlock_1180111544817((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1180111544817(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("nodeBlock");
    provider.setNoTargetText("<no nodeBlock>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1180111544817_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11801115448121180111544812(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1180111544812");
  }

  private static void setupBasic_Collection_11801115448131180111544813(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1180111544813");
  }

  private static void setupBasic_Constant_11801115448141180111544814(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1180111544814");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11801115448151180111544815(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1180111544815");
  }

  private static void setupBasic_refNode_nodeBlock1180111544817(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Indent_12161128537681216112853768(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1216112853768");
  }

  private static void setupLabel_Constant_1180111544814_1180111544814(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_nodeBlock_1180111544817(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
