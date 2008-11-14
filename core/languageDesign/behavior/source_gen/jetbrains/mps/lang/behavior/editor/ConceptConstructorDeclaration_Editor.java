package jetbrains.mps.lang.behavior.editor;

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
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;

public class ConceptConstructorDeclaration_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1225194413948(context, node);
  }

  public EditorCell createCollection1225194413948(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12251944139481225194413948(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1225194413949(context, node));
    editorCell.addEditorCell(this.createCollection1225194413953(context, node));
    editorCell.addEditorCell(this.createConstant1225194413956(context, node, "}"));
    return editorCell;
  }

  public EditorCell createCollection1225194413949(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12251944139491225194413949(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1225194413950(context, node, "constructor"));
    editorCell.addEditorCell(this.createConstant1225194413952(context, node, "{"));
    return editorCell;
  }

  public EditorCell createCollection1225194413953(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12251944139531225194413953(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell6948_0(context, node));
    editorCell.addEditorCell(this.createRefNode1225194413955(context, node));
    return editorCell;
  }

  public EditorCell createConstant1225194413950(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12251944139501225194413950(editorCell, node, context);
    setupLabel_Constant_1225194413950_1225194413950(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1225194413952(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12251944139521225194413952(editorCell, node, context);
    setupLabel_Constant_1225194413952_1225194413952(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1225194413956(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12251944139561225194413956(editorCell, node, context);
    setupLabel_Constant_1225194413956_1225194413956(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createIndentCell6948_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createRefNode1225194413955_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_body1225194413955(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_body_1225194413955((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1225194413955(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("body");
    provider.setNoTargetText("<no body>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1225194413955_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12251944139481225194413948(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1225194413948");
  }

  private static void setupBasic_Collection_12251944139491225194413949(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1225194413949");
  }

  private static void setupBasic_Constant_12251944139501225194413950(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1225194413950");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, "spaces"));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12251944139521225194413952(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1225194413952");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_12251944139531225194413953(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1225194413953");
  }

  private static void setupBasic_Indent_12251944139541225194413954(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1225194413954");
  }

  private static void setupBasic_refNode_body1225194413955(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12251944139561225194413956(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1225194413956");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1225194413950_1225194413950(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1225194413952_1225194413952(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_body_1225194413955(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1225194413956_1225194413956(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
