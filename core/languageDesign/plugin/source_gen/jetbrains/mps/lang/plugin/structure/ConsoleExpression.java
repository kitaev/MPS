package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConsoleExpression extends Expression implements ExecuteSpecific {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ConsoleExpression";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ConsoleExpression(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ConsoleExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ConsoleExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ConsoleExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ConsoleExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ConsoleExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ConsoleExpression.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ConsoleExpression.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ConsoleExpression.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ConsoleExpression.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ConsoleExpression.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ConsoleExpression.SMODEL_ATTRIBUTE, node);
  }

  public static ConsoleExpression newInstance(SModel sm, boolean init) {
    return (ConsoleExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ConsoleExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConsoleExpression newInstance(SModel sm) {
    return ConsoleExpression.newInstance(sm, false);
  }
}
