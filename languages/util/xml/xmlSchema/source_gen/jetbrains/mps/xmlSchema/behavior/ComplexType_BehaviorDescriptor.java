package jetbrains.mps.xmlSchema.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Set;
import java.util.List;

public class ComplexType_BehaviorDescriptor extends Declaration_BehaviorDescriptor {
  public ComplexType_BehaviorDescriptor() {
  }

  public boolean virtual_isMixed_1213877382388(SNode thisNode) {
    return ComplexType_Behavior.virtual_isMixed_1213877382388(thisNode);
  }

  public void virtual_checkElements_1213877382378(SNode thisNode, Set<SNode> elementDeclarations) {
    ComplexType_Behavior.virtual_checkElements_1213877382378(thisNode, elementDeclarations);
  }

  public void virtual_checkAttributes_1213877382373(SNode thisNode, List<SNode> attributeDeclarations) {
    ComplexType_Behavior.virtual_checkAttributes_1213877382373(thisNode, attributeDeclarations);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.xmlSchema.structure.ComplexType";
  }
}
