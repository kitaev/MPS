package jetbrains.mps.debug.sampleLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.execution.util.structure.IMainClass;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class WannabeClass extends BaseConcept implements INamedConcept, IMainClass {
  public static final String concept = "jetbrains.mps.debug.sampleLanguage.structure.WannabeClass";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String METHOD = "method";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public WannabeClass(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(WannabeClass.NAME);
  }

  public void setName(String value) {
    this.setProperty(WannabeClass.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(WannabeClass.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(WannabeClass.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(WannabeClass.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(WannabeClass.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(WannabeClass.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(WannabeClass.VIRTUAL_PACKAGE, value);
  }

  public int getMethodsCount() {
    return this.getChildCount(WannabeClass.METHOD);
  }

  public Iterator<WannabeMethod> methods() {
    return this.children(WannabeMethod.class, WannabeClass.METHOD);
  }

  public List<WannabeMethod> getMethods() {
    return this.getChildren(WannabeMethod.class, WannabeClass.METHOD);
  }

  public void addMethod(WannabeMethod node) {
    this.addChild(WannabeClass.METHOD, node);
  }

  public void insertMethod(WannabeMethod prev, WannabeMethod node) {
    this.insertChild(prev, WannabeClass.METHOD, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(WannabeClass.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, WannabeClass.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, WannabeClass.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(WannabeClass.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, WannabeClass.SMODEL_ATTRIBUTE, node);
  }

  public static WannabeClass newInstance(SModel sm, boolean init) {
    return (WannabeClass) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.debug.sampleLanguage.structure.WannabeClass", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static WannabeClass newInstance(SModel sm) {
    return WannabeClass.newInstance(sm, false);
  }
}
