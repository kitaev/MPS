package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.collections.structure.AbstractListOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RemoveFirstElementOperation extends AbstractListOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.RemoveFirstElementOperation";

  public RemoveFirstElementOperation(SNode node) {
    super(node);
  }

  public static RemoveFirstElementOperation newInstance(SModel sm, boolean init) {
    return (RemoveFirstElementOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.RemoveFirstElementOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RemoveFirstElementOperation newInstance(SModel sm) {
    return RemoveFirstElementOperation.newInstance(sm, false);
  }

}
