package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ParametrizedExecuteBlock extends BaseConcept implements IExecuteConfigBlock {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ParametrizedExecuteBlock";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String EXECUTE_PARAMETER_QUERY = "executeParameterQuery";
  public static final String EXECUTE_ACTIONS = "executeActions";
  public static final String EXECUTE_CONSOLE = "executeConsole";
  public static final String EXECUTE_PROCESS = "executeProcess";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ParametrizedExecuteBlock(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ParametrizedExecuteBlock.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ParametrizedExecuteBlock.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ParametrizedExecuteBlock.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ParametrizedExecuteBlock.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ParametrizedExecuteBlock.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ParametrizedExecuteBlock.VIRTUAL_PACKAGE, value);
  }

  public ExecuteParameterQuery getExecuteParameterQuery() {
    return (ExecuteParameterQuery) this.getChild(ExecuteParameterQuery.class, ParametrizedExecuteBlock.EXECUTE_PARAMETER_QUERY);
  }

  public void setExecuteParameterQuery(ExecuteParameterQuery node) {
    super.setChild(ParametrizedExecuteBlock.EXECUTE_PARAMETER_QUERY, node);
  }

  public ParametrizedExecuteActions getExecuteActions() {
    return (ParametrizedExecuteActions) this.getChild(ParametrizedExecuteActions.class, ParametrizedExecuteBlock.EXECUTE_ACTIONS);
  }

  public void setExecuteActions(ParametrizedExecuteActions node) {
    super.setChild(ParametrizedExecuteBlock.EXECUTE_ACTIONS, node);
  }

  public ParametrizedExecuteConsole getExecuteConsole() {
    return (ParametrizedExecuteConsole) this.getChild(ParametrizedExecuteConsole.class, ParametrizedExecuteBlock.EXECUTE_CONSOLE);
  }

  public void setExecuteConsole(ParametrizedExecuteConsole node) {
    super.setChild(ParametrizedExecuteBlock.EXECUTE_CONSOLE, node);
  }

  public ParametrizedExecuteProcess getExecuteProcess() {
    return (ParametrizedExecuteProcess) this.getChild(ParametrizedExecuteProcess.class, ParametrizedExecuteBlock.EXECUTE_PROCESS);
  }

  public void setExecuteProcess(ParametrizedExecuteProcess node) {
    super.setChild(ParametrizedExecuteBlock.EXECUTE_PROCESS, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ParametrizedExecuteBlock.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ParametrizedExecuteBlock.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ParametrizedExecuteBlock.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ParametrizedExecuteBlock.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ParametrizedExecuteBlock.SMODEL_ATTRIBUTE, node);
  }

  public static ParametrizedExecuteBlock newInstance(SModel sm, boolean init) {
    return (ParametrizedExecuteBlock) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ParametrizedExecuteBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ParametrizedExecuteBlock newInstance(SModel sm) {
    return ParametrizedExecuteBlock.newInstance(sm, false);
  }
}
