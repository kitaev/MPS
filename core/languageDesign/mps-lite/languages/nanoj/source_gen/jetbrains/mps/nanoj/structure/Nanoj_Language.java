package jetbrains.mps.nanoj.structure;

/*Generated by MPS */

import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;

public class Nanoj_Language {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("0452c5e6-046a-41b1-a1c2-bfa47ef3ae0b(jetbrains.mps.nanoj)");

  public static Language get() {
    return (Language) MPSModuleRepository.getInstance().getModule(MODULE_REFERENCE);
  }
}
