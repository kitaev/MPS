package jetbrains.mps.baseLanguage.classifiers.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BaseClassifierType extends Type {
  public static final String concept = "jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType";

  public BaseClassifierType(SNode node) {
    super(node);
  }

  public static BaseClassifierType newInstance(SModel sm, boolean init) {
    return (BaseClassifierType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BaseClassifierType newInstance(SModel sm) {
    return BaseClassifierType.newInstance(sm, false);
  }
}
