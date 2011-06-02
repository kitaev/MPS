package jetbrains.mps.ide.make.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.make.ModuleMaker;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.project.IModule;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.workbench.MPSDataKeys;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;
import java.util.LinkedHashSet;
import java.util.Map;

public class CleanAllModules_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(CleanAllModules_Action.class);

  public CleanAllModules_Action() {
    super("Clean Compiled Java Files", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "CleanAllModules", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      ProgressManager.getInstance().run(new Task.Modal(((Project) MapSequence.fromMap(_params).get("project")), "Cleaning", true) {
        public void run(@NotNull final ProgressIndicator indicator) {
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              ModuleMaker maker = new ModuleMaker();
              maker.clean(SetSequence.fromSetWithValues(new LinkedHashSet<IModule>(), MPSModuleRepository.getInstance().getAllModules()), indicator);
              ClassLoaderManager.getInstance().reloadAll(indicator);
            }
          });
        }
      });
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "CleanAllModules", t);
      }
    }
  }
}
