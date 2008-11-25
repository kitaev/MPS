package jetbrains.mps.ide.hierarchy;

import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.smodel.*;
import jetbrains.mps.workbench.action.BaseAction;
import jetbrains.mps.workbench.action.ActionUtils;
import org.jetbrains.annotations.NotNull;

public class HierarchyTreeNode<T extends INodeAdapter> extends MPSTreeNode {

  private SNodePointer myNodePointer;
  protected AbstractHierarchyTree<T> myHierarchyTree;

  public HierarchyTreeNode(@NotNull T declaration, IOperationContext operationContext, AbstractHierarchyTree<T> tree) {
    super(operationContext);
    SNode node = declaration.getNode();
    if (!node.isRegistered()) {
      SModel sModel = node.getModel();
      boolean wasLoading = sModel.isLoading();
      try {
        sModel.setLoading(true);
        sModel.addRoot(node.getTopmostAncestor());
      } finally {
        sModel.setLoading(wasLoading);
      }
    }
    myNodePointer = new SNodePointer(declaration);
    myHierarchyTree = tree;
    setUserObject(declaration);

    updatePresentation();
  }

  protected void updatePresentation() {
    setIcon(IconManager.getIconFor(myNodePointer.getNode()));
    setNodeIdentifier(calculateNodeIdentifier());                  
    setAdditionalText(calculateAdditionalText());
    setAutoExpandable(false);
  }

  private String calculateAdditionalText() {
    if (getNode() == null) return "null";    
    return getNode().getModel().getSModelFqName().toString();
  }

  protected void onRemove() {
    SNode node = myNodePointer.getNode();
    if (node != null && !node.isRegistered()) {
      SModel sModel = node.getModel();
      boolean wasLoading = sModel.isLoading();
      try {
        sModel.setLoading(true);
        sModel.removeRoot(node.getTopmostAncestor());
      } finally {
        sModel.setLoading(wasLoading);
      }
    }
  }

  public int getToggleClickCount() {
    return -1;
  }

  public T getNode() {
    return (T) BaseAdapter.fromNode(myNodePointer.getNode());
  }

  public String calculateNodeIdentifier() {
    if (getNode() == null) return "null";
    if (myHierarchyTree.overridesNodeIdentifierCalculation()) {
      return myHierarchyTree.calculateNodeIdentifier(this);
    }
    return getNode().getName();
  }

  public ActionGroup getActionGroup() {
    final AbstractHierarchyView<T> hierarchyView = myHierarchyTree.getHierarchyView();
    if (hierarchyView == null) return null;


    BaseAction hierarchyAction = new BaseAction("Show Hierarchy For This Node") {
      protected void doExecute(AnActionEvent e) {
        final SNode node = myNodePointer.getNode();
        hierarchyView.showConceptInHierarchy((T) node.getAdapter(), getOperationContext());
      }
    };
    return ActionUtils.groupFromActions(hierarchyAction);
  }

  public void doubleClick() {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        if (myHierarchyTree.doubleClick(HierarchyTreeNode.this)) {
          return;
        }

        final SNode node = myNodePointer.getNode();

        AbstractHierarchyView<T> hierarchyView = myHierarchyTree.getHierarchyView();
        if (hierarchyView != null) {
          hierarchyView.openNode(node, getOperationContext());
        }
      }
    });
  }
}
