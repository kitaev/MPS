package jetbrains.mps.baseLanguage.javadoc.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MethodDocReference extends BaseDocReference {
  public static final String concept = "jetbrains.mps.baseLanguage.javadoc.structure.MethodDocReference";
  public static final String METHOD_DECLARATION = "methodDeclaration";

  public MethodDocReference(SNode node) {
    super(node);
  }

  public BaseMethodDeclaration getMethodDeclaration() {
    return (BaseMethodDeclaration)this.getReferent(BaseMethodDeclaration.class, MethodDocReference.METHOD_DECLARATION);
  }

  public void setMethodDeclaration(BaseMethodDeclaration node) {
    super.setReferent(MethodDocReference.METHOD_DECLARATION, node);
  }

  public static MethodDocReference newInstance(SModel sm, boolean init) {
    return (MethodDocReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.MethodDocReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MethodDocReference newInstance(SModel sm) {
    return MethodDocReference.newInstance(sm, false);
  }
}
