package jetbrains.mps.logging.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UpdateModelClause extends ConceptFunction {

  public  UpdateModelClause(SNode node) {
    super(node);
  }

  public static UpdateModelClause newInstance(SModel sm, boolean init) {
    return (UpdateModelClause)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.logging.refactoring.structure.UpdateModelClause", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UpdateModelClause newInstance(SModel sm) {
    return UpdateModelClause.newInstance(sm, false);
  }

}
