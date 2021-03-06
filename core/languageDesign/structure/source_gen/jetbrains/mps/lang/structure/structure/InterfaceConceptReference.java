package jetbrains.mps.lang.structure.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InterfaceConceptReference extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.structure.structure.InterfaceConceptReference";
  public static final String INTFC = "intfc";

  public InterfaceConceptReference(SNode node) {
    super(node);
  }

  public InterfaceConceptDeclaration getIntfc() {
    return (InterfaceConceptDeclaration) this.getReferent(InterfaceConceptDeclaration.class, InterfaceConceptReference.INTFC);
  }

  public void setIntfc(InterfaceConceptDeclaration node) {
    super.setReferent(InterfaceConceptReference.INTFC, node);
  }

  public static InterfaceConceptReference newInstance(SModel sm, boolean init) {
    return (InterfaceConceptReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.InterfaceConceptReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InterfaceConceptReference newInstance(SModel sm) {
    return InterfaceConceptReference.newInstance(sm, false);
  }
}
