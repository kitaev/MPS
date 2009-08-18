package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IsNotEmptyOperation extends StringBooleanOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.IsNotEmptyOperation";

  public IsNotEmptyOperation(SNode node) {
    super(node);
  }


  public static IsNotEmptyOperation newInstance(SModel sm, boolean init) {
    return (IsNotEmptyOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IsNotEmptyOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IsNotEmptyOperation newInstance(SModel sm) {
    return IsNotEmptyOperation.newInstance(sm, false);
  }
}
