package jetbrains.mps.vcs.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import com.intellij.openapi.vcs.ProjectLevelVcsManager;
import com.intellij.openapi.project.Project;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.ide.vfs.VirtualFileUtils;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.workbench.MPSDataKeys;
import java.io.File;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.vcs.ModelUtils;
import jetbrains.mps.vcs.VcsMergeVersion;
import java.io.IOException;
import com.intellij.openapi.ui.Messages;
import jetbrains.mps.vcs.VcsHelper;
import jetbrains.mps.generator.ModelDigestUtil;
import jetbrains.mps.vfs.IFile;

public class ReRunMergeFromBackup_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(ReRunMergeFromBackup_Action.class);

  public ReRunMergeFromBackup_Action() {
    super("Rerun Merge from Backup", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    ProjectLevelVcsManager manager = ProjectLevelVcsManager.getInstance(((Project) MapSequence.fromMap(_params).get("project")));
    if (manager.getAllVersionedRoots().length == 0) {
      return false;
    }
    if (!(((SModelDescriptor) MapSequence.fromMap(_params).get("model")) instanceof EditableSModelDescriptor)) {
      return false;
    }
    VirtualFile file = VirtualFileUtils.getVirtualFile(ReRunMergeFromBackup_Action.this.getModelFile(_params));
    if (file == null) {
      return false;
    }
    return manager.getVcsFor(file) != null && Sequence.fromIterable(ReRunMergeFromBackup_Action.this.getBackupFiles(_params)).isNotEmpty();
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "ReRunMergeFromBackup", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("model", event.getData(MPSDataKeys.MODEL));
    if (MapSequence.fromMap(_params).get("model") == null) {
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
      for (File backupFile : Sequence.fromIterable(ReRunMergeFromBackup_Action.this.getBackupFiles(_params))) {
        try {
          SModel[] models = ModelUtils.loadZippedModels(backupFile, VcsMergeVersion.values());
          ReRunMergeFromBackup_Action.this.doMerge(models[VcsMergeVersion.MINE.ordinal()], models[VcsMergeVersion.BASE.ordinal()], models[VcsMergeVersion.REPOSITORY.ordinal()], _params);
          return;
        } catch (IOException e) {
          if (log.isWarnEnabled()) {
            log.warn("", e);
          }
          // Skip this backup 
          continue;
        }
      }
      Messages.showInfoMessage("No suitable backup files for " + ((SModelDescriptor) MapSequence.fromMap(_params).get("model")).getSModelReference().getSModelFqName() + "was not found.", "No Backup Files Found");
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "ReRunMergeFromBackup", t);
      }
    }
  }

  private Iterable<File> getBackupFiles(final Map<String, Object> _params) {
    return ModelUtils.findZipFilesForModelFile(ReRunMergeFromBackup_Action.this.getModelFile(_params).getName());
  }

  private void doMerge(SModel mine, SModel base, SModel repository, final Map<String, Object> _params) {
    SModel mineModel = ReRunMergeFromBackup_Action.this.whichMineModel(((SModelDescriptor) MapSequence.fromMap(_params).get("model")).getSModel(), mine, _params);
    if (mineModel == null) {
      return;
    }
    VcsHelper.showMergeDialog(base, mineModel, repository, ReRunMergeFromBackup_Action.this.getModelFile(_params), ((Project) MapSequence.fromMap(_params).get("project")));
  }

  private String getHash(SModel model, final Map<String, Object> _params) {
    byte[] currentBytes = ModelUtils.modelToBytes(model);
    return ModelDigestUtil.hash(currentBytes);
  }

  private IFile getModelFile(final Map<String, Object> _params) {
    return ((EditableSModelDescriptor) ((SModelDescriptor) MapSequence.fromMap(_params).get("model"))).getModelFile();
  }

  private SModel whichMineModel(SModel currentModel, SModel backUpModel, final Map<String, Object> _params) {
    if (ReRunMergeFromBackup_Action.this.getHash(currentModel, _params).equals(ReRunMergeFromBackup_Action.this.getHash(backUpModel, _params))) {
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
