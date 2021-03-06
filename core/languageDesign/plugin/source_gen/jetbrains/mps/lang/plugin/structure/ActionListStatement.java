package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ActionListStatement extends Statement implements ExecuteSpecific {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ActionListStatement";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String ACTIONS = "actions";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ActionListStatement(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ActionListStatement.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ActionListStatement.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ActionListStatement.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ActionListStatement.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ActionListStatement.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ActionListStatement.VIRTUAL_PACKAGE, value);
  }

  public Expression getActions() {
    return (Expression) this.getChild(Expression.class, ActionListStatement.ACTIONS);
  }

  public void setActions(Expression node) {
    super.setChild(ActionListStatement.ACTIONS, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ActionListStatement.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ActionListStatement.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ActionListStatement.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ActionListStatement.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ActionListStatement.SMODEL_ATTRIBUTE, node);
  }

  public static ActionListStatement newInstance(SModel sm, boolean init) {
    return (ActionListStatement) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ActionListStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ActionListStatement newInstance(SModel sm) {
    return ActionListStatement.newInstance(sm, false);
  }
}
