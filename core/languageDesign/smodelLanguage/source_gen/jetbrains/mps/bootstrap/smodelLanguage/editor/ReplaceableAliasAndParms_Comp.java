package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.ISubstituteInfoPart;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteNode;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.CaretPosition;

public class ReplaceableAliasAndParms_Comp extends AbstractCellProvider {

  /* package */AbstractCellListHandler myParameterListHandler_parameterList_;

  public  ReplaceableAliasAndParms_Comp(SNode node) {
    super(node);
  }

  public static boolean _QueryFunction_NodeCondition_1206995967611(SNode node, EditorContext editorContext, IScope scope) {
    return !(SequenceOperations.isEmpty(SLinkOperations.getTargets(node, "parameter", true)));
  }

  private static void setupBasic_RowCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1206995930398");
  }

  private static void setupBasic_CellModel_ConceptProperty(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1206995930399");
    editorCell.setFontType(MPSFonts.BOLD);
  }

  private static void setupBasic_RowCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1206995959902");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1206995959903");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setFontType(MPSFonts.BOLD);
  }

  private static void setupBasic_ParameterList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1206995959904");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1206995959906");
    editorCell.setDrawBorder(false);
    editorCell.setFontType(MPSFonts.BOLD);
  }

  private static void setupLabel_CellModel_ConceptProperty(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(Color.lightGray);
  }

  private static void setupLabel_ParameterList(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell2(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(Color.lightGray);
  }


  public EditorCell createEditorCell(EditorContext context) {
    return this.createEditorCell(context, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createRowCell(context, node);
  }

  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    ReplaceableAliasAndParms_Comp.setupBasic_RowCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCellModel_ConceptProperty(context, node));
    if (ReplaceableAliasAndParms_Comp._QueryFunction_NodeCondition_1206995967611(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRowCell1(context, node));
    }
    return editorCell;
  }

  public EditorCell createRowCell1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    ReplaceableAliasAndParms_Comp.setupBasic_RowCell1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell(context, node, "<"));
    editorCell.addEditorCell(this.createParameterList(context, node));
    editorCell.addEditorCell(this.createConstantCell2(context, node, ">"));
    return editorCell;
  }

  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    ReplaceableAliasAndParms_Comp.setupBasic_ConstantCell(editorCell, node, context);
    ReplaceableAliasAndParms_Comp.setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    ReplaceableAliasAndParms_Comp.setupBasic_ConstantCell2(editorCell, node, context);
    ReplaceableAliasAndParms_Comp.setupLabel_ConstantCell2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createParameterList(EditorContext context, SNode node) {
    if (this.myParameterListHandler_parameterList_ == null) {
      this.myParameterListHandler_parameterList_ = new ReplaceableAliasAndParms_Comp._RefNodeListHandler4(node, "parameter", context);
    }
    EditorCell_Collection editorCell = this.myParameterListHandler_parameterList_.createCells(context, new CellLayout_Horizontal(), false);
    ReplaceableAliasAndParms_Comp.setupBasic_ParameterList(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myParameterListHandler_parameterList_.getElementRole());
    return editorCell;
  }

  public EditorCell createCellModel_ConceptPropertyinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    ReplaceableAliasAndParms_Comp.setupBasic_CellModel_ConceptProperty(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      ReplaceableAliasAndParms_Comp.setupLabel_CellModel_ConceptProperty((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new ISubstituteInfoPart[]{new ReplaceableAliasAndParms_Comp.SNodeOperation_replaceWith_SNodeOperation_cellMenu1()}));
    return editorCell;
  }

  public EditorCell createCellModel_ConceptProperty(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createCellModel_ConceptPropertyinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class SNodeOperation_replaceWith_SNodeOperation_cellMenu1 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public  SNodeOperation_replaceWith_SNodeOperation_cellMenu1() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperation";
    }

}
  public static class _RefNodeListHandler4 extends RefNodeListHandler {

    public  _RefNodeListHandler4(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    private static void setupBasic_ConstantCell1(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1206995959905");
      editorCell.setDrawBorder(false);
      editorCell.setFontType(MPSFonts.ITALIC);
    }

    private static void setupLabel_ConstantCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
      editorCell.setEditable(true);
      editorCell.getTextLine().setTextColor(Color.lightGray);
    }


    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = this.createEmptyCell_internal(context, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public EditorCell createEmptyCell_internal(EditorContext context, SNode node) {
      return this.createConstantCell1(context, node, "no params");
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(elementNode));
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, ","));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), ",");
        editorCell.setSelectable(false);
        editorCell.setLayoutConstraint("");
        return editorCell;
      }
    }

    public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      ReplaceableAliasAndParms_Comp._RefNodeListHandler4.setupBasic_ConstantCell1(editorCell, node, context);
      ReplaceableAliasAndParms_Comp._RefNodeListHandler4.setupLabel_ConstantCell1(editorCell, node, context);
      editorCell.setDefaultText("");
      editorCell.setDefaultCaretPosition(CaretPosition.FIRST);
      return editorCell;
    }

}

}
