package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;

import jetbrains.mps.vcs.VcsHelper.VcsMergeVersion;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.MPSProject;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.vcs.ProjectLevelVcsManager;
import jetbrains.mps.vfs.VFileSystem;
import jetbrains.mps.workbench.MPSDataKeys;
import java.io.File;
import com.intellij.openapi.ui.Messages;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.vcs.ModelUtils;
import jetbrains.mps.vcs.VcsHelper;
import java.io.FileNotFoundException;
import jetbrains.mps.generator.ModelDigestIndex;

public class ReRunMergeFromBackup_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(ReRunMergeFromBackup_Action.class);

  private SModelDescriptor model;
  private MPSProject mpsProject;
  private Project project;

  public ReRunMergeFromBackup_Action() {
    super("Re-Run Merge From Backup", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    ProjectLevelVcsManager manager = ProjectLevelVcsManager.getInstance(ReRunMergeFromBackup_Action.this.project);
    if (manager.getAllVersionedRoots().length == 0) {
      return false;
    }
    return manager.getVcsFor(VFileSystem.getFile(ReRunMergeFromBackup_Action.this.model.getModelFile())) != null;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "ReRunMergeFromBackup", t);
      }
      this.disable(event.getPresentation());
    }
  }

  @Override
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.model = event.getData(MPSDataKeys.MODEL);
    if (this.model == null) {
      return false;
    }
    this.mpsProject = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.mpsProject == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      File[] backupFiles = ReRunMergeFromBackup_Action.this.getBackupFiles();
      if (backupFiles.length == 0) {
        Messages.showInfoMessage("Suitable backup file for model\n" + ReRunMergeFromBackup_Action.this.model + "\nwas not found.", "Backup File Not Found");
        return;
      }
      File latestBackup = backupFiles[0];
      for (File backupFile : backupFiles) {
        if (backupFile.lastModified() > latestBackup.lastModified()) {
          latestBackup = backupFile;
        }
      }
      try {
        SModel[] models = ModelUtils.loadZippedModels(latestBackup, VcsMergeVersion.values());
        ReRunMergeFromBackup_Action.this.doMerge(models[VcsMergeVersion.MINE.ordinal()], models[VcsMergeVersion.BASE.ordinal()], models[VcsMergeVersion.THEIRS.ordinal()]);
      } catch (FileNotFoundException e) {
        Messages.showErrorDialog("Backup File\n" + latestBackup.getPath() + "\nIs Invalid:\n" + e.getMessage(), "Invalid Backup File");
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "ReRunMergeFromBackup", t);
      }
    }
  }

  private void doMerge(SModel mine, SModel base, SModel theirs) {
    SModel mineModel = ReRunMergeFromBackup_Action.this.whichMineModel(ReRunMergeFromBackup_Action.this.model.getSModel(), mine);
    if (mineModel == null) {
      return;
    }
    VcsHelper.showMergeDialog(base, mineModel, theirs, ReRunMergeFromBackup_Action.this.model.getModelFile(), ReRunMergeFromBackup_Action.this.mpsProject);
  }

  private File[] getBackupFiles() {
    return ModelUtils.findZipFileNameForModelFile(ReRunMergeFromBackup_Action.this.model.getModelFile().getPath());
  }

  private String getHash(SModel model) {
    byte[] currentBytes = ModelUtils.modelToBytes(model);
    return ModelDigestIndex.hash(currentBytes);
  }

  private SModel whichMineModel(SModel currentModel, SModel backUpModel) {
    if (ReRunMergeFromBackup_Action.this.getHash(currentModel).equals(backUpModel)) {
      return currentModel;
    } else {
      String current = "Currently Loaded Model";
      String backup = "Backed Up Model";
      String[] options = {current ,backup};
      int result = Messages.showDialog("Backed up \"mine\" model is different from current model.\n Which version would you like to use?", "Current model differs from backup.", options, 0, Messages.getQuestionIcon());
      if (result == -1) {
        return null;
      } else if (options[result].equals(current)) {
        return currentModel;
      } else {
        return backUpModel;
      }
    }
  }
}
