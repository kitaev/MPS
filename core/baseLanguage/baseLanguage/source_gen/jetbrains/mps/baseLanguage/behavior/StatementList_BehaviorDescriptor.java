package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.IContainer_BehaviorDescriptor;
import jetbrains.mps.lang.textGen.behavior.ScopeConcept_BehaviorDescriptor;
import java.util.List;
import jetbrains.mps.smodel.SNode;

public class StatementList_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements IContainer_BehaviorDescriptor, ILocalVariableElementList_BehaviorDescriptor, ScopeConcept_BehaviorDescriptor {
  public StatementList_BehaviorDescriptor() {
  }

  public List<SNode> virtual_getScopeVariables_3822000666564591100(SNode thisNode) {
    return StatementList_Behavior.virtual_getScopeVariables_3822000666564591100(thisNode);
  }

  public List<SNode> virtual_getLocalVariableElements_1238805763253(SNode thisNode) {
    return StatementList_Behavior.virtual_getLocalVariableElements_1238805763253(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.structure.StatementList";
  }
}
