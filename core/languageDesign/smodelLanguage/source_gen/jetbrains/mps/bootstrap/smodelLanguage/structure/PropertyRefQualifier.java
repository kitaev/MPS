package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.structureLanguage.structure.PropertyDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PropertyRefQualifier extends BaseConcept implements IPropertyAccessQualifier {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.PropertyRefQualifier";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String PROPERTY = "property";

  public PropertyRefQualifier(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(PropertyRefQualifier.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PropertyRefQualifier.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PropertyRefQualifier.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PropertyRefQualifier.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PropertyRefQualifier.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PropertyRefQualifier.VIRTUAL_PACKAGE, value);
  }

  public PropertyDeclaration getProperty() {
    return (PropertyDeclaration)this.getReferent(PropertyRefQualifier.PROPERTY);
  }

  public void setProperty(PropertyDeclaration node) {
    super.setReferent(PropertyRefQualifier.PROPERTY, node);
  }


  public static PropertyRefQualifier newInstance(SModel sm, boolean init) {
    return (PropertyRefQualifier)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.PropertyRefQualifier", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PropertyRefQualifier newInstance(SModel sm) {
    return PropertyRefQualifier.newInstance(sm, false);
  }

}
