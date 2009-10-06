package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Redirection extends BaseConcept {
  public static final String concept = "jetbrains.mps.bash.structure.Redirection";

  public Redirection(SNode node) {
    super(node);
  }

  public static Redirection newInstance(SModel sm, boolean init) {
    return (Redirection)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.Redirection", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Redirection newInstance(SModel sm) {
    return Redirection.newInstance(sm, false);
  }
}
