package jetbrains.mps.baseLanguage.collections.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class SkipOperation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1172658539229(context, node);
  }

  public EditorCell createCollection1172658539229(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11726585392291172658539229(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1172658541028(context, node, "skip"));
    editorCell.addEditorCell(this.createConstant1215708430380(context, node, "("));
    editorCell.addEditorCell(this.createRefNode1172658545280(context, node));
    editorCell.addEditorCell(this.createConstant1172658547564(context, node, ")"));
    return editorCell;
  }

  public EditorCell createConstant1172658541028(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11726585410281172658541028(editorCell, node, context);
    setupLabel_Constant_1172658541028_1172658541028(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new SkipOperation_Editor.SkipOperation_Editor_replaceWith_SequenceOperation_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createConstant1172658547564(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11726585475641172658547564(editorCell, node, context);
    setupLabel_Constant_1172658547564_1172658547564(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1215708430380(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12157084303801215708430380(editorCell, node, context);
    setupLabel_Constant_1215708430380_1215708430380(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1172658545280_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_elementsToSkip1172658545280(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_elementsToSkip_1172658545280((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1172658545280(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("elementsToSkip");
    provider.setNoTargetText("<no elementsToSkip>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1172658545280_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11726585392291172658539229(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1172658539229");
  }

  private static void setupBasic_Constant_11726585410281172658541028(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1172658541028");
    Collections_Style_StyleSheet.getOperation(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_elementsToSkip1172658545280(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11726585475641172658547564(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1172658547564");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12157084303801215708430380(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1215708430380");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1172658541028_1172658541028(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_elementsToSkip_1172658545280(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1172658547564_1172658547564(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1215708430380_1215708430380(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class SkipOperation_Editor_replaceWith_SequenceOperation_cellMenu0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public SkipOperation_Editor_replaceWith_SequenceOperation_cellMenu0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.baseLanguage.collections.structure.SequenceOperation";
    }

}

}
