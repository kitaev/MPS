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
import jetbrains.mps.stubs.StubSource;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.baseLanguage.javastub.ASMModelLoader;
import jetbrains.mps.stubs.BaseStubModelDescriptor;
import jetbrains.mps.stubs.IStubRootNodeDescriptor;
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

  protected void updateModel(final StubLocation location, final SModel model, final StubSource source) {
    IClassPathItem cpItem = JavaStubsUtil.createClassPathItem(location);
    if (cpItem == null) {
      return;
    }
    new ASMModelLoader(location, cpItem, model).updateModel();
  }

  protected Set<BaseStubModelDescriptor> getModelDescriptors(final StubLocation location) {
    return JavaStubsUtil.getModelDescriptors(JavaStubs.this, location, JavaStubs.this.getLanguageId());
  }

  protected String getSelfModuleId() {
    return "f3061a53-9226-4cc5-a443-f952ceaf5816";
  }

  public Set<IStubRootNodeDescriptor> getRootNodeDescriptors(final StubLocation location) {
    IClassPathItem item = JavaStubsUtil.createClassPathItem(location);
    if (item == null) {
      return new HashSet<IStubRootNodeDescriptor>();
    }

    return JavaStubsUtil.iterateClassPath(location.getModuleRef(), item);
  }

  protected String getLanguageId() {
    return LanguageID.JAVA;
  }
}
