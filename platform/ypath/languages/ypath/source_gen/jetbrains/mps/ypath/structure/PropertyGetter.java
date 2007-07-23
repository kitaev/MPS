package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PropertyGetter extends LambdaMethod {

  public  PropertyGetter(SNode node) {
    super(node);
  }

  public static PropertyGetter newInstance(SModel sm, boolean init) {
    return (PropertyGetter)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.PropertyGetter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PropertyGetter newInstance(SModel sm) {
    return PropertyGetter.newInstance(sm, false);
  }

}
