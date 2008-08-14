package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LinkRefQualifier extends BaseConcept implements ILinkAccessQualifier {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.LinkRefQualifier";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String LINK = "link";

  public LinkRefQualifier(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(LinkRefQualifier.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(LinkRefQualifier.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(LinkRefQualifier.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(LinkRefQualifier.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(LinkRefQualifier.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(LinkRefQualifier.VIRTUAL_PACKAGE, value);
  }

  public LinkDeclaration getLink() {
    return (LinkDeclaration)this.getReferent(LinkRefQualifier.LINK);
  }

  public void setLink(LinkDeclaration node) {
    super.setReferent(LinkRefQualifier.LINK, node);
  }


  public static LinkRefQualifier newInstance(SModel sm, boolean init) {
    return (LinkRefQualifier)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.LinkRefQualifier", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LinkRefQualifier newInstance(SModel sm) {
    return LinkRefQualifier.newInstance(sm, false);
  }

}
