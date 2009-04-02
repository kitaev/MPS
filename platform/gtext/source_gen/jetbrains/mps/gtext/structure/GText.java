package jetbrains.mps.gtext.structure;

/*Generated by MPS */

import jetbrains.mps.gtext.structure.GItem;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GText extends GItem {
  public static final String concept = "jetbrains.mps.gtext.structure.GText";
  public static final String TEXT = "text";

  public GText(SNode node) {
    super(node);
  }

  public String getText() {
    return this.getProperty(GText.TEXT);
  }

  public void setText(String value) {
    this.setProperty(GText.TEXT, value);
  }


  public static GText newInstance(SModel sm, boolean init) {
    return (GText)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.gtext.structure.GText", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GText newInstance(SModel sm) {
    return GText.newInstance(sm, false);
  }

}
