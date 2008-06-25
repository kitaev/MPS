package jetbrains.mps.baseLanguageInternal.editor;

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
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.baseLanguage.editor.IMethodCall_actualArguments;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;

public class InternalNewExpression_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myIMethodCall_actualArguments1;

  private static void setupBasic_CollectionCell8036_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell8036_0");
  }

  private static void setupBasic_ConstantCell8036_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_0");
  }

  private static void setupBasic_fqClassNamePropertyCell8036_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_fqClassNamePropertyCell8036_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return InternalNewExpression_Editor.calculateColor2(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_IMethodCall_actualArgumentsComponentCell8036_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_IMethodCall_actualArgumentsComponentCell8036_0");
  }

  private static void setupBasic_ConstantCell8036_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_01");
  }

  private static void setupBasic_typeRefNodeCell8036_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_ConstantCell8036_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_02");
  }

  private static void setupBasic_CollectionCell8036_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell8036_01");
  }

  private static void setupBasic_ConstantCell8036_03(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_03");
  }

  private static void setupBasic_ConstantCell8036_04(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_04");
  }

  private static void setupBasic_ConstantCell8036_05(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_05");
  }

  private static void setupBasic_ConstantCell8036_06(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_06");
  }

  private static void setupBasic_ConstantCell8036_07(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_07");
  }

  private static void setupBasic_ConstantCell8036_08(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_08");
  }

  private static void setupBasic_ConstantCell8036_09(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_09");
  }

  private static void setupBasic_ConstantCell8036_010(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_010");
  }

  private static void setupBasic_ConstantCell8036_011(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_011");
  }

  private static void setupBasic_ConstantCell8036_012(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_012");
  }

  private static void setupBasic_ConstantCell8036_013(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_013");
  }

  private static void setupBasic_ConstantCell8036_014(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_014");
  }

  private static void setupBasic_ConstantCell8036_015(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_015");
  }

  private static void setupBasic_ConstantCell8036_016(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell8036_016");
  }

  private static void setupLabel_ConstantCell8036_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_fqClassNamePropertyCell8036_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell8036_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_typeRefNodeCell8036_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell8036_02(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell8036_03(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell8036_04(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell8036_05(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell8036_06(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell8036_07(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell8036_08(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell8036_09(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell8036_010(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell8036_011(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell8036_012(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell8036_013(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell8036_014(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell8036_015(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell8036_016(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static Color calculateColor2(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_GREEN;
    return result;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell8036_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.create_CollectionCell8036_01(context, node);
  }

  public EditorCell create_CollectionCell8036_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell8036_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell8036_01(context, node, "["));
    editorCell.addEditorCell(this.create_typeRefNodeCell8036_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell8036_02(context, node, "]"));
    editorCell.addEditorCell(this.create_ConstantCell8036_0(context, node, "new"));
    editorCell.addEditorCell(this.create_fqClassNamePropertyCell8036_0(context, node));
    editorCell.addEditorCell(this.create_IMethodCall_actualArgumentsComponentCell8036_0(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell8036_01(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createFlow(context, node);
    setupBasic_CollectionCell8036_01(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell8036_03(context, node, "Package"));
    editorCell.addEditorCell(this.create_ConstantCell8036_04(context, node, "name"));
    editorCell.addEditorCell(this.create_ConstantCell8036_05(context, node, "may"));
    editorCell.addEditorCell(this.create_ConstantCell8036_06(context, node, "be"));
    editorCell.addEditorCell(this.create_ConstantCell8036_07(context, node, "splitted"));
    editorCell.addEditorCell(this.create_ConstantCell8036_08(context, node, "from"));
    editorCell.addEditorCell(this.create_ConstantCell8036_09(context, node, "short"));
    editorCell.addEditorCell(this.create_ConstantCell8036_010(context, node, "class"));
    editorCell.addEditorCell(this.create_ConstantCell8036_011(context, node, "name"));
    editorCell.addEditorCell(this.create_ConstantCell8036_012(context, node, "with"));
    editorCell.addEditorCell(this.create_ConstantCell8036_013(context, node, "either"));
    editorCell.addEditorCell(this.create_ConstantCell8036_014(context, node, "'.'"));
    editorCell.addEditorCell(this.create_ConstantCell8036_015(context, node, "or"));
    editorCell.addEditorCell(this.create_ConstantCell8036_016(context, node, "'!'"));
    return editorCell;
  }

  public EditorCell create_IMethodCall_actualArgumentsComponentCell8036_0(EditorContext context, SNode node) {
    if (this.myIMethodCall_actualArguments1 == null) {
      this.myIMethodCall_actualArguments1 = new IMethodCall_actualArguments(node);
    }
    EditorCell editorCell = this.myIMethodCall_actualArguments1.createEditorCell(context);
    setupBasic_IMethodCall_actualArgumentsComponentCell8036_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_0(editorCell, node, context);
    setupLabel_ConstantCell8036_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_01(editorCell, node, context);
    setupLabel_ConstantCell8036_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_02(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_02(editorCell, node, context);
    setupLabel_ConstantCell8036_02(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_03(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_03(editorCell, node, context);
    setupLabel_ConstantCell8036_03(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_04(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_04(editorCell, node, context);
    setupLabel_ConstantCell8036_04(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_05(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_05(editorCell, node, context);
    setupLabel_ConstantCell8036_05(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_06(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_06(editorCell, node, context);
    setupLabel_ConstantCell8036_06(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_07(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_07(editorCell, node, context);
    setupLabel_ConstantCell8036_07(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_08(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_08(editorCell, node, context);
    setupLabel_ConstantCell8036_08(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_09(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_09(editorCell, node, context);
    setupLabel_ConstantCell8036_09(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_010(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_010(editorCell, node, context);
    setupLabel_ConstantCell8036_010(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_011(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_011(editorCell, node, context);
    setupLabel_ConstantCell8036_011(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_012(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_012(editorCell, node, context);
    setupLabel_ConstantCell8036_012(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_013(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_013(editorCell, node, context);
    setupLabel_ConstantCell8036_013(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_014(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_014(editorCell, node, context);
    setupLabel_ConstantCell8036_014(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_015(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_015(editorCell, node, context);
    setupLabel_ConstantCell8036_015(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell8036_016(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell8036_016(editorCell, node, context);
    setupLabel_ConstantCell8036_016(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_fqClassNamePropertyCell8036_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_fqClassNamePropertyCell8036_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_fqClassNamePropertyCell8036_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_fqClassNamePropertyCell8036_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("fqClassName");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_fqClassNamePropertyCell8036_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_typeRefNodeCell8036_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_typeRefNodeCell8036_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_typeRefNodeCell8036_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_typeRefNodeCell8036_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("type");
    provider.setNoTargetText("no type");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_typeRefNodeCell8036_0_internal(context, node, provider);
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
