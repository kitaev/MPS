package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
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
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class ToolType_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1208529555368(context, node);
  }

  public EditorCell createCollection1208529555368(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12085295553681208529555368(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1208529560572(context, node, "tool"));
    editorCell.addEditorCell(this.createConstant1208529565963(context, node, "<"));
    editorCell.addEditorCell(this.createRefCell1208529573029(context, node));
    editorCell.addEditorCell(this.createConstant1208529568496(context, node, ">"));
    return editorCell;
  }

  public EditorCell createConstant1208529560572(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12085295605721208529560572(editorCell, node, context);
    setupLabel_Constant_1208529560572_1208529560572(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1208529565963(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12085295659631208529565963(editorCell, node, context);
    setupLabel_Constant_1208529565963_1208529565963(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1208529568496(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12085295684961208529568496(editorCell, node, context);
    setupLabel_Constant_1208529568496_1208529568496(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefCell1208529573029_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new ToolType_Editor._Inline5914_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_tool1208529573029(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_tool_1208529573029((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1208529573029(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("tool");
    provider.setNoTargetText("<no tool>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1208529573029_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12085295553681208529555368(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1208529555368");
  }

  private static void setupBasic_Constant_12085295605721208529560572(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1208529560572");
  }

  private static void setupBasic_Constant_12085295659631208529565963(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1208529565963");
  }

  private static void setupBasic_Constant_12085295684961208529568496(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1208529568496");
  }

  private static void setupBasic_refCell_tool1208529573029(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_tool");
  }

  private static void setupLabel_Constant_1208529560572_1208529560572(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1208529565963_1208529565963(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1208529568496_1208529568496(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_tool_1208529573029(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class _Inline5914_0 extends AbstractCellProvider {

    public _Inline5914_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1208529574547(context, node);
    }

    public EditorCell createProperty1208529574547_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_name1208529574547(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_name_1208529574547((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1208529574547(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1208529574547_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_name1208529574547(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
    }

    private static void setupLabel_property_name_1208529574547(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
