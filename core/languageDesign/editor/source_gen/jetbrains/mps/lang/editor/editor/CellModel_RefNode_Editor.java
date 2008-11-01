package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class CellModel_RefNode_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_OpenTag1311_0;
  /* package */AbstractCellProvider my_CloseTag1311_0;
  /* package */AbstractCellProvider my_CellModel_Common1311_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1080832307620(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1080832307624(context, node);
  }

  public EditorCell createCollection1080832307620(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_10808323076201080832307620(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent1176717163182(context, node));
    editorCell.addEditorCell(this.createRefCell1140223719665(context, node));
    editorCell.addEditorCell(this.createComponent1176717169105(context, node));
    return editorCell;
  }

  public EditorCell createCollection1080832307624(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_10808323076241080832307624(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent1214477839006(context, node));
    editorCell.addEditorCell(this.createConstant1214478529990(context, node, ""));
    editorCell.addEditorCell(this.createConstant1080832307625(context, node, "Ref.node cell:"));
    editorCell.addEditorCell(this.createCollection1214477690868(context, node));
    return editorCell;
  }

  public EditorCell createCollection1214477690868(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12144776908681214477690868(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1214477807872(context, node));
    editorCell.addEditorCell(this.createCollection1214477807883(context, node));
    if (renderingCondition1311_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection1214560571660(context, node));
    }
    return editorCell;
  }

  public EditorCell createCollection1214477807872(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12144778078721214477807872(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1214477807873(context, node, "link"));
    editorCell.addEditorCell(this.createRefCell1214477807876(context, node));
    return editorCell;
  }

  public EditorCell createCollection1214477807883(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12144778078831214477807883(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1214477807884(context, node, "text*"));
    editorCell.addEditorCell(this.createProperty1214477807887(context, node));
    return editorCell;
  }

  public EditorCell createCollection1214560571660(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12145605716601214560571660(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1214560571661(context, node, "empty text*"));
    editorCell.addEditorCell(this.createProperty1214560571662(context, node));
    return editorCell;
  }

  public EditorCell createComponent1176717163182(EditorContext context, SNode node) {
    if (this.my_OpenTag1311_0 == null) {
      this.my_OpenTag1311_0 = new _OpenTag(node);
    }
    EditorCell editorCell = this.my_OpenTag1311_0.createEditorCell(context);
    setupBasic_component__OpenTag1176717163182(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent1176717169105(EditorContext context, SNode node) {
    if (this.my_CloseTag1311_0 == null) {
      this.my_CloseTag1311_0 = new _CloseTag(node);
    }
    EditorCell editorCell = this.my_CloseTag1311_0.createEditorCell(context);
    setupBasic_component__CloseTag1176717169105(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent1214477839006(EditorContext context, SNode node) {
    if (this.my_CellModel_Common1311_0 == null) {
      this.my_CellModel_Common1311_0 = new _CellModel_Common(node);
    }
    EditorCell editorCell = this.my_CellModel_Common1311_0.createEditorCell(context);
    setupBasic_component__CellModel_Common1214477839006(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant1080832307625(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_10808323076251080832307625(editorCell, node, context);
    setupLabel_Constant_1080832307625_1080832307625(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1214477807873(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12144778078731214477807873(editorCell, node, context);
    setupLabel_Constant_1214477807873_1214477807873(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1214477807884(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12144778078841214477807884(editorCell, node, context);
    setupLabel_Constant_1214477807884_1214477807884(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1214478529990(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12144785299901214478529990(editorCell, node, context);
    setupLabel_Constant_1214478529990_1214478529990(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1214560571661(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12145605716611214560571661(editorCell, node, context);
    setupLabel_Constant_1214560571661_1214560571661(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefCell1140223719665_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new CellModel_RefNode_Editor._Inline1311_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_linkDeclaration1140223719665(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_linkDeclaration_1140223719665((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1140223719665(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("linkDeclaration");
    provider.setNoTargetText("<no link>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1140223719665_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell1214477807876_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new CellModel_RefNode_Editor._Inline1311_1());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_linkDeclaration1214477807876(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_linkDeclaration_1214477807876((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1214477807876(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("linkDeclaration");
    provider.setNoTargetText("<no link>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1214477807876_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1214477807887_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_noTargetText1214477807887(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_noTargetText_1214477807887((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1214477807887(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("noTargetText");
    provider.setNoTargetText("<none>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty1214477807887_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1214560571662_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_emptyNoTargetText1214560571662(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_emptyNoTargetText_1214560571662((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1214560571662(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("emptyNoTargetText");
    provider.setNoTargetText("<none>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty1214560571662_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_10808323076201080832307620(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1080832307620");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_10808323076241080832307624(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1080832307624");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_10808323076251080832307625(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1080832307625");
    Styles_StyleSheet.getHeader(editorCell).apply(editorCell);
  }

  private static void setupBasic_refCell_linkDeclaration1140223719665(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_linkDeclaration");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_component__OpenTag1176717163182(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component__OpenTag");
  }

  private static void setupBasic_component__CloseTag1176717169105(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component__CloseTag");
  }

  private static void setupBasic_Collection_12144776908681214477690868(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1214477690868");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12144778078721214477807872(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1214477807872");
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

  private static void setupBasic_Constant_12144778078731214477807873(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1214477807873");
    Styles_StyleSheet.getProperty(editorCell).apply(editorCell);
  }

  private static void setupBasic_refCell_linkDeclaration1214477807876(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_linkDeclaration");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12144778078831214477807883(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1214477807883");
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

  private static void setupBasic_Constant_12144778078841214477807884(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1214477807884");
    Styles_StyleSheet.getProperty(editorCell).apply(editorCell);
  }

  private static void setupBasic_property_noTargetText1214477807887(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_noTargetText");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, true);
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.yellow);
          this.set(StyleAttributes.SELECTED_TEXT_BACKGROUND_COLOR, MPSColors.cyan);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_component__CellModel_Common1214477839006(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component__CellModel_Common");
  }

  private static void setupBasic_Constant_12144785299901214478529990(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1214478529990");
  }

  private static void setupBasic_Collection_12145605716601214560571660(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1214560571660");
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

  private static void setupBasic_Constant_12145605716611214560571661(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1214560571661");
    Styles_StyleSheet.getProperty(editorCell).apply(editorCell);
  }

  private static void setupBasic_property_emptyNoTargetText1214560571662(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_emptyNoTargetText");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.DRAW_BORDER, true);
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.yellow);
          this.set(StyleAttributes.SELECTED_TEXT_BACKGROUND_COLOR, MPSColors.cyan);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_1080832307625_1080832307625(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_linkDeclaration_1140223719665(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1214477807873_1214477807873(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_linkDeclaration_1214477807876(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1214477807884_1214477807884(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_noTargetText_1214477807887(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1214478529990_1214478529990(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1214560571661_1214560571661(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_emptyNoTargetText_1214560571662(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition1311_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getString(node, "noTargetText") == null;
  }

  public static class _Inline1311_0 extends AbstractCellProvider {

    public _Inline1311_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1140223741229(context, node);
    }

    public EditorCell createProperty1140223741229_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_role1140223741229(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_role_1140223741229((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1140223741229(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("role");
      provider.setNoTargetText("<no role>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1140223741229_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_role1140223741229(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_role");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.DRAW_BORDER, true);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_property_role_1140223741229(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class _Inline1311_1 extends AbstractCellProvider {

    public _Inline1311_1() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1214477807878(context, node);
    }

    public EditorCell createProperty1214477807878_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_role1214477807878(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_role_1214477807878((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1214477807878(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("role");
      provider.setNoTargetText("<no role>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1214477807878_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_role1214477807878(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_role");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.DRAW_BORDER, true);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_property_role_1214477807878(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
