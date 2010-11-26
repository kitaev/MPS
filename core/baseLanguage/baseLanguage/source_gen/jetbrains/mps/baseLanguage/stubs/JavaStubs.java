package jetbrains.mps.baseLanguage.stubs;

/*Generated by MPS */

import jetbrains.mps.stubs.BaseStubModelRootManager;
import java.util.Set;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleId;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.stubs.StubLocation;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.stubs.javastub.ASMModelLoader;
import jetbrains.mps.stubs.BaseStubModelDescriptor;
import jetbrains.mps.stubs.StubDescriptor;
import jetbrains.mps.reloading.ClassPathFactory;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.stubs.javastub.classpath.StubHelper;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.LanguageID;

public class JavaStubs extends BaseStubModelRootManager {
  public JavaStubs() {
  }

  protected Set<Language> getLanguagesToImport() {
    Set<String> moduleIds = SetSequence.fromSet(new HashSet<String>());

    moduleIds.add("f3061a53-9226-4cc5-a443-f952ceaf5816");

    Iterable<Language> languages = SetSequence.fromSet(moduleIds).<Language>select(new ISelector<String, Language>() {
      public Language select(String it) {
        return (Language) MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString(it));
      }
    });

    Set<Language> result = new HashSet<Language>();
    result.addAll(Sequence.fromIterable(languages).toListSequence());
    return result;
  }

  protected void updateModel(final StubLocation location, final SModel model) {
    IClassPathItem cpItem = JavaStubs.this.createClassPathItem(location);
    if (cpItem == null) {
      return;
    }
    new ASMModelLoader(cpItem, model).updateModel();
  }

  protected Set<BaseStubModelDescriptor> getModelDescriptors(final StubLocation location) {
    Set<BaseStubModelDescriptor> result = new HashSet<BaseStubModelDescriptor>();
    JavaStubs.this.getModelDescriptorsInternal(location, result);
    return result;
  }

  protected String getSelfModuleId() {
    return "f3061a53-9226-4cc5-a443-f952ceaf5816";
  }

  public Set<StubDescriptor> getRootNodeDescriptors(final StubLocation location) {
    IClassPathItem item = JavaStubs.this.createClassPathItem(location);
    if (item == null) {
      return new HashSet<StubDescriptor>();
    }

    Set<StubDescriptor> result = new HashSet<StubDescriptor>();
    JavaStubs.this.iterateClasspath(item, result, "");
    return result;
  }

  private IClassPathItem createClassPathItem(StubLocation location) {
    return ClassPathFactory.getInstance().createFromPath(location.getPath());
  }

  private void getModelDescriptorsInternal(StubLocation location, Set<BaseStubModelDescriptor> result) {
    String pack = location.getPrefix();
    IClassPathItem cpItem = JavaStubs.this.createClassPathItem(location);
    if (cpItem == null) {
      return;
    }

    for (String subpackage : cpItem.getSubpackages(pack)) {
      if (cpItem.getRootClasses(subpackage).iterator().hasNext()) {
        SModelReference modelReference = StubHelper.uidForPackageInStubs(subpackage, JavaStubs.this.getLanguageId());
        if (SModelRepository.getInstance().getModelDescriptor(modelReference) != null) {
          SModelReference ref = SModelReference.fromString(subpackage + "@" + SModelStereotype.getStubStereotypeForId(JavaStubs.this.getLanguageId()));
          SModelDescriptor descriptor = SModelRepository.getInstance().getModelDescriptor(ref);
          assert descriptor instanceof BaseStubModelDescriptor;
          result.add((BaseStubModelDescriptor) descriptor);
        } else {
          result.add(new BaseStubModelDescriptor(JavaStubs.this, null, modelReference));
        }
      }
      StubLocation newLocation = new StubLocation(location.getPath(), subpackage, location.getModule());
      JavaStubs.this.getModelDescriptorsInternal(newLocation, result);
    }
  }

  private void iterateClasspath(IClassPathItem item, Set<StubDescriptor> result, final String pack) {
    for (String cls : item.getRootClasses(pack)) {
      result.add(new StubDescriptor(cls, pack, item));
    }
    for (String subpack : item.getSubpackages(pack)) {
      JavaStubs.this.iterateClasspath(item, result, subpack);
    }
  }

  protected String getLanguageId() {
    return LanguageID.JAVA;
  }
}
