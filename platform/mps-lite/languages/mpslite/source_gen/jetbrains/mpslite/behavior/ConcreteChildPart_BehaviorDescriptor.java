package jetbrains.mpslite.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class ConcreteChildPart_BehaviorDescriptor extends ChildPart_BehaviorDescriptor implements INamedConcept_BehaviorDescriptor {
  public ConcreteChildPart_BehaviorDescriptor() {
  }

  public void virtual_fillConceptStructure_1238593834306(SNode thisNode, SNode concept, Map<SNode, SNode> conceptsToTargets, Map<SNode, SNode> partsToLinks) {
    ConcreteChildPart_Behavior.virtual_fillConceptStructure_1238593834306(thisNode, concept, conceptsToTargets, partsToLinks);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }
}
