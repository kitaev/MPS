package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ExecuteConfigBlock extends ConceptFunction implements IExecuteConfigBlock {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ExecuteConfigBlock";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ExecuteConfigBlock(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ExecuteConfigBlock.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ExecuteConfigBlock.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ExecuteConfigBlock.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ExecuteConfigBlock.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ExecuteConfigBlock.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ExecuteConfigBlock.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ExecuteConfigBlock.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ExecuteConfigBlock.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ExecuteConfigBlock.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ExecuteConfigBlock.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ExecuteConfigBlock.SMODEL_ATTRIBUTE, node);
  }

  public static ExecuteConfigBlock newInstance(SModel sm, boolean init) {
    return (ExecuteConfigBlock) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ExecuteConfigBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ExecuteConfigBlock newInstance(SModel sm) {
    return ExecuteConfigBlock.newInstance(sm, false);
  }
}
