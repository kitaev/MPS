package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GetNextOperation extends AbstractIteratorOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.GetNextOperation";

  public GetNextOperation(SNode node) {
    super(node);
  }

  public static GetNextOperation newInstance(SModel sm, boolean init) {
    return (GetNextOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.GetNextOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GetNextOperation newInstance(SModel sm) {
    return GetNextOperation.newInstance(sm, false);
  }
}
