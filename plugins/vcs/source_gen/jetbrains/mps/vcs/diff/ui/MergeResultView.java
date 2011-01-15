package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import javax.swing.JPanel;
import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.ide.ui.TextTreeNode;
import jetbrains.mps.vcs.diff.Warning;
import jetbrains.mps.vcs.diff.Conflict;
import jetbrains.mps.vcs.diff.Merger;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.IOperationContext;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import jetbrains.mps.ide.ui.smodel.SNodeTreeNode;
import jetbrains.mps.smodel.SNode;
import com.intellij.openapi.actionSystem.ActionGroup;
import jetbrains.mps.workbench.action.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.ide.ui.smodel.SModelTreeNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.util.Condition;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.vcs.diff.oldchanges.Change;
import jetbrains.mps.ide.projectPane.Icons;
import javax.swing.tree.TreeNode;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.vcs.diff.oldchanges.NewNodeChange;

/*package*/ class MergeResultView extends JPanel {
  private MPSTree myResultTree;
  private MPSTree myConflictsAndWarningsTree = new MPSTree() {
    protected MPSTreeNode rebuild() {
      TextTreeNode root = new TextTreeNode("Conflicts And Warnings");
      if (myMerger.getWarnings().isEmpty()) {
        root.add(new TextTreeNode("No Warnings"));
      } else {
        TextTreeNode warnings = new TextTreeNode("Warnings");
        for (Warning w : myMerger.getWarnings()) {
          warnings.add(new MergeResultView.WarningNode(w));
        }
        root.add(warnings);
      }
      if (myMerger.getConflicts().isEmpty()) {
        root.add(new TextTreeNode("No Conflicts"));
      } else {
        TextTreeNode conflicts = new TextTreeNode("Conflicts");
        for (Conflict c : myMerger.getConflicts()) {
          conflicts.add(new MergeResultView.ConflictNode(c));
        }
        root.add(conflicts);
      }
      return root;
    }
  };
  private final Merger myMerger;
  private SModel myBaseModel;
  private SModel myChange1;
  private SModel myChange2;
  private IOperationContext myContext;

  public MergeResultView(IOperationContext context, SModel baseModel, SModel change1, SModel change2, Merger merger) {
    myContext = context;
    myBaseModel = baseModel;
    myChange1 = change1;
    myChange2 = change2;
    myResultTree = new MPSTree() {
      protected MPSTreeNode rebuild() {
        return new MergeResultView.MySModelTreeNode(myMerger.getResultModel(), "", myContext);
      }
    };
    myMerger = merger;
    myMerger.doRebuild(new Runnable() {
      public void run() {
        updateView();
      }
    });
    setLayout(new BorderLayout());
    JSplitPane splitter = new JSplitPane(JSplitPane.VERTICAL_SPLIT, new JScrollPane(myResultTree), new JScrollPane(myConflictsAndWarningsTree));
    splitter.setDividerLocation(500);
    add(splitter, BorderLayout.CENTER);
  }

  public void updateView() {
    myResultTree.rebuildNow();
    myResultTree.expandRoot();
    myConflictsAndWarningsTree.rebuildNow();
    myConflictsAndWarningsTree.expandRoot();
  }

  public SModel getResult() {
    return myMerger.getResultModel();
  }

  public boolean isResolved() {
    return myMerger.isResolved();
  }

  protected void showConflict(Conflict conflict) {
  }

  private class MySNodeTreeNode extends SNodeTreeNode {
    public MySNodeTreeNode(SNode node, String role, IOperationContext operationContext) {
      super(node, role, operationContext);
    }

    public ActionGroup getActionGroup() {
      final SNode node = getSNode();
      if (node != null && node.isRoot()) {
        BaseAction showRootDiffDialog = new BaseAction("Show Merge In MPS Editor") {
          protected void doExecute(AnActionEvent event, Map<String, Object> map) {
            doubleClick();
          }
        };
        showRootDiffDialog.setExecuteOutsideCommand(true);
        DefaultActionGroup group = ActionUtils.groupFromActions(showRootDiffDialog);
        return group;
      } else {
        return null;
      }
    }

    public void doubleClick() {
      final boolean[] isRoot = new boolean[1];
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          isRoot[0] = getSNode().getParent() == null;
        }
      });
      if (!(isRoot[0])) {
        return;
      }
      final RootMergeDialog dialog = new RootMergeDialog(myContext, myChange1, myChange2, true);
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          dialog.init(getSNode(), myMerger);
        }
      });
      dialog.showDialog();
      myMerger.setPreviewMode(false);
      myMerger.doRebuild(new Runnable() {
        public void run() {
          updateView();
        }
      });
    }
  }

  private class MySModelTreeNode extends SModelTreeNode {
    private SModel myModel;

    public MySModelTreeNode(SModel model, String label, @NotNull IOperationContext operationContext) {
      super(null, label, operationContext);
      myModel = model;
    }

    protected void doUpdatePresentation() {
      if (myModel == null) {
        return;
      }
      super.doUpdatePresentation();
    }

    @NotNull
    public SNodeTreeNode createSNodeTreeNode(SNode node, String role, IOperationContext operationContext, Condition<SNode> condition) {
      return new MergeResultView.MySNodeTreeNode(node, role, operationContext);
    }

    public SModel getSModel() {
      return myModel;
    }

    public SModelDescriptor getSModelDescriptor() {
      return null;
    }

    public ActionGroup getActionGroup() {
      return null;
    }

    public void doubleClick() {
    }
  }

  private class ConflictNode extends MPSTreeNode {
    private Conflict myConflict;

    public ConflictNode(Conflict conflict) {
      super(null);
      myConflict = conflict;
      addNode(conflict.getChange1());
      addNode(conflict.getChange2());
      setNodeIdentifier("Conflict" + (((getParent() != null) ?
        getParent().getIndex(this) :
        ""
      )));
      setText("Conflict");
    }

    @Override
    public void doubleClick() {
      showConflict(myConflict);
    }

    private void addNode(Change change) {
      add(new MergeResultView.ChangeNode(change, (myMerger.isMine(change) ?
        "mine" :
        "theirs"
      )));
    }
  }

  private class WarningNode extends MPSTreeNode {
    private Warning myWarning;

    public WarningNode(Warning w) {
      super(null);
      myWarning = w;
      setNodeIdentifier(myWarning.toString());
      setIcon(Icons.DEFAULT_ICON);
    }

    @Override
    public boolean isLeaf() {
      return true;
    }

    public void doubleClick() {
      SNode node = myMerger.getResultModel().getNodeById(myWarning.getId());
      if (node != null) {
        TreeNode tn = myResultTree.findNodeWith(node);
        myResultTree.selectNode(tn);
      }
    }
  }

  private class ChangeNode extends MPSTreeNode {
    private Change myChange;
    private String myAdditionalText;

    public ChangeNode(Change change) {
      this(change, null);
    }

    public ChangeNode(Change change, String additionalText) {
      super(null);
      myChange = change;
      myAdditionalText = additionalText;
      setNodeIdentifier(myChange + "");
      setText(calculateText());
      setIcon(Icons.DEFAULT_ICON);
    }

    public ActionGroup getActionGroup() {
      String text = (myMerger.getExcludedChanges().contains(myChange) ?
        "Include" :
        "Exclude"
      );
      BaseAction action = new BaseAction(text) {
        protected void doExecute(AnActionEvent event, Map<String, Object> map) {
          if (myMerger.getExcludedChanges().contains(myChange)) {
            myMerger.includeChange(myChange);
          } else {
            myMerger.excludeChange(myChange);
          }
          myMerger.doRebuild(new Runnable() {
            public void run() {
              updateView();
            }
          });
        }
      };
      action.setDisableOnNoProject(false);
      return ActionUtils.groupFromActions(action);
    }

    public void doubleClick() {
      SNodeId id = myChange.getAffectedNodeId();
      if (myChange instanceof NewNodeChange && ((NewNodeChange) myChange).getNodeParent() != null) {
        NewNodeChange anc = (NewNodeChange) myChange;
        id = anc.getNodeParent();
      }
      SNode node = (id == null ?
        null :
        myMerger.getResultModel().getNodeById(id)
      );
      if (node != null) {
        TreeNode tn = myResultTree.findNodeWith(node);
        myResultTree.selectNode(tn);
      }
    }

    public boolean isLeaf() {
      return true;
    }

    public String calculateText() {
      String result;
      if (myMerger.getExcludedChanges().contains(myChange)) {
        result = "<html><s>" + myChange + "</s>";
      } else {
        result = "" + myChange;
      }
      if (myAdditionalText != null) {
        result += " " + myAdditionalText;
      }
      return result;
    }
  }
}
