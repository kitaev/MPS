package jetbrains.mps.lang.typesystem.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
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
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class CreateEquationStatement_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myAbstractEquationInspector6235_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1193663097813(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1193663110445(context, node);
  }

  public EditorCell createCollection1193663097813(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11936630978131193663097813(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRefNode1193663097814(context, node));
    editorCell.addEditorCell(this.createConceptProperty1193663097815(context, node));
    editorCell.addEditorCell(this.createRefNode1193663097818(context, node));
    editorCell.addEditorCell(this.createConstant1193663097819(context, node, ";"));
    return editorCell;
  }

  public EditorCell createCollection1193663110445(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11936631104451193663110445(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent1216204717828(context, node));
    editorCell.addEditorCell(this.createConstant1193663139848(context, node, ""));
    editorCell.addEditorCell(this.createConstant1193663144396(context, node, "advanced:"));
    editorCell.addEditorCell(this.createCollection1193663118797(context, node));
    return editorCell;
  }

  public EditorCell createCollection1193663118797(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11936631187971193663118797(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1193663123158(context, node, "direction ="));
    editorCell.addEditorCell(this.createProperty1193663158383(context, node));
    return editorCell;
  }

  public EditorCell createComponent1216204717828(EditorContext context, SNode node) {
    if (this.myAbstractEquationInspector6235_0 == null) {
      this.myAbstractEquationInspector6235_0 = new AbstractEquationInspector(node);
    }
    EditorCell editorCell = this.myAbstractEquationInspector6235_0.createEditorCell(context);
    setupBasic_component_AbstractEquationInspector1216204717828(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant1193663097819(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11936630978191193663097819(editorCell, node, context);
    setupLabel_Constant_1193663097819_1193663097819(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1193663123158(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11936631231581193663123158(editorCell, node, context);
    setupLabel_Constant_1193663123158_1193663123158(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1193663139848(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11936631398481193663139848(editorCell, node, context);
    setupLabel_Constant_1193663139848_1193663139848(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1193663144396(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11936631443961193663144396(editorCell, node, context);
    setupLabel_Constant_1193663144396_1193663144396(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1193663097814_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_leftExpression1193663097814(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_leftExpression_1193663097814((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1193663097814(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("leftExpression");
    provider.setNoTargetText("<no leftExpression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1193663097814_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createConceptProperty1193663097815_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_conceptProperty_alias1193663097815(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_conceptProperty_alias_1193663097815((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new SubstituteInfoPart[]{new CreateEquationStatement_Editor.CreateEquationStatement_Editor_replaceWith_AbstractEquationStatement_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createConceptProperty1193663097815(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptProperty1193663097815_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1193663097818_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_rightExpression1193663097818(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_rightExpression_1193663097818((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1193663097818(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("rightExpression");
    provider.setNoTargetText("<no rightExpression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1193663097818_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1193663158383_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_direction1193663158383(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_direction_1193663158383((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1193663158383(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("direction");
    provider.setNoTargetText("<no direction>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1193663158383_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11936630978131193663097813(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1193663097813");
  }

  private static void setupBasic_refNode_leftExpression1193663097814(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_conceptProperty_alias1193663097815(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("conceptProperty_alias");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_LEFT, 1.0);
          this.set(StyleAttributes.PADDING_RIGHT, 1.0);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_rightExpression1193663097818(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11936630978191193663097819(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1193663097819");
  }

  private static void setupBasic_Collection_11936631104451193663110445(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1193663110445");
  }

  private static void setupBasic_Collection_11936631187971193663118797(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1193663118797");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11936631231581193663123158(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1193663123158");
  }

  private static void setupBasic_Constant_11936631398481193663139848(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1193663139848");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11936631443961193663144396(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1193663144396");
  }

  private static void setupBasic_property_direction1193663158383(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_direction");
  }

  private static void setupBasic_component_AbstractEquationInspector1216204717828(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_AbstractEquationInspector");
  }

  private static void setupLabel_refNode_leftExpression_1193663097814(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_conceptProperty_alias_1193663097815(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_rightExpression_1193663097818(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1193663097819_1193663097819(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1193663123158_1193663123158(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1193663139848_1193663139848(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1193663144396_1193663144396(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_direction_1193663158383(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class CreateEquationStatement_Editor_replaceWith_AbstractEquationStatement_cellMenu0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public CreateEquationStatement_Editor_replaceWith_AbstractEquationStatement_cellMenu0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.lang.typesystem.structure.AbstractEquationStatement";
    }

}

}
