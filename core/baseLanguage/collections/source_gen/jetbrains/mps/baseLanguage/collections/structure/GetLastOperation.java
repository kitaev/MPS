package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GetLastOperation extends NoArgumentsSequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.GetLastOperation";

  public GetLastOperation(SNode node) {
    super(node);
  }

  public static GetLastOperation newInstance(SModel sm, boolean init) {
    return (GetLastOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.GetLastOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GetLastOperation newInstance(SModel sm) {
    return GetLastOperation.newInstance(sm, false);
  }

}
