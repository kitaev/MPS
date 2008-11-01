package jetbrains.mps.ypath.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class TreePathAdapterExpression_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1168890312650(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1197449048612(context, node);
  }

  public EditorCell createCollection1168890312650(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11688903126501168890312650(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition8904_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1197451169341(context, node, "!"));
    }
    editorCell.addEditorCell(this.createRefNode1168890321048(context, node));
    return editorCell;
  }

  public EditorCell createCollection1197449048612(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11974490486121197449048612(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1197449053304(context, node));
    return editorCell;
  }

  public EditorCell createCollection1197449053304(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11974490533041197449053304(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1197449054282(context, node, "treepath aspect:"));
    editorCell.addEditorCell(this.createRefCell1197449068841(context, node));
    return editorCell;
  }

  public EditorCell createConstant1197449054282(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11974490542821197449054282(editorCell, node, context);
    setupLabel_Constant_1197449054282_1197449054282(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1197451169341(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11974511693411197451169341(editorCell, node, context);
    setupLabel_Constant_1197451169341_1197451169341(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1168890321048_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_expression1168890321048(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_expression_1168890321048((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1168890321048(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("expression");
    provider.setNoTargetText("<no expression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1168890321048_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell1197449068841_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new TreePathAdapterExpression_Editor._Inline8904_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_treepathAspect1197449068841(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_treepathAspect_1197449068841((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1197449068841(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("treepathAspect");
    provider.setNoTargetText("<no treepathAspect>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1197449068841_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11688903126501168890312650(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1168890312650");
  }

  private static void setupBasic_refNode_expression1168890321048(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_11974490486121197449048612(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1197449048612");
  }

  private static void setupBasic_Collection_11974490533041197449053304(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1197449053304");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11974490542821197449054282(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1197449054282");
  }

  private static void setupBasic_refCell_treepathAspect1197449068841(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_treepathAspect");
  }

  private static void setupBasic_Constant_11974511693411197451169341(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1197451169341");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.red);
        }

      };
      inlineStyle.apply(editorCell);
    }
    TreePathAdapterExpression_DELETE.setCellActions(editorCell, node, context);
  }

  private static void setupLabel_refNode_expression_1168890321048(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1197449054282_1197449054282(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_treepathAspect_1197449068841(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1197451169341_1197451169341(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition8904_0(SNode node, EditorContext editorContext, IScope scope) {
    return (SNodeOperations.getAncestor(node, "jetbrains.mps.ypath.structure.TreePathOperationExpression", false, false) == null);
  }

  public static class _Inline8904_0 extends AbstractCellProvider {

    public _Inline8904_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1197449072761(context, node);
    }

    public EditorCell createProperty1197449072761_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_name1197449072761(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_name_1197449072761((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1197449072761(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1197449072761_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_name1197449072761(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
    }

    private static void setupLabel_property_name_1197449072761(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
