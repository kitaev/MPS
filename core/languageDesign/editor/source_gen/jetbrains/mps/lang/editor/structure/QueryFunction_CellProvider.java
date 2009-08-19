package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_CellProvider extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.editor.structure.QueryFunction_CellProvider";

  public QueryFunction_CellProvider(SNode node) {
    super(node);
  }

  public static QueryFunction_CellProvider newInstance(SModel sm, boolean init) {
    return (QueryFunction_CellProvider)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.QueryFunction_CellProvider", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QueryFunction_CellProvider newInstance(SModel sm) {
    return QueryFunction_CellProvider.newInstance(sm, false);
  }
}
