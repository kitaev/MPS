package webr.xml.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CDATA extends Content {
  public static final String concept = "webr.xml.structure.CDATA";
  public static String CONTENT_LIST = "contentList";

  public CDATA(SNode node) {
    super(node);
  }

  public ContentList getContentList() {
    return (ContentList)this.getChild(CDATA.CONTENT_LIST);
  }

  public void setContentList(ContentList node) {
    super.setChild(CDATA.CONTENT_LIST, node);
  }


  public static CDATA newInstance(SModel sm, boolean init) {
    return (CDATA)SModelUtil_new.instantiateConceptDeclaration("webr.xml.structure.CDATA", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CDATA newInstance(SModel sm) {
    return CDATA.newInstance(sm, false);
  }

}
