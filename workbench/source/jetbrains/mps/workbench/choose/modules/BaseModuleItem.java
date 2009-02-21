/*
 * Copyright 2003-2009 JetBrains s.r.o.
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
package jetbrains.mps.workbench.choose.modules;

import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.vcs.FileStatus;
import jetbrains.mps.project.IModule;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.MPSModuleRepository;
import org.jetbrains.annotations.Nullable;

public abstract class BaseModuleItem implements NavigationItem {
  private IModule myModule;
  private String myShortName;

  public BaseModuleItem(IModule module) {
    myModule = module;
    myShortName = NameUtil.shortNameFromLongName(myModule.getModuleUID());
  }

  public IModule getModule() {
    return myModule;
  }

  public String getName() {
    return null;
  }

  @Nullable
  public ItemPresentation getPresentation() {
    return new ModulePresentation(myModule);
  }

  public FileStatus getFileStatus() {
    //todo return correct value
    return FileStatus.NOT_CHANGED;
  }

  public boolean canNavigate() {
    return true;
  }

  public boolean canNavigateToSource() {
    return false;
  }
}
