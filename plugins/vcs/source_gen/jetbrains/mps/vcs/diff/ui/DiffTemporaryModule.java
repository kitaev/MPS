package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.smodel.SModel;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.project.structure.modules.ModuleDescriptor;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.project.ProjectScope;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.ModuleContext;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.BaseSModelDescriptor;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.smodel.persistence.IModelRootManager;
import jetbrains.mps.smodel.ModelLoadingState;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.annotations.Nullable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.refactoring.StructureModificationLog;

public class DiffTemporaryModule extends AbstractModule {
  private SModel myModel;
  private Project myProject;

  private DiffTemporaryModule(SModel model, String version, Project project) {
    setModuleReference(ModuleReference.fromString(SModelOperations.getModelName(model) + "@" + version));
    myModel = model;
    myProject = project;
  }

  public Class getClass(String fqName) {
    return null;
  }

  public ModuleDescriptor getModuleDescriptor() {
    return null;
  }

  public void setModuleDescriptor(ModuleDescriptor moduleDescriptor, boolean reloadClasses) {
    throw new UnsupportedOperationException();
  }

  public void save() {
    throw new UnsupportedOperationException();
  }

  public String toString() {
    return getModuleFqName();
  }

  public List<SModelDescriptor> getOwnModelDescriptors() {
    return Arrays.asList(myModel.getModelDescriptor());
  }

  protected AbstractModule.ModuleScope createScope() {
    return new DiffTemporaryModule.DiffModuleScope();
  }

  private DiffTemporaryModule.DiffModuleContext createContext() {
    return new DiffTemporaryModule.DiffModuleContext();
  }

  private SModelDescriptor findModel(SModelReference reference) {
    if (reference.equals(myModel.getSModelReference())) {
      return myModel.getModelDescriptor();
    }
    List<IScope> scopes = ListSequence.fromList(new ArrayList<IScope>());
    ProjectScope ps = myProject.getComponent(ProjectScope.class);
    if (ps != null) {
      ListSequence.fromList(scopes).addElement(ps);
    }
    ListSequence.fromList(scopes).addElement(GlobalScope.getInstance());
    for (IScope scope : ListSequence.fromList(scopes)) {
      SModelDescriptor md = scope.getModelDescriptor(reference);
      if (md != null) {
        return md;
      }
    }
    // if we can't find model using full reference, try to find by fq-name 
    // this is needed for viewing diff on models saved before MPS 2.0 M5 
    for (IScope scope : ListSequence.fromList(scopes)) {
      SModelDescriptor md = scope.getModelDescriptor(reference.getSModelFqName());
      if (md != null) {
        return md;
      }
    }
    return null;
  }

  public static void createModuleForModel(SModel model, String version, Project project) {
    createModuleForModel(model, version, project, false);
  }

  public static void createModuleForModel(SModel model, String version, Project project, boolean mergeResultModel) {
    if (model.getModelDescriptor() != null) {
      return;
    }
    IModule module = null;
    if (mergeResultModel) {
      SModelDescriptor mdInRepo = SModelRepository.getInstance().getModelDescriptor(model.getSModelReference());
      if (mdInRepo != null) {
        module = mdInRepo.getModule();
      }
    }

    if (module == null) {
      module = new DiffTemporaryModule(model, version, project);
    }
    model.setModelDescriptor(new DiffTemporaryModule.DiffSModelDescriptor(module, model, mergeResultModel));
  }

  public static IOperationContext getOperationContext(Project project, SModel model) {
    SModelDescriptor md = model.getModelDescriptor();
    assert md != null;
    IModule module = md.getModule();
    if (module instanceof DiffTemporaryModule) {
      return ((DiffTemporaryModule) module).createContext();
    } else {
      return new ModuleContext(module, project);
    }
  }

  private class DiffModuleScope extends AbstractModule.ModuleScope {
    private DiffModuleScope() {
    }

    protected Set<IModule> getInitialModules() {
      Set<IModule> result = SetSequence.fromSet(new HashSet<IModule>());
      SetSequence.fromSet(result).addElement(DiffTemporaryModule.this);
      SetSequence.fromSet(result).addSequence(Sequence.fromIterable(GlobalScope.getInstance().getVisibleModules()));
      return result;
    }

    protected Set<Language> getInitialUsedLanguages() {
      return SetSequence.fromSetWithValues(new HashSet<Language>(), GlobalScope.getInstance().getVisibleLanguages());
    }

    @Override
    public SModelDescriptor getModelDescriptor(SModelReference reference) {
      return findModel(reference);
    }
  }

  public static class DiffSModelDescriptor extends BaseSModelDescriptor implements EditableSModelDescriptor {
    private IModule myModule;
    private boolean myEditable;

    private DiffSModelDescriptor(IModule module, SModel model, boolean editable) {
      super(IModelRootManager.NULL_MANAGER, model.getSModelReference(), false);
      myModule = module;
      mySModel = model;
      myEditable = editable;
      setLoadingState(ModelLoadingState.FULLY_LOADED);
    }

    protected BaseSModelDescriptor.ModelLoadResult initialLoad() {
      throw new UnsupportedOperationException();
    }

    @Override
    public IModule getModule() {
      return myModule;
    }

    @Override
    public SModelDescriptor resolveModel(SModelReference reference) {
      if (myModule instanceof DiffTemporaryModule.DiffModuleScope) {
        return ((DiffTemporaryModule) myModule).findModel(reference);
      } else {
        return super.resolveModel(reference);
      }
    }

    public boolean isDoNotGenerate() {
      throw new UnsupportedOperationException();
    }

    public void setDoNotGenerate(boolean b) {
      throw new UnsupportedOperationException();
    }

    public boolean isPackaged() {
      return !(myEditable);
    }

    public void setChanged(boolean b) {
      throw new UnsupportedOperationException();
    }

    public boolean isChanged() {
      throw new UnsupportedOperationException();
    }

    public long lastChangeTime() {
      throw new UnsupportedOperationException();
    }

    public void setModelFile(IFile file) {
      throw new UnsupportedOperationException();
    }

    @Nullable
    public IFile getModelFile() {
      throw new UnsupportedOperationException();
    }

    public int getPersistenceVersion() {
      throw new UnsupportedOperationException();
    }

    public void setVersion(int i) {
      throw new UnsupportedOperationException();
    }

    public void save() {
      throw new UnsupportedOperationException();
    }

    public Map<String, String> getMetaData() {
      throw new UnsupportedOperationException();
    }

    public int getVersion() {
      throw new UnsupportedOperationException();
    }

    public void reloadFromDiskSafe() {
      throw new UnsupportedOperationException();
    }

    public void setAttribute(String string, String string1) {
      throw new UnsupportedOperationException();
    }

    public void saveStructureModificationLog(@NotNull StructureModificationLog log) {
      throw new UnsupportedOperationException();
    }

    public void reloadFromDisk() {
      throw new UnsupportedOperationException();
    }

    public String getAttribute(String string) {
      throw new UnsupportedOperationException();
    }

    @NotNull
    public StructureModificationLog getStructureModificationLog() {
      throw new UnsupportedOperationException();
    }

    public boolean needsReloading() {
      throw new UnsupportedOperationException();
    }
  }

  private class DiffModuleContext extends ModuleContext {
    private DiffModuleContext() {
      super(DiffTemporaryModule.this, myProject);
    }

    @Override
    public IModule getModule() {
      return DiffTemporaryModule.this;
    }
  }
}
