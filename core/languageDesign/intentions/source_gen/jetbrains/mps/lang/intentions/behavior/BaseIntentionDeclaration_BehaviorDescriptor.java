package jetbrains.mps.lang.intentions.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import jetbrains.mps.lang.plugin.behavior.ICheckedNamePolicy_BehaviorDescriptor;
import jetbrains.mps.lang.structure.behavior.IConceptAspect_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.behavior.IConceptAspect_Behavior;
import java.util.List;
import jetbrains.mps.lang.plugin.behavior.ICheckedNamePolicy_Behavior;
import jetbrains.mps.checkedName.PropertyReference;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class BaseIntentionDeclaration_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements INamedConcept_BehaviorDescriptor, ICheckedNamePolicy_BehaviorDescriptor, IConceptAspect_BehaviorDescriptor {
  public BaseIntentionDeclaration_BehaviorDescriptor() {
  }

  public boolean virtual_isApplicable_7839831476331657915(SNode thisNode, SNode candidate) {
    return IConceptAspect_Behavior.virtual_isApplicable_7839831476331657915(thisNode, candidate);
  }

  public List<SNode> virtual_getDescendantsToCheck_1628770029971140562(SNode thisNode) {
    return ICheckedNamePolicy_Behavior.virtual_getDescendantsToCheck_1628770029971140562(thisNode);
  }

  public List<PropertyReference> virtual_getPropertiesToCheck_1628770029971140570(SNode thisNode) {
    return ICheckedNamePolicy_Behavior.virtual_getPropertiesToCheck_1628770029971140570(thisNode);
  }

  public boolean virtual_isParameterized_6263518417926802310(SNode thisNode) {
    return BaseIntentionDeclaration_Behavior.virtual_isParameterized_6263518417926802310(thisNode);
  }

  public List<SNode> virtual_getBaseConceptCollection_5270353093116013036(SNode thisNode) {
    return IConceptAspect_Behavior.virtual_getBaseConceptCollection_5270353093116013036(thisNode);
  }

  public PropertyReference virtual_getPropertyToCheck_5003188907305392322(SNode thisNode) {
    return ICheckedNamePolicy_Behavior.virtual_getPropertyToCheck_5003188907305392322(thisNode);
  }

  public SNode virtual_getBaseConcept_2621449412040133768(SNode thisNode) {
    return BaseIntentionDeclaration_Behavior.virtual_getBaseConcept_2621449412040133768(thisNode);
  }

  public SNode virtual_getDescendantToCheck_3745452943050928880(SNode thisNode) {
    return BaseIntentionDeclaration_Behavior.virtual_getDescendantToCheck_3745452943050928880(thisNode);
  }

  public void virtual_setBaseConcept_6261424444345963020(SNode thisNode, SNode baseConcept) {
    BaseIntentionDeclaration_Behavior.virtual_setBaseConcept_6261424444345963020(thisNode, baseConcept);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.intentions.structure.BaseIntentionDeclaration";
  }
}
