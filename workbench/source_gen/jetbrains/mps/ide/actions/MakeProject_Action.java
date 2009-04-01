package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import java.util.Set;
import jetbrains.mps.project.IModule;
import java.util.LinkedHashSet;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.make.ModuleMaker;
import jetbrains.mps.reloading.ClassLoaderManager;

public class MakeProject_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(MakeProject_Action.class);

  public Project ideaProject;
  public MPSProject project;

  public MakeProject_Action() {
    super("Make Project", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "MakeProject", t);
      }
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.ideaProject = event.getData(MPSDataKeys.PROJECT);
    if (this.ideaProject == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      final Set<IModule> modules = new LinkedHashSet<IModule>();
      SetSequence.fromSet(modules).addSequence(ListSequence.fromList(MakeProject_Action.this.project.getProjectSolutions()));
      SetSequence.fromSet(modules).addSequence(ListSequence.fromList(MakeProject_Action.this.project.getProjectLanguages()));
      SetSequence.fromSet(modules).addSequence(ListSequence.fromList(MakeProject_Action.this.project.getProjectDevKits()));
      ProgressManager.getInstance().run(new Task.Modal(MakeProject_Action.this.ideaProject, "Making", true) {

        public void run(@NotNull() final ProgressIndicator indicator) {
          ModelAccess.instance().runReadAction(new Runnable() {

            public void run() {
              new ModuleMaker().make(modules, indicator);
              ClassLoaderManager.getInstance().reloadAll(indicator);
            }
          });
        }
      });
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "MakeProject", t);
      }
    }
  }

}
