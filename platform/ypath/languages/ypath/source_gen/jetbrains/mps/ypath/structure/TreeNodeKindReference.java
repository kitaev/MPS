package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TreeNodeKindReference extends Expression {
  public static String TREE_PATH_ASPECT = "treePathAspect";
  public static String TREE_NODE_KIND = "treeNodeKind";

  public  TreeNodeKindReference(SNode node) {
    super(node);
  }

  public static TreeNodeKindReference newInstance(SModel sm, boolean init) {
    return (TreeNodeKindReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.TreeNodeKindReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TreeNodeKindReference newInstance(SModel sm) {
    return TreeNodeKindReference.newInstance(sm, false);
  }


  public TreePathAspect getTreePathAspect() {
    return (TreePathAspect)this.getReferent(TreeNodeKindReference.TREE_PATH_ASPECT);
  }

  public void setTreePathAspect(TreePathAspect node) {
    super.setReferent(TreeNodeKindReference.TREE_PATH_ASPECT, node);
  }

  public TreeNodeKind getTreeNodeKind() {
    return (TreeNodeKind)this.getReferent(TreeNodeKindReference.TREE_NODE_KIND);
  }

  public void setTreeNodeKind(TreeNodeKind node) {
    super.setReferent(TreeNodeKindReference.TREE_NODE_KIND, node);
  }

}
