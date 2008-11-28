package jetbrains.mps.ypath.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.ypath.behavior.IterateOperation_Behavior;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.nodeEditor.cellMenu.CellContext;

public class IterateOperation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1178981885128(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1197457259749(context, node);
  }

  public EditorCell createCollection1178981885128(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11789818851281178981885128(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createReadOnlyModelAccessor1226062536173(context, node));
    if (renderingCondition7857_3(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection1197644974882(context, node));
    }
    return editorCell;
  }

  public EditorCell createCollection1197457259749(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11974572597491197457259749(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1197457263643(context, node));
    return editorCell;
  }

  public EditorCell createCollection1197457263643(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11974572636431197457263643(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1197457264548(context, node, "used feature:"));
    editorCell.addEditorCell(this.createRefCell1197457270305(context, node));
    if (renderingCondition7857_4(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection1199715336889(context, node));
    }
    return editorCell;
  }

  public EditorCell createCollection1197644974882(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11976449748821197644974882(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition7857_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1197644974883(context, node, "*"));
    }
    if (renderingCondition7857_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRefCell1197644974894(context, node));
    }
    if (renderingCondition7857_2(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRefNode1197644974916(context, node));
    }
    return editorCell;
  }

  public EditorCell createCollection1199715336889(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11997153368891199715336889(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1199790457860(context, node, "/"));
    editorCell.addEditorCell(this.createRefNode1199715349117(context, node));
    return editorCell;
  }

  public EditorCell createConstant1197457264548(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11974572645481197457264548(editorCell, node, context);
    setupLabel_Constant_1197457264548_1197457264548(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1197644974883(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11976449748831197644974883(editorCell, node, context);
    setupLabel_Constant_1197644974883_1197644974883(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new IterateOperation_Editor.IterateOperation_component_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createConstant1199790457860(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11997904578601199790457860(editorCell, node, context);
    setupLabel_Constant_1199790457860_1199790457860(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor1226062536173(final EditorContext context, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(context, new ModelAccessor() {

      public String getText() {
        return IterateOperation_Behavior.call_getAxisInternalValue_1213877293456(node);
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }

    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ReadOnlyModelAccessor_12260625361731226062536173(editorCell, node, context);
    setupLabel_ReadOnlyModelAccessor_1226062536173_1226062536173(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createRefCell1197457270305_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new IterateOperation_Editor._Inline7857_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_usedFeature1197457270305(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_usedFeature_1197457270305((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1197457270305(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("usedFeature");
    provider.setNoTargetText("<no usedFeature>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1197457270305_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell1197644974894_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new IterateOperation_Editor._Inline7857_1());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_usedFeature1197644974894(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_usedFeature_1197644974894((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new SubstituteInfoPart[]{new IterateOperation_Editor.IterateOperation_component_cellMenu1()}));
    return editorCell;
  }

  public EditorCell createRefCell1197644974894(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("usedFeature");
    provider.setNoTargetText("<no usedFeature>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1197644974894_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1197644974916_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_paramObject1197644974916(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_paramObject_1197644974916((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new SubstituteInfoPart[]{new IterateOperation_Editor.IterateOperation_component_cellMenu2()}));
    return editorCell;
  }

  public EditorCell createRefNode1197644974916(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("paramObject");
    provider.setNoTargetText("<no paramObject>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1197644974916_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1199715349117_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_paramObject1199715349117(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_paramObject_1199715349117((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1199715349117(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("paramObject");
    provider.setNoTargetText("<no paramObject>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1199715349117_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11789818851281178981885128(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1178981885128");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11974572597491197457259749(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1197457259749");
  }

  private static void setupBasic_Collection_11974572636431197457263643(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1197457263643");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11974572645481197457264548(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1197457264548");
  }

  private static void setupBasic_refCell_usedFeature1197457270305(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_usedFeature");
  }

  private static void setupBasic_Collection_11976449748821197644974882(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1197644974882");
  }

  private static void setupBasic_Constant_11976449748831197644974883(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1197644974883");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.EDITABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
    IterateOperation_DELETE.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_refCell_usedFeature1197644974894(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_usedFeature");
    IterateOperation_DELETE.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_refNode_paramObject1197644974916(EditorCell editorCell, SNode node, EditorContext context) {
    IterateOperation_DELETE.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Collection_11997153368891199715336889(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1199715336889");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_paramObject1199715349117(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11997904578601199790457860(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1199790457860");
  }

  private static void setupBasic_ReadOnlyModelAccessor_12260625361731226062536173(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ReadOnlyModelAccessor_1226062536173");
  }

  private static void setupLabel_Constant_1197457264548_1197457264548(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_usedFeature_1197457270305(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1197644974883_1197644974883(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_usedFeature_1197644974894(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_paramObject_1197644974916(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_paramObject_1199715349117(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1199790457860_1199790457860(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ReadOnlyModelAccessor_1226062536173_1226062536173(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition7857_0(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "usedFeature", false) == null);
  }

  public static boolean renderingCondition7857_1(SNode node, EditorContext editorContext, IScope scope) {
    return !((SLinkOperations.getTarget(node, "usedFeature", false) == null)) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "usedFeature", false), "jetbrains.mps.ypath.structure.IParamFeature"));
  }

  public static boolean renderingCondition7857_2(SNode node, EditorContext editorContext, IScope scope) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "usedFeature", false), "jetbrains.mps.ypath.structure.IParamFeature");
  }

  public static boolean renderingCondition7857_3(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "usedFeature", false) == null) || !(SPropertyOperations.getBoolean(SLinkOperations.getTarget(node, "usedFeature", false), "default"));
  }

  public static boolean renderingCondition7857_4(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "paramObject", true) != null);
  }

  public static class _Inline7857_0 extends AbstractCellProvider {

    public _Inline7857_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1197457272760(context, node);
    }

    public EditorCell createProperty1197457272760_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_name1197457272760(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_name_1197457272760((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1197457272760(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1197457272760_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_name1197457272760(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.EDITABLE, false);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_property_name_1197457272760(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class _Inline7857_1 extends AbstractCellProvider {

    public _Inline7857_1() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1197644974896(context, node);
    }

    public EditorCell createProperty1197644974896_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_name1197644974896(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_name_1197644974896((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1197644974896(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1197644974896_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_name1197644974896(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
    }

    private static void setupLabel_property_name_1197644974896(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class IterateOperation_component_cellMenu0 implements SubstituteInfoPart {

    private menu_SubstituteFeatureAndParameter myComponent;

    public IterateOperation_component_cellMenu0() {
      this.myComponent = new menu_SubstituteFeatureAndParameter();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }

}
  public static class IterateOperation_component_cellMenu1 implements SubstituteInfoPart {

    private menu_SubstituteFeatureAndParameter myComponent;

    public IterateOperation_component_cellMenu1() {
      this.myComponent = new menu_SubstituteFeatureAndParameter();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }

}
  public static class IterateOperation_component_cellMenu2 implements SubstituteInfoPart {

    private menu_SubstituteFeatureAndParameter myComponent;

    public IterateOperation_component_cellMenu2() {
      this.myComponent = new menu_SubstituteFeatureAndParameter();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }

}

}
