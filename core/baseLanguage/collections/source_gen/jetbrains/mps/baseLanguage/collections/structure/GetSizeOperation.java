package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.collections.structure.SequenceOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GetSizeOperation extends SequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation";

  public GetSizeOperation(SNode node) {
    super(node);
  }

  public static GetSizeOperation newInstance(SModel sm, boolean init) {
    return (GetSizeOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GetSizeOperation newInstance(SModel sm) {
    return GetSizeOperation.newInstance(sm, false);
  }

}
