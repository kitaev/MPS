package jetbrains.mps.ui.modeling.structure;

/*Generated by MPS */

import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;

public class Modeling_Language {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("8a448bd0-1380-4c01-9820-0f051d33888c(jetbrains.mps.ui.modeling)");

  public static Language get() {
    return (Language) MPSModuleRepository.getInstance().getModule(MODULE_REFERENCE);
  }
}
