package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptProperty extends BaseConcept {
  public static String CONCEPT_PROPERTY_DECLARATION = "conceptPropertyDeclaration";

  public  ConceptProperty(SNode node) {
    super(node);
  }

  public static ConceptProperty newInstance(SModel sm, boolean init) {
    return (ConceptProperty)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.ConceptProperty", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static ConceptProperty newInstance(SModel sm) {
    return ConceptProperty.newInstance(sm, false);
  }

  public ConceptPropertyDeclaration getConceptPropertyDeclaration() {
    return (ConceptPropertyDeclaration)this.getReferent(ConceptProperty.CONCEPT_PROPERTY_DECLARATION);
  }
  public void setConceptPropertyDeclaration(ConceptPropertyDeclaration node) {
    super.setReferent(ConceptProperty.CONCEPT_PROPERTY_DECLARATION, node);
  }
}
