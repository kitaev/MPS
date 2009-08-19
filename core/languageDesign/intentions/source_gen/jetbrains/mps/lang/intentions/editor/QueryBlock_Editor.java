package jetbrains.mps.lang.intentions.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.baseLanguage.editor.ConceptFunction_Component;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class QueryBlock_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_6409_0(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createCustom_6409_0(editorContext, node);
  }

  private EditorCell createCollection_6409_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_6409_0");
    editorCell.addEditorCell(this.createCollection_6409_1(editorContext, node));
    editorCell.addEditorCell(this.createComponent_6409_0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_6409_1(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_6409_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_6409_0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6409_1(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_6409_0(editorContext, node));
    return editorCell;
  }

  private EditorCell createComponent_6409_0(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new ConceptFunction_Component(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createConstant_6409_0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "type");
    editorCell.setCellId("Constant_6409_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
      style.set(StyleAttributes.SELECTABLE, true);
      style.set(StyleAttributes.EDITABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6409_1(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ":");
    editorCell.setCellId("Constant_6409_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, true);
      style.set(StyleAttributes.EDITABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCustom_6409_0(final EditorContext editorContext, final SNode node) {
    AbstractCellProvider provider = new _FunctionTypes._return_P0_E0<AbstractCellProvider>() {
      public AbstractCellProvider invoke() {
        return new AbstractCellProvider() {
          public EditorCell createEditorCell(EditorContext editorContext) {
            EditorCell_Collection collection = EditorCell_Collection.createVertical(editorContext, node);
            collection.addEditorCell(new EditorCell_Constant(editorContext, node, "Concept function help:"));
            if (SConceptPropertyOperations.getString(SNodeOperations.getConceptDeclaration(node), "shortDescription") != null) {
              collection.addEditorCell(new EditorCell_Constant(editorContext, node, SConceptPropertyOperations.getString(SNodeOperations.getConceptDeclaration(node), "shortDescription")));
            }
            collection.addEditorCell(new EditorCell_Constant(editorContext, node, ""));
            collection.addEditorCell(new EditorCell_Constant(editorContext, node, "Parameter help:"));
            for (SNode cfp : ConceptFunction_Behavior.call_getParameters_1213877374450(node)) {
              String alias = SPropertyOperations.getString(cfp, "alias");
              String description = SPropertyOperations.getString(cfp, "shortDescription");
              if (description == null) {
                description = "<no help. use short_description concept function property to create one>";
              }
              EditorCell_Constant message = new EditorCell_Constant(editorContext, node, alias + " : " + description);
              collection.addEditorCell(message);
            }
            return collection;
          }
        };
      }
    }.invoke();
    EditorCell editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("Custom_6409_0");
    return editorCell;
  }

  private EditorCell createRefNode_6409_0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("paramType");
    provider.setNoTargetText("<no paramType>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_FOCUS);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }
}
