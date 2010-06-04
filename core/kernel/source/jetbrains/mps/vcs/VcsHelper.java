/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.vcs;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.util.Computable;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.vcs.FilePath;
import com.intellij.openapi.vcs.actions.VcsContextFactory;
import com.intellij.openapi.vcs.impl.AbstractVcsHelperImpl;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.vcs.ModelUtils.Version;
import jetbrains.mps.vcs.diff.ui.MergeModelsDialog;
import jetbrains.mps.vcs.diff.ui.ModelDiffTool.ReadException;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.VFileSystem;
import jetbrains.mps.watching.ModelChangesWatcher;

import javax.swing.SwingUtilities;
import java.io.File;
import java.io.IOException;

public class VcsHelper {
  private static final Logger LOG = Logger.getLogger(VcsHelper.class);

  public static boolean showDiskMemoryMerge(final IFile modelFile, final SModel inMemory) {
    return ModelChangesWatcher.instance().executeUnderBlockedReload(new Computable<Boolean>() {
      @Override
      public Boolean compute() {
        try {
          File backupFile = doBackup(modelFile, inMemory);
          return showSimpleDialog(modelFile, inMemory, backupFile);
        } catch (IOException e) {
          LOG.error(e);
          throw new RuntimeException(e);
        }
      }
    });

  }

  private static boolean showSimpleDialog(IFile modelFile, SModel inMemory, File backupFile) {
    String message = "Model " + inMemory + " has conflicting changes.\n" +
      "It was modified on disk and in memory at the same time.\n" +
      "Fear not, backup of both versions was created and saved to:\n" +
      backupFile.getAbsolutePath() + "\n" +
      "Which version to use?";
    String title = "Model " + inMemory + " has conflicting changes.";
    String diskVersion = "Load Disk Version";
    String memoryVersion = "Save Memory Version";
    String showMergeDialog = "Show Merge Dialog";
    String[] options = {diskVersion, memoryVersion, showMergeDialog};
    int result = Messages.showDialog(message, title, options, 0, Messages.getQuestionIcon());
    if (result == -1) return showDiskMemoryMerge(modelFile, inMemory);
    if (options[result].equals(diskVersion)) {
      return false;
    } else if (options[result].equals(memoryVersion)) {
      return true;
    } else {
      return doRealMerge(modelFile, inMemory);
    }
  }

  private static File doBackup(IFile modelFile, SModel inMemory) throws IOException {
    File tmp = jetbrains.mps.util.FileUtil.createTmpDir();
    AbstractVcsHelperImpl.writeContentsToFile(ModelUtils.modelToBytes(inMemory), modelFile.getName(), tmp, FsMemoryMergeVersion.MEMORY.getSuffix());
    FileUtil.copy(modelFile.toFile(), new File(tmp.getAbsolutePath() + File.separator + modelFile.getName() + "." + FsMemoryMergeVersion.FILE_SYSTEM.getSuffix()));
    File zipfile = ModelUtils.chooseZipFileNameForModelFile(modelFile.getPath());
    jetbrains.mps.util.FileUtil.zip(tmp, zipfile);

    jetbrains.mps.util.FileUtil.delete(tmp);

    return zipfile;
  }

  private static boolean doRealMerge(IFile modelFile, final SModel inMemory) {
    try {
      final SModel onDisk = ModelUtils.readModel(FileUtil.loadFileBytes(FileSystem.toFile(modelFile)), modelFile.getPath());
      return showMergeDialog(inMemory, inMemory, onDisk, modelFile,ProjectManager.getInstance().getOpenProjects()[0]);
    } catch (IOException e) {
      LOG.error(e);
    } catch (ReadException e) {
      LOG.error(e);
    }
    return true;
  }

  public static boolean showMergeDialog(final SModel base, final SModel mine, final SModel repo, IFile modelFile, final Project project) {
    final VirtualFile file = VFileSystem.getFile(modelFile);
    LOG.assertLog(file != null);

    final MergeModelsDialog dialog = ModelAccess.instance().runWriteActionInCommand(new Computable<MergeModelsDialog>() {
      public MergeModelsDialog compute() {
        IOperationContext context = new ModuleContext(base.getModelDescriptor().getModule(), project);
        return new MergeModelsDialog(context, base, mine, repo);
      }
    });
    dialog.showDialog();
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        dialog.toFront();
      }
    });

    if (dialog.getResultModel() != null) {
      SModel result = dialog.getResultModel();
      byte[] bytes = ModelUtils.modelToBytes(result);
      ModelUtils.replaceWithNewModelFromBytes(file, bytes);
      return false;
    }
    return true;
  }

  public static FilePath getFilePath(IFile file) {
    return getFilePath(file.toFile());
  }

  public static FilePath getFilePath(String file) {
    return getFilePath(new File(file));
  }

  public static FilePath getFilePath(VirtualFile file) {
    return VcsContextFactory.SERVICE.getInstance().createFilePathOn(file);
  }

  public static FilePath getFilePath(File file) {
    return VcsContextFactory.SERVICE.getInstance().createFilePathOn(file);
  }

  public static FilePath getFilePath(VcsContextFactory factory, IFile file) {
    return getFilePath(factory, file.toFile());
  }

  public static FilePath getFilePath(VcsContextFactory factory, String file) {
    return getFilePath(factory, new File(file));
  }

  public static FilePath getFilePath(VcsContextFactory factory, VirtualFile file) {
    return factory.createFilePathOn(file);
  }

  public static FilePath getFilePath(VcsContextFactory factory, File file) {
    return factory.createFilePathOn(file);
  }

  public static enum FsMemoryMergeVersion implements Version {
    FILE_SYSTEM("filesystem"),
    MEMORY("memory");

    private final String mySuffix;

    FsMemoryMergeVersion(String suffix) {
      mySuffix = suffix;
    }

    public String getSuffix() {
      return mySuffix;
    }
  }

  public static enum VcsMergeVersion implements Version {
    MINE("mine"),
    THEIRS("repository"),
    BASE("base");

    private final String mySuffix;

    VcsMergeVersion(String suffix) {
      mySuffix = suffix;
    }

    public String getSuffix() {
      return mySuffix;
    }
  }
}
