package jetbrains.mps.baseLanguage.closures.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.Type_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import java.util.List;

public class FunctionType_BehaviorDescriptor extends Type_BehaviorDescriptor {
  public FunctionType_BehaviorDescriptor() {
  }

  public SNode virtual_getResultType_1230475757059(SNode thisNode) {
    return FunctionType_Behavior.virtual_getResultType_1230475757059(thisNode);
  }

  public String virtual_getRuntimeClassName_1230472987259(SNode thisNode) {
    return FunctionType_Behavior.virtual_getRuntimeClassName_1230472987259(thisNode);
  }

  public String virtual_getPresentation_1213877396640(SNode thisNode) {
    return FunctionType_Behavior.virtual_getPresentation_1213877396640(thisNode);
  }

  public List<String> virtual_getVariableSuffixes_1213877337304(SNode thisNode) {
    return FunctionType_Behavior.virtual_getVariableSuffixes_1213877337304(thisNode);
  }

  public String virtual_getRuntimeSignature_1213877404927(SNode thisNode) {
    return FunctionType_Behavior.virtual_getRuntimeSignature_1213877404927(thisNode);
  }

  public SNode virtual_getTerminateType_1232032188607(SNode thisNode) {
    return FunctionType_Behavior.virtual_getTerminateType_1232032188607(thisNode);
  }

  public SNode virtual_getClassExpression_1213877337357(SNode thisNode) {
    return FunctionType_Behavior.virtual_getClassExpression_1213877337357(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.closures.structure.FunctionType";
  }
}
