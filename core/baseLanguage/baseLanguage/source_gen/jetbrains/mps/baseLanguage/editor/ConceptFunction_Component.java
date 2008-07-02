package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.ModelAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptPropertyOperations;
import java.util.List;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction_Behavior;
import jetbrains.mps.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.nodeEditor.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class ConceptFunction_Component extends AbstractCellProvider {

  public ConceptFunction_Component(SNode node) {
    super(node);
  }

  private static void setupBasic_CollectionCell6954_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell6954_0");
  }

  private static void setupBasic_CollectionCell6954_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell6954_01");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_CollectionCell6954_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell6954_02");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ModelAccessCell6954_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ModelAccessCell6954_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
          this.set(StyleAttributes.EDITABLE, false);
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return ConceptFunction_Component.calculateColor75(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ConstantCell6954_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell6954_0");
  }

  private static void setupBasic_CollectionCell6954_03(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell6954_03");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_bodyRefNodeCell6954_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_ConstantCell6954_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell6954_01");
  }

  private static void setupBasic_IndentCell6954_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_IndentCell6954_0");
  }

  private static void setupLabel_ModelAccessCell6954_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell6954_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_bodyRefNodeCell6954_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell6954_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static Color calculateColor75(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_BLUE;
    return result;
  }


  public EditorCell createEditorCell(EditorContext context) {
    return this.createEditorCell(context, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell6954_0(context, node);
  }

  public EditorCell create_CollectionCell6954_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell6954_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_CollectionCell6954_01(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell6954_01(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_CollectionCell6954_01(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_CollectionCell6954_02(context, node));
    editorCell.addEditorCell(this.create_CollectionCell6954_03(context, node));
    editorCell.addEditorCell(this.create_ConstantCell6954_01(context, node, "}"));
    return editorCell;
  }

  public EditorCell create_CollectionCell6954_02(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell6954_02(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ModelAccessCell6954_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell6954_0(context, node, "{"));
    return editorCell;
  }

  public EditorCell create_CollectionCell6954_03(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell6954_03(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell5(context, node));
    editorCell.addEditorCell(this.create_bodyRefNodeCell6954_0(context, node));
    return editorCell;
  }

  public EditorCell create_ConstantCell6954_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell6954_0(editorCell, node, context);
    setupLabel_ConstantCell6954_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell6954_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell6954_01(editorCell, node, context);
    setupLabel_ConstantCell6954_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ModelAccessCell6954_0(EditorContext context, SNode node) {
    ModelAccessor modelAccessor = this._modelAcessorFactory_1214568089972(context, node);
    EditorCell_Property editorCell = EditorCell_Property.create(context, modelAccessor, node);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    setupBasic_ModelAccessCell6954_0(editorCell, node, context);
    setupLabel_ModelAccessCell6954_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public ModelAccessor _modelAcessorFactory_1214568089972(final EditorContext editorContext, final SNode node) {
    return new ModelAccessor() {

      public String getText() {
        StringBuilder result = new StringBuilder();
        if (SConceptPropertyOperations.getString(node, "conceptFunctionName") != null) {
          result.append(SConceptPropertyOperations.getString(node, "conceptFunctionName"));
        }
        result.append("(");
        List<SNode> parameters = ConceptFunction_Behavior.call_getParameters_1213877374450(node);
        boolean isFirst = true;
        for(SNode cfp : parameters) {
          if (!(isFirst)) {
            result.append(", ");
          }
          isFirst = false;
          result.append(SConceptPropertyOperations.getString(cfp, "alias"));
        }
        result.append(")->");
        SNode expectedReturnType = (SNode)ConceptFunction_Behavior.call_getExpectedReturnType_1213877374441(node);
        if (expectedReturnType == null) {
          result.append("void");
        } else
        {
          result.append(BaseConcept_Behavior.call_getPresentation_1213877396640(expectedReturnType));
        }
        return result.toString();
      }

      public void setText(String text) {
      }

      public boolean isValidText(String text) {
        return this.getText().equals(text);
      }

    };
  }

  public EditorCell createIndentCell5(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell create_bodyRefNodeCell6954_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_bodyRefNodeCell6954_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_bodyRefNodeCell6954_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_bodyRefNodeCell6954_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("body");
    provider.setNoTargetText("<no body>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_bodyRefNodeCell6954_0_internal(context, node, provider);
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
