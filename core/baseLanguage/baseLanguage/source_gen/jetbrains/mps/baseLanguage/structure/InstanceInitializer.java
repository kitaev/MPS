package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InstanceInitializer extends BaseConcept implements ClassifierMember, IStatementListContainer {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.InstanceInitializer";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String STATEMENT_LIST = "statementList";
  public static final String VISIBILITY = "visibility";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public InstanceInitializer(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(InstanceInitializer.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(InstanceInitializer.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(InstanceInitializer.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(InstanceInitializer.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(InstanceInitializer.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(InstanceInitializer.VIRTUAL_PACKAGE, value);
  }

  public StatementList getStatementList() {
    return (StatementList) this.getChild(StatementList.class, InstanceInitializer.STATEMENT_LIST);
  }

  public void setStatementList(StatementList node) {
    super.setChild(InstanceInitializer.STATEMENT_LIST, node);
  }

  public Visibility getVisibility() {
    return (Visibility) this.getChild(Visibility.class, InstanceInitializer.VISIBILITY);
  }

  public void setVisibility(Visibility node) {
    super.setChild(InstanceInitializer.VISIBILITY, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(InstanceInitializer.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, InstanceInitializer.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, InstanceInitializer.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(InstanceInitializer.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, InstanceInitializer.SMODEL_ATTRIBUTE, node);
  }

  public static InstanceInitializer newInstance(SModel sm, boolean init) {
    return (InstanceInitializer) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceInitializer", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InstanceInitializer newInstance(SModel sm) {
    return InstanceInitializer.newInstance(sm, false);
  }
}
