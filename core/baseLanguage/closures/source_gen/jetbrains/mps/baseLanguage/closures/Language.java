package jetbrains.mps.baseLanguage.closures;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.baseLanguage.closures.typesystem.TypesystemDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import jetbrains.mps.baseLanguage.closures.constraints.ConstraintsAspectDescriptor;
import jetbrains.mps.smodel.structure.StructureDescriptor;
import jetbrains.mps.baseLanguage.closures.structure.StructureAspectDescriptor;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)");

  private final Collection<TemplateModule> generators;

  public Language() {
    generators = TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "857d0a79-6f44-4f46-84ed-9c5b42632011(jetbrains.mps.baseLanguage.closures#1199623535494)"));
  }

  public String getNamespace() {
    return "jetbrains.mps.baseLanguage.closures";
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
    return new ConstraintsAspectDescriptor();
  }

  @Override
  public DescriptorProvider<StructureDescriptor> getStructureAspect() {
    return new StructureAspectDescriptor();
  }
}
