package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.buildlanguage.structure.PropertyDeclaration;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Macro extends PropertyDeclaration implements INamedConcept {
  public static final String concept = "jetbrains.mps.build.packaging.structure.Macro";
  public static final String PATH = "path";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public Macro(SNode node) {
    super(node);
  }

  public String getPath() {
    return this.getProperty(Macro.PATH);
  }

  public void setPath(String value) {
    this.setProperty(Macro.PATH, value);
  }

  public String getName() {
    return this.getProperty(Macro.NAME);
  }

  public void setName(String value) {
    this.setProperty(Macro.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(Macro.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Macro.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Macro.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Macro.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Macro.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Macro.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(Macro.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, Macro.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, Macro.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(Macro.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, Macro.SMODEL_ATTRIBUTE, node);
  }

  public static Macro newInstance(SModel sm, boolean init) {
    return (Macro) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.Macro", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Macro newInstance(SModel sm) {
    return Macro.newInstance(sm, false);
  }
}
