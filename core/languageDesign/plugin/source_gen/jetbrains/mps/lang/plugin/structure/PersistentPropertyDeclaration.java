package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.VariableDeclaration;
import jetbrains.mps.baseLanguage.classifiers.structure.IMember;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PersistentPropertyDeclaration extends VariableDeclaration implements IMember {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.PersistentPropertyDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public PersistentPropertyDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(PersistentPropertyDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(PersistentPropertyDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(PersistentPropertyDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PersistentPropertyDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PersistentPropertyDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PersistentPropertyDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PersistentPropertyDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PersistentPropertyDeclaration.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(PersistentPropertyDeclaration.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, PersistentPropertyDeclaration.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, PersistentPropertyDeclaration.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(PersistentPropertyDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, PersistentPropertyDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public static PersistentPropertyDeclaration newInstance(SModel sm, boolean init) {
    return (PersistentPropertyDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.PersistentPropertyDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PersistentPropertyDeclaration newInstance(SModel sm) {
    return PersistentPropertyDeclaration.newInstance(sm, false);
  }
}
