package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FeatureSizeFun extends ConceptFunction {

  public  FeatureSizeFun(SNode node) {
    super(node);
  }

  public static FeatureSizeFun newInstance(SModel sm, boolean init) {
    return (FeatureSizeFun)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.FeatureSizeFun", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FeatureSizeFun newInstance(SModel sm) {
    return FeatureSizeFun.newInstance(sm, false);
  }

}
