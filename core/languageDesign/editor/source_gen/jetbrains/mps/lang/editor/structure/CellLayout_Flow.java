package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellLayout_Flow extends CellLayout {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellLayout_Flow";

  public CellLayout_Flow(SNode node) {
    super(node);
  }

  public static CellLayout_Flow newInstance(SModel sm, boolean init) {
    return (CellLayout_Flow)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellLayout_Flow", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellLayout_Flow newInstance(SModel sm) {
    return CellLayout_Flow.newInstance(sm, false);
  }
}
