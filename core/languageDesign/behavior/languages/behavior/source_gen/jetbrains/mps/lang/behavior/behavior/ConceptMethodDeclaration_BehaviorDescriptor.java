package jetbrains.mps.lang.behavior.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.BaseMethodDeclaration_BehaviorDescriptor;
import jetbrains.mps.baseLanguage.behavior.IVisible_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;

public class ConceptMethodDeclaration_BehaviorDescriptor extends BaseMethodDeclaration_BehaviorDescriptor implements IVisible_BehaviorDescriptor {
  public ConceptMethodDeclaration_BehaviorDescriptor() {
  }

  public boolean virtual_isAbstract_1232982539764(SNode thisNode) {
    return ConceptMethodDeclaration_Behavior.virtual_isAbstract_1232982539764(thisNode);
  }

  public SNode virtual_getNearestOverriddenMethod_5358895268254685434(SNode thisNode) {
    return ConceptMethodDeclaration_Behavior.virtual_getNearestOverriddenMethod_5358895268254685434(thisNode);
  }

  public boolean virtual_canBeAnnotated_1233076312117(SNode thisNode) {
    return ConceptMethodDeclaration_Behavior.virtual_canBeAnnotated_1233076312117(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration";
  }
}
