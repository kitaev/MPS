package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TestNodeAnnotation extends INodeAnnotattion implements INamedConcept {
  public static final String concept = "jetbrains.mps.lang.test.structure.TestNodeAnnotation";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public TestNodeAnnotation(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(TestNodeAnnotation.NAME);
  }

  public void setName(String value) {
    this.setProperty(TestNodeAnnotation.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(TestNodeAnnotation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TestNodeAnnotation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TestNodeAnnotation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TestNodeAnnotation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TestNodeAnnotation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TestNodeAnnotation.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(TestNodeAnnotation.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, TestNodeAnnotation.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, TestNodeAnnotation.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(TestNodeAnnotation.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, TestNodeAnnotation.SMODEL_ATTRIBUTE, node);
  }

  public static TestNodeAnnotation newInstance(SModel sm, boolean init) {
    return (TestNodeAnnotation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.test.structure.TestNodeAnnotation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TestNodeAnnotation newInstance(SModel sm) {
    return TestNodeAnnotation.newInstance(sm, false);
  }
}
