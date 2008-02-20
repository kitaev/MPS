package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class ComponentController extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.ComponentController";
  public static String COMPONENT = "component";
  public static String CONSTRUCTOR = "constructor";
  public static String ATTRIBUTE = "attribute";
  public static String COMPONENT_METHOD = "componentMethod";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";

  public  ComponentController(SNode node) {
    super(node);
  }

  public static ComponentController newInstance(SModel sm, boolean init) {
    return (ComponentController)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.ComponentController", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ComponentController newInstance(SModel sm) {
    return ComponentController.newInstance(sm, false);
  }


  public ComponentDeclaration getComponent() {
    return (ComponentDeclaration)this.getReferent(ComponentController.COMPONENT);
  }

  public void setComponent(ComponentDeclaration node) {
    super.setReferent(ComponentController.COMPONENT, node);
  }

  public ComponentConstructor getConstructor() {
    return (ComponentConstructor)this.getChild(ComponentController.CONSTRUCTOR);
  }

  public void setConstructor(ComponentConstructor node) {
    super.setChild(ComponentController.CONSTRUCTOR, node);
  }

  public int getAttributesCount() {
    return this.getChildCount(ComponentController.ATTRIBUTE);
  }

  public Iterator<AttributeDeclaration> attributes() {
    return this.children(ComponentController.ATTRIBUTE);
  }

  public List<AttributeDeclaration> getAttributes() {
    return this.getChildren(ComponentController.ATTRIBUTE);
  }

  public void addAttribute(AttributeDeclaration node) {
    this.addChild(ComponentController.ATTRIBUTE, node);
  }

  public void insertAttribute(AttributeDeclaration prev, AttributeDeclaration node) {
    this.insertChild(prev, ComponentController.ATTRIBUTE, node);
  }

  public int getComponentMethodsCount() {
    return this.getChildCount(ComponentController.COMPONENT_METHOD);
  }

  public Iterator<ComponentMethodDeclaration> componentMethods() {
    return this.children(ComponentController.COMPONENT_METHOD);
  }

  public List<ComponentMethodDeclaration> getComponentMethods() {
    return this.getChildren(ComponentController.COMPONENT_METHOD);
  }

  public void addComponentMethod(ComponentMethodDeclaration node) {
    this.addChild(ComponentController.COMPONENT_METHOD, node);
  }

  public void insertComponentMethod(ComponentMethodDeclaration prev, ComponentMethodDeclaration node) {
    this.insertChild(prev, ComponentController.COMPONENT_METHOD, node);
  }

  public String getName() {
    return this.getProperty(ComponentController.NAME);
  }

  public void setName(String value) {
    this.setProperty(ComponentController.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ComponentController.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ComponentController.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ComponentController.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ComponentController.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ComponentController.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ComponentController.VIRTUAL_PACKAGE, value);
  }

}
