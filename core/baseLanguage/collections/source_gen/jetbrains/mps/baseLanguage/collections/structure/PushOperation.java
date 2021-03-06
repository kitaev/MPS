package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PushOperation extends SingleArgumentSequenceOperation implements IStackOperation, IDequeOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.PushOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public PushOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(PushOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PushOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PushOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PushOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PushOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PushOperation.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(PushOperation.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, PushOperation.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, PushOperation.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(PushOperation.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, PushOperation.SMODEL_ATTRIBUTE, node);
  }

  public static PushOperation newInstance(SModel sm, boolean init) {
    return (PushOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.PushOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PushOperation newInstance(SModel sm) {
    return PushOperation.newInstance(sm, false);
  }
}
