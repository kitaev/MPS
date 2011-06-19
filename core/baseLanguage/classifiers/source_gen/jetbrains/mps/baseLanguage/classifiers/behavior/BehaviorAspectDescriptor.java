package jetbrains.mps.baseLanguage.classifiers.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifier", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldDeclaration", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodCallOperation", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration", "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierType", "jetbrains.mps.baseLanguage.classifiers.structure.SuperClassifierExpresson", "jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpression"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 7:
        return new ThisClassifierExpression_BehaviorDescriptor();
      case 5:
        return new DefaultClassifierType_BehaviorDescriptor();
      case 4:
        return new DefaultClassifierMethodDeclaration_BehaviorDescriptor();
      case 3:
        return new DefaultClassifierMethodCallOperation_BehaviorDescriptor();
      case 2:
        return new DefaultClassifierFieldDeclaration_BehaviorDescriptor();
      case 1:
        return new DefaultClassifierFieldAccessOperation_BehaviorDescriptor();
      case 6:
        return new SuperClassifierExpresson_BehaviorDescriptor();
      case 0:
        return new DefaultClassifier_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
}
