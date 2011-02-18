package jetbrains.mps.debugger.java.ui.evaluation;

/*Generated by MPS */

import javax.swing.JTabbedPane;
import jetbrains.mps.ide.embeddableEditor.EmbeddableEditor;
import jetbrains.mps.debugger.java.evaluation.model.AbstractEvaluationModel;
import jetbrains.mps.nodeEditor.Highlighter;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.debug.runtime.DebugSession;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.smodel.Language;
import javax.swing.JSplitPane;
import com.intellij.ui.components.JBScrollPane;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import javax.swing.JComponent;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;

public class EvaluationPanel extends EvaluationUi {
  private final JTabbedPane myTabbedPane = new JTabbedPane();
  private EmbeddableEditor myEditor;
  private EmbeddableEditor myResultEditor;
  private final AbstractEvaluationModel myEvaluationModel;
  private final Highlighter myHighlighter;
  private volatile boolean myIsDisposed = false;

  public EvaluationPanel(Project project, @NotNull DebugSession session, AbstractEvaluationModel evaluationModel, boolean autoUpdate) {
    super(session, autoUpdate);
    myHighlighter = project.getComponent(Highlighter.class);

    myEvaluationModel = evaluationModel;
    if (myEvaluationModel.isDeveloperMode()) {
      myEvaluationModel.addGenerationListener(new _FunctionTypes._void_P1_E0<SNode>() {
        public void invoke(SNode result) {
          EvaluationPanel.this.updateGenerationResultTab(result);
        }
      });
    }

    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        myEditor = new EmbeddableEditor(new ModuleContext(myEvaluationModel.getModule(), myEvaluationModel.getModule().getMPSProject().getProject()), myEvaluationModel.getModel(), myEvaluationModel.getRootToShow(), myEvaluationModel.getNodeToShow(), true);

        for (Language language : myEvaluationModel.getRequiredLanguages()) {
          myEditor.addLanguage(language);
        }
      }
    });

    myTree.addModel(myEvaluationModel);
    if (myEvaluationModel.getDebugSession().isPaused()) {
      myTree.updateLocation(myDebugSession.getUiState().getStackFrame().getLocation().getUnitName(), myDebugSession.getUiState().getThread().getThread());
    }

    JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    splitPane.setResizeWeight(0.8);
    splitPane.setTopComponent(myEditor.getComponenet());
    splitPane.setBottomComponent(new JBScrollPane(myTree));

    if (myEvaluationModel.isDeveloperMode()) {
      myTabbedPane.addTab("Main", splitPane);
      add(myTabbedPane);
    } else {
      add(splitPane);
    }

    myEditor.getComponenet().registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent p0) {
        evaluate();
      }
    }, KeyStroke.getKeyStroke("ctrl ENTER"), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    myHighlighter.addAdditionalEditor(myEditor.getEditor());
  }

  public AbstractEvaluationModel getEvaluationModel() {
    return myEvaluationModel;
  }

  public void dispose() {
    ApplicationManager.getApplication().assertIsDispatchThread();
    if (myIsDisposed) {
      return;
    }
    myIsDisposed = true;
    super.dispose();
    myHighlighter.removeAdditionalEditor(myEditor.getEditor());
    myEditor.disposeEditor(false);
  }

  public void evaluate() {
    evaluate(myEvaluationModel);
  }

  public void updateGenerationResultTab(final SNode generatedResult) {
    ApplicationManager.getApplication().invokeLater(new Runnable() {
      public void run() {
        if (EvaluationPanel.this.myResultEditor == null) {
          ModelAccess.instance().runWriteActionInCommand(new Runnable() {
            public void run() {
              EvaluationPanel.this.myResultEditor = new EmbeddableEditor(new ModuleContext(myEvaluationModel.getModule(), myEvaluationModel.getModule().getMPSProject()), myEvaluationModel.getModule(), generatedResult, generatedResult, false);
            }
          });
          EvaluationPanel.this.myTabbedPane.add("Generated Result", EvaluationPanel.this.myResultEditor.getComponenet());
          EvaluationPanel.this.myTabbedPane.validate();
        } else {
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              EvaluationPanel.this.myResultEditor.setNode(generatedResult);
            }
          });
        }
      }
    }, ModalityState.NON_MODAL);
  }

  protected void update() {
    myEvaluationModel.updateState();
  }
}
