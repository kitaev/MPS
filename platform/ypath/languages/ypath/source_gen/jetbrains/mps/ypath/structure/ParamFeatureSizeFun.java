package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ParamFeatureSizeFun extends FeatureSizeFun implements IParamFeatureFun {

  public  ParamFeatureSizeFun(SNode node) {
    super(node);
  }

  public static ParamFeatureSizeFun newInstance(SModel sm, boolean init) {
    return (ParamFeatureSizeFun)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.ParamFeatureSizeFun", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ParamFeatureSizeFun newInstance(SModel sm) {
    return ParamFeatureSizeFun.newInstance(sm, false);
  }

}
