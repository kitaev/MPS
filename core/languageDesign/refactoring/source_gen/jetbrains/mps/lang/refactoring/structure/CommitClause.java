package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CommitClause extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.CommitClause";

  public CommitClause(SNode node) {
    super(node);
  }

  public static CommitClause newInstance(SModel sm, boolean init) {
    return (CommitClause) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.CommitClause", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CommitClause newInstance(SModel sm) {
    return CommitClause.newInstance(sm, false);
  }
}
