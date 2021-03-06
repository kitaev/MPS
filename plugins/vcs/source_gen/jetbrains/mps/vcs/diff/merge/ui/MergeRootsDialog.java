package jetbrains.mps.vcs.diff.merge.ui;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import jetbrains.mps.vcs.diff.merge.MergeContext;
import jetbrains.mps.vcs.diff.ui.ChangeEditorMessage;
import jetbrains.mps.smodel.SNodeId;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import jetbrains.mps.vcs.diff.ui.DiffEditor;
import java.util.List;
import jetbrains.mps.vcs.diff.ui.ChangeGroupBuilder;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.vcs.diff.ui.DiffEditorsGroup;
import jetbrains.mps.vcs.diff.merge.MergeContextState;
import com.intellij.openapi.diff.ex.DiffStatusBar;
import com.intellij.openapi.diff.impl.util.TextDiffType;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.ModelAccess;
import javax.swing.JSplitPane;
import jetbrains.mps.vcs.diff.ui.NextPreviousTraverser;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.Separator;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.vcs.diff.ui.DiffTemporaryModule;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.vcs.diff.ui.ChangeTrapeciumStrip;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComponent;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MergeRootsDialog extends BaseDialog {
  private MergeContext myMergeContext;
  private boolean myDisposed = false;
  private ChangeEditorMessage.ConflictChecker myConflictChecker;
  private MergeModelsDialog myModelsDialog;
  private SNodeId myRootId;
  private JPanel myContainer = new JPanel(new BorderLayout());
  private JPanel myTopPanel = new JPanel(new GridBagLayout());
  private JPanel myBottomPanel = new JPanel(new GridBagLayout());
  private DiffEditor myResultEditor;
  private DiffEditor myMineEditor;
  private DiffEditor myRepositoryEditor;
  private List<ChangeGroupBuilder> myChangeGroupBuilders = ListSequence.fromList(new ArrayList<ChangeGroupBuilder>());
  private DiffEditorsGroup myDiffEditorsGroup = new DiffEditorsGroup();
  private MergeContextState myStateToRestore;
  private DiffStatusBar myStatusBar = new DiffStatusBar(TextDiffType.MERGE_TYPES);

  public MergeRootsDialog(MergeModelsDialog mergeModelsDialog, MergeContext mergeContext, SNodeId rootId, String rootName) {
    super(mergeModelsDialog, "Merging " + rootName);
    myConflictChecker = new ChangeEditorMessage.ConflictChecker() {
      public boolean isChangeConflicted(ModelChange ch) {
        return Sequence.fromIterable(myMergeContext.getConflictedWith(ch)).isNotEmpty();
      }
    };
    myModelsDialog = mergeModelsDialog;
    myMergeContext = mergeContext;
    myRootId = rootId;
    myStateToRestore = myMergeContext.getCurrentState();

    myMineEditor = addEditor(0, myMergeContext.getMyModel());
    myResultEditor = addEditor(1, myMergeContext.getResultModel());
    myRepositoryEditor = addEditor(2, myMergeContext.getRepositoryModel());

    linkEditors(true, false);
    linkEditors(false, false);
    linkEditors(true, true);
    linkEditors(false, true);

    myMergeContext.setChangesInvalidateHandler(new MergeContext.ChangesInvalidateHandler() {
      public void someChangesInvalidated() {
        ModelAccess.instance().runReadInEDT(new Runnable() {
          public void run() {
            rehighlight();
          }
        });
      }
    });

    JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, myTopPanel, myBottomPanel);
    splitPane.setResizeWeight(0.7);
    MergeRootsDialog.MyGoToNeighbourRootActions neighbourActions = new MergeRootsDialog.MyGoToNeighbourRootActions();
    NextPreviousTraverser neighbourTraverser = new NextPreviousTraverser(myChangeGroupBuilders, myResultEditor.getMainEditor());
    DefaultActionGroup actionGroup = ActionUtils.groupFromActions(new ApplyNonConflictsForRoot(this), Separator.getInstance(), neighbourActions.previous(), neighbourActions.next(), Separator.getInstance(), neighbourTraverser.previousAction(), neighbourTraverser.nextAction());
    ActionToolbar toolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, actionGroup, true);
    neighbourTraverser.setActionToolbar(toolbar);

    myContainer.add(toolbar.getComponent(), BorderLayout.NORTH);
    myContainer.add(splitPane, BorderLayout.CENTER);
    myContainer.add(this.myStatusBar, BorderLayout.SOUTH);
    highlightAllChanges();
  }

  private ChangeGroupBuilder createChangeGroupBuilder(boolean mine, boolean inspector) {
    return new ChangeGroupBuilder(myMergeContext, (mine ?
      myMergeContext.getMyChangeSet() :
      myMergeContext.getRepositoryChangeSet()
    ), (mine ?
      myMineEditor :
      myResultEditor
    ), (mine ?
      myResultEditor :
      myRepositoryEditor
    ), inspector);
  }

  public void rehighlight() {
    myMineEditor.unhighlightAllChanges();
    myResultEditor.unhighlightAllChanges();
    myRepositoryEditor.unhighlightAllChanges();

    if (myResultEditor.getMainEditor().getEditedNode() == null) {
      SModel resultModel = myMergeContext.getResultModel();
      SNode node = getRootNode(resultModel);
      if (node != null) {
        myResultEditor.getMainEditor().editNode(node, DiffTemporaryModule.getOperationContext(myModelsDialog.getProject(), resultModel));
      }
    }

    myResultEditor.getMainEditor().rebuildEditorContent();

    highlightAllChanges();
  }

  private void highlightAllChanges() {
    ListSequence.fromList(myChangeGroupBuilders).visitAll(new IVisitor<ChangeGroupBuilder>() {
      public void visit(ChangeGroupBuilder b) {
        b.invalidate();
      }
    });

    List<ModelChange> changesForRoot = ListSequence.fromList(myMergeContext.getChangesForRoot(myRootId)).where(new IWhereFilter<ModelChange>() {
      public boolean accept(ModelChange ch) {
        return !(myMergeContext.isChangeResolved(ch));
      }
    }).toListSequence();
    for (ModelChange change : ListSequence.fromList(changesForRoot)) {
      higlightChange(myResultEditor, myMergeContext.getResultModel(), change);
      if (myMergeContext.isMyChange(change)) {
        higlightChange(myMineEditor, myMergeContext.getMyModel(), change);
      } else {
        higlightChange(myRepositoryEditor, myMergeContext.getRepositoryModel(), change);
      }
    }
    myMineEditor.repaintAndRebuildEditorMessages();
    myResultEditor.repaintAndRebuildEditorMessages();
    myRepositoryEditor.repaintAndRebuildEditorMessages();
    int conflictingChanges = ListSequence.fromList(changesForRoot).where(new IWhereFilter<ModelChange>() {
      public boolean accept(ModelChange ch) {
        return Sequence.fromIterable(myMergeContext.getConflictedWith(ch)).isNotEmpty();
      }
    }).count();
    myStatusBar.setText(MergeModelsDialog.generateUnresolvedChangesText(ListSequence.fromList(changesForRoot).count(), conflictingChanges));
  }

  private void higlightChange(DiffEditor diffEditor, SModel model, ModelChange change) {
    diffEditor.highlightChange(model, change, myConflictChecker);
  }

  private void linkEditors(boolean mine, boolean inspector) {
    // create change group builder, trapecium strip and merge buttons painter 
    // 'mine' parameter means mine changeset, 'inspector' - highlight inspector editor component 
    ChangeGroupBuilder changeGroupBuilder = createChangeGroupBuilder(mine, inspector);
    ListSequence.fromList(myChangeGroupBuilders).addElement(changeGroupBuilder);
    ChangeTrapeciumStrip strip = new ChangeTrapeciumStrip(changeGroupBuilder);
    JPanel panel = (inspector ?
      myBottomPanel :
      myTopPanel
    );
    GridBagConstraints gbc = new GridBagConstraints((mine ?
      1 :
      3
    ), 0, 1, 1, 0, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 0, 5, 0), 0, 0);
    panel.add(strip, gbc);
    MergeButtonsPainter.addTo(this, (mine ?
      myMineEditor :
      myRepositoryEditor
    ), changeGroupBuilder, inspector);
  }

  private SNode getRootNode(SModel model) {
    SNode node = model.getNodeById(myRootId);
    if (node != null && node.getParent() == null) {
      return node;
    }
    if (model == myMergeContext.getResultModel()) {
      SNodeId replacement = myMergeContext.getReplacementId(myRootId);
      if (replacement != null) {
        return model.getNodeById(replacement);
      }
    }
    return null;
  }

  private DiffEditor addEditor(int index, SModel model) {
    final DiffEditor result = new DiffEditor(DiffTemporaryModule.getOperationContext(myModelsDialog.getProject(), model), getRootNode(model), myModelsDialog.getContentTitles()[index], index == 0);

    GridBagConstraints gbc = new GridBagConstraints(index * 2, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, (index == 0 ?
      5 :
      0
    ), 5, (index == 2 ?
      5 :
      0
    )), 0, 0);
    myTopPanel.add(result.getTopComponent(), gbc);
    myBottomPanel.add(result.getInspector().getExternalComponent(), gbc);

    myDiffEditorsGroup.add(result);
    return result;
  }

  public SNodeId getRootId() {
    return myRootId;
  }

  /*package*/ MergeModelsDialog getModelsDialog() {
    return myModelsDialog;
  }

  protected JComponent getMainComponent() {
    return myContainer;
  }

  @Override
  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return DialogDimensionsSettings.generateDialogDimensions(-50, -100);
  }

  @BaseDialog.Button(name = "OK", mnemonic = 'O', position = 0, defaultButton = true)
  public void ok() {
    MergeConfirmation.showMergeConfirmationAndTakeAction(this, myMergeContext, myMergeContext.getChangesForRoot(myRootId), new _FunctionTypes._void_P0_E0() {
      public void invoke() {
        myMergeContext.applyChanges(myMergeContext.getApplicableChangesForRoot(myRootId));
      }
    }, new _FunctionTypes._void_P0_E0() {
      public void invoke() {
        saveAndClose();
      }
    });
  }

  public void saveAndClose() {
    myStateToRestore = null;
    dispose();
  }

  @BaseDialog.Button(name = "Cancel", mnemonic = 'C', position = 1)
  public void cancel() {
    dispose();
  }

  /*package*/ MergeContext getMergeContext() {
    return myMergeContext;
  }

  public void resetState() {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        myModelsDialog.restoreState(myStateToRestore);
      }
    });
  }

  @Override
  public void dispose() {
    if (myDisposed) {
      return;
    }
    if (myStateToRestore == null) {
      myModelsDialog.rebuildLater();
    } else {
      resetState();
    }
    myModelsDialog.rootsDialogClosed();
    myDisposed = true;
    super.dispose();
  }

  private class MyGoToNeighbourRootActions extends GoToNeighbourRootActions {
    public MyGoToNeighbourRootActions() {
    }

    protected void goTo(@NotNull SNodeId rootId) {
      saveAndClose();
      myModelsDialog.invokeMergeRoots(rootId);
    }

    @Nullable
    protected SNodeId getNeighbourId(boolean next) {
      return myModelsDialog.getNeighbourRoot(myRootId, next);
    }
  }
}
