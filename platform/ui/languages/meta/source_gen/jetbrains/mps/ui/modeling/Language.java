package jetbrains.mps.ui.modeling;

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
import jetbrains.mps.ui.modeling.typesystem.TypesystemDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("8a448bd0-1380-4c01-9820-0f051d33888c(jetbrains.mps.ui.modeling)");

  private DescriptorProvider<StructureDescriptor> structureAspect;
  private DescriptorProvider<BehaviorDescriptor> behaviorAspect;
  private DescriptorProvider<ConstraintsDescriptor> constraintsAspect;
  private final Collection<TemplateModule> generators;

  public Language() {
    generators = TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "f65201f1-7dc7-4cfc-9f79-ca0a316cf695(jetbrains.mps.ui.modeling#1773430080753795670)"));
    structureAspect = getAspectDescriptorByClassName("jetbrains.mps.ui.modeling.structure.StructureAspectDescriptor");
    behaviorAspect = getAspectDescriptorByClassName("jetbrains.mps.ui.modeling.behavior.BehaviorAspectDescriptor");
    constraintsAspect = getAspectDescriptorByClassName("jetbrains.mps.ui.modeling.constraints.ConstraintsAspectDescriptor");

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
    return "jetbrains.mps.ui.modeling";
  }

  @Override
  public IHelginsDescriptor getTypesystem() {
    return new TypesystemDescriptor();
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
