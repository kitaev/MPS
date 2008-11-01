package jetbrains.mps.lang.typesystem.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class Node_TypeOperation_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_NotInRules_Component4604_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createConstant1176544322411(context, node, "type");
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createComponent1176544407635(context, node);
  }

  public EditorCell createComponent1176544407635(EditorContext context, SNode node) {
    if (this.my_NotInRules_Component4604_0 == null) {
      this.my_NotInRules_Component4604_0 = new _NotInRules_Component(node);
    }
    EditorCell editorCell = this.my_NotInRules_Component4604_0.createEditorCell(context);
    setupBasic_component__NotInRules_Component1176544407635(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant1176544322411(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11765443224111176544322411(editorCell, node, context);
    setupLabel_Constant_1176544322411_1176544322411(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }


  private static void setupBasic_Constant_11765443224111176544322411(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1176544322411");
  }

  private static void setupBasic_component__NotInRules_Component1176544407635(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component__NotInRules_Component");
  }

  private static void setupLabel_Constant_1176544322411_1176544322411(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
