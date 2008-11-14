package jetbrains.mps.build.packaging.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class IncludeExcludeEditorComponent extends AbstractCellProvider {

  public IncludeExcludeEditorComponent(SNode node) {
    super(node);
  }

  public EditorCell createEditorCell(EditorContext context) {
    return this.createEditorCell(context, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1224596916549(context, node);
  }

  public EditorCell createCollection1224596916549(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12245969165491224596916549(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition0446_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection1224596916551(context, node));
    }
    if (renderingCondition0446_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection1224596916554(context, node));
    }
    return editorCell;
  }

  public EditorCell createCollection1224596916551(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12245969165511224596916551(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1224596916552(context, node, "excludes"));
    editorCell.addEditorCell(this.createProperty1224596916553(context, node));
    return editorCell;
  }

  public EditorCell createCollection1224596916554(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12245969165541224596916554(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1224596916555(context, node, "includes"));
    editorCell.addEditorCell(this.createProperty1224596916556(context, node));
    return editorCell;
  }

  public EditorCell createConstant1224596916552(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12245969165521224596916552(editorCell, node, context);
    setupLabel_Constant_1224596916552_1224596916552(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1224596916555(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12245969165551224596916555(editorCell, node, context);
    setupLabel_Constant_1224596916555_1224596916555(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty1224596916553_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_excludes1224596916553(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_excludes_1224596916553((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1224596916553(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("excludes");
    provider.setNoTargetText("<no excludes>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty1224596916553_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1224596916556_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_includes1224596916556(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_includes_1224596916556((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1224596916556(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("includes");
    provider.setNoTargetText("<no includes>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty1224596916556_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12245969165491224596916549(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1224596916549");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12245969165511224596916551(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1224596916551");
  }

  private static void setupBasic_Constant_12245969165521224596916552(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1224596916552");
    MPSLayoutStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_LEFT, new Padding(1.0, "spaces"));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_excludes1224596916553(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_excludes");
  }

  private static void setupBasic_Collection_12245969165541224596916554(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1224596916554");
  }

  private static void setupBasic_Constant_12245969165551224596916555(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1224596916555");
    MPSLayoutStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
  }

  private static void setupBasic_property_includes1224596916556(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_includes");
  }

  private static void setupLabel_Constant_1224596916552_1224596916552(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_excludes_1224596916553(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1224596916555_1224596916555(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_includes_1224596916556(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition0446_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getString(node, "excludes") != null && SPropertyOperations.getString(node, "excludes").length() > 0;
  }

  public static boolean renderingCondition0446_1(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getString(node, "includes") != null && SPropertyOperations.getString(node, "includes").length() > 0;
  }

}
