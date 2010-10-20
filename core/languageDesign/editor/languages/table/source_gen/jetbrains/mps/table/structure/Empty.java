package jetbrains.mps.table.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Empty extends BaseConcept {
  public static final String concept = "jetbrains.mps.table.structure.Empty";

  public Empty(SNode node) {
    super(node);
  }

  public static Empty newInstance(SModel sm, boolean init) {
    return (Empty) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.table.structure.Empty", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Empty newInstance(SModel sm) {
    return Empty.newInstance(sm, false);
  }
}
