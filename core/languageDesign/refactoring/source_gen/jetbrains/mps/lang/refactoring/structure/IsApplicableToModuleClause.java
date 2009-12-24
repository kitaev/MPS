package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IsApplicableToModuleClause extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.IsApplicableToModuleClause";

  public IsApplicableToModuleClause(SNode node) {
    super(node);
  }

  public static IsApplicableToModuleClause newInstance(SModel sm, boolean init) {
    return (IsApplicableToModuleClause) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.IsApplicableToModuleClause", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IsApplicableToModuleClause newInstance(SModel sm) {
    return IsApplicableToModuleClause.newInstance(sm, false);
  }
}
