package jetbrains.mps.lang.editor.editor;

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
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IScope;
import org.apache.commons.lang.ObjectUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Item;

public class FontStyleStyleClassItem_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_0528_0(context, node);
  }

  public EditorCell createCollection_0528_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_0528_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_0528_0(context, node, "font-style"));
    editorCell.addEditorCell(this.createConstant_0528_1(context, node, ":"));
    if (renderingCondition0528_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createProperty_0528_1(context, node));
    }
    if (renderingCondition0528_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRefNode_0528_1(context, node));
    }
    return editorCell;
  }

  public EditorCell createConstant_0528_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0528_0(editorCell, node, context);
    setupLabel_Constant_0528_0(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new FontStyleStyleClassItem_Editor.FontStyleStyleClassItem_Editor_replaceWith_StyleClassItem_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createConstant_0528_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0528_1(editorCell, node, context);
    setupLabel_Constant_0528_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty_0528_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_0528_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_Property_0528_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_0528_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("style");
    provider.setNoTargetText("<no style>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty_0528_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_0528_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_0528_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefNode_0528_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new SubstituteInfoPart[]{new FontStyleStyleClassItem_Editor.FontStyleStyleClassItem_generic_cellMenu1(),new FontStyleStyleClassItem_Editor.FontStyleStyleClassItem_generic_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createRefNode_0528_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("query");
    provider.setNoTargetText("<no query>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode_0528_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_0528_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0528_0");
  }

  private static void setupBasic_Constant_0528_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0528_0");
    Styles_StyleSheet.getItem(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_0528_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0528_1");
  }

  private static void setupBasic_Property_0528_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_style");
  }

  private static void setupBasic_RefNode_0528_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_0528_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_0528_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Property_0528_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNode_0528_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition0528_0(SNode node, EditorContext editorContext, IScope scope) {
    return !(ObjectUtils.equals(SPropertyOperations.getString_def(node, "style", null), SEnumOperations.getEnumMemberValue(SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.lang.editor.structure)", "_FontStyle_Enum"), "query"))));
  }

  public static boolean renderingCondition0528_1(SNode node, EditorContext editorContext, IScope scope) {
    return ObjectUtils.equals(SPropertyOperations.getString_def(node, "style", null), SEnumOperations.getEnumMemberValue(SEnumOperations.getEnumMember(SEnumOperations.getEnum("r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.lang.editor.structure)", "_FontStyle_Enum"), "query")));
  }

  public static class FontStyleStyleClassItem_Editor_replaceWith_StyleClassItem_cellMenu0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public FontStyleStyleClassItem_Editor_replaceWith_StyleClassItem_cellMenu0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.lang.editor.structure.StyleClassItem";
    }

}
  public static class FontStyleStyleClassItem_generic_cellMenu0 extends AbstractCellMenuPart_Generic_Group {

    public FontStyleStyleClassItem_generic_cellMenu0() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      return SEnumOperations.getEnumMembers(SEnumOperations.getEnum("r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.lang.editor.structure)", "_FontStyle_Enum"));
    }

    public void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      this.handleAction_impl((SNode)parameterObject, node, model, scope, operationContext);
    }

    public void handleAction_impl(SNode parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SNodeOperations.detachNode(SLinkOperations.getTarget(node, "query", true));
      SPropertyOperations.set(node, "style", SEnumOperations.getEnumMemberValue(parameterObject));
    }

    public boolean isReferentPresentation() {
      return false;
    }

}
  public static class FontStyleStyleClassItem_generic_cellMenu1 extends AbstractCellMenuPart_Generic_Item {

    public FontStyleStyleClassItem_generic_cellMenu1() {
    }

    public void handleAction(SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SLinkOperations.setNewChild(node, "query", "jetbrains.mps.lang.editor.structure.QueryFunction_FontStyle");
    }

    public String getMatchingText() {
      return "query body";
    }

}

}
