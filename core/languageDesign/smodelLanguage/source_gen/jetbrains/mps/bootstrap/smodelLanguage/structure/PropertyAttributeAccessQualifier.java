package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.AnnotationLinkDeclaration;

public class PropertyAttributeAccessQualifier extends BaseConcept implements IAttributeAccessQualifier {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.PropertyAttributeAccessQualifier";
  public static String PROPERTY_ARGUMENT = "propertyArgument";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String ANNOTATION_LINK = "annotationLink";

  public  PropertyAttributeAccessQualifier(SNode node) {
    super(node);
  }

  public static PropertyAttributeAccessQualifier newInstance(SModel sm, boolean init) {
    return (PropertyAttributeAccessQualifier)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.PropertyAttributeAccessQualifier", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PropertyAttributeAccessQualifier newInstance(SModel sm) {
    return PropertyAttributeAccessQualifier.newInstance(sm, false);
  }


  public IPropertyAccessQualifier getPropertyArgument() {
    return (IPropertyAccessQualifier)this.getChild(PropertyAttributeAccessQualifier.PROPERTY_ARGUMENT);
  }

  public void setPropertyArgument(IPropertyAccessQualifier node) {
    super.setChild(PropertyAttributeAccessQualifier.PROPERTY_ARGUMENT, node);
  }

  public String getShortDescription() {
    return this.getProperty(PropertyAttributeAccessQualifier.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PropertyAttributeAccessQualifier.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PropertyAttributeAccessQualifier.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PropertyAttributeAccessQualifier.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PropertyAttributeAccessQualifier.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PropertyAttributeAccessQualifier.VIRTUAL_PACKAGE, value);
  }

  public AnnotationLinkDeclaration getAnnotationLink() {
    return (AnnotationLinkDeclaration)this.getReferent(PropertyAttributeAccessQualifier.ANNOTATION_LINK);
  }

  public void setAnnotationLink(AnnotationLinkDeclaration node) {
    super.setReferent(PropertyAttributeAccessQualifier.ANNOTATION_LINK, node);
  }

}
