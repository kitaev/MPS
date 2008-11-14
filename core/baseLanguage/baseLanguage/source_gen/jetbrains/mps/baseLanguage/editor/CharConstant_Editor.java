package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class CharConstant_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1200397593367(context, node);
  }

  public EditorCell createAlternation1208859155872(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = CharConstant_Editor.renderingCondition2322_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createProperty1208859155873(context, node);
    } else
    {
      editorCell = this.createProperty1208859230495(context, node);
    }
    setupBasic_Alternation_12088591558721208859155872(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createCollection1200397593367(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12003975933671200397593367(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1200397594526(context, node, "'"));
    editorCell.addEditorCell(this.createAlternation1208859155872(context, node));
    editorCell.addEditorCell(this.createConstant1200397598655(context, node, "'"));
    return editorCell;
  }

  public EditorCell createConstant1200397594526(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12003975945261200397594526(editorCell, node, context);
    setupLabel_Constant_1200397594526_1200397594526(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1200397598655(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12003975986551200397598655(editorCell, node, context);
    setupLabel_Constant_1200397598655_1200397598655(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty1208859155873_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_charConstant1208859155873(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_charConstant_1208859155873((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1208859155873(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("charConstant");
    provider.setNoTargetText("<no charConstant>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1208859155873_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1208859230495_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_charConstant1208859230495(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_charConstant_1208859230495((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1208859230495(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("charConstant");
    provider.setNoTargetText("<no charConstant>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1208859230495_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12003975933671200397593367(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1200397593367");
  }

  private static void setupBasic_Constant_12003975945261200397594526(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1200397594526");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12003975986551200397598655(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1200397598655");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Alternation_12088591558721208859155872(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Alternation_1208859155872");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.LAYOUT_CONSTRAINT, "punctuation");
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_charConstant1208859155873(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_charConstant");
    BaseLanguageStyle_StyleSheet.getStringLiteral(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, "spaces"));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_charConstant1208859230495(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_charConstant");
    BaseLanguageStyle_StyleSheet.getCompactKeyWord(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1200397594526_1200397594526(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1200397598655_1200397598655(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_charConstant_1208859155873(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_charConstant_1208859230495(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition2322_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.hasValue(node, "charConstant", null) || !(SPropertyOperations.getString(node, "charConstant").startsWith("\\"));
  }

}
