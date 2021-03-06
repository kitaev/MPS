package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellLayout_Superscript extends CellLayout {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellLayout_Superscript";

  public CellLayout_Superscript(SNode node) {
    super(node);
  }

  public static CellLayout_Superscript newInstance(SModel sm, boolean init) {
    return (CellLayout_Superscript) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellLayout_Superscript", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellLayout_Superscript newInstance(SModel sm) {
    return CellLayout_Superscript.newInstance(sm, false);
  }
}
