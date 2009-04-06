package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.collections.structure.AbstractIteratorOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class HasNextOperation extends AbstractIteratorOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.HasNextOperation";

  public HasNextOperation(SNode node) {
    super(node);
  }

  public static HasNextOperation newInstance(SModel sm, boolean init) {
    return (HasNextOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.HasNextOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static HasNextOperation newInstance(SModel sm) {
    return HasNextOperation.newInstance(sm, false);
  }

}
