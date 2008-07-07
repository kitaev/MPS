package jetbrains.mps.bootstrap.helgins.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.ISubstituteInfoPart;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.NonEmptyPropertyCellProvider;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class AbstractInequationStatement_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myAbstractEquationInspector1;

  private static void setupBasic_CollectionCell18424_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell18424_0");
  }

  private static void setupBasic_leftExpressionRefNodeCell18424_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_ConceptPropertyCell18424_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConceptPropertyCell18424_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return AbstractInequationStatement_Editor.calculateColor11(cell);
            }

          });
          this.set(StyleAttributes.PADDING_LEFT, 1.0);
          this.set(StyleAttributes.PADDING_RIGHT, 1.0);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_rightExpressionRefNodeCell18424_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_ConstantCell18424_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell18424_0");
  }

  private static void setupBasic_inequationPriorityNonEmptyPropertyCell18424_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_inequationPriorityNonEmptyPropertyCell18424_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_SIZE, 8);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_CollectionCell18424_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell18424_01");
  }

  private static void setupBasic_AbstractEquationInspectorComponentCell18424_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_AbstractEquationInspectorComponentCell18424_0");
  }

  private static void setupBasic_CollectionCell18424_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell18424_02");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_inequationPriorityPropertyCell18424_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_inequationPriorityPropertyCell18424_0");
  }

  private static void setupBasic_ConstantCell18424_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell18424_01");
  }

  private static void setupLabel_leftExpressionRefNodeCell18424_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConceptPropertyCell18424_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_rightExpressionRefNodeCell18424_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell18424_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_inequationPriorityNonEmptyPropertyCell18424_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_inequationPriorityPropertyCell18424_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell18424_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static Color _QueryFunction_Color_1214399678682(SNode node, EditorContext editorContext) {
    if (SPropertyOperations.getBoolean(node, "checkOnly")) {
      return Color.GRAY;
    } else
    {
      return Color.BLACK;
    }
  }

  private static Color calculateColor11(EditorCell cell) {
    Color result;
    result = AbstractInequationStatement_Editor._QueryFunction_Color_1214399678682((cell == null ?
      null :
      cell.getSNode()
    ), (cell == null ?
      null :
      cell.getEditorContext()
    ));
    return result;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell18424_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.create_CollectionCell18424_01(context, node);
  }

  public EditorCell create_CollectionCell18424_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell18424_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_leftExpressionRefNodeCell18424_0(context, node));
    editorCell.addEditorCell(this.create_ConceptPropertyCell18424_0(context, node));
    if (node.hasProperty("inequationPriority")) {
      editorCell.addEditorCell(this.create_inequationPriorityNonEmptyPropertyCell18424_0(context, node));
    }
    editorCell.addEditorCell(this.create_rightExpressionRefNodeCell18424_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell18424_0(context, node, ";"));
    return editorCell;
  }

  public EditorCell create_CollectionCell18424_01(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_CollectionCell18424_01(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_AbstractEquationInspectorComponentCell18424_0(context, node));
    editorCell.addEditorCell(this.create_CollectionCell18424_02(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell18424_02(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell18424_02(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell18424_01(context, node, "priority:"));
    editorCell.addEditorCell(this.create_inequationPriorityPropertyCell18424_0(context, node));
    return editorCell;
  }

  public EditorCell create_AbstractEquationInspectorComponentCell18424_0(EditorContext context, SNode node) {
    if (this.myAbstractEquationInspector1 == null) {
      this.myAbstractEquationInspector1 = new AbstractEquationInspector(node);
    }
    EditorCell editorCell = this.myAbstractEquationInspector1.createEditorCell(context);
    setupBasic_AbstractEquationInspectorComponentCell18424_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell create_ConstantCell18424_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell18424_0(editorCell, node, context);
    setupLabel_ConstantCell18424_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell18424_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell18424_01(editorCell, node, context);
    setupLabel_ConstantCell18424_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_leftExpressionRefNodeCell18424_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_leftExpressionRefNodeCell18424_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_leftExpressionRefNodeCell18424_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_leftExpressionRefNodeCell18424_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("leftExpression");
    provider.setNoTargetText("<no leftExpression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_leftExpressionRefNodeCell18424_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_ConceptPropertyCell18424_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_ConceptPropertyCell18424_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_ConceptPropertyCell18424_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new ISubstituteInfoPart[]{new AbstractInequationStatement_Editor.AbstractInequationStatement_Editor_replaceWith_AbstractEquationStatement_cellMenu()}));
    return editorCell;
  }

  public EditorCell create_ConceptPropertyCell18424_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_ConceptPropertyCell18424_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_rightExpressionRefNodeCell18424_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_rightExpressionRefNodeCell18424_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_rightExpressionRefNodeCell18424_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_rightExpressionRefNodeCell18424_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("rightExpression");
    provider.setNoTargetText("<no rightExpression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_rightExpressionRefNodeCell18424_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_inequationPriorityNonEmptyPropertyCell18424_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_inequationPriorityNonEmptyPropertyCell18424_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_inequationPriorityNonEmptyPropertyCell18424_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_inequationPriorityNonEmptyPropertyCell18424_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new NonEmptyPropertyCellProvider(node, context);
    provider.setRole("inequationPriority");
    provider.setNoTargetText("<no inequationPriority>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_inequationPriorityNonEmptyPropertyCell18424_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_inequationPriorityPropertyCell18424_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_inequationPriorityPropertyCell18424_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_inequationPriorityPropertyCell18424_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_inequationPriorityPropertyCell18424_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("inequationPriority");
    provider.setNoTargetText("<no inequationPriority>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_inequationPriorityPropertyCell18424_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class AbstractInequationStatement_Editor_replaceWith_AbstractEquationStatement_cellMenu extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public AbstractInequationStatement_Editor_replaceWith_AbstractEquationStatement_cellMenu() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.bootstrap.helgins.structure.AbstractEquationStatement";
    }

}

}
