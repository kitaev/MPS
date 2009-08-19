package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BaseLineCell extends BooleanStyleSheetItem {
  public static final String concept = "jetbrains.mps.lang.editor.structure.BaseLineCell";

  public BaseLineCell(SNode node) {
    super(node);
  }

  public static BaseLineCell newInstance(SModel sm, boolean init) {
    return (BaseLineCell)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.BaseLineCell", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BaseLineCell newInstance(SModel sm) {
    return BaseLineCell.newInstance(sm, false);
  }
}
