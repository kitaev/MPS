package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SModelDescriptor;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.workbench.actions.imports.ImportHelper;

public class AddModelImport_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(AddModelImport_Action.class);
  private static final Icon ICON = null;

  public Project project;
  public MPSProject mpsProject;
  public IModule module;
  public SModelDescriptor model;

  public AddModelImport_Action() {
    super("Add Model Import", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl M";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "AddModelImport", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    this.mpsProject = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.mpsProject == null) {
      return false;
    }
    this.module = event.getData(MPSDataKeys.MODULE);
    if (this.module == null) {
      return false;
    }
    this.model = event.getData(MPSDataKeys.MODEL);
    if (this.model == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      ImportHelper.addModelImport(AddModelImport_Action.this.project, AddModelImport_Action.this.mpsProject, AddModelImport_Action.this.module, AddModelImport_Action.this.model);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "AddModelImport", t);
    }
  }

}
