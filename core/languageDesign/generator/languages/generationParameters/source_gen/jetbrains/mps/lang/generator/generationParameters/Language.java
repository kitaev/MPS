package jetbrains.mps.lang.generator.generationParameters;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.lang.generator.generationParameters.typesystem.TypesystemDescriptor;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("289fcc83-6543-41e8-a5ca-768235715ce4(jetbrains.mps.lang.generator.generationParameters)");

  private final Collection<TemplateModule> generators;

  public Language() {
    generators = TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "7a7d58c9-ab9e-433c-bb4d-a8b1b2b20885(jetbrains.mps.lang.generator.generationParameters#650531548512001931)"));
  }

  public String getNamespace() {
    return "jetbrains.mps.lang.generator.generationParameters";
  }

  @Override
  public IHelginsDescriptor getTypesystem() {
    return new TypesystemDescriptor();
  }

  public Collection<TemplateModule> getGenerators() {
    return generators;
  }
}
