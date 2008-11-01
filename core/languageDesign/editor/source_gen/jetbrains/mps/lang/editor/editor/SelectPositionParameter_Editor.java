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
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class SelectPositionParameter_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1201268892010(context, node);
  }

  public EditorCell createCollection1201268892010(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12012688920101201268892010(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1201268892699(context, node, "position"));
    editorCell.addEditorCell(this.createConstant1201268895904(context, node, "="));
    editorCell.addEditorCell(this.createProperty1201268897781(context, node));
    return editorCell;
  }

  public EditorCell createConstant1201268892699(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12012688926991201268892699(editorCell, node, context);
    setupLabel_Constant_1201268892699_1201268892699(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1201268895904(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12012688959041201268895904(editorCell, node, context);
    setupLabel_Constant_1201268895904_1201268895904(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty1201268897781_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_position1201268897781(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_position_1201268897781((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1201268897781(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("position");
    provider.setNoTargetText("<no position>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1201268897781_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12012688920101201268892010(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1201268892010");
  }

  private static void setupBasic_Constant_12012688926991201268892699(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1201268892699");
  }

  private static void setupBasic_Constant_12012688959041201268895904(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1201268895904");
  }

  private static void setupBasic_property_position1201268897781(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_position");
  }

  private static void setupLabel_Constant_1201268892699_1201268892699(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1201268895904_1201268895904(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_position_1201268897781(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
