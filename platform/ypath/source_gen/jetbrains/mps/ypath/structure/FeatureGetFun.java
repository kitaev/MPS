package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FeatureGetFun extends ConceptFunction {
  public static final String concept = "jetbrains.mps.ypath.structure.FeatureGetFun";

  public FeatureGetFun(SNode node) {
    super(node);
  }

  public static FeatureGetFun newInstance(SModel sm, boolean init) {
    return (FeatureGetFun)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.FeatureGetFun", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FeatureGetFun newInstance(SModel sm) {
    return FeatureGetFun.newInstance(sm, false);
  }
}
