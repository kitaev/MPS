package jetbrains.mps.lang.behavior.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SModelReference;

public class FindUsagesDescriptor extends BaseFindUsagesDescriptor {
  public FindUsagesDescriptor() {
    super(new ModuleReference("jetbrains.mps.lang.behavior", "af65afd8-f0dd-4942-87d9-63a55f2a9db1"), SModelReference.fromString("r:b2afece2-23e8-4a6f-a918-9d117d839057(jetbrains.mps.lang.behavior.findUsages)"));
  }

  public void init() {
    add(new OverridingMethods_Finder(), "1227530810320");
  }
}
