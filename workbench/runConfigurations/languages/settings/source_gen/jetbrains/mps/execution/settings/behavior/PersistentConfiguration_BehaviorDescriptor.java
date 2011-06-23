package jetbrains.mps.execution.settings.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import jetbrains.mps.baseLanguage.classifiers.behavior.IClassifier_BehaviorDescriptor;
import jetbrains.mps.execution.common.behavior.IGeneratedToClass_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.baseLanguage.classifiers.behavior.IClassifier_Behavior;
import jetbrains.mps.execution.common.behavior.IGeneratedToClass_Behavior;
import jetbrains.mps.baseLanguage.behavior.IExtractMethodRefactoringProcessor;
import org.jetbrains.annotations.NonNls;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class PersistentConfiguration_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements IPersistentPropertyHolder_BehaviorDescriptor, INamedConcept_BehaviorDescriptor, IClassifier_BehaviorDescriptor, IGeneratedToClass_BehaviorDescriptor {
  public PersistentConfiguration_BehaviorDescriptor() {
  }

  public SNode virtual_createType_1213877527970(SNode thisNode) {
    return PersistentConfiguration_Behavior.virtual_createType_1213877527970(thisNode);
  }

  public List<SNode> virtual_getMembers_1213877528124(SNode thisNode) {
    return IClassifier_Behavior.virtual_getMembers_1213877528124(thisNode);
  }

  public String virtual_getFullName_946964771156905503(SNode thisNode) {
    return IGeneratedToClass_Behavior.virtual_getFullName_946964771156905503(thisNode);
  }

  public List<SNode> virtual_getMembers_1213877528020(SNode thisNode, SNode contextNode) {
    return PersistentConfiguration_Behavior.virtual_getMembers_1213877528020(thisNode, contextNode);
  }

  public List<SNode> virtual_getParts_1213877527988(SNode thisNode) {
    return IClassifier_Behavior.virtual_getParts_1213877527988(thisNode);
  }

  public String virtual_getGeneratedClassName_946964771156905488(SNode thisNode) {
    return IGeneratedToClass_Behavior.virtual_getGeneratedClassName_946964771156905488(thisNode);
  }

  public SNode virtual_createSuperType_1217433657148(SNode thisNode) {
    return IClassifier_Behavior.virtual_createSuperType_1217433657148(thisNode);
  }

  public IExtractMethodRefactoringProcessor virtual_getExtractMethodRefactoringProcessor_1221393367929(SNode thisNode, List<SNode> nodesToRefactor) {
    return IClassifier_Behavior.virtual_getExtractMethodRefactoringProcessor_1221393367929(thisNode, nodesToRefactor);
  }

  @NonNls
  public String virtual_getSuffix_946964771156905483(SNode thisNode) {
    return PersistentConfiguration_Behavior.virtual_getSuffix_946964771156905483(thisNode);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.execution.settings.structure.PersistentConfiguration";
  }
}
