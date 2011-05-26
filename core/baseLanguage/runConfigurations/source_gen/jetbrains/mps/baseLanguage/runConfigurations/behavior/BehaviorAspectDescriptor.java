package jetbrains.mps.baseLanguage.runConfigurations.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch ((fqName).hashCode()) {
      case 638382655:
        return new JavaNodeRunConfiguration_BehaviorDescriptor();
      case 1255693015:
        return new JavaCheckBlock_BehaviorDescriptor();
      case 176098589:
        return new JavaRunConfiguration_BehaviorDescriptor();
      case -1616976445:
        return new JavaConfigurationRunParameters_FunctionParameter_BehaviorDescriptor();
      case -1580346184:
        return new UserComponentReferenceAnnotation_BehaviorDescriptor();
      case -535338940:
        return new Node_FunctionParameter_BehaviorDescriptor();
      case -1776949629:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.runConfigurations.structure.IJavaRunConfigurationParameter 
        return null;
      case 616231109:
        return new NodeRunConfigPropertyInstance_BehaviorDescriptor();
      case 1341486731:
        return new JavaNodeConfigurationEditorDeclaration_BehaviorDescriptor();
      case 237705548:
        return new OnChangeNodeBlock_BehaviorDescriptor();
      case -1711177389:
        return new ComponentInsideOfChangeListenerAnnotation_BehaviorDescriptor();
      case -177572680:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.runConfigurations.structure.IOnChangeEditorBlock 
        return null;
      case 2056789236:
        return new IsApplicableBlock_BehaviorDescriptor();
      case -583237754:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.runConfigurations.structure.IMainClass 
        return null;
      default:
        return null;
    }
  }
}
