package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.AbstractCreator;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class TreePathCreator extends AbstractCreator implements TreePath {
  public static String DEFAULT_FEATURE = "defaultFeature";
  public static String TREE_PATH_TYPE = "treePathType";
  public static String PARENT_BLOCK = "parentBlock";
  public static String CHILDREN_BLOCK = "childrenBlock";
  public static String FEATURES = "features";

  public  TreePathCreator(SNode node) {
    super(node);
  }

  public static TreePathCreator newInstance(SModel sm, boolean init) {
    return (TreePathCreator)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.TreePathCreator", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TreePathCreator newInstance(SModel sm) {
    return TreePathCreator.newInstance(sm, false);
  }


  public IFeature getDefaultFeature() {
    return (IFeature)this.getReferent(TreePathCreator.DEFAULT_FEATURE);
  }

  public void setDefaultFeature(IFeature node) {
    super.setReferent(TreePathCreator.DEFAULT_FEATURE, node);
  }

  public TreePathType getTreePathType() {
    return (TreePathType)this.getChild(TreePathCreator.TREE_PATH_TYPE);
  }

  public void setTreePathType(TreePathType node) {
    super.setChild(TreePathCreator.TREE_PATH_TYPE, node);
  }

  public ParentBlock getParentBlock() {
    return (ParentBlock)this.getChild(TreePathCreator.PARENT_BLOCK);
  }

  public void setParentBlock(ParentBlock node) {
    super.setChild(TreePathCreator.PARENT_BLOCK, node);
  }

  public ChildrenBlock getChildrenBlock() {
    return (ChildrenBlock)this.getChild(TreePathCreator.CHILDREN_BLOCK);
  }

  public void setChildrenBlock(ChildrenBlock node) {
    super.setChild(TreePathCreator.CHILDREN_BLOCK, node);
  }

  public int getFeaturesesCount() {
    return this.getChildCount(TreePathCreator.FEATURES);
  }

  public Iterator<IFeature> featureses() {
    return this.children(TreePathCreator.FEATURES);
  }

  public List<IFeature> getFeatureses() {
    return this.getChildren(TreePathCreator.FEATURES);
  }

  public void addFeatures(IFeature node) {
    this.addChild(TreePathCreator.FEATURES, node);
  }

  public void insertFeatures(IFeature prev, IFeature node) {
    this.insertChild(prev, TreePathCreator.FEATURES, node);
  }

}
