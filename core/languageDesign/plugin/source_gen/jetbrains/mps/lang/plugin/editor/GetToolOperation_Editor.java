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
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class GetToolOperation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1209909955068(context, node);
  }

  public EditorCell createCollection1209909955068(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12099099550681209909955068(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1209909959454(context, node, "tool"));
    editorCell.addEditorCell(this.createConstant1209909961705(context, node, "<"));
    editorCell.addEditorCell(this.createRefCell1209909966445(context, node));
    editorCell.addEditorCell(this.createConstant1209909963132(context, node, ">"));
    return editorCell;
  }

  public EditorCell createConstant1209909959454(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12099099594541209909959454(editorCell, node, context);
    setupLabel_Constant_1209909959454_1209909959454(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1209909961705(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12099099617051209909961705(editorCell, node, context);
    setupLabel_Constant_1209909961705_1209909961705(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1209909963132(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12099099631321209909963132(editorCell, node, context);
    setupLabel_Constant_1209909963132_1209909963132(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefCell1209909966445_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new GetToolOperation_Editor._Inline8845_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_tool1209909966445(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_tool_1209909966445((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1209909966445(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("tool");
    provider.setNoTargetText("<no tool>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1209909966445_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12099099550681209909955068(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1209909955068");
  }

  private static void setupBasic_Constant_12099099594541209909959454(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1209909959454");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_RIGHT_WITH_MEASURE, new Padding(0.0, "spaces"));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12099099617051209909961705(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1209909961705");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FIRST_POSITION_ALLOWED, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12099099631321209909963132(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1209909963132");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_refCell_tool1209909966445(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_tool");
  }

  private static void setupLabel_Constant_1209909959454_1209909959454(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1209909961705_1209909961705(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1209909963132_1209909963132(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_tool_1209909966445(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class _Inline8845_0 extends AbstractCellProvider {

    public _Inline8845_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1209909969528(context, node);
    }

    public EditorCell createProperty1209909969528_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_name1209909969528(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_name_1209909969528((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1209909969528(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1209909969528_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_name1209909969528(EditorCell editorCell, SNode node, EditorContext context) {
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

    private static void setupLabel_property_name_1209909969528(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
