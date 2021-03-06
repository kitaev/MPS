package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UpdateGroupBlock extends BaseConcept implements GroupContents {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.UpdateGroupBlock";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String UPDATE_FUNCTION = "updateFunction";
  public static final String ENUMERATE_FUNCTION = "enumerateFunction";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public UpdateGroupBlock(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(UpdateGroupBlock.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(UpdateGroupBlock.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(UpdateGroupBlock.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(UpdateGroupBlock.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(UpdateGroupBlock.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(UpdateGroupBlock.VIRTUAL_PACKAGE, value);
  }

  public UpdateGroupFunction getUpdateFunction() {
    return (UpdateGroupFunction) this.getChild(UpdateGroupFunction.class, UpdateGroupBlock.UPDATE_FUNCTION);
  }

  public void setUpdateFunction(UpdateGroupFunction node) {
    super.setChild(UpdateGroupBlock.UPDATE_FUNCTION, node);
  }

  public EnumerateChildrenFunction getEnumerateFunction() {
    return (EnumerateChildrenFunction) this.getChild(EnumerateChildrenFunction.class, UpdateGroupBlock.ENUMERATE_FUNCTION);
  }

  public void setEnumerateFunction(EnumerateChildrenFunction node) {
    super.setChild(UpdateGroupBlock.ENUMERATE_FUNCTION, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(UpdateGroupBlock.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, UpdateGroupBlock.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, UpdateGroupBlock.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(UpdateGroupBlock.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, UpdateGroupBlock.SMODEL_ATTRIBUTE, node);
  }

  public static UpdateGroupBlock newInstance(SModel sm, boolean init) {
    return (UpdateGroupBlock) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.UpdateGroupBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UpdateGroupBlock newInstance(SModel sm) {
    return UpdateGroupBlock.newInstance(sm, false);
  }
}
