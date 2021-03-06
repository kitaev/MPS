package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ApplicableNodeCondition extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.ApplicableNodeCondition";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ApplicableNodeCondition(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ApplicableNodeCondition.NAME);
  }

  public void setName(String value) {
    this.setProperty(ApplicableNodeCondition.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ApplicableNodeCondition.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ApplicableNodeCondition.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ApplicableNodeCondition.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ApplicableNodeCondition.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ApplicableNodeCondition.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ApplicableNodeCondition.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ApplicableNodeCondition.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ApplicableNodeCondition.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ApplicableNodeCondition.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ApplicableNodeCondition.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ApplicableNodeCondition.SMODEL_ATTRIBUTE, node);
  }

  public static ApplicableNodeCondition newInstance(SModel sm, boolean init) {
    return (ApplicableNodeCondition) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.ApplicableNodeCondition", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ApplicableNodeCondition newInstance(SModel sm) {
    return ApplicableNodeCondition.newInstance(sm, false);
  }
}
