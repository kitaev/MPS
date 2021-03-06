package jetbrains.mps.ui.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.AbstractOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ui.modeling.structure.UIAction;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CallUIActionOperation extends AbstractOperation {
  public static final String concept = "jetbrains.mps.ui.structure.CallUIActionOperation";
  public static final String ACTION = "action";

  public CallUIActionOperation(SNode node) {
    super(node);
  }

  public UIAction getAction() {
    return (UIAction) this.getReferent(UIAction.class, CallUIActionOperation.ACTION);
  }

  public void setAction(UIAction node) {
    super.setReferent(CallUIActionOperation.ACTION, node);
  }

  public static CallUIActionOperation newInstance(SModel sm, boolean init) {
    return (CallUIActionOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.CallUIActionOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CallUIActionOperation newInstance(SModel sm) {
    return CallUIActionOperation.newInstance(sm, false);
  }
}
