package jetbrains.mps.lang.textGen.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.BaseMethodDeclaration_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;

public class OperationDeclaration_BehaviorDescriptor extends BaseMethodDeclaration_BehaviorDescriptor {
  public OperationDeclaration_BehaviorDescriptor() {
  }

  public boolean virtual_isReturnsVoid_1234359555698(SNode thisNode) {
    return OperationDeclaration_Behavior.virtual_isReturnsVoid_1234359555698(thisNode);
  }

  public String virtual_getPresentation_1213877396640(SNode thisNode) {
    return OperationDeclaration_Behavior.virtual_getPresentation_1213877396640(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.textGen.structure.OperationDeclaration";
  }
}
