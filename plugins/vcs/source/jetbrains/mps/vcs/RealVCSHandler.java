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

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.vcs.history.VcsRevisionNumber;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.List;

public class RealVCSHandler implements VCSHandler, ApplicationComponent {
  public void addSuspiciousModule(AbstractModule abstractModule, boolean isInConflict) {
    SuspiciousModelIndex.instance().addModule(abstractModule, isInConflict);
  }

  public void addSuspiciousModel(EditableSModelDescriptor modelDescriptor, boolean isInConflict) {
    SuspiciousModelIndex.instance().addModel(modelDescriptor, isInConflict);
  }

  public void addFilesToVcs(List<File> files, boolean recursive, boolean silently) {
    VCSUtil.addFilesToVcs(files, recursive, silently);
  }

  public void removeFromVcs(List<File> files, boolean silently) {
    VCSUtil.removeFilesFromVcs(files, silently);
  }

  public VcsRevisionNumber getRevisionNumber(VirtualFile file) {
    return VCSUtil.getRevisionNumber(file);
  }

  public boolean isInConflict(IFile iFile, boolean synchronously) {
    return VCSUtil.isInConflict(iFile, synchronously);
  }

  public boolean resolveDiskMemoryConflict(IFile modelFile, SModel model) {
    return VcsHelper.resolveDiskMemoryConflict(modelFile, model);
  }

  //-----component methods

  @NotNull
  public String getComponentName() {
    return "VCS Handler";
  }

  public void initComponent() {

  }

  public void disposeComponent() {

  }
}
