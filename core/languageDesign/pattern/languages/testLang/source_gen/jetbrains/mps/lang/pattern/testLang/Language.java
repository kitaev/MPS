package jetbrains.mps.lang.pattern.testLang;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.StructureDescriptor;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.smodel.language.LanguageRuntimeInterpreted;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("5206c888-7c5d-4275-bc0a-7c4da12f46e8(jetbrains.mps.lang.pattern.testLang)");

  private DescriptorProvider<StructureDescriptor> structureAspect;
  private DescriptorProvider<BehaviorDescriptor> behaviorAspect;
  private DescriptorProvider<ConstraintsDescriptor> constraintsAspect;
  private final Collection<TemplateModule> generators;

  public Language() {
    generators = TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "383fb34a-5096-4810-bd84-cd6a1bfe2711(jetbrains.mps.lang.pattern.testLang#8707387027762047836)"));
    structureAspect = getAspectDescriptorByClassName("jetbrains.mps.lang.pattern.testLang.structure.StructureAspectDescriptor");
    behaviorAspect = getAspectDescriptorByClassName("jetbrains.mps.lang.pattern.testLang.behavior.BehaviorAspectDescriptor");
    constraintsAspect = getAspectDescriptorByClassName("jetbrains.mps.lang.pattern.testLang.constraints.ConstraintsAspectDescriptor");

    if (structureAspect == null) {
      structureAspect = LanguageRuntimeInterpreted.STRUCTURE_PROVIDER;
    }
    if (behaviorAspect == null) {
      behaviorAspect = LanguageRuntimeInterpreted.BEHAVIOR_PROVIDER;
    }
    if (constraintsAspect == null) {
      constraintsAspect = LanguageRuntimeInterpreted.CONSTRAINTS_PROVIDER;
    }
  }

  public String getNamespace() {
    return "jetbrains.mps.lang.pattern.testLang";
  }

  @Override
  public IHelginsDescriptor getTypesystem() {
    return null;
  }

  @Override
  public BaseFindUsagesDescriptor getFindUsages() {
    return null;
  }

  public Collection<TemplateModule> getGenerators() {
    return generators;
  }

  @Override
  public DescriptorProvider<ConstraintsDescriptor> getConstraintsAspect() {
    return constraintsAspect;
  }

  @Override
  public DescriptorProvider<StructureDescriptor> getStructureAspect() {
    return structureAspect;
  }

  @Override
  public DescriptorProvider<BehaviorDescriptor> getBehaviorAspect() {
    return behaviorAspect;
  }
}
