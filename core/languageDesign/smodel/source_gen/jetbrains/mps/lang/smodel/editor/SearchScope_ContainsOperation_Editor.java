package jetbrains.mps.lang.smodel.editor;

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
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;

public class SearchScope_ContainsOperation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1221170579242(context, node);
  }

  public EditorCell createCollection1221170579242(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12211705792421221170579242(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1221170583510(context, node, "contains"));
    editorCell.addEditorCell(this.createConstant1221170704918(context, node, "("));
    editorCell.addEditorCell(this.createRefNode1221171056921(context, node));
    editorCell.addEditorCell(this.createConstant1221171077626(context, node, ")"));
    return editorCell;
  }

  public EditorCell createConstant1221170583510(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12211705835101221170583510(editorCell, node, context);
    setupLabel_Constant_1221170583510_1221170583510(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1221170704918(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12211707049181221170704918(editorCell, node, context);
    setupLabel_Constant_1221170704918_1221170704918(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1221171077626(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12211710776261221171077626(editorCell, node, context);
    setupLabel_Constant_1221171077626_1221171077626(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1221171056921_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_nodeToCheck1221171056921(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_nodeToCheck_1221171056921((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1221171056921(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("nodeToCheck");
    provider.setNoTargetText("<no nodeToCheck>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1221171056921_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12211705792421221170579242(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1221170579242");
  }

  private static void setupBasic_Constant_12211705835101221170583510(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1221170583510");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, "spaces"));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12211707049181221170704918(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1221170704918");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_nodeToCheck1221171056921(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12211710776261221171077626(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1221171077626");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1221170583510_1221170583510(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1221170704918_1221170704918(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_nodeToCheck_1221171056921(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1221171077626_1221171077626(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
