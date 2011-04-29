package jetbrains.mps.ide.properties;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.project.structure.modules.Dependency;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.project.structure.modules.ClassPathEntry;
import jetbrains.mps.project.structure.modules.StubModelsEntry;
import jetbrains.mps.workbench.dialogs.project.components.parts.lists.ListsFactory;
import jetbrains.mps.project.structure.modules.ModuleDescriptor;

public class ModuleProperties {
  public static final String NAMESPACE = "namespace";
  public static final String COMPILE_IN_MPS = "compileInMPS";
  public static final String USED_LANGUAGES = "usedLanguages";
  public static final String USED_DEVKITS = "usedDevkits";

  private String myNamespace;
  private boolean myCompileInMPS;
  private List<ModelRoot> myModelRoots;
  private List<Dependency> myDependencies;
  private List<ModuleReference> myUsedLanguages;
  private List<ModuleReference> myUsedDevkits;
  private List<ClassPathEntry> myClassPaths;
  private List<StubModelsEntry> myStubModels;

  public ModuleProperties() {
    myModelRoots = ListsFactory.create(ListsFactory.MODEL_ROOT_COMPARATOR);
    myDependencies = ListsFactory.create(ListsFactory.DEPENDENCY_COMPARATOR);
    myUsedLanguages = ListsFactory.create(ListsFactory.MODULE_VALID_REF_COMPARATOR);
    myUsedDevkits = ListsFactory.create(ListsFactory.MODULE_VALID_REF_COMPARATOR);
    myClassPaths = ListsFactory.create(ListsFactory.CLASSPATH_ENTRY_COMPARATOR);
    myStubModels = ListsFactory.create(ListsFactory.STUB_MODEL_ENTRY_COMPARATOR);
  }

  public String getNamespace() {
    return myNamespace;
  }

  public void setNamespace(String namespace) {
    myNamespace = namespace;
  }

  public boolean isCompileInMPS() {
    return myCompileInMPS;
  }

  public void setCompileInMPS(boolean compileInMPS) {
    myCompileInMPS = compileInMPS;
  }

  public List<ModelRoot> getModelRoots() {
    return myModelRoots;
  }

  public void setModelRoots(List<ModelRoot> modelRoots) {
    myModelRoots = modelRoots;
  }

  public List<Dependency> getDependencies() {
    return myDependencies;
  }

  public void setDependencies(List<Dependency> dependencies) {
    myDependencies = dependencies;
  }

  public List<ModuleReference> getUsedLanguages() {
    return myUsedLanguages;
  }

  public void setUsedLanguages(List<ModuleReference> usedLanguages) {
    myUsedLanguages = usedLanguages;
  }

  public List<ModuleReference> getUsedDevkits() {
    return myUsedDevkits;
  }

  public void setUsedDevkits(List<ModuleReference> usedDevkits) {
    myUsedDevkits = usedDevkits;
  }

  public List<ClassPathEntry> getClassPaths() {
    return myClassPaths;
  }

  public void setClassPaths(List<ClassPathEntry> classPaths) {
    myClassPaths = classPaths;
  }

  public List<StubModelsEntry> getStubModels() {
    return myStubModels;
  }

  public void setStubModels(List<StubModelsEntry> stubModels) {
    myStubModels = stubModels;
  }

  public void loadFrom(ModuleDescriptor descriptor) {
    myNamespace = descriptor.getNamespace();
    myCompileInMPS = descriptor.getCompileInMPS();
    for (ModelRoot root : descriptor.getModelRoots()) {
      myModelRoots.add((root != null ?
        root.getCopy() :
        null
      ));
    }
    for (Dependency dep : descriptor.getDependencies()) {
      myDependencies.add((dep != null ?
        dep.getCopy() :
        null
      ));
    }
    myUsedLanguages.addAll(descriptor.getUsedLanguages());
    myUsedDevkits.addAll(descriptor.getUsedDevkits());
    for (StubModelsEntry entry : descriptor.getStubModelEntries()) {
      myStubModels.add((entry != null ?
        entry.getCopy() :
        null
      ));
    }
  }

  public void saveTo(ModuleDescriptor descriptor) {
    descriptor.setNamespace(myNamespace);
    descriptor.setCompileInMPS(myCompileInMPS);
    descriptor.getModelRoots().clear();
    descriptor.getModelRoots().addAll(myModelRoots);
    descriptor.getDependencies().clear();
    descriptor.getDependencies().addAll(myDependencies);
    descriptor.getUsedLanguages().clear();
    descriptor.getUsedLanguages().addAll(myUsedLanguages);
    descriptor.getUsedDevkits().clear();
    descriptor.getUsedDevkits().addAll(myUsedDevkits);
    descriptor.getStubModelEntries().clear();
    descriptor.getStubModelEntries().addAll(myStubModels);
  }
}
