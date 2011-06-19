package jetbrains.mps.build.distrib.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"jetbrains.mps.build.distrib.structure.ArtifactReferenceCommandLinePart", "jetbrains.mps.build.distrib.structure.ClassPath", "jetbrains.mps.build.distrib.structure.DigitalSignatureWindowsConfiguration", "jetbrains.mps.build.distrib.structure.DistribConfiguration", "jetbrains.mps.build.distrib.structure.ExternalVariableReference", "jetbrains.mps.build.distrib.structure.FileAssociation", "jetbrains.mps.build.distrib.structure.MacConfig", "jetbrains.mps.build.distrib.structure.MacOsFileAssociation", "jetbrains.mps.build.distrib.structure.PathCommantLinePart", "jetbrains.mps.build.distrib.structure.Role", "jetbrains.mps.build.distrib.structure.SimplePath", "jetbrains.mps.build.distrib.structure.StringCommandLinePart", "jetbrains.mps.build.distrib.structure.UniversalConfig", "jetbrains.mps.build.distrib.structure.UnixConfig", "jetbrains.mps.build.distrib.structure.WindowsConfig"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 3:
        return new DistribConfiguration_BehaviorDescriptor();
      case 1:
        return new ClassPath_BehaviorDescriptor();
      case 10:
        return new SimplePath_BehaviorDescriptor();
      case 14:
        return new WindowsConfig_BehaviorDescriptor();
      case 12:
        return new UniversalConfig_BehaviorDescriptor();
      case 2:
        return new DigitalSignatureWindowsConfiguration_BehaviorDescriptor();
      case 11:
        return new StringCommandLinePart_BehaviorDescriptor();
      case 0:
        return new ArtifactReferenceCommandLinePart_BehaviorDescriptor();
      case 6:
        return new MacConfig_BehaviorDescriptor();
      case 4:
        return new ExternalVariableReference_BehaviorDescriptor();
      case 5:
        return new FileAssociation_BehaviorDescriptor();
      case 7:
        return new MacOsFileAssociation_BehaviorDescriptor();
      case 9:
        return new Role_BehaviorDescriptor();
      case 8:
        return new PathCommantLinePart_BehaviorDescriptor();
      case 13:
        return new UnixConfig_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
}
