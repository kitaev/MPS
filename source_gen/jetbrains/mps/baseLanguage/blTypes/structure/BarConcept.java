package jetbrains.mps.baseLanguage.blTypes.structure;

/*Generated by MPS  */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BarConcept extends BaseConcept {

  public  BarConcept(SNode node) {
    super(node);
  }

  public static BarConcept newInstance(SModel sm, boolean init) {
    return (BarConcept)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.blTypes.BarConcept", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static BarConcept newInstance(SModel sm) {
    return BarConcept.newInstance(sm, false);
  }
}
