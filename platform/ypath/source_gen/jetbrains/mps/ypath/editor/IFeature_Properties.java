package jetbrains.mps.ypath.editor;

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
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;

public class IFeature_Properties extends AbstractCellProvider {

  public IFeature_Properties(SNode node) {
    super(node);
  }

  public EditorCell createEditorCell(EditorContext context) {
    return this.createEditorCell(context, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1199012044067(context, node);
  }

  public EditorCell createCollection1199012044067(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11990120440671199012044067(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1199012045442(context, node));
    editorCell.addEditorCell(this.createCollection1199012070331(context, node));
    return editorCell;
  }

  public EditorCell createCollection1199012045442(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11990120454421199012045442(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1199012045443(context, node, "properties"));
    return editorCell;
  }

  public EditorCell createCollection1199012070331(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11990120703311199012070331(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1199012070332(context, node, "  "));
    editorCell.addEditorCell(this.createCollection1199012070333(context, node));
    return editorCell;
  }

  public EditorCell createCollection1199012070333(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11990120703331199012070333(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(true);
    editorCell.addEditorCell(this.createCollection1199012070334(context, node));
    editorCell.addEditorCell(this.createCollection1199012070336(context, node));
    editorCell.addEditorCell(this.createCollection1199012143817(context, node));
    editorCell.addEditorCell(this.createCollection1199012154061(context, node));
    return editorCell;
  }

  public EditorCell createCollection1199012070334(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11990120703341199012070334(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1199012070335(context, node, "writable"));
    return editorCell;
  }

  public EditorCell createCollection1199012070336(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11990120703361199012070336(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1199012070337(context, node, "  "));
    editorCell.addEditorCell(this.createProperty1199012070338(context, node));
    return editorCell;
  }

  public EditorCell createCollection1199012143817(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11990121438171199012143817(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1199012146226(context, node, "ascending"));
    return editorCell;
  }

  public EditorCell createCollection1199012154061(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11990121540611199012154061(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1199012154062(context, node, "  "));
    editorCell.addEditorCell(this.createProperty1199012549658(context, node));
    return editorCell;
  }

  public EditorCell createConstant1199012045443(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11990120454431199012045443(editorCell, node, context);
    setupLabel_Constant_1199012045443_1199012045443(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1199012070332(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11990120703321199012070332(editorCell, node, context);
    setupLabel_Constant_1199012070332_1199012070332(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1199012070335(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11990120703351199012070335(editorCell, node, context);
    setupLabel_Constant_1199012070335_1199012070335(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1199012070337(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11990120703371199012070337(editorCell, node, context);
    setupLabel_Constant_1199012070337_1199012070337(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1199012146226(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11990121462261199012146226(editorCell, node, context);
    setupLabel_Constant_1199012146226_1199012146226(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1199012154062(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11990121540621199012154062(editorCell, node, context);
    setupLabel_Constant_1199012154062_1199012154062(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty1199012070338_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_writable1199012070338(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_writable_1199012070338((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1199012070338(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("writable");
    provider.setNoTargetText("<no writable>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1199012070338_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1199012549658_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_ascending1199012549658(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_ascending_1199012549658((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1199012549658(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("ascending");
    provider.setNoTargetText("<no ascending>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1199012549658_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11990120440671199012044067(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1199012044067");
  }

  private static void setupBasic_Collection_11990120454421199012045442(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1199012045442");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11990120454431199012045443(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1199012045443");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.gray);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11990120703311199012070331(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1199012070331");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11990120703321199012070332(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1199012070332");
  }

  private static void setupBasic_Collection_11990120703331199012070333(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1199012070333");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11990120703341199012070334(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1199012070334");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11990120703351199012070335(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1199012070335");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_11990120703361199012070336(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1199012070336");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11990120703371199012070337(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1199012070337");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_writable1199012070338(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_writable");
  }

  private static void setupBasic_Collection_11990121438171199012143817(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1199012143817");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11990121462261199012146226(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1199012146226");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_11990121540611199012154061(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1199012154061");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11990121540621199012154062(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1199012154062");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_ascending1199012549658(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_ascending");
  }

  private static void setupLabel_Constant_1199012045443_1199012045443(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1199012070332_1199012070332(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1199012070335_1199012070335(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1199012070337_1199012070337(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_writable_1199012070338(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1199012146226_1199012146226(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1199012154062_1199012154062(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_ascending_1199012549658(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
