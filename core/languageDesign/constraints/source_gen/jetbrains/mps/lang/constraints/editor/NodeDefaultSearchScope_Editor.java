package jetbrains.mps.lang.constraints.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class NodeDefaultSearchScope_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1159289834189(context, node);
  }

  public EditorCell createCollection1159289834189(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11592898341891159289834189(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(true);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1159289834201(context, node));
    editorCell.addEditorCell(this.createConstant1159289834243(context, node, ""));
    return editorCell;
  }

  public EditorCell createCollection1159289834201(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11592898342011159289834201(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1159289834202(context, node, "  "));
    editorCell.addEditorCell(this.createCollection1159289834203(context, node));
    return editorCell;
  }

  public EditorCell createCollection1159289834203(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11592898342031159289834203(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition7999_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection1159289834204(context, node));
    }
    if (renderingCondition7999_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection1159289834235(context, node));
    }
    editorCell.addEditorCell(this.createCollection1159289834239(context, node));
    return editorCell;
  }

  public EditorCell createCollection1159289834204(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11592898342041159289834204(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1159289834205(context, node, "search scope description (deprecated)"));
    editorCell.addEditorCell(this.createConstant1159289834206(context, node, ":"));
    editorCell.addEditorCell(this.createProperty1159289834207(context, node));
    return editorCell;
  }

  public EditorCell createCollection1159289834235(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11592898342351159289834235(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1159289834236(context, node, "can create (deprecated)"));
    editorCell.addEditorCell(this.createConstant1159289834237(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode1159289834238(context, node));
    return editorCell;
  }

  public EditorCell createCollection1159289834239(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11592898342391159289834239(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1159289834240(context, node, "search scope"));
    editorCell.addEditorCell(this.createConstant1159289834241(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode1159289834242(context, node));
    return editorCell;
  }

  public EditorCell createConstant1159289834202(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11592898342021159289834202(editorCell, node, context);
    setupLabel_Constant_1159289834202_1159289834202(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1159289834205(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11592898342051159289834205(editorCell, node, context);
    setupLabel_Constant_1159289834205_1159289834205(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1159289834206(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11592898342061159289834206(editorCell, node, context);
    setupLabel_Constant_1159289834206_1159289834206(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1159289834236(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11592898342361159289834236(editorCell, node, context);
    setupLabel_Constant_1159289834236_1159289834236(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1159289834237(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11592898342371159289834237(editorCell, node, context);
    setupLabel_Constant_1159289834237_1159289834237(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1159289834240(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11592898342401159289834240(editorCell, node, context);
    setupLabel_Constant_1159289834240_1159289834240(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1159289834241(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11592898342411159289834241(editorCell, node, context);
    setupLabel_Constant_1159289834241_1159289834241(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1159289834243(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11592898342431159289834243(editorCell, node, context);
    setupLabel_Constant_1159289834243_1159289834243(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty1159289834207_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_description1159289834207(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_description_1159289834207((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1159289834207(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("description");
    provider.setNoTargetText("<no description>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty1159289834207_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1159289834238_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_searchScopeCanCreate1159289834238(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_searchScopeCanCreate_1159289834238((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1159289834238(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("searchScopeCanCreate");
    provider.setNoTargetText("<default>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1159289834238_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1159289834242_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_searchScopeFactory1159289834242(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_searchScopeFactory_1159289834242((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1159289834242(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("searchScopeFactory");
    provider.setNoTargetText("<none>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1159289834242_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11592898341891159289834189(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1159289834189");
  }

  private static void setupBasic_Collection_11592898342011159289834201(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1159289834201");
  }

  private static void setupBasic_Constant_11592898342021159289834202(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1159289834202");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11592898342031159289834203(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1159289834203");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11592898342041159289834204(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1159289834204");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11592898342051159289834205(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1159289834205");
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

  private static void setupBasic_Constant_11592898342061159289834206(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1159289834206");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_description1159289834207(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_description");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11592898342351159289834235(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1159289834235");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11592898342361159289834236(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1159289834236");
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

  private static void setupBasic_Constant_11592898342371159289834237(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1159289834237");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_searchScopeCanCreate1159289834238(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_11592898342391159289834239(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1159289834239");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11592898342401159289834240(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1159289834240");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11592898342411159289834241(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1159289834241");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_searchScopeFactory1159289834242(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11592898342431159289834243(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1159289834243");
  }

  private static void setupLabel_Constant_1159289834202_1159289834202(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1159289834205_1159289834205(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1159289834206_1159289834206(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_description_1159289834207(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1159289834236_1159289834236(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1159289834237_1159289834237(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_searchScopeCanCreate_1159289834238(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1159289834240_1159289834240(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1159289834241_1159289834241(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_searchScopeFactory_1159289834242(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1159289834243_1159289834243(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition7999_0(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "searchScopeCanCreate", true) != null);
  }

  public static boolean renderingCondition7999_1(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getString(node, "description") != null && SPropertyOperations.getString(node, "description").length() > 0;
  }

}
