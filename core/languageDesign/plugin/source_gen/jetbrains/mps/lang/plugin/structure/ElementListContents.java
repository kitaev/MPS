package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ElementListContents extends BaseConcept implements GroupContents {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ElementListContents";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String REFERENCE = "reference";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ElementListContents(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ElementListContents.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ElementListContents.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ElementListContents.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ElementListContents.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ElementListContents.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ElementListContents.VIRTUAL_PACKAGE, value);
  }

  public int getReferencesCount() {
    return this.getChildCount(ElementListContents.REFERENCE);
  }

  public Iterator<ActionGroupMember> references() {
    return this.children(ActionGroupMember.class, ElementListContents.REFERENCE);
  }

  public List<ActionGroupMember> getReferences() {
    return this.getChildren(ActionGroupMember.class, ElementListContents.REFERENCE);
  }

  public void addReference(ActionGroupMember node) {
    this.addChild(ElementListContents.REFERENCE, node);
  }

  public void insertReference(ActionGroupMember prev, ActionGroupMember node) {
    this.insertChild(prev, ElementListContents.REFERENCE, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ElementListContents.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ElementListContents.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ElementListContents.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ElementListContents.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ElementListContents.SMODEL_ATTRIBUTE, node);
  }

  public static ElementListContents newInstance(SModel sm, boolean init) {
    return (ElementListContents) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ElementListContents", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ElementListContents newInstance(SModel sm) {
    return ElementListContents.newInstance(sm, false);
  }
}
