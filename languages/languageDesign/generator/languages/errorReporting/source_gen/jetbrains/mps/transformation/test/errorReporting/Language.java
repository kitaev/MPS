package jetbrains.mps.transformation.test.errorReporting;

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
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("99a58581-8518-40c8-81f1-e364306f5ffc(jetbrains.mps.transformation.test.errorReporting)");

  private DescriptorProvider<StructureDescriptor> structureAspect;
  private DescriptorProvider<BehaviorDescriptor> behaviorAspect;
  private DescriptorProvider<ConstraintsDescriptor> constraintsAspect;
  private final Collection<TemplateModule> generators;

  public Language() {
    generators = TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "c8f0806e-aaf9-46ca-bf04-85538f65af1d(jetbrains.mps.transformation.test.errorReporting#7287346816896111110)"));
    structureAspect = getAspectDescriptorByClassName("jetbrains.mps.transformation.test.errorReporting.structure.StructureAspectDescriptor");
    behaviorAspect = getAspectDescriptorByClassName("jetbrains.mps.transformation.test.errorReporting.behavior.BehaviorAspectDescriptor");
    constraintsAspect = getAspectDescriptorByClassName("jetbrains.mps.transformation.test.errorReporting.constraints.ConstraintsAspectDescriptor");

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
    return "jetbrains.mps.transformation.test.errorReporting";
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
