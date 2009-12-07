package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ide.dialogs.BaseDialog;
import java.awt.Frame;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.nodeEditor.EditorContext;
import javax.swing.JComponent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.ide.ui.TextTreeNode;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.ide.icons.IconManager;

public abstract class SelectMembersDialog<T extends SNode> extends BaseDialog {
  protected SNode myClassifier;
  private String myMemberDescription;
  private boolean myAnswer = false;
  protected Frame myFrame;
  private List<T> mySelectedMembers = ListSequence.fromList(new ArrayList<T>());
  private MPSTree myTree = new MPSTree() {
    protected MPSTreeNode rebuild() {
      return SelectMembersDialog.this.rebuildOurTree();
    }
  };

  public SelectMembersDialog(EditorContext editorContext, Frame mainFrame, SNode node, String memberDescription) {
    super(mainFrame, "Select " + memberDescription);
    this.myMemberDescription = memberDescription;
    this.myClassifier = node;
    this.myFrame = mainFrame;
    this.myTree.setRootVisible(true);
  }

  protected JComponent getMainComponent() {
    this.myTree.rebuildNow();
    this.myTree.expandAll();
    this.myTree.selectFirstLeaf();
    this.myTree.addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER) {
          SelectMembersDialog.this.disposeTrue();
        }
      }
    });
    JScrollPane scrollPane = new JScrollPane(this.myTree);
    JPanel mainPanel = new JPanel(new BorderLayout());
    mainPanel.add(scrollPane, BorderLayout.CENTER);
    return mainPanel;
  }

  private void disposeTrue() {
    this.myAnswer = true;
    for (MPSTreeNode selectedNode : this.myTree.getSelectedNodes(MPSNodeInSelectDialog.class, null)) {
      ListSequence.fromList(this.mySelectedMembers).addElement(((MPSNodeInSelectDialog<T>)selectedNode).getNode());
    }
    this.dispose();
  }

  @Override
  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    int width = 200;
    int height = 250;
    if (this.myFrame == null) {
      return new DialogDimensionsSettings.DialogDimensions(400, 400, width, height);
    }
    return new DialogDimensionsSettings.DialogDimensions(this.myFrame.getX() + (this.myFrame.getWidth() - width) / 2, this.myFrame.getY() + (this.myFrame.getHeight() - height) / 2, width, height);
  }

  @BaseDialog.Button(position = 0, name = "OK", mnemonic = 'O', defaultButton = true)
  public void onOk() {
    this.disposeTrue();
  }

  @BaseDialog.Button(position = 1, name = "Cancel", mnemonic = 'C')
  public void onCancel() {
    this.dispose();
  }

  protected abstract List<T> getMembers();

  protected String getPresentation(T member) {
    return SPropertyOperations.getString(member, "name");
  }

  private MPSTreeNode rebuildOurTree() {
    TextTreeNode root = new TextTreeNode(NameUtil.capitalize(this.myMemberDescription));
    for (final T member : this.getMembers()) {
      MPSNodeInSelectDialog<T> newNode = new MPSNodeInSelectDialog<T>(member);
      newNode.setIcon(IconManager.getIconFor(member));
      newNode.setText(this.getPresentation(member));
      root.add(newNode);
    }
    return root;
  }

  public List<T> getSelectedMembers() {
    return ListSequence.fromListWithValues(new ArrayList<T>(), this.mySelectedMembers);
  }

  public boolean getAnswer() {
    return this.myAnswer;
  }
}
