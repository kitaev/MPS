package jetbrains.mps.lang.core.structure;

/*Generated by MPS */

import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;

public class Core_Language {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)");

  public static Language get() {
    return (Language) MPSModuleRepository.getInstance().getModule(MODULE_REFERENCE);
  }
}
