package jetbrains.mps.lang.smodel.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.baseLanguage.editor.IMethodCall_actualArguments;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;

public class Node_ConceptMethodCall_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myIMethodCall_actualArguments6574_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1179409334055(context, node);
  }

  public EditorCell createCollection1179409334055(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11794093340551179409334055(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRefCell1179409337167(context, node));
    editorCell.addEditorCell(this.createComponent1225529460832(context, node));
    return editorCell;
  }

  public EditorCell createComponent1225529460832(EditorContext context, SNode node) {
    if (this.myIMethodCall_actualArguments6574_0 == null) {
      this.myIMethodCall_actualArguments6574_0 = new IMethodCall_actualArguments(node);
    }
    EditorCell editorCell = this.myIMethodCall_actualArguments6574_0.createEditorCell(context);
    setupBasic_component_IMethodCall_actualArguments1225529460832(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createRefCell1179409337167_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new Node_ConceptMethodCall_Editor._Inline6574_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_conceptMethodDeclaration1179409337167(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_conceptMethodDeclaration_1179409337167((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1179409337167(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("conceptMethodDeclaration");
    provider.setNoTargetText("<no conceptMethodDeclaration>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1179409337167_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11794093340551179409334055(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1179409334055");
  }

  private static void setupBasic_refCell_conceptMethodDeclaration1179409337167(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_conceptMethodDeclaration");
  }

  private static void setupBasic_component_IMethodCall_actualArguments1225529460832(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_IMethodCall_actualArguments");
  }

  private static void setupLabel_refCell_conceptMethodDeclaration_1179409337167(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class _Inline6574_0 extends AbstractCellProvider {

    public _Inline6574_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1179409341654(context, node);
    }

    public EditorCell createProperty1179409341654_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_name1179409341654(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_name_1179409341654((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1179409341654(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1179409341654_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_name1179409341654(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.PADDING_RIGHT_WITH_MEASURE, new Padding(0.0, "spaces"));
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_property_name_1179409341654(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
