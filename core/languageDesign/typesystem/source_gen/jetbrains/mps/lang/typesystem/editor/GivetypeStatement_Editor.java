package jetbrains.mps.lang.typesystem.editor;

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
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;

public class GivetypeStatement_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1175496213287(context, node);
  }

  public EditorCell createCollection1175496213287(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11754962132871175496213287(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1196780008705(context, node, "!"));
    editorCell.addEditorCell(this.createConstant1175496216836(context, node, "givetype"));
    editorCell.addEditorCell(this.createConstant1175519380362(context, node, "("));
    editorCell.addEditorCell(this.createRefNode1175496229572(context, node));
    editorCell.addEditorCell(this.createConstant1175519384020(context, node, ")"));
    editorCell.addEditorCell(this.createConstant1175496245699(context, node, "to"));
    editorCell.addEditorCell(this.createRefNode1175496250217(context, node));
    editorCell.addEditorCell(this.createConstant1175496799986(context, node, ";"));
    return editorCell;
  }

  public EditorCell createConstant1175496216836(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11754962168361175496216836(editorCell, node, context);
    setupLabel_Constant_1175496216836_1175496216836(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1175496245699(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11754962456991175496245699(editorCell, node, context);
    setupLabel_Constant_1175496245699_1175496245699(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1175496799986(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11754967999861175496799986(editorCell, node, context);
    setupLabel_Constant_1175496799986_1175496799986(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1175519380362(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11755193803621175519380362(editorCell, node, context);
    setupLabel_Constant_1175519380362_1175519380362(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1175519384020(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11755193840201175519384020(editorCell, node, context);
    setupLabel_Constant_1175519384020_1175519384020(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1196780008705(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11967800087051196780008705(editorCell, node, context);
    setupLabel_Constant_1196780008705_1196780008705(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1175496229572_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_typeExpression1175496229572(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_typeExpression_1175496229572((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1175496229572(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("typeExpression");
    provider.setNoTargetText("<no typeExpression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1175496229572_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1175496250217_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_termExpression1175496250217(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_termExpression_1175496250217((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1175496250217(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("termExpression");
    provider.setNoTargetText("<no termExpression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1175496250217_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11754962132871175496213287(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1175496213287");
  }

  private static void setupBasic_Constant_11754962168361175496216836(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1175496216836");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_typeExpression1175496229572(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11754962456991175496245699(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1175496245699");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_termExpression1175496250217(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11754967999861175496799986(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1175496799986");
  }

  private static void setupBasic_Constant_11755193803621175519380362(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1175519380362");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_11755193840201175519384020(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1175519384020");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_11967800087051196780008705(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1196780008705");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.red);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_1175496216836_1175496216836(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_typeExpression_1175496229572(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1175496245699_1175496245699(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_termExpression_1175496250217(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1175496799986_1175496799986(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1175519380362_1175519380362(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1175519384020_1175519384020(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1196780008705_1196780008705(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
