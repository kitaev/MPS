package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.baseLanguage.behavior.Classifier_Behavior;
import jetbrains.mps.baseLanguage.behavior.IWillBeClassifier_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class check_switchArgument_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_switchArgument_NonTypesystemRule() {
  }

  public void applyRule(final SNode switchStatement, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode arg = SLinkOperations.getTarget(switchStatement, "expression", true);
    if (arg == null) {
      return;
    }
    SNode argType = TypeChecker.getInstance().getTypeOf(arg);
    if (SNodeOperations.isInstanceOf(argType, "jetbrains.mps.baseLanguage.structure.PrimitiveType")) {
      if (!(SNodeOperations.isInstanceOf(argType, "jetbrains.mps.baseLanguage.structure.IntegerType") || SNodeOperations.isInstanceOf(argType, "jetbrains.mps.baseLanguage.structure.CharType") || SNodeOperations.isInstanceOf(argType, "jetbrains.mps.baseLanguage.structure.ByteType") || SNodeOperations.isInstanceOf(argType, "jetbrains.mps.baseLanguage.structure.ShortType"))) {
        {
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(arg, "Primitive argument of switch should be byte, short, char or int", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "9035995549588681125", null, errorTarget);
        }
      }
      return;
    }
    if (SNodeOperations.isInstanceOf(argType, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(argType, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), "jetbrains.mps.baseLanguage.structure.EnumClass")) {
        return;
      }
    }
    if (SNodeOperations.isInstanceOf(argType, "jetbrains.mps.baseLanguage.structure.IWillBeClassifier")) {
      if (Classifier_Behavior.call_isDescendant_7165541881557222913(IWillBeClassifier_Behavior.call_baseClassifier_4125795553993767872(SNodeOperations.cast(argType, "jetbrains.mps.baseLanguage.structure.IWillBeClassifier")), SLinkOperations.getTarget(new check_switchArgument_NonTypesystemRule.QuotationClass_geu3h9_a0a0a0a5a0().createNode(typeCheckingContext), "classifier", false))) {
        return;
      }
    }
    {
      MessageTarget errorTarget = new NodeMessageTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(arg, "Argument of switch should be enum of primitive", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "3306910260423168223", null, errorTarget);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.SwitchStatement";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_geu3h9_a0a0a0a5a0 {
    public QuotationClass_geu3h9_a0a0a0a5a0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#f3061a53-9226-4cc5-a443-f952ceaf5816#jetbrains.mps.baseLanguage.structure(jetbrains.mps.baseLanguage.structure@java_stub)"), SNodeId.fromString("~EnumClass")));
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#f3061a53-9226-4cc5-a443-f952ceaf5816#jetbrains.mps.baseLanguage.structure(jetbrains.mps.baseLanguage.structure@java_stub)"), SNodeId.fromString("~EnumClass")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
