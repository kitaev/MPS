package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DoUpdateBlock extends UpdateBlock {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.DoUpdateBlock";

  public DoUpdateBlock(SNode node) {
    super(node);
  }

  public static DoUpdateBlock newInstance(SModel sm, boolean init) {
    return (DoUpdateBlock) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.DoUpdateBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DoUpdateBlock newInstance(SModel sm) {
    return DoUpdateBlock.newInstance(sm, false);
  }
}
