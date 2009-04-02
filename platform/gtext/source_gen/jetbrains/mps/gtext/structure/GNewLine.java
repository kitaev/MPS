package jetbrains.mps.gtext.structure;

/*Generated by MPS */

import jetbrains.mps.gtext.structure.GItem;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GNewLine extends GItem {
  public static final String concept = "jetbrains.mps.gtext.structure.GNewLine";

  public GNewLine(SNode node) {
    super(node);
  }

  public static GNewLine newInstance(SModel sm, boolean init) {
    return (GNewLine)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.gtext.structure.GNewLine", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GNewLine newInstance(SModel sm) {
    return GNewLine.newInstance(sm, false);
  }

}
