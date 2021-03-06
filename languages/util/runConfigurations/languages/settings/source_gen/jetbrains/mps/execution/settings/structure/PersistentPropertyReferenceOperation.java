package jetbrains.mps.execution.settings.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PersistentPropertyReferenceOperation extends BaseConcept implements IOperation {
  public static final String concept = "jetbrains.mps.execution.settings.structure.PersistentPropertyReferenceOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String VARIABLE_DECLARATION = "variableDeclaration";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public PersistentPropertyReferenceOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(PersistentPropertyReferenceOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PersistentPropertyReferenceOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PersistentPropertyReferenceOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PersistentPropertyReferenceOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PersistentPropertyReferenceOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PersistentPropertyReferenceOperation.VIRTUAL_PACKAGE, value);
  }

  public PersistentPropertyDeclaration getVariableDeclaration() {
    return (PersistentPropertyDeclaration) this.getReferent(PersistentPropertyDeclaration.class, PersistentPropertyReferenceOperation.VARIABLE_DECLARATION);
  }

  public void setVariableDeclaration(PersistentPropertyDeclaration node) {
    super.setReferent(PersistentPropertyReferenceOperation.VARIABLE_DECLARATION, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(PersistentPropertyReferenceOperation.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, PersistentPropertyReferenceOperation.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, PersistentPropertyReferenceOperation.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(PersistentPropertyReferenceOperation.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, PersistentPropertyReferenceOperation.SMODEL_ATTRIBUTE, node);
  }

  public static PersistentPropertyReferenceOperation newInstance(SModel sm, boolean init) {
    return (PersistentPropertyReferenceOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.settings.structure.PersistentPropertyReferenceOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PersistentPropertyReferenceOperation newInstance(SModel sm) {
    return PersistentPropertyReferenceOperation.newInstance(sm, false);
  }
}
