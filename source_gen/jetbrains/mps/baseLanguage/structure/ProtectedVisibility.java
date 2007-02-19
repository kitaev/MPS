package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ProtectedVisibility extends Visibility {

  public  ProtectedVisibility(SNode node) {
    super(node);
  }

  public static ProtectedVisibility newInstance(SModel sm, boolean init) {
    return (ProtectedVisibility)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ProtectedVisibility", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static ProtectedVisibility newInstance(SModel sm) {
    return ProtectedVisibility.newInstance(sm, false);
  }
}
