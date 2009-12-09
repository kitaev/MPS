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
package jetbrains.mps.vcs;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vcs.FilePath;
import com.intellij.openapi.vcs.actions.VcsContextFactory;
import jetbrains.mps.cleanup.CleanupListener;
import jetbrains.mps.cleanup.CleanupManager;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.reloading.CompositeClassPathItem;
import jetbrains.mps.reloading.FileClassPathItem;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.ModuleRepositoryAdapter;
import jetbrains.mps.smodel.ModuleRepositoryListener;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.vfs.VFileSystem;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.io.File;

public class GlobalClassPathIndex implements ApplicationComponent {
  private static final Logger LOG = Logger.getLogger(GlobalClassPathIndex.class);

  public static GlobalClassPathIndex getInstance() {
    return ApplicationManager.getApplication().getComponent(GlobalClassPathIndex.class);
  }

  private final VcsContextFactory myVcsContextFactory;
  private final MPSModuleRepository myModuleRepository;
  private final Map<String, ArrayList<IModule>> myClassPathIndex = new HashMap<String, ArrayList<IModule>>();
  private final HashSet<String> myExcludedClassPath = new HashSet<String>();
  private boolean myIsChanged = false;
  private final List<ExclusionChangedListener> myListeners = new ArrayList<ExclusionChangedListener>();
  private final ModuleRepositoryAdapter myModuleRepositoryListener = new ModuleRepositoryAdapter() {
    @Override
    public void moduleAdded(IModule module) {
      if (module.isPackaged()) return;
      GlobalClassPathIndex.this.moduleAdded(module);
    }

    @Override
    public void moduleInitialized(IModule module) {
//  todo moduleInitialized is not called on change module properties => move this call to the right place
//      GlobalClassPathIndex.this.moduleInitialized(module);
    }

    @Override
    public void moduleChanged(IModule changedModule) {
      if (changedModule.isPackaged()) return;
      GlobalClassPathIndex.this.moduleInitialized(changedModule);
      if (myIsChanged) {
        notifyListeners();
        myIsChanged = false;
      }
    }

    @Override
    public void moduleRemoved(IModule module) {
      if (module.isPackaged()) return;
      GlobalClassPathIndex.this.moduleRemoved(module);
    }
  };

  public GlobalClassPathIndex(final MPSModuleRepository moduleRepository, VcsContextFactory factory) {
    myModuleRepository = moduleRepository;
    myVcsContextFactory = factory;
  }

  private void notifyListeners() {
    for (ExclusionChangedListener l : myListeners) {
      l.exclusionChanged();
    }
  }

  public void addListener(ExclusionChangedListener l) {
    myListeners.add(l);
  }

  public void removeListener(ExclusionChangedListener l) {
    myListeners.remove(l);
  }

  private void moduleInitialized(IModule module) {
    updateClassesGen(module);
    updateClassPath(module, module.getClassPathItem());
  }

  private void updateClassesGen(IModule module) {
    IFile classesGen = module.getClassesGen();
    if (classesGen == null) return;
    myExcludedClassPath.add(classesGen.getCanonicalPath());
  }


  private void updateClassPath(IModule module, IClassPathItem item) {
    if (item instanceof CompositeClassPathItem) {
      List<IClassPathItem> children = ((CompositeClassPathItem) item).getChildren();
      for (IClassPathItem child : children) {
        updateClassPath(module, child);
      }
    } else if (item instanceof FileClassPathItem) {
      String classPath = ((FileClassPathItem) item).getClassPath();
      if (new File(classPath).isDirectory()) {
        dealWithClassPathOnModuleInit(module, classPath);
      }
    }
  }

  private void dealWithClassPathOnModuleInit(IModule module, String classPathFile) {
    ArrayList<IModule> modules = myClassPathIndex.get(classPathFile);
    if (modules == null) {
      modules = new ArrayList<IModule>();
      myClassPathIndex.put(classPathFile, modules);
    }
    if (!modules.contains(module)) {
      modules.add(module);
    }
    if (isClassPathExcludedInModule(module, classPathFile) && !myExcludedClassPath.contains(classPathFile)) {
      // should exclude classPath
      for (IModule m : myClassPathIndex.get(classPathFile)) {
        if (m == module) continue;
        m.excludeClassPath(classPathFile, true);
      }
      myExcludedClassPath.add(classPathFile);
      myIsChanged = true;
    } else if (!isClassPathExcludedInModule(module, classPathFile) && myExcludedClassPath.contains(classPathFile)) {
      // should include classPath
      for (IModule m : myClassPathIndex.get(classPathFile)) {
        if (m == module) continue;
        m.excludeClassPath(classPathFile, false);
      }
      myExcludedClassPath.remove(classPathFile);
      myIsChanged = true;
    }
  }

