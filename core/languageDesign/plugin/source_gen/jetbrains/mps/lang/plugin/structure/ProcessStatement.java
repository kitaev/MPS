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

public class ProcessStatement extends Statement implements ExecuteSpecific {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ProcessStatement";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String PROCESS = "process";
  public static final String COMMAND = "command";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ProcessStatement(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ProcessStatement.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ProcessStatement.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ProcessStatement.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ProcessStatement.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ProcessStatement.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ProcessStatement.VIRTUAL_PACKAGE, value);
  }

  public Expression getProcess() {
    return (Expression) this.getChild(Expression.class, ProcessStatement.PROCESS);
  }

  public void setProcess(Expression node) {
    super.setChild(ProcessStatement.PROCESS, node);
  }

  public Expression getCommand() {
    return (Expression) this.getChild(Expression.class, ProcessStatement.COMMAND);
  }

  public void setCommand(Expression node) {
    super.setChild(ProcessStatement.COMMAND, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ProcessStatement.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ProcessStatement.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ProcessStatement.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ProcessStatement.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ProcessStatement.SMODEL_ATTRIBUTE, node);
  }

  public static ProcessStatement newInstance(SModel sm, boolean init) {
    return (ProcessStatement) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ProcessStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ProcessStatement newInstance(SModel sm) {
    return ProcessStatement.newInstance(sm, false);
  }
}
