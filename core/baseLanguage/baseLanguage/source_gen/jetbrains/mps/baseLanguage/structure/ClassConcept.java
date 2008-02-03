package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class ClassConcept extends Classifier {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ClassConcept";
  public static String EXTENDED_CLASS = "extendedClass";
  public static String NAME = "name";
  public static String ABSTRACT_CLASS = "abstractClass";
  public static String SUPERCLASS = "superclass";
  public static String STATIC_INITIALIZER = "staticInitializer";
  public static String FIELD = "field";
  public static String CONSTRUCTOR = "constructor";
  public static String STATIC_METHOD = "staticMethod";
  public static String IMPLEMENTED_INTERFACE = "implementedInterface";
  public static String STATIC_INNER_CLASSIFIERS = "staticInnerClassifiers";
  public static String PROPERTY = "property";

  public  ClassConcept(SNode node) {
    super(node);
  }

  public static ClassConcept newInstance(SModel sm, boolean init) {
    return (ClassConcept)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassConcept", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ClassConcept newInstance(SModel sm) {
    return ClassConcept.newInstance(sm, false);
  }


  public ClassConcept getExtendedClass() {
    return (ClassConcept)this.getReferent(ClassConcept.EXTENDED_CLASS);
  }

  public void setExtendedClass(ClassConcept node) {
    super.setReferent(ClassConcept.EXTENDED_CLASS, node);
  }

  public String getName() {
    return this.getProperty(ClassConcept.NAME);
  }

  public void setName(String value) {
    this.setProperty(ClassConcept.NAME, value);
  }

  public boolean getAbstractClass() {
    return this.getBooleanProperty(ClassConcept.ABSTRACT_CLASS);
  }

  public void setAbstractClass(boolean value) {
    this.setBooleanProperty(ClassConcept.ABSTRACT_CLASS, value);
  }

  public ClassifierType getSuperclass() {
    return (ClassifierType)this.getChild(ClassConcept.SUPERCLASS);
  }

  public void setSuperclass(ClassifierType node) {
    super.setChild(ClassConcept.SUPERCLASS, node);
  }

  public StatementList getStaticInitializer() {
    return (StatementList)this.getChild(ClassConcept.STATIC_INITIALIZER);
  }

  public void setStaticInitializer(StatementList node) {
    super.setChild(ClassConcept.STATIC_INITIALIZER, node);
  }

  public int getFieldsCount() {
    return this.getChildCount(ClassConcept.FIELD);
  }

  public Iterator<FieldDeclaration> fields() {
    return this.children(ClassConcept.FIELD);
  }

  public List<FieldDeclaration> getFields() {
    return this.getChildren(ClassConcept.FIELD);
  }

  public void addField(FieldDeclaration node) {
    this.addChild(ClassConcept.FIELD, node);
  }

  public void insertField(FieldDeclaration prev, FieldDeclaration node) {
    this.insertChild(prev, ClassConcept.FIELD, node);
  }

  public int getConstructorsCount() {
    return this.getChildCount(ClassConcept.CONSTRUCTOR);
  }

  public Iterator<ConstructorDeclaration> constructors() {
    return this.children(ClassConcept.CONSTRUCTOR);
  }

  public List<ConstructorDeclaration> getConstructors() {
    return this.getChildren(ClassConcept.CONSTRUCTOR);
  }

  public void addConstructor(ConstructorDeclaration node) {
    this.addChild(ClassConcept.CONSTRUCTOR, node);
  }

  public void insertConstructor(ConstructorDeclaration prev, ConstructorDeclaration node) {
    this.insertChild(prev, ClassConcept.CONSTRUCTOR, node);
  }

  public int getStaticMethodsCount() {
    return this.getChildCount(ClassConcept.STATIC_METHOD);
  }

  public Iterator<StaticMethodDeclaration> staticMethods() {
    return this.children(ClassConcept.STATIC_METHOD);
  }

  public List<StaticMethodDeclaration> getStaticMethods() {
    return this.getChildren(ClassConcept.STATIC_METHOD);
  }

  public void addStaticMethod(StaticMethodDeclaration node) {
    this.addChild(ClassConcept.STATIC_METHOD, node);
  }

  public void insertStaticMethod(StaticMethodDeclaration prev, StaticMethodDeclaration node) {
    this.insertChild(prev, ClassConcept.STATIC_METHOD, node);
  }

  public int getImplementedInterfacesCount() {
    return this.getChildCount(ClassConcept.IMPLEMENTED_INTERFACE);
  }

  public Iterator<ClassifierType> implementedInterfaces() {
    return this.children(ClassConcept.IMPLEMENTED_INTERFACE);
  }

  public List<ClassifierType> getImplementedInterfaces() {
    return this.getChildren(ClassConcept.IMPLEMENTED_INTERFACE);
  }

  public void addImplementedInterface(ClassifierType node) {
    this.addChild(ClassConcept.IMPLEMENTED_INTERFACE, node);
  }

  public void insertImplementedInterface(ClassifierType prev, ClassifierType node) {
    this.insertChild(prev, ClassConcept.IMPLEMENTED_INTERFACE, node);
  }

  public int getStaticInnerClassifiersesCount() {
    return this.getChildCount(ClassConcept.STATIC_INNER_CLASSIFIERS);
  }

  public Iterator<Classifier> staticInnerClassifierses() {
    return this.children(ClassConcept.STATIC_INNER_CLASSIFIERS);
  }

  public List<Classifier> getStaticInnerClassifierses() {
    return this.getChildren(ClassConcept.STATIC_INNER_CLASSIFIERS);
  }

  public void addStaticInnerClassifiers(Classifier node) {
    this.addChild(ClassConcept.STATIC_INNER_CLASSIFIERS, node);
  }

  public void insertStaticInnerClassifiers(Classifier prev, Classifier node) {
    this.insertChild(prev, ClassConcept.STATIC_INNER_CLASSIFIERS, node);
  }

  public int getPropertysCount() {
    return this.getChildCount(ClassConcept.PROPERTY);
  }

  public Iterator<Property> propertys() {
    return this.children(ClassConcept.PROPERTY);
  }

  public List<Property> getPropertys() {
    return this.getChildren(ClassConcept.PROPERTY);
  }

  public void addProperty(Property node) {
    this.addChild(ClassConcept.PROPERTY, node);
  }

  public void insertProperty(Property prev, Property node) {
    this.insertChild(prev, ClassConcept.PROPERTY, node);
  }

}
