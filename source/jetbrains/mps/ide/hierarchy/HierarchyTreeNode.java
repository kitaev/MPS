package jetbrains.mps.ide.hierarchy;

import jetbrains.mps.smodel.*;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.ide.AbstractActionWithEmptyIcon;
import jetbrains.mps.ide.EditorsPane;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.ide.AbstractProjectFrame;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.ide.navigation.NavigationActionProcessor;
import jetbrains.mps.ide.navigation.EditorNavigationCommand;
import jetbrains.mps.project.ModuleContext;

import javax.swing.JPopupMenu;
import javax.swing.Icon;
import java.awt.event.ActionEvent;

import org.jetbrains.annotations.NotNull;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 05.06.2007
 * Time: 16:50:49
 * To change this template use File | Settings | File Templates.
 */
public class HierarchyTreeNode<T extends INodeAdapter> extends MPSTreeNode {

    private SNodePointer myNodePointer;
    protected AbstractHierarchyTree<T> myHierarchyTree;

    public HierarchyTreeNode(@NotNull T declaration, IOperationContext operationContext, AbstractHierarchyTree<T> tree) {
      super(operationContext);
      myNodePointer = new SNodePointer(declaration);
      myHierarchyTree = tree;
      setUserObject(declaration);
    }

    public int getToggleClickCount() {
      return -1;
    }

    public T getNode() {
      return (T) BaseAdapter.fromNode(myNodePointer.getNode());
    }

    public String getNodeIdentifier() {
      if (getNode() == null) return "null";
      String namespace = getNode().getModel().toString();
      return getNode().getName() + "  (" + namespace + ")";
    }

    public JPopupMenu getPopupMenu() {
      JPopupMenu result = new JPopupMenu();
      result.add(new AbstractActionWithEmptyIcon("Show Hierarchy For This Concept") {
        public void actionPerformed(ActionEvent e) {
          final SNode node = myNodePointer.getNode();
          myHierarchyTree.getHierarchyView().showConceptInHierarchy((T) node.getAdapter(), getOperationContext());
        }
      }).setBorder(null);
      return result;
    }

    public void doubleClick() {
      final SNode node = myNodePointer.getNode();

      final EditorsPane editorsPane = myHierarchyTree.getHierarchyView().myIde.getEditorsPane();
      final IEditor currentEditor = editorsPane.getCurrentEditor();

      NavigationActionProcessor.executeNavigationAction(new EditorNavigationCommand(node, currentEditor, editorsPane), getOperationContext().getProject());

    }

    public Icon getIcon(boolean expanded) {
      return IconManager.getIconFor(myNodePointer.getNode());
    }

  }
