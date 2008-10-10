package jetbrains.mps.lang.quotation.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import java.awt.event.KeyEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.quotation.structure.Antiquotation_AnnotationLink;
import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.lang.quotation.structure.ListAntiquotation;
import jetbrains.mps.nodeEditor.cells.EditorCell_Component;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation_AnnotationLink;
import jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.PropertyAccessor;
import jetbrains.mps.lang.quotation.structure.PropertyAntiquotation_AnnotationLink;
import jetbrains.mps.lang.quotation.structure.PropertyAntiquotation;

public class _CreateAntiquotationKeyMap extends EditorCellKeyMap {

  public _CreateAntiquotationKeyMap() {
    this.setApplicableToEveryModel(false);
    EditorCellKeyMapAction action;
    action = new _CreateAntiquotationKeyMap._CreateAntiquotationKeyMap_Action0();
    this.putAction("any", "%", action);
    action = new _CreateAntiquotationKeyMap._CreateAntiquotationKeyMap_Action1();
    this.putAction("any", "*", action);
    action = new _CreateAntiquotationKeyMap._CreateAntiquotationKeyMap_Action2();
    this.putAction("any", "^", action);
    action = new _CreateAntiquotationKeyMap._CreateAntiquotationKeyMap_Action3();
    this.putAction("any", "$", action);
  }
  public static class _CreateAntiquotationKeyMap_Action0 extends EditorCellKeyMapAction {

    public _CreateAntiquotationKeyMap_Action0() {
      this.setShownInPopupMenu(false);
    }

    public String getDescriptionText() {
      return "antiquotation";
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (contextNode.isInstanceOfConcept("jetbrains.mps.lang.quotation.structure.Quotation")) {
        return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      return true;
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode contextNode = editorContext.getSelectedCell().getSNode();
      if (contextNode == null) {
        return;
      }
      if (SNodeOperations.isInstanceOf(contextNode, "jetbrains.mps.lang.quotation.structure.Antiquotation")) {
        SNode attributedNode = SNodeOperations.getParent((contextNode));
        attributedNode.setAttribute(null);
        return;
      }
      SModel model = SNodeOperations.getModel(contextNode);
      if (Antiquotation_AnnotationLink.getAntiquotation((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(contextNode))) != null) {
        contextNode.setAttribute(null);
      } else
      contextNode.setAttribute(SModelOperations.createNewNode(model, "jetbrains.mps.lang.quotation.structure.Antiquotation", null));
    }

    public String getKeyStroke() {
      return " %";
    }

}
  public static class _CreateAntiquotationKeyMap_Action1 extends EditorCellKeyMapAction {

    public _CreateAntiquotationKeyMap_Action1() {
      this.setShownInPopupMenu(false);
    }

    public String getDescriptionText() {
      return "list antiquotation";
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (contextNode.isInstanceOfConcept("jetbrains.mps.lang.quotation.structure.Quotation")) {
        return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      return true;
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode contextNode = editorContext.getSelectedCell().getSNode();
      if (contextNode == null) {
        return;
      }
      if (SNodeOperations.isInstanceOf(contextNode, "jetbrains.mps.lang.quotation.structure.ListAntiquotation")) {
        SNode attributedNode = SNodeOperations.getParent(contextNode);
        assert attributedNode != null;
        attributedNode.setAttribute(null);
        return;
      }
      SModel model = SNodeOperations.getModel(contextNode);
      if (BaseAdapter.isInstance(contextNode.getAttribute(), ListAntiquotation.class)) {
        contextNode.setAttribute(null);
      } else
      contextNode.setAttribute(SModelOperations.createNewNode(model, "jetbrains.mps.lang.quotation.structure.ListAntiquotation", null));
    }

    public String getKeyStroke() {
      return " *";
    }

}
  public static class _CreateAntiquotationKeyMap_Action2 extends EditorCellKeyMapAction {

    public _CreateAntiquotationKeyMap_Action2() {
      this.setShownInPopupMenu(false);
    }

