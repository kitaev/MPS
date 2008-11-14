package jetbrains.mps.lang.smodel.editor;

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
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class EnumMemberReference_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1146158256146(context, node);
  }

  public EditorCell createCollection1146158256146(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11461582561461146158256146(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1146158270588(context, node, "<"));
    editorCell.addEditorCell(this.createRefCell1146158258594(context, node));
    editorCell.addEditorCell(this.createConstant1146158355984(context, node, ">"));
    return editorCell;
  }

  public EditorCell createConstant1146158270588(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11461582705881146158270588(editorCell, node, context);
    setupLabel_Constant_1146158270588_1146158270588(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1146158355984(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11461583559841146158355984(editorCell, node, context);
    setupLabel_Constant_1146158355984_1146158355984(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefCell1146158258594_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new EnumMemberReference_Editor._Inline9300_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_enumMember1146158258594(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_enumMember_1146158258594((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1146158258594(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("enumMember");
    provider.setNoTargetText("<no enumMember>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1146158258594_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11461582561461146158256146(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1146158256146");
  }

  private static void setupBasic_refCell_enumMember1146158258594(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_enumMember");
  }

  private static void setupBasic_Constant_11461582705881146158270588(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1146158270588");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
          this.set(StyleAttributes.PADDING_RIGHT_WITH_MEASURE, new Padding(0.0, "spaces"));
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
          this.set(StyleAttributes.LAST_POSITION_ALLOWED, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11461583559841146158355984(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1146158355984");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
          this.set(StyleAttributes.PADDING_RIGHT_WITH_MEASURE, new Padding(0.0, "spaces"));
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
          this.set(StyleAttributes.FIRST_POSITION_ALLOWED, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_refCell_enumMember_1146158258594(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1146158270588_1146158270588(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1146158355984_1146158355984(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class _Inline9300_0 extends AbstractCellProvider {

    public _Inline9300_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1146158258596(context, node);
    }

    public EditorCell createProperty1146158258596_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_externalValue1146158258596(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_externalValue_1146158258596((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1146158258596(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("externalValue");
      provider.setNoTargetText("<no ext value>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1146158258596_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_externalValue1146158258596(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_externalValue");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
            this.set(StyleAttributes.PADDING_RIGHT_WITH_MEASURE, new Padding(0.0, "spaces"));
            this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_property_externalValue_1146158258596(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