  private void moduleRemoved(IModule module) {
    unexcludeClassPath(module, module.getClassPathItem());
  }

  private void unexcludeClassPath(IModule module, IClassPathItem item) {
    if (item instanceof CompositeClassPathItem) {
      List<IClassPathItem> children = ((CompositeClassPathItem) item).getChildren();
      for (IClassPathItem child : children) {
        unexcludeClassPath(module, child);
      }
    } else if (item instanceof FileClassPathItem) {
      String classPath = ((FileClassPathItem) item).getClassPath();
      if (new File(classPath).isDirectory()) {
        dealWithClassPathOnModuleRemove(module, classPath);
      }
    }
  }

  private void dealWithClassPathOnModuleRemove(IModule module, String classPathFile) {
    ArrayList<IModule> modules = myClassPathIndex.get(classPathFile);
    if (modules != null) {
      boolean removed = modules.remove(module);
      LOG.assertLog(removed, "Classpath index does not contain module " + module + " for classpath " + classPathFile);
    }
    if (isClassPathExcludedInModule(module, classPathFile)) {
      // if we exclude this class path and nobody else does, we remove classPath from excluded
      if (myExcludedClassPath.contains(classPathFile) && (modules == null || modules.isEmpty())) {
        myExcludedClassPath.remove(classPathFile);
      }
    }
  }

  private void moduleAdded(IModule module) {
    excludeClassesGen(module);
    excludeClassPath(module, module.getClassPathItem());
  }

  private void excludeClassPath(IModule module, IClassPathItem item) {
    if (item instanceof CompositeClassPathItem) {
      List<IClassPathItem> children = ((CompositeClassPathItem) item).getChildren();
      for (IClassPathItem child : children) {
        excludeClassPath(module, child);
      }
    } else if (item instanceof FileClassPathItem) {
      String classPath = ((FileClassPathItem) item).getClassPath();
      if (new File(classPath).isDirectory()) {
        dealWithClassPathOnModuleAdd(module, classPath);
      }
    }
  }

  private void dealWithClassPathOnModuleAdd(IModule module, String classPathFile) {
    if (isClassPathExcludedInModule(module, classPathFile)) {
      // we only need to update this module if classPath is included in other modules
      ArrayList<IModule> modules = myClassPathIndex.get(classPathFile);
      if (!myExcludedClassPath.contains(classPathFile) && (modules != null) && !modules.isEmpty()) {
        module.excludeClassPath(classPathFile, false);
        modules.add(module);
      } else if (modules == null) {
        putModuleInIndex(module, classPathFile);
        myExcludedClassPath.add(classPathFile);
      } else {
        modules.add(module);
        myExcludedClassPath.add(classPathFile);
      }
    } else {
      // if classpath is included, we check that it is included in every else module
      ArrayList<IModule> modules = myClassPathIndex.get(classPathFile);
      if (modules == null) {
        putModuleInIndex(module, classPathFile);
      } else {
        // we only need update all existing modules if the classPath is excluded
        if (myExcludedClassPath.remove(classPathFile)) {
          for (IModule m : modules) {
            m.excludeClassPath(classPathFile, false);
          }
        }
        modules.add(module);
      }
    }
  }

  private boolean isClassPathExcludedInModule(IModule module, String classPathFile) {
    return module.isClassPathExcluded(classPathFile.replace("/", File.separator));
  }

  private void putModuleInIndex(IModule module, String classPathFile) {
    ArrayList<IModule> modules = new ArrayList<IModule>();
    modules.add(module);
    myClassPathIndex.put(classPathFile, modules);
  }

  private void excludeClassesGen(IModule module) {
    IFile classesGen = module.getClassesGen();
    if (classesGen == null) return;
    myExcludedClassPath.add(classesGen.getCanonicalPath());
  }

  @NotNull
  public String getComponentName() {
    return "Global Class Path Index";
  }

  public void initComponent() {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        List<IModule> moduleList = myModuleRepository.getAllModules();
        for (IModule module : moduleList) {
          moduleAdded(module);
        }
      }
    });
    myModuleRepository.addModuleRepositoryListener(myModuleRepositoryListener);
  }

  public void disposeComponent() {
    myModuleRepository.removeModuleRepositoryListener(myModuleRepositoryListener);
  }

  public boolean isExcluded(VirtualFile file) {
    return isExcluded(file.getPath());
  }

  public boolean isExcluded(FilePath filePath) {
    return isExcluded(filePath.getPath());
  }

  public boolean isExcluded(String filePath) {
    return myExcludedClassPath.contains(filePath);
  }

  public Set<String> getExcludedClassPath() {
    return Collections.unmodifiableSet(myExcludedClassPath);
  }

  public static interface ExclusionChangedListener {
    void exclusionChanged();
  }
}
