package jetbrains.mps.baseLanguage.editor;

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

public class LowerBoundType_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1171903879284(context, node);
  }

  public EditorCell createCollection1171903879284(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11719038792841171903879284(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1171903880552(context, node, "?"));
    editorCell.addEditorCell(this.createConstant1171903882257(context, node, "super"));
    editorCell.addEditorCell(this.createRefNode1171903885353(context, node));
    return editorCell;
  }

  public EditorCell createConstant1171903880552(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11719038805521171903880552(editorCell, node, context);
    setupLabel_Constant_1171903880552_1171903880552(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1171903882257(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11719038822571171903882257(editorCell, node, context);
    setupLabel_Constant_1171903882257_1171903882257(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1171903885353_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_bound1171903885353(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_bound_1171903885353((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1171903885353(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("bound");
    provider.setNoTargetText("<no bound>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1171903885353_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11719038792841171903879284(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1171903879284");
  }

  private static void setupBasic_Constant_11719038805521171903880552(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1171903880552");
  }

  private static void setupBasic_Constant_11719038822571171903882257(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1171903882257");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_bound1171903885353(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1171903880552_1171903880552(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1171903882257_1171903882257(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_bound_1171903885353(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
