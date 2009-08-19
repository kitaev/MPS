package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_ModelAccess_Setter extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.editor.structure.QueryFunction_ModelAccess_Setter";

  public QueryFunction_ModelAccess_Setter(SNode node) {
    super(node);
  }

  public static QueryFunction_ModelAccess_Setter newInstance(SModel sm, boolean init) {
    return (QueryFunction_ModelAccess_Setter)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.QueryFunction_ModelAccess_Setter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QueryFunction_ModelAccess_Setter newInstance(SModel sm) {
    return QueryFunction_ModelAccess_Setter.newInstance(sm, false);
  }
}
