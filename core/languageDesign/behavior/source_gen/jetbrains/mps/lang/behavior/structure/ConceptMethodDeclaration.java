package jetbrains.mps.lang.behavior.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;
import jetbrains.mps.baseLanguage.structure.IVisible;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Visibility;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptMethodDeclaration extends BaseMethodDeclaration implements IVisible {
  public static final String concept = "jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String IS_VIRTUAL = "isVirtual";
  public static final String IS_PRIVATE = "isPrivate";
  public static final String IS_ABSTRACT = "isAbstract";
  public static final String OVERRIDDEN_METHOD = "overriddenMethod";
  public static final String VISIBILITY = "visibility";

  public ConceptMethodDeclaration(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ConceptMethodDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ConceptMethodDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ConceptMethodDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ConceptMethodDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ConceptMethodDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ConceptMethodDeclaration.VIRTUAL_PACKAGE, value);
  }

  public boolean getIsVirtual() {
    return this.getBooleanProperty(ConceptMethodDeclaration.IS_VIRTUAL);
  }

  public void setIsVirtual(boolean value) {
    this.setBooleanProperty(ConceptMethodDeclaration.IS_VIRTUAL, value);
  }

  public boolean getIsPrivate() {
    return this.getBooleanProperty(ConceptMethodDeclaration.IS_PRIVATE);
  }

  public void setIsPrivate(boolean value) {
    this.setBooleanProperty(ConceptMethodDeclaration.IS_PRIVATE, value);
  }

  public boolean getIsAbstract() {
    return this.getBooleanProperty(ConceptMethodDeclaration.IS_ABSTRACT);
  }

  public void setIsAbstract(boolean value) {
    this.setBooleanProperty(ConceptMethodDeclaration.IS_ABSTRACT, value);
  }

  public ConceptMethodDeclaration getOverriddenMethod() {
    return (ConceptMethodDeclaration)this.getReferent(ConceptMethodDeclaration.class, ConceptMethodDeclaration.OVERRIDDEN_METHOD);
  }

  public void setOverriddenMethod(ConceptMethodDeclaration node) {
    super.setReferent(ConceptMethodDeclaration.OVERRIDDEN_METHOD, node);
  }

  public Visibility getVisibility() {
    return (Visibility)this.getChild(Visibility.class, ConceptMethodDeclaration.VISIBILITY);
  }

  public void setVisibility(Visibility node) {
    super.setChild(ConceptMethodDeclaration.VISIBILITY, node);
  }

  public static ConceptMethodDeclaration newInstance(SModel sm, boolean init) {
    return (ConceptMethodDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptMethodDeclaration newInstance(SModel sm) {
    return ConceptMethodDeclaration.newInstance(sm, false);
  }
}
