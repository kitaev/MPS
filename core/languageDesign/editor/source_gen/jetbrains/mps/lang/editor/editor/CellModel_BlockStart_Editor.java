package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;

public class CellModel_BlockStart_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_CellModel_Common1215_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createProperty1198504910573(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1198504953470(context, node);
  }

  public EditorCell createCollection1198504953470(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11985049534701198504953470(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent1214478813995(context, node));
    return editorCell;
  }

  public EditorCell createComponent1214478813995(EditorContext context, SNode node) {
    if (this.my_CellModel_Common1215_0 == null) {
      this.my_CellModel_Common1215_0 = new _CellModel_Common(node);
    }
    EditorCell editorCell = this.my_CellModel_Common1215_0.createEditorCell(context);
    setupBasic_component__CellModel_Common1214478813995(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createProperty1198504910573_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_openBrace1198504910573(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_openBrace_1198504910573((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1198504910573(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("openBrace");
    provider.setNoTargetText("{");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty1198504910573_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_property_openBrace1198504910573(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_openBrace");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, true);
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
          this.set(StyleAttributes.NULL_TEXT_COLOR, MPSColors.blue);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11985049534701198504953470(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1198504953470");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.DRAW_BORDER, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_component__CellModel_Common1214478813995(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component__CellModel_Common");
  }

  private static void setupLabel_property_openBrace_1198504910573(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
