package jetbrains.mps.gtext.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GIndentBlock extends GItem {
  public static final String concept = "jetbrains.mps.gtext.structure.GIndentBlock";
  public static String ITEM_LIST = "itemList";

  public GIndentBlock(SNode node) {
    super(node);
  }

  public GItemList getItemList() {
    return (GItemList)this.getChild(GIndentBlock.ITEM_LIST);
  }

  public void setItemList(GItemList node) {
    super.setChild(GIndentBlock.ITEM_LIST, node);
  }


  public static GIndentBlock newInstance(SModel sm, boolean init) {
    return (GIndentBlock)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.gtext.structure.GIndentBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GIndentBlock newInstance(SModel sm) {
    return GIndentBlock.newInstance(sm, false);
  }

}
