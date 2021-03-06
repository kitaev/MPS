package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodesTestMethod extends BaseMethodDeclaration implements INamedConcept, ITestMethod {
  public static final String concept = "jetbrains.mps.lang.test.structure.NodesTestMethod";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public NodesTestMethod(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(NodesTestMethod.NAME);
  }

  public void setName(String value) {
    this.setProperty(NodesTestMethod.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(NodesTestMethod.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(NodesTestMethod.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(NodesTestMethod.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(NodesTestMethod.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(NodesTestMethod.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(NodesTestMethod.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(NodesTestMethod.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, NodesTestMethod.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, NodesTestMethod.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(NodesTestMethod.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, NodesTestMethod.SMODEL_ATTRIBUTE, node);
  }

  public static NodesTestMethod newInstance(SModel sm, boolean init) {
    return (NodesTestMethod) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.test.structure.NodesTestMethod", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodesTestMethod newInstance(SModel sm) {
    return NodesTestMethod.newInstance(sm, false);
  }
}
