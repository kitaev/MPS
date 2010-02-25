package jetbrains.mps.lang.actions.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class ParameterizedSubstituteMenuPart_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_1639_f0v0godq(editorContext, node);
  }

  private EditorCell createCollection_1639_f0v0godq(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_1639_f0v0godq");
    editorCell.addEditorCell(this.createConstant_1639_f0v0gtjm(editorContext, node));
    editorCell.addEditorCell(this.createCollection_1639_f0v0gy7n(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_1639_f0v0gy7n(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_1639_f0v0gy7n");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell1639_fmoo0v07(editorContext, node));
    editorCell.addEditorCell(this.createCollection_1639_f0v0h0m5(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_1639_f0v0h0m5(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_1639_f0v0h0m5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createCollection_1639_f0v0h2ui(editorContext, node));
    editorCell.addEditorCell(this.createConstant_1639_f0v0hjly(editorContext, node));
    editorCell.addEditorCell(this.createCollection_1639_f0v0hr29(editorContext, node));
    editorCell.addEditorCell(this.createConstant_1639_f0v1d7o3(editorContext, node));
    editorCell.addEditorCell(this.createCollection_1639_f0v1d7o4(editorContext, node));
    editorCell.addEditorCell(this.createConstant_1639_f0v1d7o7(editorContext, node));
    editorCell.addEditorCell(this.createCollection_1639_f0v1d7o8(editorContext, node));
    editorCell.addEditorCell(this.createConstant_1639_fcomjmpq(editorContext, node));
    editorCell.addEditorCell(this.createCollection_1639_fcomjmpr(editorContext, node));
    editorCell.addEditorCell(this.createConstant_1639_fp6xpeel(editorContext, node));
    editorCell.addEditorCell(this.createCollection_1639_fp6xphnu(editorContext, node));
    editorCell.addEditorCell(this.createConstant_1639_f0v1i33c(editorContext, node));
    editorCell.addEditorCell(this.createCollection_1639_f0v1i33d(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_1639_f0v0h2ui(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_1639_f0v0h2ui");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_1639_f0v0h2uj(editorContext, node));
    editorCell.addEditorCell(this.createConstant_1639_f0v155uy(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_1639_f0v0h8ra(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_1639_f0v0hr29(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_1639_f0v0hr29");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell1639_fmoo0wdp(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_1639_f0v0nx6h(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_1639_f0v1d7o4(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_1639_f0v1d7o4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell1639_fmoo0yjf(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_1639_f0v1d7o6(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_1639_f0v1d7o8(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_1639_f0v1d7o8");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell1639_fmoo0zyo(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_1639_f0v1d7oa(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_1639_f0v1i33d(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_1639_f0v1i33d");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell1639_fmoo1472(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_1639_f0v1i33f(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_1639_fcomjmpr(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_1639_fcomjmpr");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell1639_fmoo11xg(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_1639_fcomjmpt(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_1639_fp6xphnu(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_1639_fp6xphnu");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell1639_fp6xphnv(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_1639_fp6xphnw(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_1639_f0v0gtjm(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "parameterized item");
    editorCell.setCellId("Constant_1639_f0v0gtjm");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_1639_f0v0h2uj(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "parameter type");
    editorCell.setCellId("Constant_1639_f0v0h2uj");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_1639_f0v0hjly(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "query");
    editorCell.setCellId("Constant_1639_f0v0hjly");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_1639_f0v155uy(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "=");
    editorCell.setCellId("Constant_1639_f0v155uy");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_1639_f0v1d7o3(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "matching text");
    editorCell.setCellId("Constant_1639_f0v1d7o3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_1639_f0v1d7o7(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "description text");
    editorCell.setCellId("Constant_1639_f0v1d7o7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_1639_f0v1i33c(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "create child node");
    editorCell.setCellId("Constant_1639_f0v1i33c");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_1639_fcomjmpq(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "icon");
    editorCell.setCellId("Constant_1639_fcomjmpq");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_1639_fp6xpeel(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "type");
    editorCell.setCellId("Constant_1639_fp6xpeel");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createIndentCell1639_fmoo0v07(EditorContext editorContext, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(editorContext, node);
    return result;
  }

  private EditorCell createIndentCell1639_fmoo0wdp(EditorContext editorContext, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(editorContext, node);
    return result;
  }

  private EditorCell createIndentCell1639_fmoo0yjf(EditorContext editorContext, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(editorContext, node);
    return result;
  }

  private EditorCell createIndentCell1639_fmoo0zyo(EditorContext editorContext, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(editorContext, node);
    return result;
  }

  private EditorCell createIndentCell1639_fmoo11xg(EditorContext editorContext, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(editorContext, node);
    return result;
  }

  private EditorCell createIndentCell1639_fmoo1472(EditorContext editorContext, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(editorContext, node);
    return result;
  }

  private EditorCell createIndentCell1639_fp6xphnv(EditorContext editorContext, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(editorContext, node);
    return result;
  }

  private EditorCell createRefNode_1639_f0v0h8ra(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("type");
    provider.setNoTargetText("<no type>");
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

  private EditorCell createRefNode_1639_f0v0nx6h(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("query");
    provider.setNoTargetText("<no query>");
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

  private EditorCell createRefNode_1639_f0v1d7o6(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("matchingText");
    provider.setNoTargetText("<default>");
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

  private EditorCell createRefNode_1639_f0v1d7oa(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("descriptionText");
    provider.setNoTargetText("<default>");
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

  private EditorCell createRefNode_1639_f0v1i33f(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("handler");
    provider.setNoTargetText("<default>");
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

  private EditorCell createRefNode_1639_fcomjmpt(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("icon");
    provider.setNoTargetText("<default>");
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

  private EditorCell createRefNode_1639_fp6xphnw(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("actionType");
    provider.setNoTargetText("<default>");
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
}
