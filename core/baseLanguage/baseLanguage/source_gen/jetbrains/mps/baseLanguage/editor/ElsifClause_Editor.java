package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.baseLanguage.behavior.ElsifClause_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModel;

public class ElsifClause_Editor extends DefaultNodeEditor {

  private static void setupBasic_Collection_12060610471061206061047106(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1206061047106");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.POSITION, "next-line");
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12060610515921206061051592(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1206061051592");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12060610550321206061055032(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1206061055032");
    BaseLanguageStyle_StyleSheet.RIGHT_BRACE.apply(editorCell);
  }

  private static void setupBasic_Constant_12060610598151206061059815(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1206061059815");
    BaseLanguageStyle_StyleSheet.KEY_WORD.apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.EDITABLE, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12060610688021206061068802(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1206061068802");
    BaseLanguageStyle_StyleSheet.LEFT_PAREN.apply(editorCell);
  }

  private static void setupBasic_Constant_12060610711001206061071100(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1206061071100");
    BaseLanguageStyle_StyleSheet.RIGHT_PAREN.apply(editorCell);
  }

  private static void setupBasic_Constant_12060610745091206061074509(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1206061074509");
    BaseLanguageStyle_StyleSheet.LEFT_BRACE.apply(editorCell);
  }

  private static void setupBasic_refNode_condition1206061083792(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_12060610997781206061099778(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1206061099778");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.POSITION, "indented");
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12060610997791206061099779(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Indent_1206061099779");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_statementList1206061106547(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1206061055032_1206061055032(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1206061059815_1206061059815(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1206061068802_1206061068802(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1206061071100_1206061071100(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1206061074509_1206061074509(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_condition_1206061083792(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_statementList_1206061106547(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1206061047106(context, node);
  }

  public EditorCell createCollection1206061047106(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12060610471061206061047106(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1206061051592(context, node));
    editorCell.addEditorCell(this.createCollection1206061099778(context, node));
    return editorCell;
  }

  public EditorCell createCollection1206061051592(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12060610515921206061051592(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1206061055032(context, node, "}"));
    editorCell.addEditorCell(this.createConstant1206061059815(context, node, "else if"));
    editorCell.addEditorCell(this.createConstant1206061068802(context, node, "("));
    editorCell.addEditorCell(this.createRefNode1206061083792(context, node));
    editorCell.addEditorCell(this.createConstant1206061071100(context, node, ")"));
    editorCell.addEditorCell(this.createConstant1206061074509(context, node, "{"));
    return editorCell;
  }

  public EditorCell createCollection1206061099778(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12060610997781206061099778(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell3(context, node));
    editorCell.addEditorCell(this.createRefNode1206061106547(context, node));
    return editorCell;
  }

  public EditorCell createConstant1206061055032(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12060610550321206061055032(editorCell, node, context);
    setupLabel_Constant_1206061055032_1206061055032(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1206061059815(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12060610598151206061059815(editorCell, node, context);
    setupLabel_Constant_1206061059815_1206061059815(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new ElsifClause_Editor.ElsifClause_generic_cellMenu()}));
    return editorCell;
  }

  public EditorCell createConstant1206061068802(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12060610688021206061068802(editorCell, node, context);
    setupLabel_Constant_1206061068802_1206061068802(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1206061071100(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12060610711001206061071100(editorCell, node, context);
    setupLabel_Constant_1206061071100_1206061071100(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1206061074509(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12060610745091206061074509(editorCell, node, context);
    setupLabel_Constant_1206061074509_1206061074509(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createIndentCell3(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createRefNode1206061083792_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_condition1206061083792(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_condition_1206061083792((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1206061083792(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("condition");
    provider.setNoTargetText("<no condition>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1206061083792_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1206061106547_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_statementList1206061106547(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_statementList_1206061106547((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1206061106547(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("statementList");
    provider.setNoTargetText("<no statementList>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1206061106547_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class ElsifClause_generic_cellMenu extends AbstractCellMenuPart_Generic_Group {

    public ElsifClause_generic_cellMenu() {
    }

    public List createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      // todo this is quite a hackish stuff but we need it
      // todo but we need it since we can't enable/disable
      // todo menu items by condition
      SNode ifStatement = ElsifClause_Behavior.call_getIfStatement_1213877360521(node);
      List<String> result = ListSequence.<String>fromArray();
      if ((SLinkOperations.getTarget(ifStatement, "ifFalseStatement", true) == null)) {
        ListSequence.fromList(result).addElement("else");
      }
      ListSequence.fromList(result).addElement("else if");
      return result;
    }

    public void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      this.handleAction_impl((String)parameterObject, node, model, scope, operationContext);
    }

    public void handleAction_impl(String parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      if ("else".equals(parameterObject)) {
        ElsifClause_Behavior.call_convertToElseClause_1217846674032(node);
      }
    }

    public boolean isReferentPresentation() {
      return false;
    }

}

}
