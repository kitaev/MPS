package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LinkAttributeQualifier extends AttributeQualifier {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.LinkAttributeQualifier";
  public static final String ATTRIBUTE_CONCEPT = "attributeConcept";
  public static final String LINK_QUALIFIER = "linkQualifier";

  public LinkAttributeQualifier(SNode node) {
    super(node);
  }

  public ConceptDeclaration getAttributeConcept() {
    return (ConceptDeclaration) this.getReferent(ConceptDeclaration.class, LinkAttributeQualifier.ATTRIBUTE_CONCEPT);
  }

  public void setAttributeConcept(ConceptDeclaration node) {
    super.setReferent(LinkAttributeQualifier.ATTRIBUTE_CONCEPT, node);
  }

  public ILinkQualifier getLinkQualifier() {
    return (ILinkQualifier) this.getChild(ILinkQualifier.class, LinkAttributeQualifier.LINK_QUALIFIER);
  }

  public void setLinkQualifier(ILinkQualifier node) {
    super.setChild(LinkAttributeQualifier.LINK_QUALIFIER, node);
  }

  public static LinkAttributeQualifier newInstance(SModel sm, boolean init) {
    return (LinkAttributeQualifier) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.LinkAttributeQualifier", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LinkAttributeQualifier newInstance(SModel sm) {
    return LinkAttributeQualifier.newInstance(sm, false);
  }
}
