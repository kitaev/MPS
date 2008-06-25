package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;

public class EnumMemberReference_Editor extends DefaultNodeEditor {

  private static void setupBasic_CollectionCell13171_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell13171_0");
  }

  private static void setupBasic_enumMemberRefCell13171_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_enumMemberRefCell13171_0");
  }

  private static void setupBasic_ConstantCell13171_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell13171_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return EnumMemberReference_Editor.calculateColor1(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ConstantCell13171_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell13171_01");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return EnumMemberReference_Editor.calculateColor27(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_enumMemberRefCell13171_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell13171_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell13171_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static Color calculateColor1(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_MAGENTA;
    return result;
  }

  private static Color calculateColor27(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_MAGENTA;
    return result;
  }

  private static Color calculateColor51(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_MAGENTA;
    return result;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell13171_0(context, node);
  }

  public EditorCell create_CollectionCell13171_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell13171_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell13171_0(context, node, "<"));
    editorCell.addEditorCell(this.create_enumMemberRefCell13171_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell13171_01(context, node, ">"));
    return editorCell;
  }

  public EditorCell create_ConstantCell13171_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell13171_0(editorCell, node, context);
    setupLabel_ConstantCell13171_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell13171_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell13171_01(editorCell, node, context);
    setupLabel_ConstantCell13171_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_enumMemberRefCell13171_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new EnumMemberReference_Editor._Inline15());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_enumMemberRefCell13171_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_enumMemberRefCell13171_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_enumMemberRefCell13171_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("enumMember");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_enumMemberRefCell13171_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class _Inline15 extends AbstractCellProvider {

    public _Inline15() {
      super();
    }

    private static void setupBasic_externalValuePropertyCell13171_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_externalValuePropertyCell13171_0");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
            this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

              public Color calculate(EditorCell cell) {
                return EnumMemberReference_Editor.calculateColor51(cell);
              }

            });
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_externalValuePropertyCell13171_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }


    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.create_externalValuePropertyCell13171_0(context, node);
    }

    public EditorCell create_externalValuePropertyCell13171_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_externalValuePropertyCell13171_0(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_externalValuePropertyCell13171_0((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell create_externalValuePropertyCell13171_0(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("externalValue");
      provider.setNoTargetText("<no ext value>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.create_externalValuePropertyCell13171_0_internal(context, node, provider);
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

}
