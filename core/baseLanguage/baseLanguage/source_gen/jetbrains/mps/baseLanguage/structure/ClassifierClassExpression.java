package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ClassifierClassExpression extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ClassifierClassExpression";
  public static final String CLASSIFIER = "classifier";

  public ClassifierClassExpression(SNode node) {
    super(node);
  }

  public Classifier getClassifier() {
    return (Classifier) this.getReferent(Classifier.class, ClassifierClassExpression.CLASSIFIER);
  }

  public void setClassifier(Classifier node) {
    super.setReferent(ClassifierClassExpression.CLASSIFIER, node);
  }

  public static ClassifierClassExpression newInstance(SModel sm, boolean init) {
    return (ClassifierClassExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierClassExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ClassifierClassExpression newInstance(SModel sm) {
    return ClassifierClassExpression.newInstance(sm, false);
  }
}
