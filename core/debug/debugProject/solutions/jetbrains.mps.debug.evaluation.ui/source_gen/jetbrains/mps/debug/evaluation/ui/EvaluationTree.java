package jetbrains.mps.debug.evaluation.ui;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTree;
import com.intellij.openapi.actionSystem.DataProvider;
import com.sun.jdi.ThreadReference;
import java.util.Map;
import jetbrains.mps.debug.evaluation.model.AbstractEvaluationModel;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.debug.evaluation.proxies.IValueProxy;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.ide.ui.TextTreeNode;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NonNls;
import javax.swing.tree.TreePath;
import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.debug.evaluation.EvaluationProvider;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.debug.runtime.java.programState.watchables.CalculatedWatchable;
import jetbrains.mps.debug.api.integration.ui.WatchableNode;
import jetbrains.mps.debug.api.programState.IWatchable;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.awt.Color;
import jetbrains.mps.ide.messages.Icons;
import jetbrains.mps.datatransfer.CopyPasteUtil;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;
import java.io.StringWriter;
import java.io.PrintWriter;

/*package*/ class EvaluationTree extends MPSTree implements DataProvider {
  private String myClassFqName;
  private ThreadReference myThreadReference;
  private Map<AbstractEvaluationModel, EvaluationTree.EvaluationState> myStates = MapSequence.fromMap(new HashMap<AbstractEvaluationModel, EvaluationTree.EvaluationState>());

  public EvaluationTree() {
    super();
    setRootVisible(false);
    setShowsRootHandles(true);
    rebuildNow();
  }

  public void updateLocation(String classFqName, ThreadReference threadReference) {
    myClassFqName = classFqName;
    myThreadReference = threadReference;
  }

  /*package*/ void addModel(AbstractEvaluationModel model) {
    ApplicationManager.getApplication().assertIsDispatchThread();
    MapSequence.fromMap(myStates).put(model, new EvaluationTree.InitializedState());
  }

  /*package*/ void removeModel(AbstractEvaluationModel model) {
    ApplicationManager.getApplication().assertIsDispatchThread();
    MapSequence.fromMap(myStates).removeKey(model);
  }

  /*package*/ void setResultProxy(IValueProxy valueProxy, AbstractEvaluationModel model) {
    ApplicationManager.getApplication().assertIsDispatchThread();
    MapSequence.fromMap(myStates).put(model, new EvaluationTree.ResultState(model.getPresentation(), valueProxy, myClassFqName, myThreadReference));
  }

  /*package*/ void setError(@NotNull String text, AbstractEvaluationModel model) {
    ApplicationManager.getApplication().assertIsDispatchThread();
    MapSequence.fromMap(myStates).put(model, new EvaluationTree.FailureState(text));
  }

  /*package*/ void setError(@NotNull Throwable error, AbstractEvaluationModel model) {
    ApplicationManager.getApplication().assertIsDispatchThread();
    MapSequence.fromMap(myStates).put(model, new EvaluationTree.FailureState(error));
  }

  /*package*/ void setEvaluating(AbstractEvaluationModel model) {
    ApplicationManager.getApplication().assertIsDispatchThread();
    MapSequence.fromMap(myStates).put(model, new EvaluationTree.EvaluationInProgressState());
  }

  @Override
  protected MPSTreeNode rebuild() {
    MPSTreeNode rootTreeNode = new TextTreeNode("Evaluation Result");
    for (AbstractEvaluationModel model : SetSequence.fromSet(MapSequence.fromMap(myStates).keySet())) {
      MapSequence.fromMap(myStates).get(model).rebuild(rootTreeNode, model);
    }
    return rootTreeNode;
  }

  @Override
  public void dispose() {
    MapSequence.fromMap(myStates).clear();
    rebuildLater();
    super.dispose();
  }

  @Nullable
  public Object getData(@NonNls String dataId) {
    if (dataId.equals(EvaluationUi.EVALUATION_MODEL.getName())) {
      TreePath path = getSelectionPath();
      if (path != null) {
        Object component = path.getLastPathComponent();
        if (component instanceof EvaluationTree.EvaluationModelNode) {
          return ((EvaluationTree.EvaluationModelNode) component).getModel();
        }
      }
    }
    return null;
  }

  private static ActionGroup getWatchesActionGroup() {
    AnAction editWatchAction = new AnAction("Edit Watch") {
      public void actionPerformed(AnActionEvent event) {
        AbstractEvaluationModel model = EvaluationUi.EVALUATION_MODEL.getData(event.getDataContext());
        // todo remove cast 
        ((EvaluationProvider) model.getDebugSession().getEvaluationProvider()).showEditWatchDialog(MPSDataKeys.OPERATION_CONTEXT.getData(event.getDataContext()), model);
      }

      @Override
      public void update(AnActionEvent event) {
        event.getPresentation().setVisible(EvaluationUi.EVALUATION_MODEL.getData(event.getDataContext()) != null);
      }
    };
    return new DefaultActionGroup(editWatchAction);
  }

  private static abstract class EvaluationState {
    public EvaluationState() {
    }

    public abstract void rebuild(MPSTreeNode rootTreeNode, AbstractEvaluationModel model);
  }

  public static interface EvaluationModelNode {
    public AbstractEvaluationModel getModel();
  }

  private static class InitializedState extends EvaluationTree.EvaluationState {
    public InitializedState() {
    }

    public void rebuild(MPSTreeNode rootTreeNode, AbstractEvaluationModel model) {
      rootTreeNode.add(new EvaluationTree.InitialTreeNode(model));
      // todo? 
    }
  }

  private static class EvaluationInProgressState extends EvaluationTree.EvaluationState {
    public EvaluationInProgressState() {
    }

    public void rebuild(MPSTreeNode rootTreeNode, AbstractEvaluationModel model) {
      rootTreeNode.add(new EvaluationTree.EvaluatingTreeNode(model));
    }
  }

  private static class ResultState extends EvaluationTree.EvaluationState {
    @NotNull
    private final IValueProxy myValueProxy;
    @NotNull
    private final String myClassFqName;
    private final ThreadReference myThreadReference;
    private final String myPresentation;
    private CalculatedWatchable myCachedWatchable;

    public ResultState(String presentation, IValueProxy proxy, @NotNull String classFqName, ThreadReference threadReference) {
      myPresentation = presentation;
      myValueProxy = proxy;
      myClassFqName = classFqName;
      myThreadReference = threadReference;
    }

    public void rebuild(MPSTreeNode rootTreeNode, AbstractEvaluationModel model) {
      final boolean canEvalaute = model.getDebugSession().isStepEnabled();
      if (canEvalaute) {
        myCachedWatchable = new CalculatedWatchable(myPresentation, myValueProxy.getJDIValue(), myClassFqName, myThreadReference);
      }
      if (myCachedWatchable != null) {
        WatchableNode watchableNode = new EvaluationTree.ResultState.MyWatchableNode(model, myCachedWatchable) {
          @Override
          public boolean isLeaf() {
            if (canEvalaute) {
              return super.isLeaf();
            }
            return true;
          }
        };
        rootTreeNode.add(watchableNode);
      } else {
        rootTreeNode.add(new EvaluationTree.InitialTreeNode(model));
      }
    }

    private class MyWatchableNode extends WatchableNode implements EvaluationTree.EvaluationModelNode {
      private final AbstractEvaluationModel myModel;

      public MyWatchableNode(AbstractEvaluationModel model, @NotNull IWatchable watchable) {
        super(watchable);
        myModel = model;
      }

      @Override
      public ActionGroup getActionGroup() {
        ActionGroup group = super.getActionGroup();
        if (group == null) {
          return new DefaultActionGroup(getWatchesActionGroup());
        }
        return new DefaultActionGroup(group, getWatchesActionGroup());
      }

      public AbstractEvaluationModel getModel() {
        return myModel;
      }
    }
  }

  private static class FailureState extends EvaluationTree.EvaluationState {
    @Nullable
    private String myErrorText;
    private Throwable myError;

    public FailureState(String errorText) {
      myErrorText = errorText;
    }

    private FailureState(Throwable error) {
      myError = error;
    }

    public void rebuild(MPSTreeNode rootTreeNode, AbstractEvaluationModel model) {
      if (myError != null) {
        rootTreeNode.add(new EvaluationTree.ErrorTreeNode(model, myError));
      } else {
        rootTreeNode.add(new EvaluationTree.ErrorTreeNode(model, myErrorText));
      }
    }
  }

  private static class ErrorTreeNode extends TextTreeNode implements EvaluationTree.EvaluationModelNode {
    private final List<String> myExtendedMessage = ListSequence.fromList(new ArrayList<String>());
    private final AbstractEvaluationModel myModel;

    public ErrorTreeNode(AbstractEvaluationModel model, @NotNull String text, String... extendedMessage) {
      super(model.getPresentation() + " = " + text);
      myModel = model;
      if (extendedMessage != null && extendedMessage.length > 0) {
        for (int i = 0; i < extendedMessage.length; i++) {
          ListSequence.fromList(myExtendedMessage).addElement(extendedMessage[i]);
        }
      }

      doInit();
    }

    public ErrorTreeNode(AbstractEvaluationModel model, Throwable t) {
      this(model, (t.getMessage() == null ?
        t.toString() :
        t.getMessage()
      ), getStackTrace(t));
    }

    @Override
    public boolean isLeaf() {
      return ListSequence.fromList(myExtendedMessage).count() == 0;
    }

    @Override
    protected void updatePresentation() {
      super.updatePresentation();

      setColor(Color.RED);
      setIcon(Icons.ERROR_ICON);
    }

    @Override
    protected void doInit() {
      for (String messagePart : ListSequence.fromList(myExtendedMessage)) {
        TextTreeNode node = new TextTreeNode(messagePart) {
          @Override
          public boolean isLeaf() {
            return true;
          }
        };
        add(node);
        node.setIcon(Icons.ERROR_ICON);
      }
    }

    @Override
    public ActionGroup getActionGroup() {
      DefaultActionGroup defaultActionGroup = new DefaultActionGroup();
      defaultActionGroup.add(new AnAction("Copy Stacktrace To Clipboard") {
        public void actionPerformed(AnActionEvent event) {
          CopyPasteUtil.copyTextToClipboard(getText() + ListSequence.fromList(myExtendedMessage).foldLeft("", new ILeftCombinator<String, String>() {
            public String combine(String s, String it) {
              return s + "\n" + it;
            }
          }));
        }
      });
      defaultActionGroup.add(getWatchesActionGroup());
      return defaultActionGroup;
    }

    public AbstractEvaluationModel getModel() {
      return myModel;
    }

    private static String[] getStackTrace(Throwable t) {
      StringWriter writer = new StringWriter();
      t.printStackTrace(new PrintWriter(writer));
      return writer.toString().split("\n");
    }
  }

  private static class EvaluatingTreeNode extends TextTreeNode implements EvaluationTree.EvaluationModelNode {
    private final AbstractEvaluationModel myModel;

    public EvaluatingTreeNode(AbstractEvaluationModel model) {
      super(model.getPresentation() + " = " + "evaluating...");
      myModel = model;
    }

    @Override
    public boolean isLeaf() {
      return true;
    }

    @Override
    protected void updatePresentation() {
      super.updatePresentation();
      setColor(Color.GRAY);
      setIcon(Icons.INFORMATION_ICON);
    }

    public AbstractEvaluationModel getModel() {
      return myModel;
    }
  }

  private static class InitialTreeNode extends TextTreeNode {
    public InitialTreeNode(AbstractEvaluationModel model) {
      super(model.getPresentation() + " = ");
      setIcon(jetbrains.mps.debug.integration.Icons.WATCH);
    }

    public boolean isLeaf() {
      return true;
    }
  }
}
