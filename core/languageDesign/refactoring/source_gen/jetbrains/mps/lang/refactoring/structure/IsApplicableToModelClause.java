package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IsApplicableToModelClause extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.IsApplicableToModelClause";

  public IsApplicableToModelClause(SNode node) {
    super(node);
  }

  public static IsApplicableToModelClause newInstance(SModel sm, boolean init) {
    return (IsApplicableToModelClause) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.IsApplicableToModelClause", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IsApplicableToModelClause newInstance(SModel sm) {
    return IsApplicableToModelClause.newInstance(sm, false);
  }
}
