package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.collections.structure.SequenceOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ToArrayOperation extends SequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.ToArrayOperation";

  public ToArrayOperation(SNode node) {
    super(node);
  }

  public static ToArrayOperation newInstance(SModel sm, boolean init) {
    return (ToArrayOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ToArrayOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ToArrayOperation newInstance(SModel sm) {
    return ToArrayOperation.newInstance(sm, false);
  }

}
