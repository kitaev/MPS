package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MultiLineString extends PropertyValueExpression implements INamedConcept {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.MultiLineString";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String STRING_EXPRESSION = "stringExpression";

  public MultiLineString(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(MultiLineString.NAME);
  }

  public void setName(String value) {
    this.setProperty(MultiLineString.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(MultiLineString.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(MultiLineString.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(MultiLineString.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(MultiLineString.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(MultiLineString.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(MultiLineString.VIRTUAL_PACKAGE, value);
  }

  public int getStringExpressionsCount() {
    return this.getChildCount(MultiLineString.STRING_EXPRESSION);
  }

  public Iterator<PropertyValueExpression> stringExpressions() {
    return this.children(PropertyValueExpression.class, MultiLineString.STRING_EXPRESSION);
  }

  public List<PropertyValueExpression> getStringExpressions() {
    return this.getChildren(PropertyValueExpression.class, MultiLineString.STRING_EXPRESSION);
  }

  public void addStringExpression(PropertyValueExpression node) {
    this.addChild(MultiLineString.STRING_EXPRESSION, node);
  }

  public void insertStringExpression(PropertyValueExpression prev, PropertyValueExpression node) {
    this.insertChild(prev, MultiLineString.STRING_EXPRESSION, node);
  }

  public static MultiLineString newInstance(SModel sm, boolean init) {
    return (MultiLineString)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.MultiLineString", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MultiLineString newInstance(SModel sm) {
    return MultiLineString.newInstance(sm, false);
  }
}
