package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StaticFieldReference extends VariableReference {
  public static String CLASSIFIER = "classifier";

  public  StaticFieldReference(SNode node) {
    super(node);
  }

  public static StaticFieldReference newInstance(SModel sm, boolean init) {
    return (StaticFieldReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.StaticFieldReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static StaticFieldReference newInstance(SModel sm) {
    return StaticFieldReference.newInstance(sm, false);
  }

  public Classifier getClassifier() {
    return (Classifier)this.getReferent(StaticFieldReference.CLASSIFIER);
  }
  public void setClassifier(Classifier node) {
    super.setReferent(StaticFieldReference.CLASSIFIER, node);
  }
  public StaticFieldDeclaration getStaticFieldDeclaration() {
    return (StaticFieldDeclaration)this.getVariableDeclaration();
  }
  public void setStaticFieldDeclaration(StaticFieldDeclaration node) {
    this.setVariableDeclaration(node);
  }
}
