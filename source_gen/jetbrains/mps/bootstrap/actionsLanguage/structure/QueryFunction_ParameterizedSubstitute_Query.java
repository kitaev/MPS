package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_ParameterizedSubstitute_Query extends ConceptFunction {

  public  QueryFunction_ParameterizedSubstitute_Query(SNode node) {
    super(node);
  }

  public static QueryFunction_ParameterizedSubstitute_Query newInstance(SModel sm, boolean init) {
    return (QueryFunction_ParameterizedSubstitute_Query)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_ParameterizedSubstitute_Query", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QueryFunction_ParameterizedSubstitute_Query newInstance(SModel sm) {
    return QueryFunction_ParameterizedSubstitute_Query.newInstance(sm, false);
  }

}
