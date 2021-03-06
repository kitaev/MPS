package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Model_GetLongNameOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Model_GetLongNameOperation";

  public Model_GetLongNameOperation(SNode node) {
    super(node);
  }

  public static Model_GetLongNameOperation newInstance(SModel sm, boolean init) {
    return (Model_GetLongNameOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Model_GetLongNameOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Model_GetLongNameOperation newInstance(SModel sm) {
    return Model_GetLongNameOperation.newInstance(sm, false);
  }
}
