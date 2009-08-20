package jetbrains.mps.gtext.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GLine extends GItem implements GCompositeItem {
  public static final String concept = "jetbrains.mps.gtext.structure.GLine";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String ITEM = "item";

  public GLine(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(GLine.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(GLine.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(GLine.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(GLine.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(GLine.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(GLine.VIRTUAL_PACKAGE, value);
  }

  public int getItemsCount() {
    return this.getChildCount(GLine.ITEM);
  }

  public Iterator<GItem> items() {
    return this.children(GItem.class, GLine.ITEM);
  }

  public List<GItem> getItems() {
    return this.getChildren(GItem.class, GLine.ITEM);
  }

  public void addItem(GItem node) {
    this.addChild(GLine.ITEM, node);
  }

  public void insertItem(GItem prev, GItem node) {
    this.insertChild(prev, GLine.ITEM, node);
  }

  public static GLine newInstance(SModel sm, boolean init) {
    return (GLine)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.gtext.structure.GLine", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GLine newInstance(SModel sm) {
    return GLine.newInstance(sm, false);
  }
}
