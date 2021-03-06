package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ExternalOptionReference extends BaseConcept {
  public static final String concept = "jetbrains.mps.bash.structure.ExternalOptionReference";

  public ExternalOptionReference(SNode node) {
    super(node);
  }

  public static ExternalOptionReference newInstance(SModel sm, boolean init) {
    return (ExternalOptionReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.ExternalOptionReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ExternalOptionReference newInstance(SModel sm) {
    return ExternalOptionReference.newInstance(sm, false);
  }
}
