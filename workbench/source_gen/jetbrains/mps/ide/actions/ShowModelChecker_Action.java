package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;

public class ShowModelChecker_Action extends GeneratedAction {
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}/icons/modelChecker.png", "jetbrains.mps.ide"), true);
  protected static Log log = LogFactory.getLog(ShowModelChecker_Action.class);

  private MPSProject mpsProject;

  public ShowModelChecker_Action() {
    super("Show Model Checker", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl alt C";
  }

  public boolean isApplicable(AnActionEvent event) {
    return ShowModelChecker_Action.this.mpsProject.getPluginManager().getTool(ModelCheckerTool_Tool.class).isAvailable();
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "ShowModelChecker", t);
      }
      this.disable(event.getPresentation());
    }
  }

  @Override
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.mpsProject = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.mpsProject == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      ModelCheckerTool_Tool tool = ShowModelChecker_Action.this.mpsProject.getPluginManager().getTool(ModelCheckerTool_Tool.class);
      if (!(tool.isAvailable()) || !(tool.toolIsOpened())) {
        // Not visible: open 
        tool.openToolLater(true);
      } else if (tool.getToolWindow().isActive()) {
        // Visible and active: hide 
        tool.getToolWindow().hide(null);
      } else {
        // Visible and not active: activate 
        tool.getToolWindow().activate(null);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "ShowModelChecker", t);
      }
    }
  }
}
