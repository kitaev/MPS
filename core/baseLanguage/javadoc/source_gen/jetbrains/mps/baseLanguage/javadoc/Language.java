package jetbrains.mps.baseLanguage.javadoc;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("f2801650-65d5-424e-bb1b-463a8781b786(jetbrains.mps.baseLanguage.javadoc)");

  public Language() {
  }

  public String getNamespace() {
    return "jetbrains.mps.baseLanguage.javadoc";
  }

  @Override
  public IHelginsDescriptor getTypesystem() {
    return null;
  }

  public Collection<TemplateModule> getGenerators() {
    return null;
  }
}
