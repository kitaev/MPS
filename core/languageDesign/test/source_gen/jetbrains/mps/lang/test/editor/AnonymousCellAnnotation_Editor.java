package jetbrains.mps.lang.test.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;

public class AnonymousCellAnnotation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1229195018258(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1229277791864(context, node);
  }

  public EditorCell createCollection1229195018258(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12291950182581229195018258(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1229195023151(context, node, "<"));
    editorCell.addEditorCell(this.createConstant1229195103100(context, node, "cell"));
    editorCell.addEditorCell(this.createAttributedNodeCell1229195083676(context, node));
    editorCell.addEditorCell(this.createConstant1229195046654(context, node, ">"));
    return editorCell;
  }

  public EditorCell createCollection1229277791864(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12292777918641229277791864(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1229277798945(context, node));
    return editorCell;
  }

  public EditorCell createCollection1229277798945(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12292777989451229277798945(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1229277802728(context, node, "cell id:"));
    editorCell.addEditorCell(this.createProperty1229277846684(context, node));
    return editorCell;
  }

  public EditorCell createConstant1229195023151(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12291950231511229195023151(editorCell, node, context);
    setupLabel_Constant_1229195023151_1229195023151(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1229195046654(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12291950466541229195046654(editorCell, node, context);
    setupLabel_Constant_1229195046654_1229195046654(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1229195103100(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12291951031001229195103100(editorCell, node, context);
    setupLabel_Constant_1229195103100_1229195103100(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1229277802728(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12292778027281229277802728(editorCell, node, context);
    setupLabel_Constant_1229277802728_1229277802728(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createAttributedNodeCell1229195083676(EditorContext context, SNode node) {
    IOperationContext opContext = context.getOperationContext();
    EditorManager manager = EditorManager.getInstanceFromContext(opContext);
    EditorCell editorCell = manager.getCurrentAttributedNodeCell();
    setupBasic_AttributedNodeCell_12291950836761229195083676(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createProperty1229277846684_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_cellId1229277846684(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_cellId_1229277846684((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1229277846684(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("cellId");
    provider.setNoTargetText("<no cellId>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1229277846684_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12291950182581229195018258(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1229195018258");
  }

  private static void setupBasic_Constant_12291950231511229195023151(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1229195023151");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12291950466541229195046654(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1229195046654");
  }

  private static void setupBasic_AttributedNodeCell_12291950836761229195083676(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("AttributedNodeCell_1229195083676");
  }

  private static void setupBasic_Constant_12291951031001229195103100(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1229195103100");
    transformationTest_StyleSheet.getEditorOperation(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_12292777918641229277791864(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1229277791864");
  }

  private static void setupBasic_Collection_12292777989451229277798945(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1229277798945");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12292778027281229277802728(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1229277802728");
  }

  private static void setupBasic_property_cellId1229277846684(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_cellId");
  }

  private static void setupLabel_Constant_1229195023151_1229195023151(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1229195046654_1229195046654(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1229195103100_1229195103100(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1229277802728_1229277802728(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_cellId_1229277846684(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
