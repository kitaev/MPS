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
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class BlockStatement_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1119291654779(context, node);
  }

  public EditorCell createCollection1119291654779(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11192916547791119291654779(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition6106_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1144224544543(context, node, "{"));
    }
    editorCell.addEditorCell(this.createCollection1119291719344(context, node));
    if (renderingCondition6106_2(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1119291721269(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection1119291719344(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11192917193441119291719344(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition6106_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1119291719345(context, node, "  "));
    }
    editorCell.addEditorCell(this.createRefNode1119291719346(context, node));
    return editorCell;
  }

  public EditorCell createConstant1119291719345(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11192917193451119291719345(editorCell, node, context);
    setupLabel_Constant_1119291719345_1119291719345(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1119291721269(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11192917212691119291721269(editorCell, node, context);
    setupLabel_Constant_1119291721269_1119291721269(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1144224544543(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11442245445431144224544543(editorCell, node, context);
    setupLabel_Constant_1144224544543_1144224544543(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1119291719346_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_statements1119291719346(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_statements_1119291719346((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1119291719346(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("statements");
    provider.setNoTargetText("<no statements>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1119291719346_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11192916547791119291654779(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1119291654779");
  }

  private static void setupBasic_Collection_11192917193441119291719344(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1119291719344");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11192917193451119291719345(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1119291719345");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.PADDING_LEFT, new Padding(0.0, "spaces"));
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, "spaces"));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_statements1119291719346(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11192917212691119291721269(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1119291721269");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_11442245445431144224544543(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1144224544543");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_LEFT, new Padding(0.0, "spaces"));
        }

      };
      inlineStyle.apply(editorCell);
    }
    editorCell.addKeyMap(new InsertFirstStatement_KeyMap());
  }

  private static void setupLabel_Constant_1119291719345_1119291719345(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_statements_1119291719346(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1119291721269_1119291721269(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1144224544543_1144224544543(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition6106_0(SNode node, EditorContext editorContext, IScope scope) {
    return !(SNodeOperations.hasRole(node, "jetbrains.mps.baseLanguage.structure.IfStatement", "ifFalseStatement"));
  }

  public static boolean renderingCondition6106_1(SNode node, EditorContext editorContext, IScope scope) {
    return !(SNodeOperations.hasRole(node, "jetbrains.mps.baseLanguage.structure.IfStatement", "ifFalseStatement"));
  }

  public static boolean renderingCondition6106_2(SNode node, EditorContext editorContext, IScope scope) {
    return !(SNodeOperations.hasRole(node, "jetbrains.mps.baseLanguage.structure.IfStatement", "ifFalseStatement"));
  }

}
