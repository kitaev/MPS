package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class BaseMethodDeclaration extends BaseConcept implements INamedConcept, Annotable {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  public static String RETURN_TYPE = "returnType";
  public static String BODY = "body";
  public static String PARAMETER = "parameter";
  public static String THROWS_ITEM = "throwsItem";
  public static String ANNOTATION = "annotation";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String IS_FINAL = "isFinal";

  public  BaseMethodDeclaration(SNode node) {
    super(node);
  }

  public static BaseMethodDeclaration newInstance(SModel sm, boolean init) {
    return (BaseMethodDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BaseMethodDeclaration newInstance(SModel sm) {
    return BaseMethodDeclaration.newInstance(sm, false);
  }


  public Type getReturnType() {
    return (Type)this.getChild(BaseMethodDeclaration.RETURN_TYPE);
  }

  public void setReturnType(Type node) {
    super.setChild(BaseMethodDeclaration.RETURN_TYPE, node);
  }

  public StatementList getBody() {
    return (StatementList)this.getChild(BaseMethodDeclaration.BODY);
  }

  public void setBody(StatementList node) {
    super.setChild(BaseMethodDeclaration.BODY, node);
  }

  public int getParametersCount() {
    return this.getChildCount(BaseMethodDeclaration.PARAMETER);
  }

  public Iterator<ParameterDeclaration> parameters() {
    return this.children(BaseMethodDeclaration.PARAMETER);
  }

  public List<ParameterDeclaration> getParameters() {
    return this.getChildren(BaseMethodDeclaration.PARAMETER);
  }

  public void addParameter(ParameterDeclaration node) {
    this.addChild(BaseMethodDeclaration.PARAMETER, node);
  }

  public void insertParameter(ParameterDeclaration prev, ParameterDeclaration node) {
    this.insertChild(prev, BaseMethodDeclaration.PARAMETER, node);
  }

  public int getThrowsItemsCount() {
    return this.getChildCount(BaseMethodDeclaration.THROWS_ITEM);
  }

  public Iterator<ClassifierType> throwsItems() {
    return this.children(BaseMethodDeclaration.THROWS_ITEM);
  }

  public List<ClassifierType> getThrowsItems() {
    return this.getChildren(BaseMethodDeclaration.THROWS_ITEM);
  }

  public void addThrowsItem(ClassifierType node) {
    this.addChild(BaseMethodDeclaration.THROWS_ITEM, node);
  }

  public void insertThrowsItem(ClassifierType prev, ClassifierType node) {
    this.insertChild(prev, BaseMethodDeclaration.THROWS_ITEM, node);
  }

  public int getAnnotationsCount() {
    return this.getChildCount(BaseMethodDeclaration.ANNOTATION);
  }

  public Iterator<AnnotationInstance> annotations() {
    return this.children(BaseMethodDeclaration.ANNOTATION);
  }

  public List<AnnotationInstance> getAnnotations() {
    return this.getChildren(BaseMethodDeclaration.ANNOTATION);
  }

  public void addAnnotation(AnnotationInstance node) {
    this.addChild(BaseMethodDeclaration.ANNOTATION, node);
  }

  public void insertAnnotation(AnnotationInstance prev, AnnotationInstance node) {
    this.insertChild(prev, BaseMethodDeclaration.ANNOTATION, node);
  }

  public String getName() {
    return this.getProperty(BaseMethodDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(BaseMethodDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(BaseMethodDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BaseMethodDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BaseMethodDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BaseMethodDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BaseMethodDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BaseMethodDeclaration.VIRTUAL_PACKAGE, value);
  }

  public boolean getIsFinal() {
    return this.getBooleanProperty(BaseMethodDeclaration.IS_FINAL);
  }

  public void setIsFinal(boolean value) {
    this.setBooleanProperty(BaseMethodDeclaration.IS_FINAL, value);
  }

}
