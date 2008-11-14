package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.nodeEditor.BlockCells;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class FileGeneratorDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1226684746323;
  /* package */AbstractCellListHandler myListHandler_1226684746336;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1226684746338(context, node);
  }

  public EditorCell createCollection1226684746315(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12266847463151226684746315(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1226684746316(context, node, "file generator"));
    editorCell.addEditorCell(this.createConstant1226684746317(context, node, "extends"));
    editorCell.addEditorCell(this.createRefCell1226684746318(context, node));
    return editorCell;
  }

  public EditorCell createCollection1226684746322(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12266847463221226684746322(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRefNodeList1226684746323(context, node));
    editorCell.addEditorCell(this.createConstant1226684746325(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1226684746327(context, node));
    editorCell.addEditorCell(this.createConstant1226684746328(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1226684746330(context, node));
    editorCell.addEditorCell(this.createConstant1226684746331(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1226684746333(context, node));
    editorCell.addEditorCell(this.createConstant1226684746334(context, node, ""));
    editorCell.addEditorCell(this.createRefNodeList1226684746336(context, node));
    return editorCell;
  }

  public EditorCell createCollection1226684746338(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12266847463381226684746338(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1226684746339(context, node));
    editorCell.addEditorCell(this.createCollection1226684746342(context, node));
    if (renderingCondition0103_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1226684746832(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection1226684746339(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12266847463391226684746339(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1226684746315(context, node));
    if (renderingCondition0103_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1226684746811(context, node, "{"));
    }
    return editorCell;
  }

  public EditorCell createCollection1226684746342(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12266847463421226684746342(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell0103_0(context, node));
    editorCell.addEditorCell(this.createCollection1226684746322(context, node));
    return editorCell;
  }

  public EditorCell createConstant1226684746316(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12266847463161226684746316(editorCell, node, context);
    setupLabel_Constant_1226684746316_1226684746316(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1226684746317(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12266847463171226684746317(editorCell, node, context);
    setupLabel_Constant_1226684746317_1226684746317(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1226684746325(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12266847463251226684746325(editorCell, node, context);
    setupLabel_Constant_1226684746325_1226684746325(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1226684746328(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12266847463281226684746328(editorCell, node, context);
    setupLabel_Constant_1226684746328_1226684746328(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1226684746331(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12266847463311226684746331(editorCell, node, context);
    setupLabel_Constant_1226684746331_1226684746331(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1226684746334(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12266847463341226684746334(editorCell, node, context);
    setupLabel_Constant_1226684746334_1226684746334(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1226684746811(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12266847468111226684746811(editorCell, node, context);
    setupLabel_Constant_1226684746811_1226684746811(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1226684746832(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12266847468321226684746832(editorCell, node, context);
    setupLabel_Constant_1226684746832_1226684746832(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1226684746323(EditorContext context, SNode node) {
    if (this.myListHandler_1226684746323 == null) {
      this.myListHandler_1226684746323 = new FileGeneratorDeclaration_Editor.fieldListHandler_0103_0(node, "field", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1226684746323.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_field1226684746323(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1226684746323.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList1226684746336(EditorContext context, SNode node) {
    if (this.myListHandler_1226684746336 == null) {
      this.myListHandler_1226684746336 = new FileGeneratorDeclaration_Editor.methodListHandler_0103_0(node, "method", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1226684746336.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_method1226684746336(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1226684746336.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell0103_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createRefCell1226684746318_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new FileGeneratorDeclaration_Editor._Inline0103_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_extendedClass1226684746318(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_extendedClass_1226684746318((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1226684746318(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("extendedClass");
    provider.setNoTargetText("<no extendedClass>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1226684746318_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1226684746327_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_generateBlock1226684746327(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_generateBlock_1226684746327((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1226684746327(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("generateBlock");
    provider.setNoTargetText("<no generate block>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1226684746327_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1226684746330_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_isDefaultBlock1226684746330(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_isDefaultBlock_1226684746330((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1226684746330(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("isDefaultBlock");
    provider.setNoTargetText("<no isDefault block>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1226684746330_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1226684746333_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_overridesDefaultBlock1226684746333(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_overridesDefaultBlock_1226684746333((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1226684746333(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("overridesDefaultBlock");
    provider.setNoTargetText("<no overridesDefaultBlock>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1226684746333_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12266847463151226684746315(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1226684746315");
  }

  private static void setupBasic_Constant_12266847463161226684746316(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226684746316");
  }

  private static void setupBasic_Constant_12266847463171226684746317(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226684746317");
  }

  private static void setupBasic_refCell_extendedClass1226684746318(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_extendedClass");
  }

  private static void setupBasic_Collection_12266847463221226684746322(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1226684746322");
  }

  private static void setupBasic_refNodeList_field1226684746323(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_field");
  }

  private static void setupBasic_Constant_12266847463251226684746325(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226684746325");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_generateBlock1226684746327(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12266847463281226684746328(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226684746328");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_isDefaultBlock1226684746330(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12266847463311226684746331(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226684746331");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_overridesDefaultBlock1226684746333(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12266847463341226684746334(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226684746334");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_method1226684746336(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_method");
  }

  private static void setupBasic_Collection_12266847463381226684746338(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1226684746338");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12266847463391226684746339(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1226684746339");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12266847463421226684746342(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1226684746342");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12266847463431226684746343(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1226684746343");
  }

  private static void setupBasic_Constant_12266847468111226684746811(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226684746811");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12266847468321226684746832(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1226684746832");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1226684746316_1226684746316(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1226684746317_1226684746317(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_extendedClass_1226684746318(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_field_1226684746323(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1226684746325_1226684746325(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_generateBlock_1226684746327(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1226684746328_1226684746328(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_isDefaultBlock_1226684746330(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1226684746331_1226684746331(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_overridesDefaultBlock_1226684746333(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1226684746334_1226684746334(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_method_1226684746336(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1226684746811_1226684746811(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1226684746832_1226684746832(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition0103_0(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static boolean renderingCondition0103_1(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static class _Inline0103_0 extends AbstractCellProvider {

    public _Inline0103_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1226684746320(context, node);
    }

    public EditorCell createProperty1226684746320_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_name1226684746320(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_name_1226684746320((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1226684746320(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1226684746320_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_name1226684746320(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, "spaces"));
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_property_name_1226684746320(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class fieldListHandler_0103_0 extends RefNodeListHandler {

    public fieldListHandler_0103_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = this.createEmptyCell_internal(context, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public EditorCell createEmptyCell_internal(EditorContext context, SNode node) {
      return this.createConstant1226684746324(context, node, "");
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      return super.createSeparatorCell(context);
    }

    public EditorCell createConstant1226684746324(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12266847463241226684746324(editorCell, node, context);
      setupLabel_Constant_1226684746324_1226684746324(editorCell, node, context);
      editorCell.setDefaultText("<fields>");
      return editorCell;
    }


    private static void setupBasic_Constant_12266847463241226684746324(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1226684746324");
    }

    private static void setupLabel_Constant_1226684746324_1226684746324(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class methodListHandler_0103_0 extends RefNodeListHandler {

    public methodListHandler_0103_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = this.createEmptyCell_internal(context, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public EditorCell createEmptyCell_internal(EditorContext context, SNode node) {
      return this.createConstant1226684746337(context, node, "");
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      return super.createSeparatorCell(context);
    }

    public EditorCell createConstant1226684746337(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12266847463371226684746337(editorCell, node, context);
      setupLabel_Constant_1226684746337_1226684746337(editorCell, node, context);
      editorCell.setDefaultText("<methods>");
      return editorCell;
    }


    private static void setupBasic_Constant_12266847463371226684746337(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1226684746337");
    }

    private static void setupLabel_Constant_1226684746337_1226684746337(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
