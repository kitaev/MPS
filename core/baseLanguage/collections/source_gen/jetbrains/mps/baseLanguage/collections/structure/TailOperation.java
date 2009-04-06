package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.collections.structure.ChunkOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TailOperation extends ChunkOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.TailOperation";

  public TailOperation(SNode node) {
    super(node);
  }

  public static TailOperation newInstance(SModel sm, boolean init) {
    return (TailOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.TailOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TailOperation newInstance(SModel sm) {
    return TailOperation.newInstance(sm, false);
  }

}
