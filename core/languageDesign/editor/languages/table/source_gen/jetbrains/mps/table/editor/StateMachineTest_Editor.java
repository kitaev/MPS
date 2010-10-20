package jetbrains.mps.table.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.table.runtime.TableModelCreator;
import jetbrains.mps.lang.editor.table.runtime.TableModel;
import jetbrains.mps.lang.editor.table.runtime.AbstractTableModel;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.editor.table.runtime.EditorCell_Table;

public class StateMachineTest_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_hhanjm_a(editorContext, node);
  }

  private EditorCell createCollection_hhanjm_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_hhanjm_a");
    editorCell.addEditorCell(this.createConstant_hhanjm_a0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_hhanjm_b0(editorContext, node));
    editorCell.addEditorCell(this.createTable_hhanjm_c0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_hhanjm_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "State Machine");
    editorCell.setCellId("Constant_hhanjm_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createProperty_hhanjm_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
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

  private EditorCell createTable_hhanjm_c0(EditorContext editorContext, SNode node) {
    TableModelCreator creator = new TableModelCreator() {
      public TableModel getTable(final SNode node, EditorContext editorContext) {
        return new AbstractTableModel() {
          public int getColumnsNumber() {
            return 1 + ListSequence.fromList(SLinkOperations.getTargets(node, "events", true)).count();
          }

          public int getRowsNumber() {
            return 1 + ListSequence.fromList(SLinkOperations.getTargets(node, "states", true)).count();
          }

          public SNode getValueAt(int row, int column) {
            if (row == 0 && column > 0) {
              return ListSequence.fromList(SLinkOperations.getTargets(node, "events", true)).getElement(column - 1);
            }
            if (column == 0 && row > 0) {
              return ListSequence.fromList(SLinkOperations.getTargets(node, "states", true)).getElement(row - 1);
            }
            if (row > 0 && column > 0) {
              SNode event = ListSequence.fromList(SLinkOperations.getTargets(node, "events", true)).getElement(column - 1);
              SNode state = ListSequence.fromList(SLinkOperations.getTargets(node, "states", true)).getElement(row - 1);
              for (SNode transition : ListSequence.fromList(SLinkOperations.getTargets(node, "transition", true))) {
                if (SLinkOperations.getTarget(SLinkOperations.getTarget(transition, "event", true), "event", false) == event && SLinkOperations.getTarget(SLinkOperations.getTarget(transition, "state", true), "state", false) == state) {
                  return transition;
                }
              }
            }
            return null;
          }

          @Override
          public void createElement(int row, int column) {
            if (row > 0 && column > 0) {
              SNode event = ListSequence.fromList(SLinkOperations.getTargets(node, "events", true)).getElement(column - 1);
              SNode state = ListSequence.fromList(SLinkOperations.getTargets(node, "states", true)).getElement(row - 1);
              SNode transition = SConceptOperations.createNewNode("jetbrains.mps.table.structure.Transition", null);
              SLinkOperations.setTarget(transition, "event", SConceptOperations.createNewNode("jetbrains.mps.table.structure.EventReference", null), true);
              SLinkOperations.setTarget(SLinkOperations.getTarget(transition, "event", true), "event", event, false);
              SLinkOperations.setTarget(transition, "state", SConceptOperations.createNewNode("jetbrains.mps.table.structure.StateReference", null), true);
              SLinkOperations.setTarget(SLinkOperations.getTarget(transition, "state", true), "state", state, false);
              ListSequence.fromList(SLinkOperations.getTargets(node, "transition", true)).addElement(transition);
            }
          }

          public void deleteRow(int row) {
          }
        };
      }
    };
    EditorCell_Collection editorCell = EditorCell_Table.createTable(editorContext, node, creator.getTable(node, editorContext));
    editorCell.setCellId("Table_hhanjm_c0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    return editorCell;
  }
}
