package jetbrains.mps.ui.modeling;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.ui.modeling.typesystem.TypesystemDescriptor;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("8a448bd0-1380-4c01-9820-0f051d33888c(jetbrains.mps.ui.modeling)");

  private final Collection<TemplateModule> generators;

  public Language() {
    generators = TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "f65201f1-7dc7-4cfc-9f79-ca0a316cf695(jetbrains.mps.ui.modeling#1773430080753795670)"));
  }

  public String getNamespace() {
    return "jetbrains.mps.ui.modeling";
  }

  @Override
  public IHelginsDescriptor getTypesystem() {
    return new TypesystemDescriptor();
  }

  public Collection<TemplateModule> getGenerators() {
    return generators;
  }
}
