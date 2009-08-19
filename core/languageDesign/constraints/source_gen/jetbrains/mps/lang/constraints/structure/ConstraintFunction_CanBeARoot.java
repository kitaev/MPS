package jetbrains.mps.lang.constraints.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConstraintFunction_CanBeARoot extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.constraints.structure.ConstraintFunction_CanBeARoot";

  public ConstraintFunction_CanBeARoot(SNode node) {
    super(node);
  }

  public static ConstraintFunction_CanBeARoot newInstance(SModel sm, boolean init) {
    return (ConstraintFunction_CanBeARoot)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.constraints.structure.ConstraintFunction_CanBeARoot", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConstraintFunction_CanBeARoot newInstance(SModel sm) {
    return ConstraintFunction_CanBeARoot.newInstance(sm, false);
  }
}
