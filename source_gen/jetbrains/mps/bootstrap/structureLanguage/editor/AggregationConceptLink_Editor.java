package jetbrains.mps.bootstrap.structureLanguage.editor;

/*Generated by MPS 21.02.2006 16:00:58 */


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;

public class AggregationConceptLink_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createRowCell(context, node);
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    if(Queries.semanticNodeCondition_ConceptLink_LinkDeclaredNotInConceptLinksSection(node, context.getOperationContext())) {
      editorCell.addEditorCell(this.createRowCell1(context, node));
    }
    editorCell.addEditorCell(this.createConceptLinkDeclarationReferenceCell(context, node));
    editorCell.addEditorCell(this.createConstantCell(context, node, "="));
    editorCell.addEditorCell(this.createTargetCell(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1105739124743");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRowCell1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.addEditorCell(this.createErrorCell(context, node));
    editorCell.addEditorCell(this.createLinkNameInErrorMessage(context, node));
    editorCell.addEditorCell(this.createErrorCell1(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1137539511592");
    editorCell.setLayoutConstraint("");
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
    editorCell.putUserObject(EditorCell.CELL_ID, "1105739124746");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createErrorCell(EditorContext context, SNode node) {
    EditorCell_Error editorCell = EditorCell_Error.create(context, node, "link");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1137539537612");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createErrorCell1(EditorContext context, SNode node) {
    EditorCell_Error editorCell = EditorCell_Error.create(context, node, "is declared in obsolete way");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1137539555474");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createLinkNameInErrorMessageinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new AggregationConceptLink_Editor_linkNameInErrorMessage_InlineComponent());
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setDrawBorder(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    if(editorCell instanceof EditorCell_Label) {
      EditorCell_Label editorCellLabel = (EditorCell_Label)editorCell;
      editorCellLabel.setEditable(true);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.putUserObject(EditorCell.CELL_ID, "1137539592946");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createLinkNameInErrorMessage(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("conceptLinkDeclaration");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createLinkNameInErrorMessageinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else 
    return cellWithRole;
  }
  public EditorCell createConceptLinkDeclarationReferenceCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new AggregationConceptLink_Editor_conceptLinkDeclaration_InlineComponent1());
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    if(editorCell instanceof EditorCell_Label) {
      EditorCell_Label editorCellLabel = (EditorCell_Label)editorCell;
      editorCellLabel.setEditable(true);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    AggregationConceptLink_ConceptLinks_Menu.setCellActions(editorCell, node, context);
    editorCell.putUserObject(EditorCell.CELL_ID, "1105739124744");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConceptLinkDeclarationReferenceCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("conceptLinkDeclaration");
    provider.setNoTargetText("<no link>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptLinkDeclarationReferenceCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else 
    return cellWithRole;
  }
  public EditorCell createTargetCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    if(editorCell instanceof EditorCell_Label) {
      EditorCell_Label editorCellLabel = (EditorCell_Label)editorCell;
      editorCellLabel.setEditable(true);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    AggregationConceptLink_ConceptLinkTargets_Menu.setCellActions(editorCell, node, context);
    editorCell.putUserObject(EditorCell.CELL_ID, "1105987989392");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createTargetCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("target");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createTargetCellinternal(context, node, provider);
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
