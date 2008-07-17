package jetbrains.mps.bootstrap.editorLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;

import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.ISubstituteInfoPart;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.AbstractCellMenuPart_PropertyValues;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.nodeEditor.EditorCellKeyMap;

public class CellKeyMapKeystroke_Editor extends DefaultNodeEditor {

  private static void setupBasic_CollectionCell1532_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell1532_0");
  }

  private static void setupBasic_ConstantCell1532_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell1532_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_modifiersPropertyCell1532_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_modifiersPropertyCell1532_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return CellKeyMapKeystroke_Editor.calculateColor56(cell);
            }

          });
          this.set(StyleAttributes.SELECTED_TEXT_BACKGROUND_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return CellKeyMapKeystroke_Editor.calculateColor79(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ConstantCell1532_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell1532_01");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_keycodePropertyCell1532_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_keycodePropertyCell1532_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return CellKeyMapKeystroke_Editor.calculateColor54(cell);
            }

          });
          this.set(StyleAttributes.SELECTED_TEXT_BACKGROUND_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return CellKeyMapKeystroke_Editor.calculateColor78(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ConstantCell1532_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell1532_02");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_ConstantCell1532_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_modifiersPropertyCell1532_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell1532_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_keycodePropertyCell1532_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell1532_02(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static Color calculateColor54(EditorCell cell) {
    Color result;
    result = Color.yellow;
    return result;
  }

  private static Color calculateColor56(EditorCell cell) {
    Color result;
    result = Color.yellow;
    return result;
  }

  private static Color calculateColor78(EditorCell cell) {
    Color result;
    result = Color.cyan;
    return result;
  }

  private static Color calculateColor79(EditorCell cell) {
    Color result;
    result = Color.cyan;
    return result;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell1532_0(context, node);
  }

  public EditorCell create_CollectionCell1532_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell1532_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(true);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell1532_0(context, node, "<"));
    editorCell.addEditorCell(this.create_modifiersPropertyCell1532_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell1532_01(context, node, " > + <"));
    editorCell.addEditorCell(this.create_keycodePropertyCell1532_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell1532_02(context, node, " >"));
    return editorCell;
  }

  public EditorCell create_ConstantCell1532_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell1532_0(editorCell, node, context);
    setupLabel_ConstantCell1532_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell1532_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell1532_01(editorCell, node, context);
    setupLabel_ConstantCell1532_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell1532_02(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell1532_02(editorCell, node, context);
    setupLabel_ConstantCell1532_02(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_modifiersPropertyCell1532_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_modifiersPropertyCell1532_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_modifiersPropertyCell1532_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new ISubstituteInfoPart[]{new CellKeyMapKeystroke_Editor.CellKeyMapKeystroke_modifiers_cellMenu()}));
    return editorCell;
  }

  public EditorCell create_modifiersPropertyCell1532_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("modifiers");
    provider.setNoTargetText("any");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.create_modifiersPropertyCell1532_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_keycodePropertyCell1532_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_keycodePropertyCell1532_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_keycodePropertyCell1532_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new ISubstituteInfoPart[]{new CellKeyMapKeystroke_Editor.CellKeyMapKeystroke_keycode_cellMenu()}));
    return editorCell;
  }

  public EditorCell create_keycodePropertyCell1532_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("keycode");
    provider.setNoTargetText("<keycode>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_keycodePropertyCell1532_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class CellKeyMapKeystroke_keycode_cellMenu extends AbstractCellMenuPart_PropertyValues {

    public CellKeyMapKeystroke_keycode_cellMenu() {
    }

    public List<String> getPropertyValues(SNode node, IScope scope, IOperationContext operationContext) {
      List<String> keycodes = ListSequence.<String>fromArray(EditorCellKeyMap.KEY_CODE_DIGIT, EditorCellKeyMap.KEY_CODE_LETTER, EditorCellKeyMap.KEY_CODE_LETTER_OR_DIGIT, EditorCellKeyMap.KEY_CODE_SPACE, EditorCellKeyMap.KEY_CODE_CHAR);
      ListSequence.fromList(keycodes).addSequence(ListSequence.fromList(EditorCellKeyMap.getVirtualKeycodes()));
      return keycodes;
    }

}
  public static class CellKeyMapKeystroke_modifiers_cellMenu extends AbstractCellMenuPart_PropertyValues {

    public CellKeyMapKeystroke_modifiers_cellMenu() {
    }

    public List<String> getPropertyValues(SNode node, IScope scope, IOperationContext operationContext) {
      return ListSequence.<String>fromArray(EditorCellKeyMap.KEY_MODIFIERS_NONE, EditorCellKeyMap.KEY_MODIFIERS_CTRL, EditorCellKeyMap.KEY_MODIFIERS_ALT, EditorCellKeyMap.KEY_MODIFIERS_SHIFT, EditorCellKeyMap.KEY_MODIFIERS_CTRL_ALT, EditorCellKeyMap.KEY_MODIFIERS_CTRL_SHIFT, EditorCellKeyMap.KEY_MODIFIERS_CTRL_ALT_SHIFT, EditorCellKeyMap.KEY_MODIFIERS_ALT_SHIFT);
    }

}

}
