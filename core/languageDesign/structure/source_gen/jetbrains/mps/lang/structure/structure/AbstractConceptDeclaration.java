package jetbrains.mps.lang.structure.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.lang.structure.structure.IStructureDeprecatable;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import java.util.List;
import jetbrains.mps.lang.structure.structure.PropertyDeclaration;
import jetbrains.mps.lang.structure.structure.ConceptProperty;
import jetbrains.mps.lang.structure.structure.ConceptLink;
import jetbrains.mps.lang.structure.structure.ConceptPropertyDeclaration;
import jetbrains.mps.lang.structure.structure.ConceptLinkDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractConceptDeclaration extends BaseConcept implements INamedConcept, IStructureDeprecatable {
  public static final String concept = "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String LINK_DECLARATION = "linkDeclaration";
  public static final String PROPERTY_DECLARATION = "propertyDeclaration";
  public static final String CONCEPT_PROPERTY = "conceptProperty";
  public static final String CONCEPT_LINK = "conceptLink";
  public static final String CONCEPT_PROPERTY_DECLARATION = "conceptPropertyDeclaration";
  public static final String CONCEPT_LINK_DECLARATION = "conceptLinkDeclaration";

  public AbstractConceptDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(AbstractConceptDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(AbstractConceptDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(AbstractConceptDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(AbstractConceptDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(AbstractConceptDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(AbstractConceptDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(AbstractConceptDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(AbstractConceptDeclaration.VIRTUAL_PACKAGE, value);
  }

  public int getLinkDeclarationsCount() {
    return this.getChildCount(AbstractConceptDeclaration.LINK_DECLARATION);
  }

  public Iterator<LinkDeclaration> linkDeclarations() {
    return this.children(LinkDeclaration.class, AbstractConceptDeclaration.LINK_DECLARATION);
  }

  public List<LinkDeclaration> getLinkDeclarations() {
    return this.getChildren(LinkDeclaration.class, AbstractConceptDeclaration.LINK_DECLARATION);
  }

  public void addLinkDeclaration(LinkDeclaration node) {
    this.addChild(AbstractConceptDeclaration.LINK_DECLARATION, node);
  }

  public void insertLinkDeclaration(LinkDeclaration prev, LinkDeclaration node) {
    this.insertChild(prev, AbstractConceptDeclaration.LINK_DECLARATION, node);
  }

  public int getPropertyDeclarationsCount() {
    return this.getChildCount(AbstractConceptDeclaration.PROPERTY_DECLARATION);
  }

  public Iterator<PropertyDeclaration> propertyDeclarations() {
    return this.children(PropertyDeclaration.class, AbstractConceptDeclaration.PROPERTY_DECLARATION);
  }

  public List<PropertyDeclaration> getPropertyDeclarations() {
    return this.getChildren(PropertyDeclaration.class, AbstractConceptDeclaration.PROPERTY_DECLARATION);
  }

  public void addPropertyDeclaration(PropertyDeclaration node) {
    this.addChild(AbstractConceptDeclaration.PROPERTY_DECLARATION, node);
  }

  public void insertPropertyDeclaration(PropertyDeclaration prev, PropertyDeclaration node) {
    this.insertChild(prev, AbstractConceptDeclaration.PROPERTY_DECLARATION, node);
  }

  public int getConceptPropertiesCount() {
    return this.getChildCount(AbstractConceptDeclaration.CONCEPT_PROPERTY);
  }

  public Iterator<ConceptProperty> conceptProperties() {
    return this.children(ConceptProperty.class, AbstractConceptDeclaration.CONCEPT_PROPERTY);
  }

  public List<ConceptProperty> getConceptProperties() {
    return this.getChildren(ConceptProperty.class, AbstractConceptDeclaration.CONCEPT_PROPERTY);
  }

  public void addConceptProperty(ConceptProperty node) {
    this.addChild(AbstractConceptDeclaration.CONCEPT_PROPERTY, node);
  }

  public void insertConceptProperty(ConceptProperty prev, ConceptProperty node) {
    this.insertChild(prev, AbstractConceptDeclaration.CONCEPT_PROPERTY, node);
  }

  public int getConceptLinksCount() {
    return this.getChildCount(AbstractConceptDeclaration.CONCEPT_LINK);
  }

  public Iterator<ConceptLink> conceptLinks() {
    return this.children(ConceptLink.class, AbstractConceptDeclaration.CONCEPT_LINK);
  }

  public List<ConceptLink> getConceptLinks() {
    return this.getChildren(ConceptLink.class, AbstractConceptDeclaration.CONCEPT_LINK);
  }

  public void addConceptLink(ConceptLink node) {
    this.addChild(AbstractConceptDeclaration.CONCEPT_LINK, node);
  }

  public void insertConceptLink(ConceptLink prev, ConceptLink node) {
    this.insertChild(prev, AbstractConceptDeclaration.CONCEPT_LINK, node);
  }

  public int getConceptPropertyDeclarationsCount() {
    return this.getChildCount(AbstractConceptDeclaration.CONCEPT_PROPERTY_DECLARATION);
  }

  public Iterator<ConceptPropertyDeclaration> conceptPropertyDeclarations() {
    return this.children(ConceptPropertyDeclaration.class, AbstractConceptDeclaration.CONCEPT_PROPERTY_DECLARATION);
  }

  public List<ConceptPropertyDeclaration> getConceptPropertyDeclarations() {
    return this.getChildren(ConceptPropertyDeclaration.class, AbstractConceptDeclaration.CONCEPT_PROPERTY_DECLARATION);
  }

  public void addConceptPropertyDeclaration(ConceptPropertyDeclaration node) {
    this.addChild(AbstractConceptDeclaration.CONCEPT_PROPERTY_DECLARATION, node);
  }

  public void insertConceptPropertyDeclaration(ConceptPropertyDeclaration prev, ConceptPropertyDeclaration node) {
    this.insertChild(prev, AbstractConceptDeclaration.CONCEPT_PROPERTY_DECLARATION, node);
  }

  public int getConceptLinkDeclarationsCount() {
    return this.getChildCount(AbstractConceptDeclaration.CONCEPT_LINK_DECLARATION);
  }

  public Iterator<ConceptLinkDeclaration> conceptLinkDeclarations() {
    return this.children(ConceptLinkDeclaration.class, AbstractConceptDeclaration.CONCEPT_LINK_DECLARATION);
  }

  public List<ConceptLinkDeclaration> getConceptLinkDeclarations() {
    return this.getChildren(ConceptLinkDeclaration.class, AbstractConceptDeclaration.CONCEPT_LINK_DECLARATION);
  }

  public void addConceptLinkDeclaration(ConceptLinkDeclaration node) {
    this.addChild(AbstractConceptDeclaration.CONCEPT_LINK_DECLARATION, node);
  }

  public void insertConceptLinkDeclaration(ConceptLinkDeclaration prev, ConceptLinkDeclaration node) {
    this.insertChild(prev, AbstractConceptDeclaration.CONCEPT_LINK_DECLARATION, node);
  }


  public static AbstractConceptDeclaration newInstance(SModel sm, boolean init) {
    return (AbstractConceptDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractConceptDeclaration newInstance(SModel sm) {
    return AbstractConceptDeclaration.newInstance(sm, false);
  }

}
