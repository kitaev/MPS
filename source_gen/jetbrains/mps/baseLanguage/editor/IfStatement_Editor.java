package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration;
import jetbrains.mps.semanticModel.SModelUtil;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.CellAction_DeleteSmart;
import jetbrains.mps.nodeEditor.CellAction_DeleteNode;
import jetbrains.mps.baseLanguage.IfStatement;

public class IfStatement_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SemanticNode node) {
    return this.createStatementBox(context, node);
  }
  public EditorCell createStatementBox(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createHeaderRow(context, node));
    editorCell.addEditorCell(this.createIfTrueBox(context, node));
    if(this.handleConditionalQuery_1075379536707(node)) {
      editorCell.addEditorCell(this.createIfFalseBranch(context, node));
    }
    if(this.handleConditionalQuery_1075379580458(node)) {
      editorCell.addEditorCell(this.createConstantCell5(context, node, "}"));
    }
    return editorCell;
  }
  public EditorCell createHeaderRow(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createConstantCell(context, node, "if"));
    editorCell.addEditorCell(this.createConstantCell1(context, node, "("));
    editorCell.addEditorCell(this.createConditionCell(context, node));
    editorCell.addEditorCell(this.createConstantCell2(context, node, ") {"));
    return editorCell;
  }
  public EditorCell createIfTrueBox(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createIndentCell(context, node, "  "));
    editorCell.addEditorCell(this.createIfTrueCell(context, node));
    return editorCell;
  }
  public EditorCell createIfFalseBranch(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createConstantCell3(context, node, "}"));
    editorCell.addEditorCell(this.createConstantCell4(context, node, "else"));
    editorCell.addEditorCell(this.createIfFalseStatementCell(context, node));
    return editorCell;
  }
  public EditorCell createConstantCell5(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(true);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    IfStatement_IfClosingBracketActions.setCellActions(editorCell, node);
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
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
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
  public EditorCell createConstantCell2(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    return editorCell;
  }
  public EditorCell createIndentCell(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    return editorCell;
  }
  public EditorCell createConstantCell3(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    return editorCell;
  }
  public EditorCell createConstantCell4(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.getTextLine().setFontType(MPSFonts.BOLD);
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
    return editorCell;
  }
  public EditorCell createConditionCell(EditorContext context, SemanticNode node) {
    SemanticNode referencedNode = null;
    referencedNode = node.getChild("condition");
    LinkDeclaration linkDeclaration = SModelUtil.getLinkDeclaration(node, "condition");
    if(referencedNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "");
        noRefCell.setEditable(true);
        noRefCell.setSelectable(true);
        noRefCell.setDrawBorder(false);
        noRefCell.setDrawBrackets(false);
        noRefCell.setBracketsColor(Color.black);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        noRefCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration));
        IfStatement_ConditionCellActions.setCellActions(noRefCell, node);
        _DefErrorActions.setCellActions(noRefCell, node);
        return noRefCell;
      }
    }
    EditorCell editorCell = context.createNodeCell(referencedNode);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteSmart(node, linkDeclaration, referencedNode));
    editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration));
    IfStatement_ConditionCellActions.setCellActions(editorCell, node);
    return editorCell;
  }
  public EditorCell createIfTrueCell(EditorContext context, SemanticNode node) {
    SemanticNode referencedNode = null;
    referencedNode = node.getChild("ifTrue");
    LinkDeclaration linkDeclaration = SModelUtil.getLinkDeclaration(node, "ifTrue");
    if(referencedNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "");
        noRefCell.setEditable(true);
        noRefCell.setSelectable(true);
        noRefCell.setDrawBorder(false);
        noRefCell.setDrawBrackets(false);
        noRefCell.setBracketsColor(Color.black);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        noRefCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration));
        return noRefCell;
      }
    }
    EditorCell editorCell = context.createNodeCell(referencedNode);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteSmart(node, linkDeclaration, referencedNode));
    editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration));
    return editorCell;
  }
  public EditorCell createIfFalseStatementCell(EditorContext context, SemanticNode node) {
    SemanticNode referencedNode = null;
    referencedNode = node.getChild("ifFalseStatement");
    LinkDeclaration linkDeclaration = SModelUtil.getLinkDeclaration(node, "ifFalseStatement");
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
        IfStatement_ElseStatementActions.setCellActions(noRefCell, node);
        return noRefCell;
      }
    }
    EditorCell editorCell = context.createNodeCell(referencedNode);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(referencedNode));
    editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration));
    IfStatement_ElseStatementActions.setCellActions(editorCell, node);
    return editorCell;
  }
  public boolean handleConditionalQuery_1075379536707(SemanticNode node) {
    IfStatement ifStatement = (IfStatement)node;
    return ifStatement.getIfFalseStatement() != null;
  }
  public boolean handleConditionalQuery_1075379580458(SemanticNode node) {
    IfStatement ifStatement = (IfStatement)node;
    return ifStatement.getIfFalseStatement() == null;
  }
}
