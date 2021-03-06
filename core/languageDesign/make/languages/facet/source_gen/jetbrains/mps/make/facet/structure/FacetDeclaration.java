package jetbrains.mps.make.facet.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.baseLanguage.structure.IWillBeClassifier;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FacetDeclaration extends BaseConcept implements INamedConcept, IWillBeClassifier {
  public static final String concept = "jetbrains.mps.make.facet.structure.FacetDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String EXTENDED = "extended";
  public static final String REQUIRED = "required";
  public static final String OPTIONAL = "optional";
  public static final String TARGET_DECLARATION = "targetDeclaration";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public FacetDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(FacetDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(FacetDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(FacetDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(FacetDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(FacetDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(FacetDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(FacetDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(FacetDeclaration.VIRTUAL_PACKAGE, value);
  }

  public int getExtendedsCount() {
    return this.getChildCount(FacetDeclaration.EXTENDED);
  }

  public Iterator<ExtendsFacetReference> extendeds() {
    return this.children(ExtendsFacetReference.class, FacetDeclaration.EXTENDED);
  }

  public List<ExtendsFacetReference> getExtendeds() {
    return this.getChildren(ExtendsFacetReference.class, FacetDeclaration.EXTENDED);
  }

  public void addExtended(ExtendsFacetReference node) {
    this.addChild(FacetDeclaration.EXTENDED, node);
  }

  public void insertExtended(ExtendsFacetReference prev, ExtendsFacetReference node) {
    this.insertChild(prev, FacetDeclaration.EXTENDED, node);
  }

  public int getRequiredsCount() {
    return this.getChildCount(FacetDeclaration.REQUIRED);
  }

  public Iterator<RelatedFacetReference> requireds() {
    return this.children(RelatedFacetReference.class, FacetDeclaration.REQUIRED);
  }

  public List<RelatedFacetReference> getRequireds() {
    return this.getChildren(RelatedFacetReference.class, FacetDeclaration.REQUIRED);
  }

  public void addRequired(RelatedFacetReference node) {
    this.addChild(FacetDeclaration.REQUIRED, node);
  }

  public void insertRequired(RelatedFacetReference prev, RelatedFacetReference node) {
    this.insertChild(prev, FacetDeclaration.REQUIRED, node);
  }

  public int getOptionalsCount() {
    return this.getChildCount(FacetDeclaration.OPTIONAL);
  }

  public Iterator<RelatedFacetReference> optionals() {
    return this.children(RelatedFacetReference.class, FacetDeclaration.OPTIONAL);
  }

  public List<RelatedFacetReference> getOptionals() {
    return this.getChildren(RelatedFacetReference.class, FacetDeclaration.OPTIONAL);
  }

  public void addOptional(RelatedFacetReference node) {
    this.addChild(FacetDeclaration.OPTIONAL, node);
  }

  public void insertOptional(RelatedFacetReference prev, RelatedFacetReference node) {
    this.insertChild(prev, FacetDeclaration.OPTIONAL, node);
  }

  public int getTargetDeclarationsCount() {
    return this.getChildCount(FacetDeclaration.TARGET_DECLARATION);
  }

  public Iterator<TargetDeclaration> targetDeclarations() {
    return this.children(TargetDeclaration.class, FacetDeclaration.TARGET_DECLARATION);
  }

  public List<TargetDeclaration> getTargetDeclarations() {
    return this.getChildren(TargetDeclaration.class, FacetDeclaration.TARGET_DECLARATION);
  }

  public void addTargetDeclaration(TargetDeclaration node) {
    this.addChild(FacetDeclaration.TARGET_DECLARATION, node);
  }

  public void insertTargetDeclaration(TargetDeclaration prev, TargetDeclaration node) {
    this.insertChild(prev, FacetDeclaration.TARGET_DECLARATION, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(FacetDeclaration.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, FacetDeclaration.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, FacetDeclaration.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(FacetDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, FacetDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public static FacetDeclaration newInstance(SModel sm, boolean init) {
    return (FacetDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.facet.structure.FacetDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FacetDeclaration newInstance(SModel sm) {
    return FacetDeclaration.newInstance(sm, false);
  }
}
