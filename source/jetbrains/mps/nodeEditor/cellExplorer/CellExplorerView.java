package jetbrains.mps.nodeEditor.cellExplorer;

import jetbrains.mps.ide.toolsPane.Tool;
import jetbrains.mps.ide.IdeMain;
import jetbrains.mps.ide.AbstractActionWithEmptyIcon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.nodeEditor.*;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.SNode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Kostik
 */
public class CellExplorerView implements Tool {
  private JPanel myComponent = new JPanel(new BorderLayout());
  private MyTree myTree = new MyTree();
  private IdeMain myIde;

  public CellExplorerView(IdeMain ide) {
    myIde = ide;
    myComponent.add(new JScrollPane(myTree), BorderLayout.CENTER);
    update();
  }

  public void update() {
    myTree.rebuildTree();
  }

  public String getName() {
    return "Cell Explorer";
  }

  public Icon getIcon() {
    return Icons.CELL_EXPLORER_ICON;
  }

  public JComponent getComponent() {
    return myComponent;
  }

  private class MyTree extends MPSTree {
    protected MPSTreeNode rebuild() {
      AbstractEditorComponent editor = myIde.getEditorsPane().getCurrentEditor();
      if (editor == null) {
        return new TextTreeNode("No editor selected");
      } else {
        TextTreeNode root = new TextTreeNode("CELLS");
        root.add(new CellTreeNode(editor.getRootCell()));
        return root;
      }
    }
  }

  private class CellTreeNode extends MPSTreeNode {
    private EditorCell myCell;
    private boolean myInitialized = false;

    public CellTreeNode(EditorCell cell) {
      super(cell);
      myCell = cell;
    }

    public boolean isInitialized() {
      return myInitialized;
    }

    protected JPopupMenu getPopupMenu() {
      JPopupMenu result = new JPopupMenu();
      result.add(new AbstractActionWithEmptyIcon("Select In Editor") {
        public void actionPerformed(ActionEvent e) {
          myIde.getEditorsPane().getCurrentEditor().changeSelection(myCell);
        }
      }).setBorder(null);
      return result;
    }

    public void init() {
      removeAllChildren();
      if (myCell.getSNode() != null) {
        final SNode node = myCell.getSNode();
        add(new MPSTree.TextTreeNode("<html><b>Node</b> " + node.getName() + " [" + node.getId() + "]") {
          public Icon getIcon(boolean expanded) {
            return IconManager.getIconFor(node);
          }
        });

        if (myCell.getKeyMap() != null) {
          add(new KeyMapTreeNode(myCell.getKeyMap()));
        }

      } else {
        add(new MPSTree.TextTreeNode("No Node"));
      }

      if (myCell instanceof EditorCell_Collection) {
        EditorCell_Collection cell = (EditorCell_Collection) myCell;
        for (EditorCell child : cell) {
          add(new CellTreeNode(child));
        }
        myInitialized = true;
      }
    }


    public String toString() {
      return NameUtil.shortNameFromLongName(myCell.getClass().getName());
    }

    protected String getNodeIdentifier() {
      String result = myCell.getClass().getName();
      if (myCell.getSNode() != null) result += "[" + myCell.getSNode().getId() + "]";
      if (myCell.getUserObject(EditorCell.CELL_ID) != null) result += "[" + myCell.getUserObject(EditorCell.CELL_ID).toString() + "]";
      return result;
    }
  }

  private class KeyMapTreeNode extends MPSTreeNode {
    private EditorCellKeyMap myKeyMap;

    public KeyMapTreeNode(EditorCellKeyMap keyMap) {
      myKeyMap = keyMap;

      Set<String> keys = new TreeSet<String>();
      for (EditorCellKeyMap.ActionKey ak : myKeyMap.getActionKeys()) {
        keys.add(ak.toString());
      }
      for (String key : keys) {
        add(new MPSTree.TextTreeNode(key));
      }
    }




    protected String getNodeIdentifier() {
      return "Keymap";
    }
  }
}
