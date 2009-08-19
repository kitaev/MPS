package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.ConceptPropertyDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SConceptPropertyAccess extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.SConceptPropertyAccess";
  public static final String CONCEPT_PROPERTY = "conceptProperty";

  public SConceptPropertyAccess(SNode node) {
    super(node);
  }

  public ConceptPropertyDeclaration getConceptProperty() {
    return (ConceptPropertyDeclaration)this.getReferent(ConceptPropertyDeclaration.class, SConceptPropertyAccess.CONCEPT_PROPERTY);
  }

  public void setConceptProperty(ConceptPropertyDeclaration node) {
    super.setReferent(SConceptPropertyAccess.CONCEPT_PROPERTY, node);
  }

  public static SConceptPropertyAccess newInstance(SModel sm, boolean init) {
    return (SConceptPropertyAccess)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SConceptPropertyAccess", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SConceptPropertyAccess newInstance(SModel sm) {
    return SConceptPropertyAccess.newInstance(sm, false);
  }
}
