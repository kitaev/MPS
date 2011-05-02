package jetbrains.mps.lang.editor.table;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("0272d3b4-4cc8-481e-9e2f-07793fbfcb41(jetbrains.mps.lang.editor.table)");

  private final Collection<TemplateModule> generators;

  public Language() {
    generators = TemplateUtil.<TemplateModule>asCollection(TemplateUtil.createInterpretedGenerator(this, "cadeaf28-c6cf-4238-b09e-0e4d9c133ae1(jetbrains.mps.lang.editor.table#4677325677876405344)"));
  }

  public String getNamespace() {
    return "jetbrains.mps.lang.editor.table";
  }

  @Override
  public IHelginsDescriptor getTypesystem() {
    return null;
  }

  public Collection<TemplateModule> getGenerators() {
    return generators;
  }
}
