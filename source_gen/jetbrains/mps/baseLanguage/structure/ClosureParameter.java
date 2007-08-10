package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.NamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ClosureParameter extends NamedConcept {

  public  ClosureParameter(SNode node) {
    super(node);
  }

  public static ClosureParameter newInstance(SModel sm, boolean init) {
    return (ClosureParameter)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClosureParameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ClosureParameter newInstance(SModel sm) {
    return ClosureParameter.newInstance(sm, false);
  }

}
