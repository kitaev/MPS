package jetbrains.mps.lang.plugin.editor;

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
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.nodeEditor.BlockCells;

public class GeneratePlugins_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1226684746036(context, node);
  }

  public EditorCell createCollection1226684746009(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12266847460091226684746009(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1226684746010(context, node));
    editorCell.addEditorCell(this.createCollection1226684746015(context, node));
    return editorCell;
  }

  public EditorCell createCollection1226684746010(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12266847460101226684746010(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1226684746012(context, node, "generate project component"));
    editorCell.addEditorCell(this.createConstant1226684746013(context, node, ":"));
    editorCell.addEditorCell(this.createProperty1226684746014(context, node));
    return editorCell;
  }

  public EditorCell createCollection1226684746015(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12266847460151226684746015(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1226684746017(context, node, "generate application component"));
    editorCell.addEditorCell(this.createConstant1226684746018(context, node, ":"));
    editorCell.addEditorCell(this.createProperty1226684746019(context, node));
    return editorCell;
  }

  public EditorCell createCollection1226684746036(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12266847460361226684746036(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1226684746037(context, node));
    editorCell.addEditorCell(this.createCollection1226684746040(context, node));
    if (renderingCondition1681_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1226684746593(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection1226684746037(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12266847460371226684746037(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1226684746008(context, node, "Generate Plugins"));
    if (renderingCondition1681_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1226684746588(context, node, "{"));
    }
    return editorCell;
  }

  public EditorCell createCollection1226684746040(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12266847460401226684746040(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell1681_0(context, node));
    editorCell.addEditorCell(this.createCollection1226684746009(context, node));
    return editorCell;
  }

  public EditorCell createConstant1226684746008(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12266847460081226684746008(editorCell, node, context);
    setupLabel_Constant_1226684746008_1226684746008(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1226684746012(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12266847460121226684746012(editorCell, node, context);
    setupLabel_Constant_1226684746012_1226684746012(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1226684746013(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12266847460131226684746013(editorCell, node, context);
    setupLabel_Constant_1226684746013_1226684746013(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1226684746017(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12266847460171226684746017(editorCell, node, context);
    setupLabel_Constant_1226684746017_1226684746017(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1226684746018(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12266847460181226684746018(editorCell, node, context);
    setupLabel_Constant_1226684746018_1226684746018(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1226684746588(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12266847465881226684746588(editorCell, node, context);
    setupLabel_Constant_1226684746588_1226684746588(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1226684746593(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12266847465931226684746593(editorCell, node, context);
    setupLabel_Constant_1226684746593_1226684746593(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createIndentCell1681_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createProperty1226684746014_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_generateProjectPlugin1226684746014(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_generateProjectPlugin_1226684746014((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1226684746014(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("generateProjectPlugin");
    provider.setNoTargetText("<no generateProjectPlugin>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1226684746014_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1226684746019_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_generateApplicationPlugin1226684746019(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_generateApplicationPlugin_1226684746019((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1226684746019(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("generateApplicationPlugin");
    provider.setNoTargetText("<no generateApplicationPlugin>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1226684746019_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Constant_12266847460081226684746008(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226684746008");
  }

  private static void setupBasic_Collection_12266847460091226684746009(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1226684746009");
  }

  private static void setupBasic_Collection_12266847460101226684746010(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1226684746010");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12266847460121226684746012(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226684746012");
  }

  private static void setupBasic_Constant_12266847460131226684746013(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226684746013");
  }

  private static void setupBasic_property_generateProjectPlugin1226684746014(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_generateProjectPlugin");
  }

  private static void setupBasic_Collection_12266847460151226684746015(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1226684746015");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12266847460171226684746017(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226684746017");
  }

  private static void setupBasic_Constant_12266847460181226684746018(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226684746018");
  }

  private static void setupBasic_property_generateApplicationPlugin1226684746019(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_generateApplicationPlugin");
  }

  private static void setupBasic_Collection_12266847460361226684746036(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1226684746036");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12266847460371226684746037(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1226684746037");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12266847460401226684746040(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1226684746040");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12266847460411226684746041(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1226684746041");
  }

  private static void setupBasic_Constant_12266847465881226684746588(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226684746588");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12266847465931226684746593(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226684746593");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1226684746008_1226684746008(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1226684746012_1226684746012(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1226684746013_1226684746013(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_generateProjectPlugin_1226684746014(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1226684746017_1226684746017(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1226684746018_1226684746018(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_generateApplicationPlugin_1226684746019(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1226684746588_1226684746588(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1226684746593_1226684746593(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition1681_0(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static boolean renderingCondition1681_1(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

}
