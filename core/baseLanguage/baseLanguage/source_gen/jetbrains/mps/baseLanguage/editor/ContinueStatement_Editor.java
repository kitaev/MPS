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
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.smodel.SModel;

public class ContinueStatement_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_5980_0(context, node);
  }

  public EditorCell createCollection_5980_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_5980_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_5980_0(context, node, "continue"));
    if (renderingCondition5980_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_5980_1(context, node));
    }
    editorCell.addEditorCell(this.createConstant_5980_1(context, node, ";"));
    return editorCell;
  }

  public EditorCell createCollection_5980_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_5980_1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createProperty_5980_1(context, node));
    return editorCell;
  }

  public EditorCell createConstant_5980_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_5980_0(editorCell, node, context);
    setupLabel_Constant_5980_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_5980_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_5980_1(editorCell, node, context);
    setupLabel_Constant_5980_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty_5980_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_5980_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_Property_5980_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new SubstituteInfoPart[]{new ContinueStatement_Editor.ContinueStatement_generic_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createProperty_5980_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("label");
    provider.setNoTargetText("<no label>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty_5980_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_5980_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_5980_0");
  }

  private static void setupBasic_Constant_5980_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_5980_0");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.RT_ANCHOR_TAG, "default_RTransform");
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_5980_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_5980_1");
    BaseLanguageStyle_StyleSheet.getSemicolon(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_5980_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_5980_1");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Property_5980_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_label");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
          this.set(StyleAttributes.EDITABLE, true);
          this.set(StyleAttributes.PADDING_LEFT, new Padding(1.0, Measure.SPACES));
        }

      };
      inlineStyle.apply(editorCell);
    }
    ContinueStatement_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupLabel_Constant_5980_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_5980_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Property_5980_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition5980_0(SNode node, EditorContext editorContext, IScope scope) {
    return !(SPropertyOperations.hasValue(node, "label", null));
  }

  public static class ContinueStatement_generic_cellMenu0 extends AbstractCellMenuPart_Generic_Group {

    public ContinueStatement_generic_cellMenu0() {
    }

    public List createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      return ListSequence.fromList(SNodeOperations.getAncestors(node, "jetbrains.mps.baseLanguage.structure.AbstractLoopStatement", false)).translate(new ITranslator2 <?, String>() {

        public Iterable<String> translate(final ? it) {
          return new Iterable <String>() {

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
