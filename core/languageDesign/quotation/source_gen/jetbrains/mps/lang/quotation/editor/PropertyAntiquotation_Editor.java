package jetbrains.mps.lang.quotation.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;

public class PropertyAntiquotation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1196866674160(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1196866747055(context, node);
  }

  public EditorCell createCollection1196866674160(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11968666741601196866674160(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1196866674161(context, node, "$("));
    editorCell.addEditorCell(this.createRefNode1196866674166(context, node));
    editorCell.addEditorCell(this.createConstant1196866674167(context, node, ")$"));
    return editorCell;
  }

  public EditorCell createCollection1196866747055(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11968667470551196866747055(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1196866747056(context, node));
    editorCell.addEditorCell(this.createConstant1196866747058(context, node, ""));
    editorCell.addEditorCell(this.createCollection1196866747059(context, node));
    editorCell.addEditorCell(this.createCollection1196866747076(context, node));
    return editorCell;
  }

  public EditorCell createCollection1196866747056(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11968667470561196866747056(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1196866747057(context, node, "property antiquotation"));
    return editorCell;
  }

  public EditorCell createCollection1196866747059(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11968667470591196866747059(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1196866747060(context, node, "propety name:"));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor1226062530783(context, node));
    return editorCell;
  }

  public EditorCell createCollection1196866747076(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11968667470761196866747076(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1196866747077(context, node, "source concept:"));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor1226062528304(context, node));
    return editorCell;
  }

  public EditorCell createConstant1196866674161(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11968666741611196866674161(editorCell, node, context);
    setupLabel_Constant_1196866674161_1196866674161(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1196866674167(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11968666741671196866674167(editorCell, node, context);
    setupLabel_Constant_1196866674167_1196866674167(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1196866747057(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11968667470571196866747057(editorCell, node, context);
    setupLabel_Constant_1196866747057_1196866747057(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1196866747058(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11968667470581196866747058(editorCell, node, context);
    setupLabel_Constant_1196866747058_1196866747058(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1196866747060(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11968667470601196866747060(editorCell, node, context);
    setupLabel_Constant_1196866747060_1196866747060(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1196866747077(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11968667470771196866747077(editorCell, node, context);
    setupLabel_Constant_1196866747077_1196866747077(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor1226062528304(final EditorContext context, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(context, new ModelAccessor() {

      public String getText() {
        SNode parent = SNodeOperations.getParent(node);
        if ((parent != null)) {
          return SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(parent), "name");
        } else
        {
          return "";
        }
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }

    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ReadOnlyModelAccessor_12260625283041226062528304(editorCell, node, context);
    setupLabel_ReadOnlyModelAccessor_1226062528304_1226062528304(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor1226062530783(final EditorContext context, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(context, new ModelAccessor() {

      public String getText() {
        return AttributesRolesUtil.getPropertyNameFromPropertyAttributeRole(node.getRole_());
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }

    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ReadOnlyModelAccessor_12260625307831226062530783(editorCell, node, context);
    setupLabel_ReadOnlyModelAccessor_1226062530783_1226062530783(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createRefNode1196866674166_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_expression1196866674166(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_expression_1196866674166((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1196866674166(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("expression");
    provider.setNoTargetText("<expr>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1196866674166_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11968666741601196866674160(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1196866674160");
  }

  private static void setupBasic_Constant_11968666741611196866674161(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1196866674161");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return PropertyAntiquotation_Editor._StyleParameter_QueryFunction_1214399678827((cell == null ?
                null :
                cell.getSNode()
              ), (cell == null ?
                null :
                cell.getEditorContext()
              ));
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_expression1196866674166(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11968666741671196866674167(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1196866674167");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return PropertyAntiquotation_Editor._StyleParameter_QueryFunction_1214399678938((cell == null ?
                null :
                cell.getSNode()
              ), (cell == null ?
                null :
                cell.getEditorContext()
              ));
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11968667470551196866747055(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1196866747055");
  }

  private static void setupBasic_Collection_11968667470561196866747056(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1196866747056");
  }

  private static void setupBasic_Constant_11968667470571196866747057(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1196866747057");
  }

  private static void setupBasic_Constant_11968667470581196866747058(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1196866747058");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11968667470591196866747059(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1196866747059");
  }

  private static void setupBasic_Constant_11968667470601196866747060(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1196866747060");
  }

  private static void setupBasic_Collection_11968667470761196866747076(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1196866747076");
  }

  private static void setupBasic_Constant_11968667470771196866747077(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1196866747077");
  }

  private static void setupBasic_ReadOnlyModelAccessor_12260625283041226062528304(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ReadOnlyModelAccessor_1226062528304");
  }

  private static void setupBasic_ReadOnlyModelAccessor_12260625307831226062530783(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ReadOnlyModelAccessor_1226062530783");
  }

  private static void setupLabel_Constant_1196866674161_1196866674161(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_expression_1196866674166(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1196866674167_1196866674167(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1196866747057_1196866747057(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1196866747058_1196866747058(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1196866747060_1196866747060(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1196866747077_1196866747077(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ReadOnlyModelAccessor_1226062528304_1226062528304(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ReadOnlyModelAccessor_1226062530783_1226062530783(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static Color _StyleParameter_QueryFunction_1214399678827(SNode node, EditorContext editorContext) {
    return Colors.BROWN;
  }

  public static Color _StyleParameter_QueryFunction_1214399678938(SNode node, EditorContext editorContext) {
    return Colors.BROWN;
  }

}
