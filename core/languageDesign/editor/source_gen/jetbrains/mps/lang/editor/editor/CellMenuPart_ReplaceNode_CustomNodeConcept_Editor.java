package jetbrains.mps.lang.editor.editor;

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
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class CellMenuPart_ReplaceNode_CustomNodeConcept_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1165261271532(context, node);
  }

  public EditorCell createCollection1165261271532(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11652612715321165261271532(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1165261279434(context, node));
    editorCell.addEditorCell(this.createCollection1165261271533(context, node));
    return editorCell;
  }

  public EditorCell createCollection1165261271533(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11652612715331165261271533(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1165261371430(context, node, "  "));
    editorCell.addEditorCell(this.createConstant1165261271534(context, node, "replace with"));
    editorCell.addEditorCell(this.createConstant1165261271535(context, node, ":"));
    editorCell.addEditorCell(this.createRefCell1165261271536(context, node));
    return editorCell;
  }

  public EditorCell createCollection1165261279434(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11652612794341165261279434(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1165261279435(context, node, "replace node (custom node concept)"));
    return editorCell;
  }

  public EditorCell createConstant1165261271534(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11652612715341165261271534(editorCell, node, context);
    setupLabel_Constant_1165261271534_1165261271534(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1165261271535(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11652612715351165261271535(editorCell, node, context);
    setupLabel_Constant_1165261271535_1165261271535(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1165261279435(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11652612794351165261279435(editorCell, node, context);
    setupLabel_Constant_1165261279435_1165261279435(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1165261371430(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11652613714301165261371430(editorCell, node, context);
    setupLabel_Constant_1165261371430_1165261371430(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefCell1165261271536_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new CellMenuPart_ReplaceNode_CustomNodeConcept_Editor._Inline7061_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_replacementConcept1165261271536(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_replacementConcept_1165261271536((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1165261271536(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("replacementConcept");
    provider.setNoTargetText("<choose concept>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1165261271536_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11652612715321165261271532(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1165261271532");
  }

  private static void setupBasic_Collection_11652612715331165261271533(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1165261271533");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11652612715341165261271534(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1165261271534");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11652612715351165261271535(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1165261271535");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refCell_replacementConcept1165261271536(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_replacementConcept");
  }

  private static void setupBasic_Collection_11652612794341165261279434(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1165261279434");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11652612794351165261279435(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1165261279435");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.lightGray);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11652613714301165261371430(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1165261371430");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_1165261271534_1165261271534(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1165261271535_1165261271535(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_replacementConcept_1165261271536(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1165261279435_1165261279435(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1165261371430_1165261371430(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class _Inline7061_0 extends AbstractCellProvider {

    public _Inline7061_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1165261271538(context, node);
    }

    public EditorCell createProperty1165261271538_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_name1165261271538(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_name_1165261271538((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1165261271538(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(false);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1165261271538_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_name1165261271538(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_property_name_1165261271538(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
