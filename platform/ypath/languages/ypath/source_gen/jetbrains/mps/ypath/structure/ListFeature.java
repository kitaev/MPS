package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ListFeature extends BaseConcept implements INamedConcept, IFeature {
  public static String NAME = "name";
  public static String WRITABLE = "writable";
  public static String DEFAULT = "default";
  public static String GET_FUNCTION = "getFunction";
  public static String SIZE_FUNCTION = "sizeFunction";
  public static String SET_FUNCTION = "setFunction";
  public static String INSERT_FUNCTION = "insertFunction";
  public static String DELETE_FUNCTION = "deleteFunction";

  public  ListFeature(SNode node) {
    super(node);
  }

  public static ListFeature newInstance(SModel sm, boolean init) {
    return (ListFeature)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.ListFeature", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ListFeature newInstance(SModel sm) {
    return ListFeature.newInstance(sm, false);
  }


  public String getName() {
    return this.getProperty(ListFeature.NAME);
  }

  public void setName(String value) {
    this.setProperty(ListFeature.NAME, value);
  }

  public boolean getWritable() {
    return this.getBooleanProperty(ListFeature.WRITABLE);
  }

  public void setWritable(boolean value) {
    this.setBooleanProperty(ListFeature.WRITABLE, value);
  }

  public boolean getDefault() {
    return this.getBooleanProperty(ListFeature.DEFAULT);
  }

  public void setDefault(boolean value) {
    this.setBooleanProperty(ListFeature.DEFAULT, value);
  }

  public FeatureGetFun getGetFunction() {
    return (FeatureGetFun)this.getChild(ListFeature.GET_FUNCTION);
  }

  public void setGetFunction(FeatureGetFun node) {
    super.setChild(ListFeature.GET_FUNCTION, node);
  }

  public FeatureSizeFun getSizeFunction() {
    return (FeatureSizeFun)this.getChild(ListFeature.SIZE_FUNCTION);
  }

  public void setSizeFunction(FeatureSizeFun node) {
    super.setChild(ListFeature.SIZE_FUNCTION, node);
  }

  public FeatureSetFun getSetFunction() {
    return (FeatureSetFun)this.getChild(ListFeature.SET_FUNCTION);
  }

  public void setSetFunction(FeatureSetFun node) {
    super.setChild(ListFeature.SET_FUNCTION, node);
  }

  public FeatureInsertFun getInsertFunction() {
    return (FeatureInsertFun)this.getChild(ListFeature.INSERT_FUNCTION);
  }

  public void setInsertFunction(FeatureInsertFun node) {
    super.setChild(ListFeature.INSERT_FUNCTION, node);
  }

  public FeatureDeleteFun getDeleteFunction() {
    return (FeatureDeleteFun)this.getChild(ListFeature.DELETE_FUNCTION);
  }

  public void setDeleteFunction(FeatureDeleteFun node) {
    super.setChild(ListFeature.DELETE_FUNCTION, node);
  }

}
