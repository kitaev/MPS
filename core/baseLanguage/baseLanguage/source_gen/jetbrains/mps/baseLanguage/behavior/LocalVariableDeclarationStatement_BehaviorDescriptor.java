package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.IWrapper_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;

public class LocalVariableDeclarationStatement_BehaviorDescriptor extends Statement_BehaviorDescriptor implements IWrapper_BehaviorDescriptor {
  public LocalVariableDeclarationStatement_BehaviorDescriptor() {
  }

  public SNode virtual_getLocalVariableDeclaration_1238803857389(SNode thisNode) {
    return LocalVariableDeclarationStatement_Behavior.virtual_getLocalVariableDeclaration_1238803857389(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement";
  }
}
