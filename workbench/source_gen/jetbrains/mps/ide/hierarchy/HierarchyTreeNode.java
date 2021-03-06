package jetbrains.mps.ide.hierarchy;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.util.annotation.DisposableCommand;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import com.intellij.openapi.actionSystem.ActionGroup;
import jetbrains.mps.workbench.action.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.smodel.ModelAccess;

public class HierarchyTreeNode extends MPSTreeNode {
  private static Logger LOG = Logger.getLogger(HierarchyTreeNode.class);

  private SNodePointer myNodePointer;
  protected AbstractHierarchyTree myHierarchyTree;

  public HierarchyTreeNode(@NotNull SNode declaration, IOperationContext operationContext, AbstractHierarchyTree tree) {
    super(operationContext);
    SNode node = declaration;
    if (!(node.isRegistered())) {
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
    setNodeIdentifier(calculateNodeIdentifier());
  }

  protected void doUpdatePresentation() {
    @DisposableCommand SNode node = getNode_internal();
    if (node == null) {
      return;
    }
    setIcon(IconManager.getIconFor(node));
    setAdditionalText(calculateAdditionalText());
    setAutoExpandable(false);
  }

  protected String calculateAdditionalText() {
    if (getNode() == null) {
      return "null";
    }
    return SNodeOperations.getModel(getNode()).getSModelFqName().toString();
  }

  protected void onRemove() {
    super.onRemove();
    SNode node = getNode_internal();
    if (node != null && !(node.isRegistered())) {
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

  public SNode getNode() {
    return getNode_internal();
  }

  private SNode getNode_internal() {
    SNode node = myNodePointer.getNode();
    if (node == null) {
      LOG.error("Can't find node " + myNodePointer.getModelReference() + " : " + myNodePointer.getNodeId());
    }
    return node;
  }

  public String calculateNodeIdentifier() {
    if (getNode() == null) {
      return "null";
    }
    if (myHierarchyTree.overridesNodeIdentifierCalculation()) {
      return myHierarchyTree.calculateNodeIdentifier(this);
    }
    return getNode().getName();
  }

  public ActionGroup getActionGroup() {
    final AbstractHierarchyView hierarchyView = myHierarchyTree.getHierarchyView();
    if (hierarchyView == null) {
      return null;
    }
    BaseAction hierarchyAction = new BaseAction("Show Hierarchy For This Node") {
      protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
        final SNode node = getNode_internal();
        hierarchyView.showItemInHierarchy(node, getOperationContext());
      }
    };
    return ActionUtils.groupFromActions(hierarchyAction);
  }

  public void doubleClick() {
    if (myHierarchyTree.doubleClick(HierarchyTreeNode.this)) {
      return;
    }
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        final SNode node = getNode_internal();
        AbstractHierarchyView hierarchyView = myHierarchyTree.getHierarchyView();
        if (hierarchyView != null) {
          hierarchyView.openNode(node, getOperationContext());
        }
      }
    });
  }
}
