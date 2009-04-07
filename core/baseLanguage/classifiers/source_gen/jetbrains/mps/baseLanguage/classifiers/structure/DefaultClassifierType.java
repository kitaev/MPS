package jetbrains.mps.baseLanguage.classifiers.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.classifiers.structure.IClassifier;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DefaultClassifierType extends BaseClassifierType {
  public static final String concept = "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierType";
  public static final String CLASSIFIER = "classifier";

  public DefaultClassifierType(SNode node) {
    super(node);
  }

  public IClassifier getClassifier() {
    return (IClassifier)this.getReferent(IClassifier.class, DefaultClassifierType.CLASSIFIER);
  }

  public void setClassifier(IClassifier node) {
    super.setReferent(DefaultClassifierType.CLASSIFIER, node);
  }


  public static DefaultClassifierType newInstance(SModel sm, boolean init) {
    return (DefaultClassifierType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DefaultClassifierType newInstance(SModel sm) {
    return DefaultClassifierType.newInstance(sm, false);
  }

}
