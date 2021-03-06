package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BootstrapActionReference extends ActionReference {
  public static final String concept = "jetbrains.mps.lang.test.structure.BootstrapActionReference";
  public static final String ACTION_ID = "actionId";

  public BootstrapActionReference(SNode node) {
    super(node);
  }

  public String getActionId() {
    return this.getProperty(BootstrapActionReference.ACTION_ID);
  }

  public void setActionId(String value) {
    this.setProperty(BootstrapActionReference.ACTION_ID, value);
  }

  public static BootstrapActionReference newInstance(SModel sm, boolean init) {
    return (BootstrapActionReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.test.structure.BootstrapActionReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BootstrapActionReference newInstance(SModel sm) {
    return BootstrapActionReference.newInstance(sm, false);
  }
}
