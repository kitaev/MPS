package jetbrains.mps.lang.project.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import java.util.Arrays;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"jetbrains.mps.lang.project.structure.DevKit", "jetbrains.mps.lang.project.structure.Generator", "jetbrains.mps.lang.project.structure.Language", "jetbrains.mps.lang.project.structure.MappingConfigExternalRef", "jetbrains.mps.lang.project.structure.MappingConfigNormalRef", "jetbrains.mps.lang.project.structure.MappingConfigRefAllGlobal", "jetbrains.mps.lang.project.structure.MappingConfigRefAllLocal", "jetbrains.mps.lang.project.structure.MappingConfigRefBase", "jetbrains.mps.lang.project.structure.MappingConfigRefSet", "jetbrains.mps.lang.project.structure.MappingPriorityRule", "jetbrains.mps.lang.project.structure.ModelReference", "jetbrains.mps.lang.project.structure.ModelRoot", "jetbrains.mps.lang.project.structure.ModelRootManager", "jetbrains.mps.lang.project.structure.Module", "jetbrains.mps.lang.project.structure.ModuleDependency", "jetbrains.mps.lang.project.structure.ModuleReference", "jetbrains.mps.lang.project.structure.Solution", "jetbrains.mps.lang.project.structure.SourcePath", "jetbrains.mps.lang.project.structure.StubEntry", "jetbrains.mps.lang.project.structure.StubSolution"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 13:
        // interface or abstract concept behavior jetbrains.mps.lang.project.structure.Module 
        return null;
      case 2:
        return new Language_BehaviorDescriptor();
      case 16:
        return new Solution_BehaviorDescriptor();
      case 1:
        return new Generator_BehaviorDescriptor();
      case 10:
        return new ModelReference_BehaviorDescriptor();
      case 14:
        return new ModuleDependency_BehaviorDescriptor();
      case 0:
        return new DevKit_BehaviorDescriptor();
      case 9:
        return new MappingPriorityRule_BehaviorDescriptor();
      case 15:
        return new ModuleReference_BehaviorDescriptor();
      case 18:
        return new StubEntry_BehaviorDescriptor();
      case 11:
        return new ModelRoot_BehaviorDescriptor();
      case 12:
        return new ModelRootManager_BehaviorDescriptor();
      case 7:
        // interface or abstract concept behavior jetbrains.mps.lang.project.structure.MappingConfigRefBase 
        return null;
      case 5:
        return new MappingConfigRefAllGlobal_BehaviorDescriptor();
      case 6:
        return new MappingConfigRefAllLocal_BehaviorDescriptor();
      case 8:
        return new MappingConfigRefSet_BehaviorDescriptor();
      case 4:
        return new MappingConfigNormalRef_BehaviorDescriptor();
      case 3:
        return new MappingConfigExternalRef_BehaviorDescriptor();
      case 19:
        return new StubSolution_BehaviorDescriptor();
      case 17:
        return new SourcePath_BehaviorDescriptor();
      default:
        return null;
    }
  }
}
