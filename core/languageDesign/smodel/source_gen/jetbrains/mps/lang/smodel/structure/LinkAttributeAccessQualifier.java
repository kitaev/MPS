package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AnnotationLinkDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LinkAttributeAccessQualifier extends BaseConcept implements IAttributeAccessQualifier {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.LinkAttributeAccessQualifier";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String ANNOTATION_LINK = "annotationLink";
  public static final String LINK_QUALIFIER = "linkQualifier";

  public LinkAttributeAccessQualifier(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(LinkAttributeAccessQualifier.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(LinkAttributeAccessQualifier.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(LinkAttributeAccessQualifier.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(LinkAttributeAccessQualifier.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(LinkAttributeAccessQualifier.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(LinkAttributeAccessQualifier.VIRTUAL_PACKAGE, value);
  }

  public AnnotationLinkDeclaration getAnnotationLink() {
    return (AnnotationLinkDeclaration)this.getReferent(AnnotationLinkDeclaration.class, LinkAttributeAccessQualifier.ANNOTATION_LINK);
  }

  public void setAnnotationLink(AnnotationLinkDeclaration node) {
    super.setReferent(LinkAttributeAccessQualifier.ANNOTATION_LINK, node);
  }

  public ILinkAccessQualifier getLinkQualifier() {
    return (ILinkAccessQualifier)this.getChild(ILinkAccessQualifier.class, LinkAttributeAccessQualifier.LINK_QUALIFIER);
  }

  public void setLinkQualifier(ILinkAccessQualifier node) {
    super.setChild(LinkAttributeAccessQualifier.LINK_QUALIFIER, node);
  }

  public static LinkAttributeAccessQualifier newInstance(SModel sm, boolean init) {
    return (LinkAttributeAccessQualifier)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.LinkAttributeAccessQualifier", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LinkAttributeAccessQualifier newInstance(SModel sm) {
    return LinkAttributeAccessQualifier.newInstance(sm, false);
  }
}
