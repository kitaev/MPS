package jetbrains.mps.gtext.structure;

/*Generated by MPS */

import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;

public class Gtext_Language {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("a83c3bd0-2f7e-4ba1-8373-12d49e99f57e(jetbrains.mps.gtext)");

  public static Language get() {
    return (Language)MPSModuleRepository.getInstance().getModule(MODULE_REFERENCE);
  }
}
