package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IndexFunctionParam extends ConceptFunctionParameter {

  public  IndexFunctionParam(SNode node) {
    super(node);
  }

  public static IndexFunctionParam newInstance(SModel sm, boolean init) {
    return (IndexFunctionParam)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.IndexFunctionParam", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IndexFunctionParam newInstance(SModel sm) {
    return IndexFunctionParam.newInstance(sm, false);
  }

}
