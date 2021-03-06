package jetbrains.mps.lang.structure.structure;

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

public class PropertyDeclaration extends BaseConcept implements INamedConcept, IStructureDeprecatable {
  public static final String concept = "jetbrains.mps.lang.structure.structure.PropertyDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String DO_NOT_GENERATE = "doNotGenerate";
  public static final String DATA_TYPE = "dataType";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public PropertyDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(PropertyDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(PropertyDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(PropertyDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PropertyDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PropertyDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PropertyDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PropertyDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PropertyDeclaration.VIRTUAL_PACKAGE, value);
  }

  public boolean getDoNotGenerate() {
    return this.getBooleanProperty(PropertyDeclaration.DO_NOT_GENERATE);
  }

  public void setDoNotGenerate(boolean value) {
    this.setBooleanProperty(PropertyDeclaration.DO_NOT_GENERATE, value);
  }

  public DataTypeDeclaration getDataType() {
    return (DataTypeDeclaration) this.getReferent(DataTypeDeclaration.class, PropertyDeclaration.DATA_TYPE);
  }

  public void setDataType(DataTypeDeclaration node) {
    super.setReferent(PropertyDeclaration.DATA_TYPE, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(PropertyDeclaration.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, PropertyDeclaration.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, PropertyDeclaration.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(PropertyDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, PropertyDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public static PropertyDeclaration newInstance(SModel sm, boolean init) {
    return (PropertyDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.PropertyDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PropertyDeclaration newInstance(SModel sm) {
    return PropertyDeclaration.newInstance(sm, false);
  }
}
