package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class WhereBlock extends LambdaMethod {

  public  WhereBlock(SNode node) {
    super(node);
  }

  public static WhereBlock newInstance(SModel sm, boolean init) {
    return (WhereBlock)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.WhereBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static WhereBlock newInstance(SModel sm) {
    return WhereBlock.newInstance(sm, false);
  }

}
