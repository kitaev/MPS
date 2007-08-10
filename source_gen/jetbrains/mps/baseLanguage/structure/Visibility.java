package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Visibility extends BaseConcept {

  public  Visibility(SNode node) {
    super(node);
  }

  public static Visibility newInstance(SModel sm, boolean init) {
    return (Visibility)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.Visibility", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Visibility newInstance(SModel sm) {
    return Visibility.newInstance(sm, false);
  }

}
