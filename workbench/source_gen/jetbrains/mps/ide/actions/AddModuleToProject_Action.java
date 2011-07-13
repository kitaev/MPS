package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.project.IModule;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.project.structure.project.ProjectDescriptor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.vfs.IFile;

public class AddModuleToProject_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(AddModuleToProject_Action.class);

  public AddModuleToProject_Action() {
    super("Add to Project", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    for (IModule module : ((List<IModule>) MapSequence.fromMap(_params).get("modules"))) {
      if (((MPSProject) MapSequence.fromMap(_params).get("mpsProject")).getModules().contains(module)) {
        return false;
      }
    }
    return true;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "AddModuleToProject", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("modules", event.getData(MPSDataKeys.MODULES));
    if (MapSequence.fromMap(_params).get("modules") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("mpsProject", event.getData(MPSDataKeys.MPS_PROJECT));
    if (MapSequence.fromMap(_params).get("mpsProject") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      ProjectDescriptor descriptor = ((MPSProject) MapSequence.fromMap(_params).get("mpsProject")).getProjectDescriptor();
      for (IModule module : ListSequence.fromList(((List<IModule>) MapSequence.fromMap(_params).get("modules")))) {
        IFile descriptorFile = module.getDescriptorFile();
        assert descriptorFile != null;
        descriptor.addModule(descriptorFile.getPath());
      }
      ((MPSProject) MapSequence.fromMap(_params).get("mpsProject")).setProjectDescriptor(descriptor);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "AddModuleToProject", t);
      }
    }
  }
}
