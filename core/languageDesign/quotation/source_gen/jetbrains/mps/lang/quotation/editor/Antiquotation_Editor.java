package jetbrains.mps.lang.quotation.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class Antiquotation_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_lbdr4h_a(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createCollection_lbdr4h_a_0(editorContext, node);
  }

  private EditorCell createCollection_lbdr4h_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_lbdr4h_a");
    editorCell.addEditorCell(this.createConstant_lbdr4h_a0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_lbdr4h_b0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_lbdr4h_c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_lbdr4h_d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_lbdr4h_a_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_lbdr4h_a_0");
    editorCell.addEditorCell(this.createConstant_lbdr4h_a0_0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_lbdr4h_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_lbdr4h_c0(editorContext, node));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor_lbdr4h_d0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_lbdr4h_e0(editorContext, node));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor_lbdr4h_f0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_lbdr4h_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "%(");
    editorCell.setCellId("Constant_lbdr4h_a0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator<Color>() {
        public Color calculate(EditorCell cell) {
          return Antiquotation_Editor._StyleParameter_QueryFunction_lbdr4h_a0a0((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_lbdr4h_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")%");
    editorCell.setCellId("Constant_lbdr4h_d0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator<Color>() {
        public Color calculate(EditorCell cell) {
          return Antiquotation_Editor._StyleParameter_QueryFunction_lbdr4h_a0d0((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_lbdr4h_a0_0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "node antiquotation ");
    editorCell.setCellId("Constant_lbdr4h_a0_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_lbdr4h_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_lbdr4h_b0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_lbdr4h_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "attributed node concept:");
    editorCell.setCellId("Constant_lbdr4h_c0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_lbdr4h_e0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "attributed node role in parent:");
    editorCell.setCellId("Constant_lbdr4h_e0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createReadOnlyModelAccessor_lbdr4h_f0(final EditorContext editorContext, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, new ModelAccessor() {
      public String getText() {
        SNode parent = SNodeOperations.getParent(node);
        if ((parent != null)) {
          return parent.getRole_();
        } else {
          return "";
        }
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }
    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    editorCell.setCellId("ReadOnlyModelAccessor_lbdr4h_f0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    return editorCell;
  }

  private EditorCell createReadOnlyModelAccessor_lbdr4h_d0(final EditorContext editorContext, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, new ModelAccessor() {
      public String getText() {
        SNode parent = SNodeOperations.getParent(node);
        if ((SNodeOperations.getParent(node) != null)) {
          return SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(SNodeOperations.getParent(node)), "name");
        } else {
          return "";
        }
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }
    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    editorCell.setCellId("ReadOnlyModelAccessor_lbdr4h_d0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    return editorCell;
  }

  private EditorCell createRefNode_lbdr4h_c0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("expression");
    provider.setNoTargetText("<expr>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
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

  private EditorCell createProperty_lbdr4h_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("label");
    provider.setNoTargetText("");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_label");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator<Color>() {
        public Color calculate(EditorCell cell) {
          return Antiquotation_Editor._StyleParameter_QueryFunction_lbdr4h_a0b0((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
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

  private static Color _StyleParameter_QueryFunction_lbdr4h_a0d0(SNode node, EditorContext editorContext) {
    return Colors.BROWN;
  }

  private static Color _StyleParameter_QueryFunction_lbdr4h_a0a0(SNode node, EditorContext editorContext) {
    return Colors.BROWN;
  }

  private static Color _StyleParameter_QueryFunction_lbdr4h_a0b0(SNode node, EditorContext editorContext) {
    return Colors.BROWN;
  }
}
