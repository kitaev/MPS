package jetbrains.mps.lang.behavior.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.baseLanguage.structure.IMemberContainer;
import jetbrains.mps.baseLanguage.structure.IExtractMethodAvailable;
import jetbrains.mps.baseLanguage.structure.IStaticContainerForMethods;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.lang.behavior.structure.ConceptConstructorDeclaration;
import jetbrains.mps.lang.constraints.structure.NodeDefaultSearchScope;
import jetbrains.mps.lang.constraints.structure.ConstraintFunction_CanBeAChild;
import jetbrains.mps.lang.constraints.structure.ConstraintFunction_CanBeAParent;
import java.util.Iterator;
import jetbrains.mps.lang.constraints.structure.NodePropertyConstraint;
import java.util.List;
import jetbrains.mps.lang.constraints.structure.NodeReferentConstraint;
import jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration;
import jetbrains.mps.lang.behavior.structure.StaticConceptMethodDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptBehavior extends BaseConcept implements INamedConcept, IMemberContainer, IExtractMethodAvailable, IStaticContainerForMethods {
  public static final String concept = "jetbrains.mps.lang.behavior.structure.ConceptBehavior";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NAME = "name";
  public static final String CONCEPT = "concept";
  public static final String DEFAULT_CONCRETE_CONCEPT = "defaultConcreteConcept";
  public static final String CONSTRUCTOR = "constructor";
  public static final String DEFAULT_SCOPE = "defaultScope";
  public static final String CAN_BE_A_CHILD = "canBeAChild";
  public static final String CAN_BE_A_PARENT = "canBeAParent";
  public static final String PROPERTIES = "properties";
  public static final String REFERENCES = "references";
  public static final String METHOD = "method";
  public static final String STATIC_METHOD = "staticMethod";

  public ConceptBehavior(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ConceptBehavior.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ConceptBehavior.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ConceptBehavior.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ConceptBehavior.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ConceptBehavior.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ConceptBehavior.VIRTUAL_PACKAGE, value);
  }

  public String getName() {
    return this.getProperty(ConceptBehavior.NAME);
  }

  public void setName(String value) {
    this.setProperty(ConceptBehavior.NAME, value);
  }

  public AbstractConceptDeclaration getConcept() {
    return (AbstractConceptDeclaration)this.getReferent(AbstractConceptDeclaration.class, ConceptBehavior.CONCEPT);
  }

  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(ConceptBehavior.CONCEPT, node);
  }

  public ConceptDeclaration getDefaultConcreteConcept() {
    return (ConceptDeclaration)this.getReferent(ConceptDeclaration.class, ConceptBehavior.DEFAULT_CONCRETE_CONCEPT);
  }

  public void setDefaultConcreteConcept(ConceptDeclaration node) {
    super.setReferent(ConceptBehavior.DEFAULT_CONCRETE_CONCEPT, node);
  }

  public ConceptConstructorDeclaration getConstructor() {
    return (ConceptConstructorDeclaration)this.getChild(ConceptConstructorDeclaration.class, ConceptBehavior.CONSTRUCTOR);
  }

  public void setConstructor(ConceptConstructorDeclaration node) {
    super.setChild(ConceptBehavior.CONSTRUCTOR, node);
  }

  public NodeDefaultSearchScope getDefaultScope() {
    return (NodeDefaultSearchScope)this.getChild(NodeDefaultSearchScope.class, ConceptBehavior.DEFAULT_SCOPE);
  }

  public void setDefaultScope(NodeDefaultSearchScope node) {
    super.setChild(ConceptBehavior.DEFAULT_SCOPE, node);
  }

  public ConstraintFunction_CanBeAChild getCanBeAChild() {
    return (ConstraintFunction_CanBeAChild)this.getChild(ConstraintFunction_CanBeAChild.class, ConceptBehavior.CAN_BE_A_CHILD);
  }

  public void setCanBeAChild(ConstraintFunction_CanBeAChild node) {
    super.setChild(ConceptBehavior.CAN_BE_A_CHILD, node);
  }

  public ConstraintFunction_CanBeAParent getCanBeAParent() {
    return (ConstraintFunction_CanBeAParent)this.getChild(ConstraintFunction_CanBeAParent.class, ConceptBehavior.CAN_BE_A_PARENT);
  }

  public void setCanBeAParent(ConstraintFunction_CanBeAParent node) {
    super.setChild(ConceptBehavior.CAN_BE_A_PARENT, node);
  }

  public int getPropertiesesCount() {
    return this.getChildCount(ConceptBehavior.PROPERTIES);
  }

  public Iterator<NodePropertyConstraint> propertieses() {
    return this.children(NodePropertyConstraint.class, ConceptBehavior.PROPERTIES);
  }

  public List<NodePropertyConstraint> getPropertieses() {
    return this.getChildren(NodePropertyConstraint.class, ConceptBehavior.PROPERTIES);
  }

  public void addProperties(NodePropertyConstraint node) {
    this.addChild(ConceptBehavior.PROPERTIES, node);
  }

  public void insertProperties(NodePropertyConstraint prev, NodePropertyConstraint node) {
    this.insertChild(prev, ConceptBehavior.PROPERTIES, node);
  }

  public int getReferencesesCount() {
    return this.getChildCount(ConceptBehavior.REFERENCES);
  }

  public Iterator<NodeReferentConstraint> referenceses() {
    return this.children(NodeReferentConstraint.class, ConceptBehavior.REFERENCES);
  }

  public List<NodeReferentConstraint> getReferenceses() {
    return this.getChildren(NodeReferentConstraint.class, ConceptBehavior.REFERENCES);
  }

  public void addReferences(NodeReferentConstraint node) {
    this.addChild(ConceptBehavior.REFERENCES, node);
  }

  public void insertReferences(NodeReferentConstraint prev, NodeReferentConstraint node) {
    this.insertChild(prev, ConceptBehavior.REFERENCES, node);
  }

  public int getMethodsCount() {
    return this.getChildCount(ConceptBehavior.METHOD);
  }

  public Iterator<ConceptMethodDeclaration> methods() {
    return this.children(ConceptMethodDeclaration.class, ConceptBehavior.METHOD);
  }

  public List<ConceptMethodDeclaration> getMethods() {
    return this.getChildren(ConceptMethodDeclaration.class, ConceptBehavior.METHOD);
  }

  public void addMethod(ConceptMethodDeclaration node) {
    this.addChild(ConceptBehavior.METHOD, node);
  }

  public void insertMethod(ConceptMethodDeclaration prev, ConceptMethodDeclaration node) {
    this.insertChild(prev, ConceptBehavior.METHOD, node);
  }

  public int getStaticMethodsCount() {
    return this.getChildCount(ConceptBehavior.STATIC_METHOD);
  }

  public Iterator<StaticConceptMethodDeclaration> staticMethods() {
    return this.children(StaticConceptMethodDeclaration.class, ConceptBehavior.STATIC_METHOD);
  }

  public List<StaticConceptMethodDeclaration> getStaticMethods() {
    return this.getChildren(StaticConceptMethodDeclaration.class, ConceptBehavior.STATIC_METHOD);
  }

  public void addStaticMethod(StaticConceptMethodDeclaration node) {
    this.addChild(ConceptBehavior.STATIC_METHOD, node);
  }

  public void insertStaticMethod(StaticConceptMethodDeclaration prev, StaticConceptMethodDeclaration node) {
    this.insertChild(prev, ConceptBehavior.STATIC_METHOD, node);
  }


  public static ConceptBehavior newInstance(SModel sm, boolean init) {
    return (ConceptBehavior)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.behavior.structure.ConceptBehavior", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptBehavior newInstance(SModel sm) {
    return ConceptBehavior.newInstance(sm, false);
  }

}
