package jetbrains.mps.ypath.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.*;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.ISubstituteInfoPart;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.ypath.behavior.IterateOperation_Behavior;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.nodeEditor.cellMenu.ICellContext;

public class IterateOperation_Editor extends DefaultNodeEditor {

  private static void setupBasic_CollectionCell3680_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell3680_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ModelAccessCell3680_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ModelAccessCell3680_0");
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

  private static void setupBasic_CollectionCell3680_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell3680_01");
  }

  private static void setupBasic_CollectionCell3680_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell3680_02");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ConstantCell3680_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell3680_0");
  }

  private static void setupBasic_usedFeatureRefCell3680_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_usedFeatureRefCell3680_0");
  }

  private static void setupBasic_CollectionCell3680_03(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell3680_03");
  }

  private static void setupBasic_ConstantCell3680_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell3680_01");
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

  private static void setupBasic_usedFeatureRefCell3680_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_usedFeatureRefCell3680_01");
    IterateOperation_DELETE.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_paramObjectRefNodeCell3680_0(EditorCell editorCell, SNode node, EditorContext context) {
    IterateOperation_DELETE.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_CollectionCell3680_04(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell3680_04");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_paramObjectRefNodeCell3680_01(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_ConstantCell3680_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell3680_02");
  }

  private static void setupLabel_ModelAccessCell3680_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell3680_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_usedFeatureRefCell3680_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell3680_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_usedFeatureRefCell3680_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_paramObjectRefNodeCell3680_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_paramObjectRefNodeCell3680_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell3680_02(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition3680_0(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "usedFeature", false) == null);
  }

  public static boolean renderingCondition3680_01(SNode node, EditorContext editorContext, IScope scope) {
    return !((SLinkOperations.getTarget(node, "usedFeature", false) == null)) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "usedFeature", false), "jetbrains.mps.ypath.structure.IParamFeature"));
  }

  public static boolean renderingCondition3680_02(SNode node, EditorContext editorContext, IScope scope) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "usedFeature", false), "jetbrains.mps.ypath.structure.IParamFeature");
  }

  public static boolean renderingCondition3680_03(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "usedFeature", false) == null) || !(SPropertyOperations.getBoolean(SLinkOperations.getTarget(node, "usedFeature", false), "default"));
  }

  public static boolean renderingCondition3680_04(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "paramObject", true) != null);
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell3680_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.create_CollectionCell3680_01(context, node);
  }

  public EditorCell create_CollectionCell3680_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell3680_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ModelAccessCell3680_0(context, node));
    if (renderingCondition3680_03(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.create_CollectionCell3680_03(context, node));
    }
    return editorCell;
  }

  public EditorCell create_CollectionCell3680_01(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_CollectionCell3680_01(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_CollectionCell3680_02(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell3680_02(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell3680_02(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell3680_0(context, node, "used feature:"));
    editorCell.addEditorCell(this.create_usedFeatureRefCell3680_0(context, node));
    if (renderingCondition3680_04(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.create_CollectionCell3680_04(context, node));
    }
    return editorCell;
  }

  public EditorCell create_CollectionCell3680_03(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell3680_03(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition3680_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.create_ConstantCell3680_01(context, node, "*"));
    }
    if (renderingCondition3680_01(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.create_usedFeatureRefCell3680_01(context, node));
    }
    if (renderingCondition3680_02(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.create_paramObjectRefNodeCell3680_0(context, node));
    }
    return editorCell;
  }

  public EditorCell create_CollectionCell3680_04(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell3680_04(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell3680_02(context, node, "/"));
    editorCell.addEditorCell(this.create_paramObjectRefNodeCell3680_01(context, node));
    return editorCell;
  }

  public EditorCell create_ConstantCell3680_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell3680_0(editorCell, node, context);
    setupLabel_ConstantCell3680_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell3680_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell3680_01(editorCell, node, context);
    setupLabel_ConstantCell3680_01(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new ISubstituteInfoPart[]{new IterateOperation_Editor.IterateOperation_component_cellMenu()}));
    return editorCell;
  }

  public EditorCell create_ConstantCell3680_02(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell3680_02(editorCell, node, context);
    setupLabel_ConstantCell3680_02(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ModelAccessCell3680_0(EditorContext context, SNode node) {
    ModelAccessor modelAccessor = this._modelAcessorFactory_1178981885129(context, node);
    EditorCell_Property editorCell = EditorCell_Property.create(context, modelAccessor, node);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    setupBasic_ModelAccessCell3680_0(editorCell, node, context);
    setupLabel_ModelAccessCell3680_0(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new ISubstituteInfoPart[]{new IterateOperation_Editor.IterateOperation_component_cellMenu3()}));
    return editorCell;
  }

  public ModelAccessor _modelAcessorFactory_1178981885129(final EditorContext editorContext, final SNode node) {
    return new ModelAccessor() {

      public String getText() {
        return IterateOperation_Behavior.call_getAxisInternalValue_1213877293456(node);
      }

      public void setText(String text) {
      }

      public boolean isValidText(String text) {
        return IterateOperation_Behavior.call_getAxisInternalValue_1213877293456(node).equals(text);
      }

    };
  }

  public EditorCell create_usedFeatureRefCell3680_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new IterateOperation_Editor._Inline8());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_usedFeatureRefCell3680_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_usedFeatureRefCell3680_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_usedFeatureRefCell3680_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("usedFeature");
    provider.setNoTargetText("<no usedFeature>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_usedFeatureRefCell3680_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_usedFeatureRefCell3680_01_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new IterateOperation_Editor._Inline9());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_usedFeatureRefCell3680_01(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_usedFeatureRefCell3680_01((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new ISubstituteInfoPart[]{new IterateOperation_Editor.IterateOperation_component_cellMenu1()}));
    return editorCell;
  }

  public EditorCell create_usedFeatureRefCell3680_01(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("usedFeature");
    provider.setNoTargetText("<no usedFeature>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_usedFeatureRefCell3680_01_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_paramObjectRefNodeCell3680_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_paramObjectRefNodeCell3680_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_paramObjectRefNodeCell3680_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new ISubstituteInfoPart[]{new IterateOperation_Editor.IterateOperation_component_cellMenu2()}));
    return editorCell;
  }

  public EditorCell create_paramObjectRefNodeCell3680_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("paramObject");
    provider.setNoTargetText("<no paramObject>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_paramObjectRefNodeCell3680_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_paramObjectRefNodeCell3680_01_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_paramObjectRefNodeCell3680_01(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_paramObjectRefNodeCell3680_01((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_paramObjectRefNodeCell3680_01(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("paramObject");
    provider.setNoTargetText("<no paramObject>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_paramObjectRefNodeCell3680_01_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class _Inline8 extends AbstractCellProvider {

    public _Inline8() {
      super();
    }

    private static void setupBasic_namePropertyCell3680_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_namePropertyCell3680_0");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.EDITABLE, false);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_namePropertyCell3680_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }


    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.create_namePropertyCell3680_0(context, node);
    }

    public EditorCell create_namePropertyCell3680_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_namePropertyCell3680_0(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_namePropertyCell3680_0((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell create_namePropertyCell3680_0(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.create_namePropertyCell3680_0_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }

}
  public static class _Inline9 extends AbstractCellProvider {

    public _Inline9() {
      super();
    }

    private static void setupBasic_namePropertyCell3680_01(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_namePropertyCell3680_01");
    }

    private static void setupLabel_namePropertyCell3680_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }


    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.create_namePropertyCell3680_01(context, node);
    }

    public EditorCell create_namePropertyCell3680_01_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_namePropertyCell3680_01(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_namePropertyCell3680_01((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell create_namePropertyCell3680_01(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.create_namePropertyCell3680_01_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }

}
  public static class IterateOperation_component_cellMenu implements ISubstituteInfoPart {

    private menu_SubstituteFeatureAndParameter myComponent;

    public IterateOperation_component_cellMenu() {
      this.myComponent = new menu_SubstituteFeatureAndParameter();
    }

    public List<INodeSubstituteAction> createActions(ICellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }

}
  public static class IterateOperation_component_cellMenu1 implements ISubstituteInfoPart {

    private menu_SubstituteFeatureAndParameter myComponent;

    public IterateOperation_component_cellMenu1() {
      this.myComponent = new menu_SubstituteFeatureAndParameter();
    }

    public List<INodeSubstituteAction> createActions(ICellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }

}
  public static class IterateOperation_component_cellMenu2 implements ISubstituteInfoPart {

    private menu_SubstituteFeatureAndParameter myComponent;

    public IterateOperation_component_cellMenu2() {
      this.myComponent = new menu_SubstituteFeatureAndParameter();
    }

    public List<INodeSubstituteAction> createActions(ICellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }

}
  public static class IterateOperation_component_cellMenu3 implements ISubstituteInfoPart {

    private menu_SubstituteIterateOperationAxis myComponent;

    public IterateOperation_component_cellMenu3() {
      this.myComponent = new menu_SubstituteIterateOperationAxis();
    }

    public List<INodeSubstituteAction> createActions(ICellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }

}

}
