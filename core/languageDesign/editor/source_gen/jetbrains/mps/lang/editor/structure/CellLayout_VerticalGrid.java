package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellLayout_VerticalGrid extends CellLayout_Vertical {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellLayout_VerticalGrid";

  public CellLayout_VerticalGrid(SNode node) {
    super(node);
  }

  public static CellLayout_VerticalGrid newInstance(SModel sm, boolean init) {
    return (CellLayout_VerticalGrid)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellLayout_VerticalGrid", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellLayout_VerticalGrid newInstance(SModel sm) {
    return CellLayout_VerticalGrid.newInstance(sm, false);
  }
}
