package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GFGetterParamFun extends GFGetterFun implements IParamFeatureFun, IDesignFunction {
  public static final String concept = "jetbrains.mps.ypath.structure.GFGetterParamFun";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public GFGetterParamFun(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(GFGetterParamFun.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(GFGetterParamFun.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(GFGetterParamFun.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(GFGetterParamFun.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(GFGetterParamFun.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(GFGetterParamFun.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(GFGetterParamFun.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, GFGetterParamFun.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, GFGetterParamFun.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(GFGetterParamFun.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, GFGetterParamFun.SMODEL_ATTRIBUTE, node);
  }

  public static GFGetterParamFun newInstance(SModel sm, boolean init) {
    return (GFGetterParamFun) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.GFGetterParamFun", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GFGetterParamFun newInstance(SModel sm) {
    return GFGetterParamFun.newInstance(sm, false);
  }
}
