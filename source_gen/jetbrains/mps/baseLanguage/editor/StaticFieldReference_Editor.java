package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration;
import jetbrains.mps.semanticModel.SemanticModelUtil;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.EditorUtil;

public class StaticFieldReference_Editor extends DefaultNodeEditor {
  public static String MATCHING_TEXT = ". <static field>";
  public static String PRESENTATION_NAME = "static field reference";

  public EditorCell createEditorCell(EditorContext context, SemanticNode node) {
    return this.createRowCell(context, node);
  }
  public EditorCell createRowCell(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    editorCell.addKeyMap(new _Expression_KeyMap());
    editorCell.addEditorCell(this.createJavaClassTypeCell(context, node));
    editorCell.addEditorCell(this.createConstantCell(context, node, "."));
    editorCell.addEditorCell(this.createVariableDeclarationReferenceCell(context, node));
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createVariableDeclarationReferenceCell(EditorContext context, SemanticNode node) {
    SemanticNode effectiveNode = null;
    effectiveNode = node.getReferent("variableDeclaration");
    LinkDeclaration linkDeclaration = SemanticModelUtil.getLinkDeclaration(node, "variableDeclaration");
    if(effectiveNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "<no field>");
        noRefCell.setEditable(true);
        noRefCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
        noRefCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        noRefCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration));
        StaticFieldReference_FieldNameActions.setCellActions(noRefCell, node);
        return noRefCell;
      }
    }
    AbstractCellProvider inlineComponent = new StaticFieldReference_Editor_variableDeclaration_InlineComponent(effectiveNode);
    EditorCell editorCell = inlineComponent.createEditorCell(context);
    EditorUtil.setSemanticNodeToCells(editorCell, node);
    editorCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
    editorCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    editorCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration));
    StaticFieldReference_FieldNameActions.setCellActions(editorCell, node);
    return editorCell;
  }
  public EditorCell createJavaClassTypeCell(EditorContext context, SemanticNode node) {
    SemanticNode referencedNode = null;
    referencedNode = node.getChild("javaClassType");
    if(referencedNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "javaClassType");
        noRefCell.setEditable(true);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        StaticFieldReference_TypeActions.setCellActions(noRefCell, node);
        return noRefCell;
      }
    }
    EditorCell editorCell = context.createNodeCell(referencedNode);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    StaticFieldReference_TypeActions.setCellActions(editorCell, node);
    return editorCell;
  }
}
