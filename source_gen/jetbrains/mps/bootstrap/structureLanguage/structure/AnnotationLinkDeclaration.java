package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AnnotationLinkDeclaration extends LinkDeclaration implements INamedConcept {
  public static String NAME = "name";
  public static String STEREOTYPE = "stereotype";
  public static String SOURCE = "source";

  public  AnnotationLinkDeclaration(SNode node) {
    super(node);
  }

  public static AnnotationLinkDeclaration newInstance(SModel sm, boolean init) {
    return (AnnotationLinkDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.AnnotationLinkDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static AnnotationLinkDeclaration newInstance(SModel sm) {
    return AnnotationLinkDeclaration.newInstance(sm, false);
  }

  public String getName() {
    return this.getProperty(AnnotationLinkDeclaration.NAME);
  }
  public void setName(String value) {
    this.setProperty(AnnotationLinkDeclaration.NAME, value);
  }
  public AnnotationLinkStereotype getStereotype() {
    String value = super.getProperty(AnnotationLinkDeclaration.STEREOTYPE);
    return AnnotationLinkStereotype.parseValue(value);
  }
  public void setStereotype(AnnotationLinkStereotype value) {
    super.setProperty(AnnotationLinkDeclaration.STEREOTYPE, value.getValueAsString());
  }
  public ConceptDeclaration getSource() {
    return (ConceptDeclaration)this.getReferent(AnnotationLinkDeclaration.SOURCE);
  }
  public void setSource(ConceptDeclaration node) {
    super.setReferent(AnnotationLinkDeclaration.SOURCE, node);
  }
}
