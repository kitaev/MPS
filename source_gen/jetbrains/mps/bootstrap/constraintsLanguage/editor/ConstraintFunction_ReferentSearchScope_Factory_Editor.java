package jetbrains.mps.bootstrap.constraintsLanguage.editor;

/*Generated by MPS Sep 26, 2006 1:07:33 PM */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Basic;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class ConstraintFunction_ReferentSearchScope_Factory_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createRowCell(context, node);
  }
  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createColumnCell(context, node);
  }
  public EditorCell createColumnCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.addEditorCell(this.createConstantCell1(context, node, "search scope provider"));
    editorCell.addEditorCell(this.createConstantCell2(context, node, ""));
    editorCell.addEditorCell(this.createConstantCell3(context, node, "creates search scope (jetbrains.mps.smodel.search.ISearchScope)"));
    editorCell.addEditorCell(this.createConstantCell4(context, node, ""));
    editorCell.addEditorCell(this.createConstantCell5(context, node, "macros:"));
    editorCell.addEditorCell(this.createColumnCell1(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989565");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createRowCell1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.addEditorCell(this.createConstantCell6(context, node, "model"));
    editorCell.addEditorCell(this.createConstantCell7(context, node, "context"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989572");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createColumnCell1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.addEditorCell(this.createRowCell1(context, node));
    editorCell.addEditorCell(this.createRowCell2(context, node));
    editorCell.addEditorCell(this.createRowCell3(context, node));
    editorCell.addEditorCell(this.createRowCell4(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989571");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createRowCell4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.addEditorCell(this.createConstantCell13(context, node, "scope"));
    editorCell.addEditorCell(this.createConstantCell14(context, node, "context (jetbrains.mps.smodel.IScope)"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989583");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createRowCell3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.addEditorCell(this.createConstantCell10(context, node, "referenceNode"));
    editorCell.addEditorCell(this.createColumnCell2(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989578");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createColumnCell2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.addEditorCell(this.createConstantCell11(context, node, "source of the reference link"));
    editorCell.addEditorCell(this.createConstantCell12(context, node, "(optional - may not exist yet)"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989580");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createRowCell2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.addEditorCell(this.createConstantCell8(context, node, "enclosingNode"));
    editorCell.addEditorCell(this.createConstantCell9(context, node, "context"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989575");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(true);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.addEditorCell(this.createConstantCell(context, node, ">"));
    editorCell.addEditorCell(this.createBodyCell(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790978196");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createConstantCell4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989569");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createConstantCell14(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setFontType(MPSFonts.PLAIN);
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989585");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createConstantCell10(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989579");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.getTextLine().setTextColor(Color.blue);
    editorCell.getTextLine().setTextBackgroundColor(Color.lightGray);
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989566");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createConstantCell13(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989584");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createConstantCell7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setFontType(MPSFonts.PLAIN);
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989574");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setFontType(MPSFonts.BOLD);
    editorCell.getTextLine().setTextColor(Color.blue);
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790978197");
    editorCell.setLayoutConstraint("");
    editorCell.putUserObject(EditorCell.ATTRACTS_FOCUS_POLICY, EditorCell.ATTRACTS_FOCUS);
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createConstantCell8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989576");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createConstantCell6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989573");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createConstantCell3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setFontType(MPSFonts.PLAIN);
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989568");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989567");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createConstantCell9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setFontType(MPSFonts.PLAIN);
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989577");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createConstantCell11(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setFontType(MPSFonts.PLAIN);
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989581");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createConstantCell5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setFontType(MPSFonts.PLAIN);
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989570");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createConstantCell12(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setFontType(MPSFonts.PLAIN);
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790989582");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createBodyCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(true);
    editorCell.setBracketsColor(Color.black);
    if(editorCell instanceof EditorCell_Label) {
      EditorCell_Label editorCellLabel = (EditorCell_Label)editorCell;
      editorCellLabel.setEditable(true);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.putUserObject(EditorCell.CELL_ID, "1158790978198");
    editorCell.setLayoutConstraint("");
    ((EditorCell_Basic)editorCell).setParseable(false);
    return editorCell;
  }
  public EditorCell createBodyCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("body");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createBodyCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else 
    return cellWithRole;
  }
}