    public String getDescriptionText() {
      return "reference antiquotation";
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (contextNode.isInstanceOfConcept("jetbrains.mps.lang.quotation.structure.Quotation")) {
        return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      return true;
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      EditorCell selectedCell = editorContext.getSelectedCell();
      SNode contextNode = (SNode)selectedCell.getSNode();
      SNode linkNode = (SNode)selectedCell.getUserObject(EditorCell_Component.METAINFO_LINK_DECLARATION);
      if (!(BaseAdapter.isInstance(linkNode, LinkDeclaration.class))) {
        return;
      }
      if (contextNode == null) {
        return;
      }
      SNode link = (SNode)linkNode;
      if (SPropertyOperations.hasValue(link, "metaClass", "aggregation", "reference")) {
        return;
      }
      String role = SPropertyOperations.getString(link, "role");
      if (SNodeOperations.isInstanceOf(contextNode, "jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation")) {
        SNode attributedNode = SNodeOperations.getParent(contextNode);
        assert attributedNode != null;
        ReferenceAntiquotation_AnnotationLink.setReferenceAntiquotation(((BaseConcept)SNodeOperations.getAdapter(attributedNode)), role, null);
        attributedNode.setAttribute(null);
        return;
      }
      SModel model = SNodeOperations.getModel(contextNode);
      if (ReferenceAntiquotation_AnnotationLink.getReferenceAntiquotation(((BaseConcept)SNodeOperations.getAdapter(contextNode)), role) != null) {
        ReferenceAntiquotation_AnnotationLink.setReferenceAntiquotation(((BaseConcept)SNodeOperations.getAdapter(contextNode)), role, null);
      } else
      {
        ReferenceAntiquotation_AnnotationLink.setReferenceAntiquotation(((BaseConcept)SNodeOperations.getAdapter(contextNode)), role, ((ReferenceAntiquotation)SNodeOperations.getAdapter(SModelOperations.createNewNode(model, "jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation", null))));
      }
    }

    public String getKeyStroke() {
      return " ^";
    }

}
  public static class _CreateAntiquotationKeyMap_Action3 extends EditorCellKeyMapAction {

    public _CreateAntiquotationKeyMap_Action3() {
      this.setShownInPopupMenu(false);
    }

    public String getDescriptionText() {
      return "property antiquotation";
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (contextNode.isInstanceOfConcept("jetbrains.mps.lang.quotation.structure.Quotation")) {
        return this.canExecute_internal(keyEvent, editorContext, contextNode, this.getSelectedNodes(editorContext));
      }
      return false;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private boolean canExecute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      return true;
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      EditorCell selectedCell = editorContext.getSelectedCell();
      SNode contextNode = (SNode)selectedCell.getSNode();
      if (contextNode == null) {
        return;
      }
      if (!(selectedCell instanceof EditorCell_Property)) {
        return;
      }
      EditorCell_Property editorCell_Property = (EditorCell_Property)selectedCell;
      String propertyName = ((PropertyAccessor)editorCell_Property.getModelAccessor()).getPropertyName();
      if (SNodeOperations.isInstanceOf(contextNode, "jetbrains.mps.lang.quotation.structure.PropertyAntiquotation")) {
        SNode attributedNode = SNodeOperations.getParent(contextNode);
        assert attributedNode != null;
        PropertyAntiquotation_AnnotationLink.setPropertyAntiquotation(((BaseConcept)SNodeOperations.getAdapter(attributedNode)), propertyName, null);
        attributedNode.setAttribute(null);
        return;
      }
      SModel model = SNodeOperations.getModel(contextNode);
      if (PropertyAntiquotation_AnnotationLink.getPropertyAntiquotation(((BaseConcept)SNodeOperations.getAdapter(contextNode)), propertyName) != null) {
        PropertyAntiquotation_AnnotationLink.setPropertyAntiquotation(((BaseConcept)SNodeOperations.getAdapter(contextNode)), propertyName, null);
      } else
      {
        PropertyAntiquotation_AnnotationLink.setPropertyAntiquotation(((BaseConcept)SNodeOperations.getAdapter(contextNode)), propertyName, ((PropertyAntiquotation)SNodeOperations.getAdapter(SModelOperations.createNewNode(model, "jetbrains.mps.lang.quotation.structure.PropertyAntiquotation", null))));
      }
    }

    public String getKeyStroke() {
      return " $";
    }

}

}
