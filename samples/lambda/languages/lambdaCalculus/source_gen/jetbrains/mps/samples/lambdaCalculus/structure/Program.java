package jetbrains.mps.samples.lambdaCalculus.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.execution.util.structure.IMainClass;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Program extends BaseConcept implements INamedConcept, IMainClass {
  public static final String concept = "jetbrains.mps.samples.lambdaCalculus.structure.Program";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String EXPRESSION = "expression";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public Program(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(Program.NAME);
  }

  public void setName(String value) {
    this.setProperty(Program.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(Program.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Program.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Program.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Program.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Program.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Program.VIRTUAL_PACKAGE, value);
  }

  public LambdaExpression getExpression() {
    return (LambdaExpression) this.getChild(LambdaExpression.class, Program.EXPRESSION);
  }

  public void setExpression(LambdaExpression node) {
    super.setChild(Program.EXPRESSION, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(Program.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, Program.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, Program.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(Program.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, Program.SMODEL_ATTRIBUTE, node);
  }

  public static Program newInstance(SModel sm, boolean init) {
    return (Program) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.lambdaCalculus.structure.Program", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Program newInstance(SModel sm) {
    return Program.newInstance(sm, false);
  }
}
