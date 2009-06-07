package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ActionsStatement extends Statement implements ExecuteSpecific {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ActionsStatement";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String ACTION = "action";

  public ActionsStatement(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ActionsStatement.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ActionsStatement.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ActionsStatement.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ActionsStatement.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ActionsStatement.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ActionsStatement.VIRTUAL_PACKAGE, value);
  }

  public int getActionsCount() {
    return this.getChildCount(ActionsStatement.ACTION);
  }

  public Iterator<ActionInstance> actions() {
    return this.children(ActionInstance.class, ActionsStatement.ACTION);
  }

  public List<ActionInstance> getActions() {
    return this.getChildren(ActionInstance.class, ActionsStatement.ACTION);
  }

  public void addAction(ActionInstance node) {
    this.addChild(ActionsStatement.ACTION, node);
  }

  public void insertAction(ActionInstance prev, ActionInstance node) {
    this.insertChild(prev, ActionsStatement.ACTION, node);
  }


  public static ActionsStatement newInstance(SModel sm, boolean init) {
    return (ActionsStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ActionsStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ActionsStatement newInstance(SModel sm) {
    return ActionsStatement.newInstance(sm, false);
  }

}
