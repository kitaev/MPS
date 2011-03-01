package jetbrains.mps.baseLanguage.extensionMethods.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.extensionMethods.behavior.ExtensionMethodDeclaration_Behavior;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.baseLanguage.behavior.Type_Behavior;
import java.util.Map;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.baseLanguage.typesystem.RulesFunctions_BaseLanguage;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ExtensionMethodCall_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ExtensionMethodCall_InferenceRule() {
  }

  public void applyRule(final SNode extensionMethodCall, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SLinkOperations.getTarget(extensionMethodCall, "baseMethodDeclaration", false) == null) {
      return;
    }
    final SNode methodApplicableType = ExtensionMethodDeclaration_Behavior.call_getThisType_8022092943109893938(SLinkOperations.getTarget(extensionMethodCall, "baseMethodDeclaration", false));
    // --- 
    final SNode instanceType_typevar_5744862332973319659 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = IOperation_Behavior.call_getOperand_1213877410070(extensionMethodCall);
      BaseQuickFixProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:d9557470-9267-4b7b-ab45-4dc4cc5d697c(jetbrains.mps.baseLanguage.extensionMethods.typesystem)", "5744862332973319660", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.getRepresentative(instanceType_typevar_5744862332973319659), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:d9557470-9267-4b7b-ab45-4dc4cc5d697c(jetbrains.mps.baseLanguage.extensionMethods.typesystem)", "5744862332973319664", false), _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = extensionMethodCall;
      BaseQuickFixProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:d9557470-9267-4b7b-ab45-4dc4cc5d697c(jetbrains.mps.baseLanguage.extensionMethods.typesystem)", "5744862332973319668", 0, intentionProvider);
      typeCheckingContext.createLessThanInequationStrong((SNode) typeCheckingContext.getRepresentative(instanceType_typevar_5744862332973319659), (SNode) Type_Behavior.call_getLooseType_5744862332972792015(methodApplicableType), true, _info_12389875345);
    }
    // --- following piece of cake is identical for any method call --- 
    //  no more when_concrete 
    Map<SNode, List<SNode>> mmap = MapSequence.fromMap(new HashMap<SNode, List<SNode>>());
    RulesFunctions_BaseLanguage.inference_equateParametersAndReturnType(typeCheckingContext, extensionMethodCall, SLinkOperations.getTarget(SLinkOperations.getTarget(extensionMethodCall, "baseMethodDeclaration", false), "returnType", true), mmap);
    RulesFunctions_Extension.inference_equateApplicableType(typeCheckingContext, typeCheckingContext.getRepresentative(instanceType_typevar_5744862332973319659), SLinkOperations.getTarget(extensionMethodCall, "baseMethodDeclaration", false), mmap);
    RulesFunctions_BaseLanguage.inference_equateMatchingTypeVariables(typeCheckingContext, mmap);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.extensionMethods.structure.ExtensionMethodCall";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return true;
  }
}
