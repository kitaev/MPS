package jetbrains.mps.make.outlook.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.make.facet.structure.FacetReference;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Outlook extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.make.outlook.structure.Outlook";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String FACET = "facet";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public Outlook(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(Outlook.NAME);
  }

  public void setName(String value) {
    this.setProperty(Outlook.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(Outlook.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Outlook.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Outlook.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Outlook.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Outlook.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Outlook.VIRTUAL_PACKAGE, value);
  }

  public int getFacetsCount() {
    return this.getChildCount(Outlook.FACET);
  }

  public Iterator<FacetReference> facets() {
    return this.children(FacetReference.class, Outlook.FACET);
  }

  public List<FacetReference> getFacets() {
    return this.getChildren(FacetReference.class, Outlook.FACET);
  }

  public void addFacet(FacetReference node) {
    this.addChild(Outlook.FACET, node);
  }

  public void insertFacet(FacetReference prev, FacetReference node) {
    this.insertChild(prev, Outlook.FACET, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(Outlook.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, Outlook.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, Outlook.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(Outlook.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, Outlook.SMODEL_ATTRIBUTE, node);
  }

  public static Outlook newInstance(SModel sm, boolean init) {
    return (Outlook) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.outlook.structure.Outlook", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Outlook newInstance(SModel sm) {
    return Outlook.newInstance(sm, false);
  }
}
