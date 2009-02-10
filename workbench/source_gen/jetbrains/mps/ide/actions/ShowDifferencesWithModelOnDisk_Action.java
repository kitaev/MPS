package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.smodel.SModelDescriptor;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.vcs.diff.ui.ModelDifferenceDialog;
import com.intellij.openapi.application.ModalityState;

public class ShowDifferencesWithModelOnDisk_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(ShowDifferencesWithModelOnDisk_Action.class);
  private static final Icon ICON = null;

  public SModelDescriptor modelDescriptor;
  public Frame frame;

  public ShowDifferencesWithModelOnDisk_Action() {
    super("Show Differences With Model On Disk", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowDifferencesWithModelOnDisk", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.modelDescriptor = event.getData(MPSDataKeys.MODEL);
    if (this.modelDescriptor == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      final SModel memory = ShowDifferencesWithModelOnDisk_Action.this.modelDescriptor.getSModel();
      final SModel disk = ModelPersistence.readModel(ShowDifferencesWithModelOnDisk_Action.this.modelDescriptor.getModelFile());
      ApplicationManager.getApplication().invokeLater(new Runnable() {

        public void run() {
          new ModelDifferenceDialog(ShowDifferencesWithModelOnDisk_Action.this.frame, disk, memory, "Model Difference", true).showDialog();
        }

      }, ModalityState.NON_MODAL);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowDifferencesWithModelOnDisk", t);
    }
  }

}
