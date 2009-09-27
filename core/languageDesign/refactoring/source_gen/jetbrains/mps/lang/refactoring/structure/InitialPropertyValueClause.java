package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InitialPropertyValueClause extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.InitialPropertyValueClause";

  public InitialPropertyValueClause(SNode node) {
    super(node);
  }

  public static InitialPropertyValueClause newInstance(SModel sm, boolean init) {
    return (InitialPropertyValueClause)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.InitialPropertyValueClause", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InitialPropertyValueClause newInstance(SModel sm) {
    return InitialPropertyValueClause.newInstance(sm, false);
  }
}
