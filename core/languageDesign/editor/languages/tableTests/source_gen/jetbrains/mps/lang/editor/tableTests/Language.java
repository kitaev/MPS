package jetbrains.mps.lang.editor.tableTests;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;
import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import jetbrains.mps.lang.editor.tableTests.constraints.ConstraintsAspectDescriptor;
import jetbrains.mps.smodel.structure.StructureDescriptor;
import jetbrains.mps.lang.editor.tableTests.structure.StructureAspectDescriptor;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("df8799e7-254a-406f-bd67-f4cc27337152(jetbrains.mps.lang.editor.tableTests)");

  public Language() {
  }

  public String getNamespace() {
    return "jetbrains.mps.lang.editor.tableTests";
  }

  @Override
  public IHelginsDescriptor getTypesystem() {
    return null;
  }

  @Override
  public BaseFindUsagesDescriptor getFindUsages() {
    return null;
  }

  public Collection<TemplateModule> getGenerators() {
    return null;
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
