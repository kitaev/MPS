package jetbrains.mps.baseLanguage.classifiers.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;

public class BehaviorAspectDescriptor extends DescriptorProvider<BehaviorDescriptor> {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch ((fqName).hashCode()) {
      case -1553485628:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.classifiers.structure.IClassifier 
        return null;
      case -1984697667:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.classifiers.structure.IMember 
        return null;
      case 1392477911:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.classifiers.structure.IClassifierPart 
        return null;
      case 1578447933:
        return new ThisClassifierExpression_BehaviorDescriptor();
      case -573869166:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType 
        return null;
      case -1002552714:
        return new DefaultClassifierType_BehaviorDescriptor();
      case 98094890:
        // interface or abstract concept behavior jetbrains.mps.baseLanguage.classifiers.structure.IMemberOperation 
        return null;
      case 1785336861:
        return new DefaultClassifierMethodDeclaration_BehaviorDescriptor();
      case 975488652:
        return new DefaultClassifierMethodCallOperation_BehaviorDescriptor();
      case -661473956:
        return new DefaultClassifierFieldDeclaration_BehaviorDescriptor();
      case -987394235:
        return new DefaultClassifierFieldAccessOperation_BehaviorDescriptor();
      case -1101238887:
        return new SuperClassifierExpresson_BehaviorDescriptor();
      case 225062172:
        return new DefaultClassifier_BehaviorDescriptor();
      default:
        return null;
    }
  }
}
