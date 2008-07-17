package jetbrains.mps.regexp.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;

import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;

public class NTimesRegexp_Editor extends DefaultNodeEditor {

  private static void setupBasic_CollectionCell624_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell624_0");
  }

  private static void setupBasic_regexpRefNodeCell624_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_ConstantCell624_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell624_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return NTimesRegexp_Editor.calculateColor18(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
    UnaryRegexp_Regexp_actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_nPropertyCell624_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_nPropertyCell624_0");
  }

  private static void setupBasic_ConstantCell624_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell624_01");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return NTimesRegexp_Editor.calculateColor11(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
    UnaryRegexp_Regexp_actions.setCellActions(editorCell, node, context);
  }

  private static void setupLabel_regexpRefNodeCell624_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell624_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_nPropertyCell624_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell624_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static Color calculateColor11(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_MAGENTA;
    return result;
  }

  private static Color calculateColor18(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_MAGENTA;
    return result;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell624_0(context, node);
  }

  public EditorCell create_CollectionCell624_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell624_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_regexpRefNodeCell624_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell624_0(context, node, "{"));
    editorCell.addEditorCell(this.create_nPropertyCell624_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell624_01(context, node, "}"));
    return editorCell;
  }

  public EditorCell create_ConstantCell624_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell624_0(editorCell, node, context);
    setupLabel_ConstantCell624_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell624_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell624_01(editorCell, node, context);
    setupLabel_ConstantCell624_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_regexpRefNodeCell624_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_regexpRefNodeCell624_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_regexpRefNodeCell624_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_regexpRefNodeCell624_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("regexp");
    provider.setNoTargetText("<no regexp>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_regexpRefNodeCell624_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_nPropertyCell624_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_nPropertyCell624_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_nPropertyCell624_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_nPropertyCell624_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("n");
    provider.setNoTargetText("<no n>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_nPropertyCell624_0_internal(context, node, provider);
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
