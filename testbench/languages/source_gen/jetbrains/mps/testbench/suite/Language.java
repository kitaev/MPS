package jetbrains.mps.testbench.suite;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("d3c5a46f-b8c2-47db-ad0a-30b8f19c2055(jetbrains.mps.testbench.suite)");

  private final Collection<TemplateModule> generators;

  public Language() {
    generators = TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "13b00428-a31f-4c99-b565-ebb37706f8e8(jetbrains.mps.testbench.suite#8749850441865775970)"));
  }

  public String getNamespace() {
    return "jetbrains.mps.testbench.suite";
  }

  @Override
  public IHelginsDescriptor getTypesystem() {
    return null;
  }

  public Collection<TemplateModule> getGenerators() {
    return generators;
  }
}
