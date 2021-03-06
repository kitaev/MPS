/*
 * Copyright 2003-2011 JetBrains s.r.o.
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
package jetbrains.mps.project;

import com.intellij.openapi.util.Computable;
import com.intellij.openapi.util.Pair;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.dependency.DependenciesManager;
import jetbrains.mps.project.dependency.ModuleDependenciesManager;
import jetbrains.mps.project.listener.ModelCreationListener;
import jetbrains.mps.project.persistence.ModuleReadException;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.project.structure.modules.*;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.reloading.ClassPathFactory;
import jetbrains.mps.reloading.CompositeClassPathItem;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.runtime.BytecodeLocator;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.smodel.persistence.IModelRootManager;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.util.IterableUtil;
import jetbrains.mps.util.MacrosFactory;
import jetbrains.mps.util.PathManager;
import jetbrains.mps.vcs.VcsMigrationUtil;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;
import org.apache.commons.lang.ObjectUtils;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.*;

public abstract class AbstractModule implements IModule {
  private static final Logger LOG = Logger.getLogger(AbstractModule.class);

  public static final String MODULE_DIR = "module";

  private boolean myModelsRead = false;
  private boolean myInitialized = false;

  protected IFile myDescriptorFile;
  private ModuleReference myModuleReference;
  private List<SModelRoot> mySModelRoots = new ArrayList<SModelRoot>();
  private ModuleScope myScope = createScope();

  private CompositeClassPathItem myCachedClassPathItem;
  private DependenciesManager myDependenciesManager;

  private Map<Pair<String, String>, ModuleReference> myStubModulesCache = new HashMap<Pair<String, String>, ModuleReference>();

  //----model creation

  private static Set<ModelCreationListener> ourModelCreationListeners = new HashSet<ModelCreationListener>();

  public static void registerModelCreationListener(ModelCreationListener listener) {
    ourModelCreationListeners.add(listener);
  }

  public final EditableSModelDescriptor createModel(SModelFqName name, SModelRoot root) {
    IModelRootManager manager = root.getManager();

    if (!manager.isNewModelsSupported()) {
      LOG.error("Trying to create model root manager in root which doesn't support new models");
      return null;
    }

    EditableSModelDescriptor model = (EditableSModelDescriptor) manager.createNewModel(root, name, this);
    model.setChanged(true);

    for (ModelCreationListener listener : ourModelCreationListeners) {
      if (listener.isApplicable(model)) {
        listener.onCreate(model);
      }
    }

    return model;
  }

  //----reference

  protected void setModuleReference(@NotNull ModuleReference reference) {
    LOG.assertLog(myModuleReference == null || ObjectUtils.equals(myModuleReference.getModuleId(), reference.getModuleId()), reference.getModuleFqName());

    ModuleReference oldValue = myModuleReference;
    myModuleReference = reference;
    if (oldValue != null &&
      oldValue.getModuleFqName() != null &&
      !oldValue.getModuleFqName().equals(myModuleReference.getModuleFqName())) {

      MPSModuleRepository.getInstance().moduleFqNameChanged(this, oldValue.getModuleFqName());
    }
  }

  @NotNull
  public ModuleReference getModuleReference() {
    return myModuleReference;
  }

  public String getModuleFqName() {
    return myModuleReference.getModuleFqName();
  }

  //----adding different deps

  public void addDependency(@NotNull ModuleReference moduleRef, boolean reexport) {
    ModuleDescriptor descriptor = getModuleDescriptor();
    for (Dependency dep : descriptor.getDependencies()) {
      if (ObjectUtils.equals(dep.getModuleRef(), moduleRef)) return;
    }

    Dependency dep = new Dependency();
    dep.setModuleRef(moduleRef);
    dep.setReexport(reexport);
    descriptor.getDependencies().add(dep);
    //setModuleDescriptor(descriptor, true);
    invalidateCaches();
    save();
  }

  public void addUsedLanguage(ModuleReference langRef) {
    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor.getUsedLanguages().contains(langRef)) return;

    descriptor.getUsedLanguages().add(langRef);
//    setModuleDescriptor(descriptor, true);// removed as it follows to models disposing even after addChild()
    save();
  }

  public void addUsedDevkit(ModuleReference devkitRef) {
    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor.getUsedDevkits().contains(devkitRef)) return;

    descriptor.getUsedDevkits().add(devkitRef);
//    setModuleDescriptor(descriptor, true);
    save();
  }

  //----get deps

  public final DependenciesManager getDependenciesManager() {
    if (myDependenciesManager == null) {
      myDependenciesManager = createDependenciesManager();
    }
    return myDependenciesManager;
  }

  protected ModuleDependenciesManager createDependenciesManager() {
    return new ModuleDependenciesManager(this);
  }

  public List<Dependency> getDependencies() {
    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor == null) return new ArrayList<Dependency>();
    return new ArrayList<Dependency>(descriptor.getDependencies());
  }

  //----languages & devkits

  public List<ModuleReference> getUsedLanguagesReferences() {
    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor == null) return new ArrayList<ModuleReference>();
    return new ArrayList<ModuleReference>(descriptor.getUsedLanguages());
  }

  public List<ModuleReference> getUsedDevkitReferences() {
    List<ModuleReference> result = new ArrayList<ModuleReference>();
    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor != null) {
      result.addAll(descriptor.getUsedDevkits());
    }
    return result;
  }

  //----stubs

  public boolean areJavaStubsEnabled() {
    return true;
  }

  public List<StubPath> getAllStubPaths() {
    ArrayList<StubPath> result = new ArrayList<StubPath>();
    result.addAll(getStubPaths());
    result.addAll(getOwnStubPaths());
    return result;
  }

  public List<StubPath> getOwnStubPaths() {
    if (isCompileInMPS() && getClassesGen() != null) {
      String file = getClassesGen().getPath();
      if (file.endsWith("!/")) {
        file = file.substring(0, file.length() - 2);
      }
      if (new File(file).exists()) {
        return Collections.singletonList(new StubPath(getClassesGen().getPath(), LanguageID.JAVA_MANAGER));
      }
    }
    return Collections.emptyList();
  }

  public List<StubPath> getStubPaths() {
    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor != null) {
      List<ModelRoot> stubModelEntries = getModuleDescriptor().getStubModelEntries();
      ArrayList<StubPath> result = new ArrayList<StubPath>(stubModelEntries.size());
      for (ModelRoot entry : stubModelEntries) {
        result.add(new StubPath(entry.getPath(), entry.getManager()));
      }
      return result;
    }

    return Collections.emptyList();
  }

  protected List<ModelRoot> getStubModelEntriesToIncludeOrExclude() {
    return getModuleDescriptor().getStubModelEntries();
  }

  //----classpath

  public void updateClassPath() {
    myCachedClassPathItem = null;
  }

  public void invalidateClassPath() {
    Set<String> invalidate = new HashSet<String>();
    for (StubPath path : getAllStubPaths()) {
      if (!ObjectUtils.equals(path.getManager().getClassName(), LanguageID.JAVA_MANAGER.getClassName())) continue;
      invalidate.add(path.getPath());
    }
    ClassPathFactory.getInstance().invalidate(invalidate);
  }

  //todo check this code. Wy not to do it where we add jars?
  protected void updatePackagedDescriptorClasspath() {
    if (!isPackaged()) return;

    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor == null) return;

    IFile bundleHomeFile = getBundleHome();
    if (bundleHomeFile == null) return;

    IFile bundleParent = bundleHomeFile.getParent();
    if (bundleParent == null || !bundleParent.exists()) return;

    List<ModelRoot> toRemove = new ArrayList<ModelRoot>();
    for (ModelRoot sme : descriptor.getStubModelEntries()) {
      String path = sme.getPath();
      String shrinked = MacrosFactory.moduleDescriptor(this).shrinkPath(path, getDescriptorFile());
      if (MacrosFactory.containsNonMPSMacros(shrinked)) continue;
      toRemove.add(sme);
    }
    descriptor.getStubModelEntries().removeAll(toRemove);


    DeploymentDescriptor dd = descriptor.getDeploymentDescriptor();
    if (dd == null) return;

    for (String jarFile : dd.getLibraries()) {
      IFile jar = jarFile.startsWith("/")
        ? FileSystem.getInstance().getFileByPath(PathManager.getHomePath() + jarFile)
        : bundleParent.getDescendant(jarFile);
      if (jar.exists()) {
        ClassPathEntry jarEntry = new ClassPathEntry();
        jarEntry.setPath(jar.getPath());
        descriptor.getStubModelEntries().add(jetbrains.mps.project.structure.model.ModelRootUtil.fromClassPathEntry(jarEntry));
      }
    }
  }

  public IClassPathItem getClassPathItem() {
    if (myCachedClassPathItem == null) {
      myCachedClassPathItem = new CompositeClassPathItem();
      for (StubPath path : getAllStubPaths()) {
        //look for classes only in stub dirs with JavaStub manager
        if (!ObjectUtils.equals(path.getManager().getClassName(), LanguageID.JAVA_MANAGER.getClassName())) continue;

        try {
          IClassPathItem pathItem = ClassPathFactory.getInstance().createFromPath(path.getPath(), this);
          myCachedClassPathItem.add(pathItem);
        } catch (IOException e) {
          LOG.debug(e.getMessage());
        }
      }
    }
    return myCachedClassPathItem;
  }

  public IClassPathItem getModuleWithDependenciesClassPathItem() {
    return getDependenciesClasspath(CollectionUtil.set((IModule) this), false);
  }

  public static IClassPathItem getDependenciesClasspath(Set<IModule> modules, boolean includeStubSolutions) {
    return new ClasspathCollector(modules).collect(includeStubSolutions);
  }

  public BytecodeLocator getBytecodeLocator() {
    return new ModuleBytecodeLocator();
  }

  //----

  public List<SModelRoot> getSModelRoots() {
    return Collections.unmodifiableList(mySModelRoots);
  }

  protected void reloadAfterDescriptorChange() {
    rereadModels();

    updatePackagedDescriptorClasspath();
    updateClassPath();
  }

  public void onModuleLoad() {
    updateSModelReferences();
    updateModuleReferences();

    if (isPackaged()) {
      updatePackagedDescriptorClasspath();
    } else {
      Set<ModelRoot> visited = new HashSet<ModelRoot>();
      List<ModelRoot> remove = new ArrayList<ModelRoot>();
      for (ModelRoot e : getModuleDescriptor().getStubModelEntries()) {
        if (visited.contains(e)) {
          remove.add(e);
        }

        visited.add(e);
      }

      getModuleDescriptor().getStubModelEntries().removeAll(remove);
    }
  }

  public boolean isPackaged() {
    if (getDescriptorFile() == null) {
      return false;
    }
    return FileSystem.getInstance().isPackaged(getDescriptorFile());
  }

  public List<SModelDescriptor> getOwnModelDescriptors() {
    return SModelRepository.getInstance().getModelDescriptors(this);
  }

  public List<SModelDescriptor> getHiddenModelDescriptors() {
    return Collections.emptyList();
  }

  @Override
  public List<SModelDescriptor> getEditableUserModels() {
    return Collections.emptyList();
  }

  public IFile getClassesGen() {
    return ProjectPathUtil.getClassesGenFolder(getDescriptorFile());
  }

  public Set<SModelDescriptor> getImplicitlyImportedModelsFor(SModelDescriptor sm) {
    return new LinkedHashSet<SModelDescriptor>();
  }

  public Set<Language> getImplicitlyImportedLanguages(SModelDescriptor sm) {
    LinkedHashSet<Language> result = new LinkedHashSet<Language>();
    if (SModelStereotype.isGeneratorModel(sm)) {
      result.add(BootstrapLanguages.generatorLanguage());
    }
    return result;
  }

  public IFile getDescriptorFile() {
    return myDescriptorFile;
  }

  @NotNull
  public IScope getScope() {
    return myScope;
  }

  protected void readModels() {
    if (myModelsRead) return;

    myModelsRead = true;
    for (SModelRoot root : mySModelRoots) {
      root.dispose();
    }
    mySModelRoots.clear();

    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor != null) {
      List<jetbrains.mps.project.structure.model.ModelRoot> roots = descriptor.getModelRoots();
      for (jetbrains.mps.project.structure.model.ModelRoot modelRoot : roots) {
        try {
          SModelRoot root = new SModelRoot(modelRoot);
          mySModelRoots.add(root);
          IModelRootManager manager = root.getManager();
          manager.updateModels(root, this);
        } catch (Exception e) {
          LOG.error("Error loading models from root: prefix: \"" + modelRoot.getPrefix() + "\" path: \"" + modelRoot.getPath() + "\". Requested by: " + this, e);
        }
      }
    }

    myInitialized = true;
  }

  public void dispose() {
    for (SModelRoot root : mySModelRoots) {
      root.dispose();
    }
    mySModelRoots.clear();
  }

  public List<String> getSourcePaths() {
    List<String> result = new ArrayList<String>();
    ModuleDescriptor descriptor = getModuleDescriptor();
    if (descriptor != null) {
      for (String p : descriptor.getSourcePaths()) {
        result.add(p);
      }
    }
    if (getGeneratorOutputPath() != null) {
      result.add(getGeneratorOutputPath());
    }
    if (getTestsGeneratorOutputPath() != null) {
      result.add(getTestsGeneratorOutputPath());
    }
    return result;
  }

  protected void rereadModels() {
    myModelsRead = false;
    myInitialized = false;
    readModels();
  }

  protected boolean isInitialized() {
    return myInitialized;
  }

  protected void fireModuleInitialized() {
    MPSModuleRepository.getInstance().fireModuleInitialized(this);
  }

  public Class getClass(String fqName) {
    try {
      return ClassLoaderManager.getInstance().getClassFor(this, fqName);
    } catch (Throwable t) {
      LOG.error(t);
      return null;
    }
  }

  public IFile getBundleHome() {
    return FileSystem.getInstance().getBundleHome(getDescriptorFile());
  }

  public boolean isCompileInMPS() {
    ModuleDescriptor descriptor = getModuleDescriptor();
    return descriptor != null && descriptor.getCompileInMPS();
  }

  public boolean reloadClassesAfterGeneration() {
    return true;
  }

  public void invalidateCaches() {
    myScope.invalidateCaches();
  }

  public boolean needReloading() {
    if ((myDescriptorFile == null) || !myDescriptorFile.exists()) {
      return false;
    }
    String timestampString;
    if (ModelAccess.instance().canRead()) {
      timestampString = getModuleDescriptor().getTimestamp();
    } else {
      timestampString = ModelAccess.instance().runReadAction(new Computable<String>() {
        public String compute() {
          return getModuleDescriptor().getTimestamp();
        }
      });
    }
    if (timestampString == null) return true;
    long timestamp = Long.decode(timestampString);
    return timestamp != myDescriptorFile.lastModified();
  }

  @Override
  public ModuleReference getModuleFor(String packageName, String langID) {
    Pair<String, String> id = new Pair<String, String>(packageName, langID);
    if (myStubModulesCache.containsKey(id)) return myStubModulesCache.get(id);


    for (SModelDescriptor model : getOwnModelDescriptors()) {
      if (model.getLongName().equals(packageName) && model.getStereotype().equals(SModelStereotype.getStubStereotypeForId(langID))) {
        myStubModulesCache.put(id, getModuleReference());
        return getModuleReference();
      }
    }

    Collection<IModule> scopeModules = IterableUtil.asCollection(getScope().getVisibleModules());
    Set<IModule> deps = new HashSet<IModule>(scopeModules);
    for (IModule module : deps) {
      for (SModelDescriptor model : module.getOwnModelDescriptors()) {
        if (model.getLongName().equals(packageName) && model.getStereotype().equals(SModelStereotype.getStubStereotypeForId(langID))) {
          myStubModulesCache.put(id, module.getModuleReference());
          return module.getModuleReference();
        }
      }
    }

    myStubModulesCache.put(id, null);
    return null;
  }

  public String getOutputFor(SModelDescriptor model) {
    if (SModelStereotype.isTestModel(model)) {
      return getTestsGeneratorOutputPath();
    } else {
      return getGeneratorOutputPath();
    }
  }

  public final void reloadFromDisk(boolean reloadClasses) {
    ModelAccess.instance().checkWriteAccess();
    try {
      ModuleDescriptor descriptor = loadDescriptor();
      setModuleDescriptor(descriptor, reloadClasses);
    } catch (ModuleReadException e) {
      handleReadProblem(e, false);
    }
  }

  private void handleReadProblem(Exception e, boolean isInConflict) {
    VcsMigrationUtil.getHandler().addSuspiciousModule(this, isInConflict);
    LOG.error(e.getMessage());
    e.printStackTrace();
  }

  public boolean updateSModelReferences() {
    if (getModuleDescriptor() == null) return false;
    return getModuleDescriptor().updateModelRefs();
  }

  public boolean updateModuleReferences() {
    if (getModuleDescriptor() == null) return false;
    return getModuleDescriptor().updateModuleRefs();
  }

  protected void invalidateDependencies() {
    myDependenciesManager = null;
  }

  protected ModuleDescriptor loadDescriptor() {
    return null;
  }

  protected ModuleScope createScope() {
    return new ModuleScope();
  }

  public String getGeneratorOutputPath() {
    return null;
  }

  public String getTestsGeneratorOutputPath() {
    return null;
  }

  public class ModuleScope extends DefaultScope {
    protected ModuleScope() {

    }

    public AbstractModule getModule() {
      return AbstractModule.this;
    }

    protected Set<IModule> getInitialModules() {
      Set<IModule> result = new HashSet<IModule>();
      result.add(AbstractModule.this);
      return result;
    }

    protected Set<Language> getInitialUsedLanguages() {
      HashSet<Language> result = new HashSet<Language>(ModuleUtil.refsToLanguages(getUsedLanguagesReferences()));

      if (AbstractModule.this instanceof Language) {
        result.add((Language) AbstractModule.this);
        result.addAll(ModuleUtil.refsToLanguages(Collections.singletonList(BootstrapLanguages.DESCRIPTOR)));
      }

      if (AbstractModule.this instanceof Generator) {
        result.add(((Generator) AbstractModule.this).getSourceLanguage());
      }

      return result;
    }

    public String toString() {
      return "Scope of module " + AbstractModule.this;
    }
  }

  protected class ModuleBytecodeLocator implements BytecodeLocator {
    public byte[] find(String fqName) {
      return getClassPathItem().getClass(fqName);
    }

    public URL findResource(String name) {
      return getClassPathItem().getResource(name);
    }
  }

  @Override
  public List<Dependency> getDependOn() {
    return getDependencies();
  }
}
