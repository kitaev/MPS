package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_GenericSubstituteMenuPart extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.actions.structure.QueryFunction_GenericSubstituteMenuPart";

  public QueryFunction_GenericSubstituteMenuPart(SNode node) {
    super(node);
  }

  public static QueryFunction_GenericSubstituteMenuPart newInstance(SModel sm, boolean init) {
    return (QueryFunction_GenericSubstituteMenuPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.QueryFunction_GenericSubstituteMenuPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QueryFunction_GenericSubstituteMenuPart newInstance(SModel sm) {
    return QueryFunction_GenericSubstituteMenuPart.newInstance(sm, false);
  }
}
