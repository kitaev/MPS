package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ReferenceMacro extends AbstractMacro {
  public static final String concept = "jetbrains.mps.lang.generator.structure.ReferenceMacro";
  public static final String REFERENT_FUNCTION = "referentFunction";

  public ReferenceMacro(SNode node) {
    super(node);
  }

  public ReferenceMacro_GetReferent getReferentFunction() {
    return (ReferenceMacro_GetReferent)this.getChild(ReferenceMacro_GetReferent.class, ReferenceMacro.REFERENT_FUNCTION);
  }

  public void setReferentFunction(ReferenceMacro_GetReferent node) {
    super.setChild(ReferenceMacro.REFERENT_FUNCTION, node);
  }

  public static ReferenceMacro newInstance(SModel sm, boolean init) {
    return (ReferenceMacro)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.ReferenceMacro", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ReferenceMacro newInstance(SModel sm) {
    return ReferenceMacro.newInstance(sm, false);
  }
}
