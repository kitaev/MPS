package jetbrains.mps.ypath.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
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
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModel;

public class TreeNodeKindProperty_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1175161147613(context, node);
  }

  public EditorCell createAlternation1175877896714(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = TreeNodeKindProperty_Editor.renderingCondition4147_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createConstant1175877925790(context, node, "default");
    } else
    {
      editorCell = this.createConstant1175877967658(context, node, "");
    }
    setupBasic_Alternation_11758778967141175877896714(editorCell, node, context);
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new TreeNodeKindProperty_Editor.TreeNodeKindProperty_generic_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createCollection1175161147613(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11751611476131175161147613(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createAlternation1175877896714(context, node));
    editorCell.addEditorCell(this.createProperty1175161161310(context, node));
    editorCell.addEditorCell(this.createConstant1175161216688(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode1175161221950(context, node));
    return editorCell;
  }

  public EditorCell createConstant1175161216688(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11751612166881175161216688(editorCell, node, context);
    setupLabel_Constant_1175161216688_1175161216688(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1175877925790(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11758779257901175877925790(editorCell, node, context);
    setupLabel_Constant_1175877925790_1175877925790(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1175877967658(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11758779676581175877967658(editorCell, node, context);
    setupLabel_Constant_1175877967658_1175877967658(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty1175161161310_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1175161161310(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1175161161310((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1175161161310(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1175161161310_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1175161221950_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_getter1175161221950(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_getter_1175161221950((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1175161221950(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("getter");
    provider.setNoTargetText("<no getter>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1175161221950_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11751611476131175161147613(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1175161147613");
    editorCell.addKeyMap(new keymap_TreeNodeKindProperty());
  }

  private static void setupBasic_property_name1175161161310(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
    editorCell.addKeyMap(new keymap_TreeNodeKindProperty());
  }

  private static void setupBasic_Constant_11751612166881175161216688(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1175161216688");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_getter1175161221950(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Alternation_11758778967141175877896714(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Alternation_1175877896714");
    TreeNodeKindProperty_default_DELETE.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Constant_11758779257901175877925790(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1175877925790");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
          this.set(StyleAttributes.EDITABLE, false);
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11758779676581175877967658(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1175877967658");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.EDITABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_property_name_1175161161310(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1175161216688_1175161216688(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_getter_1175161221950(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1175877925790_1175877925790(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1175877967658_1175877967658(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition4147_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "default");
  }

  public static class TreeNodeKindProperty_generic_cellMenu0 extends AbstractCellMenuPart_Generic_Group {

    public TreeNodeKindProperty_generic_cellMenu0() {
    }

    public List createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      return ListSequence.<Boolean>fromArray(true, false);
    }

    public void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      this.handleAction_impl((Boolean)parameterObject, node, model, scope, operationContext);
    }

    public void handleAction_impl(Boolean parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SPropertyOperations.set(node, "default", "" + (parameterObject));
    }

    public boolean isReferentPresentation() {
      return false;
    }

    public String getMatchingText(Object parameterObject) {
      return this.getMatchingText_internal((Boolean)parameterObject);
    }

    public String getMatchingText_internal(Boolean parameterObject) {
      return (parameterObject ?
        "default" :
        "regular"
      );
    }

    public String getDescriptionText(Object parameterObject) {
      return this.getDescriptionText_internal((Boolean)parameterObject);
    }

    public String getDescriptionText_internal(Boolean parameterObject) {
      return (parameterObject ?
        "allows to omit the property when testing" :
        "property must be always specified"
      );
    }

}

}
