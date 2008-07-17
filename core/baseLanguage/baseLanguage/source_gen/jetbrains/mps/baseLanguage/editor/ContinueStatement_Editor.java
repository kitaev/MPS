package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.*;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.ISubstituteInfoPart;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ITranslator;
import jetbrains.mps.internal.collections.runtime.ISequence;
import jetbrains.mps.internal.collections.runtime.ISequenceIterableAdapter;
import java.util.Iterator;
import jetbrains.mps.closures.runtime.YieldingIterator;
import jetbrains.mps.smodel.SModel;

public class ContinueStatement_Editor extends DefaultNodeEditor {

  private static void setupBasic_CollectionCell4891_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell4891_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.NEXT_LINE, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ConstantCell4891_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell4891_0");
    BaseLanguageStyle_StyleSheet.KEY_WORD.apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.RT_ANCHOR_TAG, "default_RTransform");
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

            public Color calculate(EditorCell cell) {
              return ContinueStatement_Editor.calculateColor33(cell);
            }

          });
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ConstantCell4891_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell4891_01");
    BaseLanguageStyle_StyleSheet.SEMICOLON.apply(editorCell);
  }

  private static void setupBasic_CollectionCell4891_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell4891_01");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_labelPropertyCell4891_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_labelPropertyCell4891_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
          this.set(StyleAttributes.EDITABLE, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
    ContinueStatement_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupLabel_ConstantCell4891_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell4891_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_labelPropertyCell4891_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition4891_0(SNode node, EditorContext editorContext, IScope scope) {
    return !(SPropertyOperations.hasValue(node, "label", null));
  }

  private static Color calculateColor33(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_BLUE;
    return result;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell4891_0(context, node);
  }

  public EditorCell create_CollectionCell4891_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell4891_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell4891_0(context, node, "continue"));
    if (renderingCondition4891_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.create_CollectionCell4891_01(context, node));
    }
    editorCell.addEditorCell(this.create_ConstantCell4891_01(context, node, ";"));
    return editorCell;
  }

  public EditorCell create_CollectionCell4891_01(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell4891_01(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_labelPropertyCell4891_0(context, node));
    return editorCell;
  }

  public EditorCell create_ConstantCell4891_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell4891_0(editorCell, node, context);
    setupLabel_ConstantCell4891_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell4891_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell4891_01(editorCell, node, context);
    setupLabel_ConstantCell4891_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_labelPropertyCell4891_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_labelPropertyCell4891_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_labelPropertyCell4891_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new ISubstituteInfoPart[]{new ContinueStatement_Editor.ContinueStatement_generic_cellMenu()}));
    return editorCell;
  }

  public EditorCell create_labelPropertyCell4891_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("label");
    provider.setNoTargetText("<no label>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_labelPropertyCell4891_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class ContinueStatement_generic_cellMenu extends AbstractCellMenuPart_Generic_Group {

    public ContinueStatement_generic_cellMenu() {
    }

    public List createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      return ListSequence.fromList(SNodeOperations.getAncestors(node, "jetbrains.mps.baseLanguage.structure.AbstractLoopStatement", false)).translate(new ITranslator <SNode, String>() {

        public ISequence<String> translate(final SNode it) {
          return new ISequenceIterableAdapter <String>() {

            public Iterator<String> iterator() {
              return new YieldingIterator <String>() {

                private int __CP__ = 0;

                protected boolean moveToNext() {
__loop__:
                  do {
__switch__:
                    switch (this.__CP__) {
                      case -1:
                        assert false : "Internal error";
                        return false;
                      case 2:
                        if (!(SPropertyOperations.hasValue(it, "label", null))) {
                          this.__CP__ = 3;
                          break;
                        }
                        this.__CP__ = 1;
                        break;
                      case 4:
                        this.__CP__ = 1;
                        this.yield(SPropertyOperations.getString(it, "label"));
                        return true;
                      case 0:
                        this.__CP__ = 2;
                        break;
                      case 3:
                        this.__CP__ = 4;
                        break;
                      default:
                        break __loop__;
                    }
                  } while(true);
                  return false;
                }

              };
            }

          };
        }

      }).toListSequence();
    }

    public void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      this.handleAction_impl((String)parameterObject, node, model, scope, operationContext);
    }

    public void handleAction_impl(String parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SPropertyOperations.set(node, "label", parameterObject);
    }

    public boolean isReferentPresentation() {
      return false;
    }

}

}
