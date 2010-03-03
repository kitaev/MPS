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
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModel;

public class TreeNodeKindProperty_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_gl82dd_a(editorContext, node);
  }

  private EditorCell createAlternation_gl82dd_a0(EditorContext editorContext, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = TreeNodeKindProperty_Editor.renderingCondition_gl82dd_a0a(node, editorContext, editorContext.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createConstant_gl82dd_a0a(editorContext, node);
    } else {
      editorCell = this.createConstant_gl82dd_a0a_0(editorContext, node);
    }
    TreeNodeKindProperty_default_DELETE.setCellActions(editorCell, node, editorContext);
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new TreeNodeKindProperty_Editor.TreeNodeKindProperty_generic_cellMenu_a0a0()}));
    return editorCell;
  }

  private EditorCell createCollection_gl82dd_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_gl82dd_a");
    editorCell.addKeyMap(new keymap_TreeNodeKindProperty());
    editorCell.addEditorCell(this.createAlternation_gl82dd_a0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_gl82dd_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_gl82dd_c0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_gl82dd_d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_gl82dd_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "default");
    editorCell.setCellId("Constant_gl82dd_a0a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
      style.set(StyleAttributes.EDITABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_gl82dd_a0a_0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_gl82dd_a0a_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_gl82dd_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ":");
    editorCell.setCellId("Constant_gl82dd_c0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createProperty_gl82dd_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name");
    editorCell.addKeyMap(new keymap_TreeNodeKindProperty());
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createRefNode_gl82dd_d0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("getter");
    provider.setNoTargetText("<no getter>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private static boolean renderingCondition_gl82dd_a0a(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "default");
  }

  public static class TreeNodeKindProperty_generic_cellMenu_a0a0 extends AbstractCellMenuPart_Generic_Group {
    public TreeNodeKindProperty_generic_cellMenu_a0a0() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      return ListSequence.fromListAndArray(new ArrayList<Boolean>(), true, false);
    }

    public void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      this.handleAction_impl((Boolean) parameterObject, node, model, scope, operationContext);
    }

    public void handleAction_impl(Boolean parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SPropertyOperations.set(node, "default", "" + (parameterObject));
    }

    public boolean isReferentPresentation() {
      return false;
    }

    public String getMatchingText(Object parameterObject) {
      return this.getMatchingText_internal((Boolean) parameterObject);
    }

    public String getMatchingText_internal(Boolean parameterObject) {
      return (parameterObject ?
        "default" :
        "regular"
      );
    }

    public String getDescriptionText(Object parameterObject) {
      return this.getDescriptionText_internal((Boolean) parameterObject);
    }

    public String getDescriptionText_internal(Boolean parameterObject) {
      return (parameterObject ?
        "allows to omit the property when testing" :
        "property must be always specified"
      );
    }
  }
}
