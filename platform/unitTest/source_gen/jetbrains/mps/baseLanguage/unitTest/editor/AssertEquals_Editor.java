package jetbrains.mps.baseLanguage.unitTest.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class AssertEquals_Editor extends DefaultNodeEditor {

  private static void setupBasic_CollectionCell11435_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell11435_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell11435_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell11435_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell11435_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell11435_01");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell11435_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell11435_02");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_expectedRefNodeCell11435_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_actualRefNodeCell11435_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setDrawBorder(false);
  }

  private static void setupLabel_ConstantCell11435_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setTextColor(Color.blue);
  }

  private static void setupLabel_ConstantCell11435_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell11435_02(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setTextColor(Color.blue);
  }

  private static void setupLabel_expectedRefNodeCell11435_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_actualRefNodeCell11435_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell11435_0(context, node);
  }

  public EditorCell create_CollectionCell11435_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell11435_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell11435_0(context, node, "assert"));
    editorCell.addEditorCell(this.create_expectedRefNodeCell11435_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell11435_02(context, node, "equals"));
    editorCell.addEditorCell(this.create_actualRefNodeCell11435_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell11435_01(context, node, ";"));
    return editorCell;
  }

  public EditorCell create_ConstantCell11435_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell11435_0(editorCell, node, context);
    setupLabel_ConstantCell11435_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell11435_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell11435_01(editorCell, node, context);
    setupLabel_ConstantCell11435_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell11435_02(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell11435_02(editorCell, node, context);
    setupLabel_ConstantCell11435_02(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_expectedRefNodeCell11435_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_expectedRefNodeCell11435_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_expectedRefNodeCell11435_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_expectedRefNodeCell11435_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("expected");
    provider.setNoTargetText("expected");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_expectedRefNodeCell11435_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_actualRefNodeCell11435_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_actualRefNodeCell11435_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_actualRefNodeCell11435_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_actualRefNodeCell11435_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("actual");
    provider.setNoTargetText("actual");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_actualRefNodeCell11435_0_internal(context, node, provider);
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
