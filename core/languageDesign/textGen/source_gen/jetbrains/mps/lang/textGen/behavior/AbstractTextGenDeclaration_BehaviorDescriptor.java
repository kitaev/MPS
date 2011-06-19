package jetbrains.mps.lang.textGen.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.baseLanguage.behavior.IValidIdentifier_BehaviorDescriptor;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public abstract class AbstractTextGenDeclaration_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements IValidIdentifier_BehaviorDescriptor {
  public AbstractTextGenDeclaration_BehaviorDescriptor() {
  }

  public List<SNode> virtual_getAvailableOperations_1234781444746(SNode thisNode) {
    return AbstractTextGenDeclaration_Behavior.virtual_getAvailableOperations_1234781444746(thisNode);
  }

  public String virtual_getTextGenNode_1234784577703(SNode thisNode) {
    return AbstractTextGenDeclaration_Behavior.virtual_getTextGenNode_1234784577703(thisNode);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.textGen.structure.AbstractTextGenDeclaration";
  }
}
