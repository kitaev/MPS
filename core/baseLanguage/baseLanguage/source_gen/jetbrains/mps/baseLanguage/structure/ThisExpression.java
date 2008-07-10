package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ThisExpression extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ThisExpression";
  public static String CLASS_CONCEPT = "classConcept";

  public ThisExpression(SNode node) {
    super(node);
  }

  public static ThisExpression newInstance(SModel sm, boolean init) {
    return (ThisExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ThisExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ThisExpression newInstance(SModel sm) {
    return ThisExpression.newInstance(sm, false);
  }


  public Classifier getClassConcept() {
    return (Classifier)this.getReferent(ThisExpression.CLASS_CONCEPT);
  }

  public void setClassConcept(Classifier node) {
    super.setReferent(ThisExpression.CLASS_CONCEPT, node);
  }

}
