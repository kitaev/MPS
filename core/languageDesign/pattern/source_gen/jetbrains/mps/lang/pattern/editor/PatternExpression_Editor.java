package jetbrains.mps.lang.pattern.editor;

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
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.style.Padding;

public class PatternExpression_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1136720096749(context, node);
  }

  public EditorCell createCollection1136720096749(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11367200967491136720096749(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1136720096750(context, node, ">"));
    editorCell.addEditorCell(this.createRefNode1136720096751(context, node));
    editorCell.addEditorCell(this.createConstant1136720096752(context, node, "<"));
    return editorCell;
  }

  public EditorCell createConstant1136720096750(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11367200967501136720096750(editorCell, node, context);
    setupLabel_Constant_1136720096750_1136720096750(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1136720096752(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11367200967521136720096752(editorCell, node, context);
    setupLabel_Constant_1136720096752_1136720096752(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1136720096751_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_patternNode1136720096751(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_patternNode_1136720096751((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1136720096751(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("patternNode");
    provider.setNoTargetText("<no patternNode>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1136720096751_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11367200967491136720096749(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1136720096749");
    editorCell.addKeyMap(new _PatternExpression_KeyMap());
  }

  private static void setupBasic_Constant_11367200967501136720096750(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1136720096750");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.EDITABLE, false);
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.green);
          this.set(StyleAttributes.PADDING_RIGHT_WITH_MEASURE, new Padding(0.0, "spaces"));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_patternNode1136720096751(EditorCell editorCell, SNode node, EditorContext context) {
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BRACKETS, false);
          this.set(StyleAttributes.DRAW_BORDER, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11367200967521136720096752(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1136720096752");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.green);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_1136720096750_1136720096750(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_patternNode_1136720096751(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1136720096752_1136720096752(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
