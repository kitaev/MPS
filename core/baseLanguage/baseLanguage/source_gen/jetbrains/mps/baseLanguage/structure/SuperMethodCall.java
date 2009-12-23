package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SuperMethodCall extends BaseMethodCall {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.SuperMethodCall";

  public SuperMethodCall(SNode node) {
    super(node);
  }

  public InstanceMethodDeclaration getInstanceMethodDeclaration() {
    return this.ensureAdapter(InstanceMethodDeclaration.class, "baseMethodDeclaration", this.getBaseMethodDeclaration());
  }

  public void setInstanceMethodDeclaration(InstanceMethodDeclaration node) {
    this.setBaseMethodDeclaration(node);
  }

  public static SuperMethodCall newInstance(SModel sm, boolean init) {
    return (SuperMethodCall) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.SuperMethodCall", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SuperMethodCall newInstance(SModel sm) {
    return SuperMethodCall.newInstance(sm, false);
  }
}
