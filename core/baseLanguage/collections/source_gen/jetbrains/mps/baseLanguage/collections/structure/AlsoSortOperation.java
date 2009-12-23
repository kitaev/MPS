package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AlsoSortOperation extends SortOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.AlsoSortOperation";

  public AlsoSortOperation(SNode node) {
    super(node);
  }

  public static AlsoSortOperation newInstance(SModel sm, boolean init) {
    return (AlsoSortOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.AlsoSortOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AlsoSortOperation newInstance(SModel sm) {
    return AlsoSortOperation.newInstance(sm, false);
  }
}
