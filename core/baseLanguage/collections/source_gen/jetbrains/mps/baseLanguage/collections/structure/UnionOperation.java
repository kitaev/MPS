package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.collections.structure.BinaryOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UnionOperation extends BinaryOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.UnionOperation";

  public UnionOperation(SNode node) {
    super(node);
  }

  public static UnionOperation newInstance(SModel sm, boolean init) {
    return (UnionOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.UnionOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UnionOperation newInstance(SModel sm) {
    return UnionOperation.newInstance(sm, false);
  }

}
