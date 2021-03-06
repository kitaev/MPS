package jetbrains.mps.ui.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CreateUIObjectStatement extends UIObjectStatement implements IUIObjectDeclaration {
  public static final String concept = "jetbrains.mps.ui.structure.CreateUIObjectStatement";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public CreateUIObjectStatement(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(CreateUIObjectStatement.NAME);
  }

  public void setName(String value) {
    this.setProperty(CreateUIObjectStatement.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(CreateUIObjectStatement.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(CreateUIObjectStatement.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(CreateUIObjectStatement.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(CreateUIObjectStatement.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(CreateUIObjectStatement.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(CreateUIObjectStatement.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(CreateUIObjectStatement.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, CreateUIObjectStatement.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, CreateUIObjectStatement.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(CreateUIObjectStatement.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, CreateUIObjectStatement.SMODEL_ATTRIBUTE, node);
  }

  public static CreateUIObjectStatement newInstance(SModel sm, boolean init) {
    return (CreateUIObjectStatement) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.CreateUIObjectStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CreateUIObjectStatement newInstance(SModel sm) {
    return CreateUIObjectStatement.newInstance(sm, false);
  }
}
