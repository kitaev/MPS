package jetbrains.mps.lang.structure;

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
import jetbrains.mps.lang.structure.typesystem.TypesystemDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import jetbrains.mps.lang.structure.findUsages.FindUsagesDescriptor;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("c72da2b9-7cce-4447-8389-f407dc1158b7(jetbrains.mps.lang.structure)");

  private DescriptorProvider<StructureDescriptor> structureAspect;
  private DescriptorProvider<BehaviorDescriptor> behaviorAspect;
  private DescriptorProvider<ConstraintsDescriptor> constraintsAspect;
  private final Collection<TemplateModule> generators;

  public Language() {
    generators = TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "b8e4beec-8383-4fb9-b0bb-9d1c9c159cfc(jetbrains.mps.lang.structure#1170324972255)"));
    structureAspect = getAspectDescriptorByClassName("jetbrains.mps.lang.structure.structure.StructureAspectDescriptor");
    behaviorAspect = getAspectDescriptorByClassName("jetbrains.mps.lang.structure.behavior.BehaviorAspectDescriptor");
    constraintsAspect = getAspectDescriptorByClassName("jetbrains.mps.lang.structure.constraints.ConstraintsAspectDescriptor");

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
    return "jetbrains.mps.lang.structure";
  }

  @Override
  public IHelginsDescriptor getTypesystem() {
    return new TypesystemDescriptor();
  }

  @Override
  public BaseFindUsagesDescriptor getFindUsages() {
    return new FindUsagesDescriptor();
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
