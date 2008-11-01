package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class CaretPositionParameter_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1201270917284(context, node);
  }

  public EditorCell createCollection1201270917284(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12012709172841201270917284(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1201270918661(context, node, "caret position"));
    editorCell.addEditorCell(this.createConstant1201270927258(context, node, "="));
    editorCell.addEditorCell(this.createRefNode1201270928979(context, node));
    return editorCell;
  }

  public EditorCell createConstant1201270918661(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12012709186611201270918661(editorCell, node, context);
    setupLabel_Constant_1201270918661_1201270918661(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1201270927258(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12012709272581201270927258(editorCell, node, context);
    setupLabel_Constant_1201270927258_1201270927258(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1201270928979_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_position1201270928979(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_position_1201270928979((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1201270928979(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("position");
    provider.setNoTargetText("<no position>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1201270928979_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12012709172841201270917284(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1201270917284");
  }

  private static void setupBasic_Constant_12012709186611201270918661(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1201270918661");
  }

  private static void setupBasic_Constant_12012709272581201270927258(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1201270927258");
  }

  private static void setupBasic_refNode_position1201270928979(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1201270918661_1201270918661(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1201270927258_1201270927258(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_position_1201270928979(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
