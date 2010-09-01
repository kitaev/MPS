package jetbrains.mps.vcs.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.smodel.SModelDescriptor;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.vcs.ProjectLevelVcsManager;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.vfs.VFileSystem;
import jetbrains.mps.workbench.MPSDataKeys;
import java.io.File;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.vcs.ModelUtils;
import jetbrains.mps.vcs.VcsHelper;
import java.io.IOException;
import jetbrains.mps.vcs.diff.ui.ModelDiffTool;
import com.intellij.openapi.ui.Messages;
import jetbrains.mps.generator.index.ModelDigestHelper;
import jetbrains.mps.vfs.IFile;

public class ReRunMergeFromBackup_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(ReRunMergeFromBackup_Action.class);

  private SModelDescriptor model;
  private Project project;

  public ReRunMergeFromBackup_Action() {
    super("Rerun Merge from Backup", "", ICON);
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
    if (!(ReRunMergeFromBackup_Action.this.model instanceof EditableSModelDescriptor)) {
      return false;
    }
    VirtualFile file = VFileSystem.getFile(ReRunMergeFromBackup_Action.this.getModelFile());
    if (file == null) {
      return false;
    }
    return manager.getVcsFor(file) != null;
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

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.model = event.getData(MPSDataKeys.MODEL);
    if (this.model == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.model = null;
    this.project = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      Iterable<File> backupFiles = Sequence.fromIterable(Sequence.fromArray(ReRunMergeFromBackup_Action.this.getBackupFiles())).sort(new ISelector<File, Comparable<?>>() {
        public Comparable<?> select(File f) {
          return f.lastModified();
        }
      }, false);
      for (File backupFile : Sequence.fromIterable(backupFiles)) {
        try {
          SModel[] models = ModelUtils.loadZippedModels(backupFile, VcsHelper.VcsMergeVersion.values());
          ReRunMergeFromBackup_Action.this.doMerge(models[VcsHelper.VcsMergeVersion.MINE.ordinal()], models[VcsHelper.VcsMergeVersion.BASE.ordinal()], models[VcsHelper.VcsMergeVersion.REPOSITORY.ordinal()]);
          return;
        } catch (IOException e) {
          if (log.isWarnEnabled()) {
            log.warn("", e);
          }
          // Skip this backup 
          continue;
        } catch (ModelDiffTool.ReadException e) {
          if (log.isWarnEnabled()) {
            log.warn("", e);
          }
          // Skip this backup 
          continue;
        }
      }
      Messages.showInfoMessage("No suitable backup files for " + ReRunMergeFromBackup_Action.this.model.getSModelReference().getSModelFqName() + "was not found.", "No Backup Files Found");
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "ReRunMergeFromBackup", t);
      }
    }
  }

  private void doMerge(SModel mine, SModel base, SModel repository) {
    SModel mineModel = ReRunMergeFromBackup_Action.this.whichMineModel(ReRunMergeFromBackup_Action.this.model.getSModel(), mine);
    if (mineModel == null) {
      return;
    }
    VcsHelper.showMergeDialog(base, mineModel, repository, ReRunMergeFromBackup_Action.this.getModelFile(), ReRunMergeFromBackup_Action.this.project);
  }

  private File[] getBackupFiles() {
    return ModelUtils.findZipFileNameForModelFile(ReRunMergeFromBackup_Action.this.getModelFile().getPath());
  }

  private String getHash(SModel model) {
    byte[] currentBytes = ModelUtils.modelToBytes(model);
    return ModelDigestHelper.hash(currentBytes);
  }

  private IFile getModelFile() {
    return ((EditableSModelDescriptor) ReRunMergeFromBackup_Action.this.model).getModelFile();
  }

  private SModel whichMineModel(SModel currentModel, SModel backUpModel) {
    if (ReRunMergeFromBackup_Action.this.getHash(currentModel).equals(ReRunMergeFromBackup_Action.this.getHash(backUpModel))) {
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
