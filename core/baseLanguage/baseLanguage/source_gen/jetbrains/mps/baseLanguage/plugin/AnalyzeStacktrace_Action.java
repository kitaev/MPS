package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import java.awt.Frame;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;

public class AnalyzeStacktrace_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(AnalyzeStacktrace_Action.class);

  private Frame frame;
  private IOperationContext context;
  private MPSProject project;

  public AnalyzeStacktrace_Action() {
    super("Analyze Stacktrace", "Analyze Stacktrace", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }


  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "AnalyzeStacktrace", t);
      this.disable(event.getPresentation());
    }
  }

  @Override
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      AnalyzeStacktraceDialog dialog = new AnalyzeStacktraceDialog(AnalyzeStacktrace_Action.this.frame, AnalyzeStacktrace_Action.this.context, AnalyzeStacktrace_Action.this.project);
      dialog.showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "AnalyzeStacktrace", t);
    }
  }
}
