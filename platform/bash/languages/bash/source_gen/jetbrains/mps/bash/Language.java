package jetbrains.mps.bash;

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
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("4a1e4a24-105b-44ed-959c-6586fc957db3(jetbrains.mps.bash)");

  private DescriptorProvider<StructureDescriptor> structureAspect;
  private DescriptorProvider<BehaviorDescriptor> behaviorAspect;
  private DescriptorProvider<ConstraintsDescriptor> constraintsAspect;
  private final Collection<TemplateModule> generators;

  public Language() {
    generators = TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "a9772ef0-5f51-48a7-8cb0-e217639912db(jetbrains.mps.bash#6382090206697067824)"));
    structureAspect = getAspectDescriptorByClassName("jetbrains.mps.bash.structure.StructureAspectDescriptor");
    behaviorAspect = getAspectDescriptorByClassName("jetbrains.mps.bash.behavior.BehaviorAspectDescriptor");
    constraintsAspect = getAspectDescriptorByClassName("jetbrains.mps.bash.constraints.ConstraintsAspectDescriptor");

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
    return "jetbrains.mps.bash";
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
