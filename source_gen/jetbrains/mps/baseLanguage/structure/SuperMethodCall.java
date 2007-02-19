package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SuperMethodCall extends BaseMethodCall {

  public  SuperMethodCall(SNode node) {
    super(node);
  }

  public static SuperMethodCall newInstance(SModel sm, boolean init) {
    return (SuperMethodCall)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.SuperMethodCall", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static SuperMethodCall newInstance(SModel sm) {
    return SuperMethodCall.newInstance(sm, false);
  }

  public InstanceMethodDeclaration getInstanceMethodDeclaration() {
    return (InstanceMethodDeclaration)this.getBaseMethodDeclaration();
  }
  public void setInstanceMethodDeclaration(InstanceMethodDeclaration node) {
    this.setBaseMethodDeclaration(node);
  }
}
