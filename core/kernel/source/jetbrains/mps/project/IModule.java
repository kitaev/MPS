package jetbrains.mps.project;

import jetbrains.mps.projectLanguage.structure.ModelRoot;
import jetbrains.mps.projectLanguage.structure.ModuleDescriptor;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.smodel.*;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.List;
import java.util.Set;

public interface IModule extends ModelOwner, MPSModuleOwner {
  String getModuleUID();

  <T extends IModule> Set<T> getAllDependOnModules(Class<T> cls);

  List<SModelDescriptor> getOwnModelDescriptors();
  List<ModelRoot> getModelRoots();

  /**
   * @return All dependencies which are configured in depend on modules section
   */
  List<Dependency> getDependencies();

  /**
   * @return All modules we depend on including depend on modules, using languages, extended languages etc
   */
  List<IModule> getExplicitlyDependOnModules();

  /**
   * @return All modules which moduleUIDs are returned in getDependencies
   */
  List<IModule> getDirectlyDependOnModules();

  /**
   * @return All used languages namespaces
   */
  List<String> getUsedLanguagesNamespaces();

  /**
   * @return All used languages
   */
  List<Language> getUsedLanguages();

  /**
   * @return Explicitly depend on modules + bootstrap modules
   */
  List<IModule> getDependOnModules();

  SModelDescriptor createModel(SModelUID uid, ModelRoot root);

  Set<SModelDescriptor> getImplicitlyImportedModelsFor(SModelDescriptor sm);
  Set<Language> getImplicitlyImportedLanguages(SModelDescriptor sm);

  IFile getDescriptorFile();

  ModuleDescriptor getModuleDescriptor();
  void setModuleDescriptor(ModuleDescriptor moduleDescriptor);

  String getGeneratorOutputPath();
  IFile getClassesGen();
  File getBundleHome();

  IScope getScope();

  List<String> getSourcePaths();
  Class getClass(String fqName);

  IClassPathItem getJavaStubsClassPathItem();
  IClassPathItem getRuntimeClasspath();
  IClassPathItem getModuleWithDependenciesClassPathItem();

  boolean isCompileInMPS();
  boolean reloadClassesAfterGeneration();

  void invalidateCaches();
  void reloadStubs();
  void save();
  void convert();
  boolean isPackaged();

  void dispose();

  boolean isValid();
}
