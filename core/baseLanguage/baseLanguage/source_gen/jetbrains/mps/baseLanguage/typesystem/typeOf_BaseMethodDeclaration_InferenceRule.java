package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.behavior.IMethodLike_Behavior;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class typeOf_BaseMethodDeclaration_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeOf_BaseMethodDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode bmd, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    for (SNode throwsItem : SLinkOperations.getTargets(bmd, "throwsItem", true)) {
      {
        SNode _nodeToCheck_1029348928467 = bmd;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1215105338790", 0, null);
        typeCheckingContext.createLessThanInequality((SNode) throwsItem, (SNode) new typeOf_BaseMethodDeclaration_InferenceRule.QuotationClass_ifzhbs_a0a0a0a0().createNode(typeCheckingContext), false, true, _info_12389875345);
      }
    }
    // ========== 
    if (SLinkOperations.getTarget(bmd, "body", true) == null) {
      return;
    }
    if (SConceptPropertyOperations.getBoolean(bmd, "abstract")) {
      return;
    }
    if (SNodeOperations.isInstanceOf(bmd, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration") && SPropertyOperations.getBoolean(SNodeOperations.cast(bmd, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"), "isAbstract")) {
      return;
    }
    // ============= 
    SNode expectedRetType = IMethodLike_Behavior.call_getExpectedRetType_1239354342632(bmd);
    // ============= 
    Iterable<SNode> returnStatements = RulesFunctions_BaseLanguage.collectReturnStatements(SLinkOperations.getTarget(bmd, "body", true));
    if (expectedRetType == null) {
      // shouldn't return any values 
      for (SNode returnStatement : Sequence.fromIterable(returnStatements)) {
        if ((SLinkOperations.getTarget(returnStatement, "expression", true) != null)) {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(returnStatement, "no return value expected", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1178765152925", null, errorTarget);
          }
        }
      }
    } else {
      // should return subtypes of the 'expected type' 
      for (SNode returnStatement : Sequence.fromIterable(returnStatements)) {
        if ((SLinkOperations.getTarget(returnStatement, "expression", true) == null)) {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(returnStatement, "should return value", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1178765314800", null, errorTarget);
          }
        } else {
          SNode returnType = typeCheckingContext.typeOf(SLinkOperations.getTarget(returnStatement, "expression", true), "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1178765405776", true);
          {
            SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(returnStatement, "expression", true);
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, "" + expectedRetType + " is expected", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1185363921400", 0, null);
            typeCheckingContext.createLessThanInequality((SNode) returnType, (SNode) expectedRetType, false, true, _info_12389875345);
          }
        }
      }
    }
    // ============= 
    if (expectedRetType != null) {
      // last expression statement can serve as return statement 
      SNode lastStatement = IMethodLike_Behavior.call_getLastStatement_1239354409446(bmd);
      if (SNodeOperations.isInstanceOf(lastStatement, "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
        SNode returnType = typeCheckingContext.typeOf(SLinkOperations.getTarget(SNodeOperations.cast(lastStatement, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), "expression", true), "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1178765601477", true);
        {
          SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(SNodeOperations.cast(lastStatement, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), "expression", true);
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, expectedRetType + " is expected", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1185363855090", 0, null);
          typeCheckingContext.createLessThanInequality((SNode) returnType, (SNode) expectedRetType, false, true, _info_12389875345);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
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

  public static class QuotationClass_ifzhbs_a0a0a0a0 {
    public QuotationClass_ifzhbs_a0a0a0a0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Throwable")));
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
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Throwable")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
