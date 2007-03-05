package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;

public class ConceptRefExpression extends Expression {
  public static String CONCEPT_DECLARATION = "conceptDeclaration";

  public  ConceptRefExpression(SNode node) {
    super(node);
  }

  public static ConceptRefExpression newInstance(SModel sm, boolean init) {
    return (ConceptRefExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.ConceptRefExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static ConceptRefExpression newInstance(SModel sm) {
    return ConceptRefExpression.newInstance(sm, false);
  }

  public AbstractConceptDeclaration getConceptDeclaration() {
    return (AbstractConceptDeclaration)this.getReferent(ConceptRefExpression.CONCEPT_DECLARATION);
  }
  public void setConceptDeclaration(AbstractConceptDeclaration node) {
    super.setReferent(ConceptRefExpression.CONCEPT_DECLARATION, node);
  }
}
