package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.textGen.structure.UnitConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AnonymousClass extends ClassConcept implements IMethodCall, IAnonymousClass, IControlFlowInterrupter, UnitConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.AnonymousClass";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String CLASSIFIER = "classifier";
  public static final String BASE_METHOD_DECLARATION = "baseMethodDeclaration";
  public static final String PARAMETER = "parameter";
  public static final String TYPE_PARAMETER = "typeParameter";
  public static final String ACTUAL_ARGUMENT = "actualArgument";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public AnonymousClass(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(AnonymousClass.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(AnonymousClass.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(AnonymousClass.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(AnonymousClass.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(AnonymousClass.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(AnonymousClass.VIRTUAL_PACKAGE, value);
  }

  public Classifier getClassifier() {
    return (Classifier) this.getReferent(Classifier.class, AnonymousClass.CLASSIFIER);
  }

  public void setClassifier(Classifier node) {
    super.setReferent(AnonymousClass.CLASSIFIER, node);
  }

  public BaseMethodDeclaration getBaseMethodDeclaration() {
    return (BaseMethodDeclaration) this.getReferent(BaseMethodDeclaration.class, AnonymousClass.BASE_METHOD_DECLARATION);
  }

  public void setBaseMethodDeclaration(BaseMethodDeclaration node) {
    super.setReferent(AnonymousClass.BASE_METHOD_DECLARATION, node);
  }

  public ConstructorDeclaration getConstructorDeclaration() {
    return this.ensureAdapter(ConstructorDeclaration.class, "baseMethodDeclaration", this.getBaseMethodDeclaration());
  }

  public void setConstructorDeclaration(ConstructorDeclaration node) {
    this.setBaseMethodDeclaration(node);
  }

  public int getParametersCount() {
    return this.getChildCount(AnonymousClass.PARAMETER);
  }

  public Iterator<Expression> parameters() {
    return this.children(Expression.class, AnonymousClass.PARAMETER);
  }

  public List<Expression> getParameters() {
    return this.getChildren(Expression.class, AnonymousClass.PARAMETER);
  }

  public void addParameter(Expression node) {
    this.addChild(AnonymousClass.PARAMETER, node);
  }

  public void insertParameter(Expression prev, Expression node) {
    this.insertChild(prev, AnonymousClass.PARAMETER, node);
  }

  public int getTypeParametersCount() {
    return this.getChildCount(AnonymousClass.TYPE_PARAMETER);
  }

  public Iterator<Type> typeParameters() {
    return this.children(Type.class, AnonymousClass.TYPE_PARAMETER);
  }

  public List<Type> getTypeParameters() {
    return this.getChildren(Type.class, AnonymousClass.TYPE_PARAMETER);
  }

  public void addTypeParameter(Type node) {
    this.addChild(AnonymousClass.TYPE_PARAMETER, node);
  }

  public void insertTypeParameter(Type prev, Type node) {
    this.insertChild(prev, AnonymousClass.TYPE_PARAMETER, node);
  }

  public int getActualArgumentsCount() {
    return this.getChildCount(AnonymousClass.ACTUAL_ARGUMENT);
  }

  public Iterator<Expression> actualArguments() {
    return this.children(Expression.class, AnonymousClass.ACTUAL_ARGUMENT);
  }

  public List<Expression> getActualArguments() {
    return this.getChildren(Expression.class, AnonymousClass.ACTUAL_ARGUMENT);
  }

  public void addActualArgument(Expression node) {
    this.addChild(AnonymousClass.ACTUAL_ARGUMENT, node);
  }

  public void insertActualArgument(Expression prev, Expression node) {
    this.insertChild(prev, AnonymousClass.ACTUAL_ARGUMENT, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(AnonymousClass.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, AnonymousClass.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, AnonymousClass.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(AnonymousClass.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, AnonymousClass.SMODEL_ATTRIBUTE, node);
  }

  public static AnonymousClass newInstance(SModel sm, boolean init) {
    return (AnonymousClass) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AnonymousClass", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AnonymousClass newInstance(SModel sm) {
    return AnonymousClass.newInstance(sm, false);
  }
}
