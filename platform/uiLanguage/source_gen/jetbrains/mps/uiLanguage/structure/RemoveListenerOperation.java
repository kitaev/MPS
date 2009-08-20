package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BinaryOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RemoveListenerOperation extends BinaryOperation {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.RemoveListenerOperation";

  public RemoveListenerOperation(SNode node) {
    super(node);
  }

  public static RemoveListenerOperation newInstance(SModel sm, boolean init) {
    return (RemoveListenerOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.RemoveListenerOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RemoveListenerOperation newInstance(SModel sm) {
    return RemoveListenerOperation.newInstance(sm, false);
  }

}
