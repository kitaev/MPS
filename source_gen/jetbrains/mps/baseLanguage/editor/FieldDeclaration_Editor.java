package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.PropertyAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteProperty;
import jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration;
import jetbrains.mps.semanticModel.SModelUtil;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.CellAction_DeleteNode;

public class FieldDeclaration_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SemanticNode node) {
    return this.createDeclarationBox(context, node);
  }
  public EditorCell createDeclarationBox(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createTypeCell(context, node));
    editorCell.addEditorCell(this.createNameCell(context, node));
    if(this.handleConditionalQuery_1075290206265(node)) {
      editorCell.addEditorCell(this.createInitializerArea(context, node));
    }
    editorCell.addEditorCell(this.createConstantCell1(context, node, ";"));
    return editorCell;
  }
  public EditorCell createInitializerArea(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createConstantCell(context, node, "="));
    editorCell.addEditorCell(this.createInitializerCell(context, node));
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    return editorCell;
  }
  public EditorCell createNameCell(EditorContext context, SemanticNode node) {
    PropertyAccessor propertyAccessor = new PropertyAccessor(node, "name", false, false);
    EditorCell_Property editorCell = EditorCell_Property.create(context, propertyAccessor, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(true);
    editorCell.setDefaultText("<no name>");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.getTextLine().setFontType(MPSFonts.BOLD);
    editorCell.getTextLine().setTextColor(MPSColors.DARK_MAGENTA);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteProperty(node, "name"));
    FieldDeclaration_NameCellActions.setCellActions(editorCell, node);
    return editorCell;
  }
  public EditorCell createTypeCell(EditorContext context, SemanticNode node) {
    SemanticNode referencedNode = null;
    referencedNode = node.getChild("type");
    LinkDeclaration linkDeclaration = SModelUtil.getLinkDeclaration(node, "type");
    if(referencedNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "type");
        noRefCell.setEditable(true);
        noRefCell.setSelectable(true);
        noRefCell.setDrawBorder(false);
        noRefCell.setDrawBrackets(false);
        noRefCell.setBracketsColor(Color.black);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        noRefCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration));
        FieldDeclaration_TypeCellActions.setCellActions(noRefCell, node);
        return noRefCell;
      }
    }
    EditorCell editorCell = context.createNodeCell(referencedNode);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    if(editorCell.getSubstituteInfo() == null) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration));
    }
    FieldDeclaration_TypeCellActions.setCellActions(editorCell, node);
    return editorCell;
  }
  public EditorCell createInitializerCell(EditorContext context, SemanticNode node) {
    SemanticNode referencedNode = null;
    referencedNode = node.getChild("initializer");
    LinkDeclaration linkDeclaration = SModelUtil.getLinkDeclaration(node, "initializer");
    if(referencedNode == null) {
      {
        EditorCell_Constant noRefCell = EditorCell_Constant.create(context, node, null, true);
        noRefCell.setDefaultText("");
        noRefCell.setEditable(true);
        noRefCell.setSelectable(true);
        noRefCell.setDrawBorder(false);
        noRefCell.setDrawBrackets(false);
        noRefCell.setBracketsColor(Color.black);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        noRefCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration));
        __VariableInitializer_ActionSet.setCellActions(noRefCell, node);
        return noRefCell;
      }
    }
    EditorCell editorCell = context.createNodeCell(referencedNode);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(referencedNode));
    if(editorCell.getSubstituteInfo() == null) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration));
    }
    __VariableInitializer_ActionSet.setCellActions(editorCell, node);
    return editorCell;
  }
  public boolean handleConditionalQuery_1075290206265(SemanticNode node) {
    return FreeMethodsUtil_jetbrains_mps_baseLanguage_editor_context._SemanticNodeCondition_HasInitializer(node);
  }
}
