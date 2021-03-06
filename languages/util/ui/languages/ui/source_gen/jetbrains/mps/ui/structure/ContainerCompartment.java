package jetbrains.mps.ui.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ui.modeling.structure.Container;
import jetbrains.mps.baseLanguage.structure.StatementList;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ContainerCompartment extends BaseConcept implements IUIObjectContextProvider {
  public static final String concept = "jetbrains.mps.ui.structure.ContainerCompartment";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String CONTAINER = "container";
  public static final String BODY = "body";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ContainerCompartment(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ContainerCompartment.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ContainerCompartment.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ContainerCompartment.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ContainerCompartment.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ContainerCompartment.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ContainerCompartment.VIRTUAL_PACKAGE, value);
  }

  public Container getContainer() {
    return (Container) this.getReferent(Container.class, ContainerCompartment.CONTAINER);
  }

  public void setContainer(Container node) {
    super.setReferent(ContainerCompartment.CONTAINER, node);
  }

  public StatementList getBody() {
    return (StatementList) this.getChild(StatementList.class, ContainerCompartment.BODY);
  }

  public void setBody(StatementList node) {
    super.setChild(ContainerCompartment.BODY, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ContainerCompartment.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ContainerCompartment.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ContainerCompartment.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ContainerCompartment.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ContainerCompartment.SMODEL_ATTRIBUTE, node);
  }

  public static ContainerCompartment newInstance(SModel sm, boolean init) {
    return (ContainerCompartment) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.ContainerCompartment", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ContainerCompartment newInstance(SModel sm) {
    return ContainerCompartment.newInstance(sm, false);
  }
}
