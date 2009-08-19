package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellModel_RefNodeList extends CellModel_ListWithRole {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList";
  public static final String REVERSE = "reverse";
  public static final String ELEMENT_ACTION_MAP = "elementActionMap";
  public static final String ELEMENT_MENU_DESCRIPTOR = "elementMenuDescriptor";
  public static final String FILTER = "filter";

  public CellModel_RefNodeList(SNode node) {
    super(node);
  }

  public boolean getReverse() {
    return this.getBooleanProperty(CellModel_RefNodeList.REVERSE);
  }

  public void setReverse(boolean value) {
    this.setBooleanProperty(CellModel_RefNodeList.REVERSE, value);
  }

  public CellActionMapDeclaration getElementActionMap() {
    return (CellActionMapDeclaration)this.getReferent(CellActionMapDeclaration.class, CellModel_RefNodeList.ELEMENT_ACTION_MAP);
  }

  public void setElementActionMap(CellActionMapDeclaration node) {
    super.setReferent(CellModel_RefNodeList.ELEMENT_ACTION_MAP, node);
  }

  public LinkDeclaration getLinkDeclaration() {
    return this.ensureAdapter(LinkDeclaration.class, "relationDeclaration", this.getRelationDeclaration());
  }

  public void setLinkDeclaration(LinkDeclaration node) {
    this.setRelationDeclaration(node);
  }

  public CellMenuDescriptor getElementMenuDescriptor() {
    return (CellMenuDescriptor)this.getChild(CellMenuDescriptor.class, CellModel_RefNodeList.ELEMENT_MENU_DESCRIPTOR);
  }

  public void setElementMenuDescriptor(CellMenuDescriptor node) {
    super.setChild(CellModel_RefNodeList.ELEMENT_MENU_DESCRIPTOR, node);
  }

  public QueryFunction_NodeListFilter getFilter() {
    return (QueryFunction_NodeListFilter)this.getChild(QueryFunction_NodeListFilter.class, CellModel_RefNodeList.FILTER);
  }

  public void setFilter(QueryFunction_NodeListFilter node) {
    super.setChild(CellModel_RefNodeList.FILTER, node);
  }

  public static CellModel_RefNodeList newInstance(SModel sm, boolean init) {
    return (CellModel_RefNodeList)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellModel_RefNodeList", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellModel_RefNodeList newInstance(SModel sm) {
    return CellModel_RefNodeList.newInstance(sm, false);
  }
}
