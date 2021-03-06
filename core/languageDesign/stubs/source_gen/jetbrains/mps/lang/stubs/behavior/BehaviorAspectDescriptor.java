package jetbrains.mps.lang.stubs.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"jetbrains.mps.lang.stubs.structure.AbstractModelCreator", "jetbrains.mps.lang.stubs.structure.BaseCreatorType", "jetbrains.mps.lang.stubs.structure.GetRootsBlock", "jetbrains.mps.lang.stubs.structure.InitModuleBlock", "jetbrains.mps.lang.stubs.structure.LanguageRef", "jetbrains.mps.lang.stubs.structure.LibraryStubDescriptor", "jetbrains.mps.lang.stubs.structure.ModelCreationSettings", "jetbrains.mps.lang.stubs.structure.ModelDescriptorsBlock", "jetbrains.mps.lang.stubs.structure.ModelManagerDeclaration", "jetbrains.mps.lang.stubs.structure.ModelManagerType", "jetbrains.mps.lang.stubs.structure.Model_ConceptFunctionParameter", "jetbrains.mps.lang.stubs.structure.RootNodeDescriptorsBlock", "jetbrains.mps.lang.stubs.structure.Solution_ConceptFunctionParameter", "jetbrains.mps.lang.stubs.structure.Stereotype", "jetbrains.mps.lang.stubs.structure.StubLocation_ConceptFunctionParameter", "jetbrains.mps.lang.stubs.structure.StubSource_ConcteptFunctionParameter", "jetbrains.mps.lang.stubs.structure.StubsCreatorDeclaration", "jetbrains.mps.lang.stubs.structure.StubsCreatorType", "jetbrains.mps.lang.stubs.structure.UpdateModelBlock"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 16:
        return new StubsCreatorDeclaration_BehaviorDescriptor();
      case 18:
        return new UpdateModelBlock_BehaviorDescriptor();
      case 7:
        return new ModelDescriptorsBlock_BehaviorDescriptor();
      case 4:
        return new LanguageRef_BehaviorDescriptor();
      case 6:
        return new ModelCreationSettings_BehaviorDescriptor();
      case 11:
        return new RootNodeDescriptorsBlock_BehaviorDescriptor();
      case 14:
        return new StubLocation_ConceptFunctionParameter_BehaviorDescriptor();
      case 10:
        return new Model_ConceptFunctionParameter_BehaviorDescriptor();
      case 17:
        return new StubsCreatorType_BehaviorDescriptor();
      case 0:
        return new AbstractModelCreator_BehaviorDescriptor();
      case 8:
        return new ModelManagerDeclaration_BehaviorDescriptor();
      case 1:
        return new BaseCreatorType_BehaviorDescriptor();
      case 9:
        return new ModelManagerType_BehaviorDescriptor();
      case 5:
        return new LibraryStubDescriptor_BehaviorDescriptor();
      case 2:
        return new GetRootsBlock_BehaviorDescriptor();
      case 13:
        return new Stereotype_BehaviorDescriptor();
      case 3:
        return new InitModuleBlock_BehaviorDescriptor();
      case 12:
        return new Solution_ConceptFunctionParameter_BehaviorDescriptor();
      case 15:
        return new StubSource_ConcteptFunctionParameter_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
}
