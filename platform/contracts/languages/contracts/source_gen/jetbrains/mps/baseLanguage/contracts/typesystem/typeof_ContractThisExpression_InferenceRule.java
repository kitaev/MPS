package jetbrains.mps.baseLanguage.contracts.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_ContractThisExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ContractThisExpression_InferenceRule() {
  }

  public void applyRule(final SNode contractThisExpression, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode classifier = SNodeOperations.getAncestor(contractThisExpression, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
    List<SNode> typeVarRefs = new ArrayList<SNode>();
    for (SNode typeVariableDeclaration : SLinkOperations.getTargets(classifier, "typeVariableDeclaration", true)) {
      ListSequence.fromList(typeVarRefs).addElement(new typeof_ContractThisExpression_InferenceRule.QuotationClass_scihsm_a0a0a0c0a().createNode(typeVariableDeclaration, typeCheckingContext));
    }
    {
      SNode _nodeToCheck_1029348928467 = contractThisExpression;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:25ace809-bc3a-401e-bad3-caa877e546fb(jetbrains.mps.baseLanguage.contracts.typesystem)", "2329648364425265341", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:25ace809-bc3a-401e-bad3-caa877e546fb(jetbrains.mps.baseLanguage.contracts.typesystem)", "2329648364425265338", true), (SNode) new typeof_ContractThisExpression_InferenceRule.QuotationClass_scihsm_a0a3a0().createNode(classifier, typeVarRefs, typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.contracts.structure.ContractThisExpression";
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

  public static class QuotationClass_scihsm_a0a0a0c0a {
    public QuotationClass_scihsm_a0a0a0c0a() {
    }

    public SNode createNode(Object parameter_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.TypeVariableReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("typeVariableDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.TypeVariableReference", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("typeVariableDeclaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_scihsm_a0a3a0 {
    public QuotationClass_scihsm_a0a3a0() {
    }

    public SNode createNode(Object parameter_4, Object parameter_5, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setReferent("classifier", (SNode) parameter_4);
        {
          List<SNode> nodes = (List<SNode>) parameter_5;
          for (SNode child : nodes) {
            quotedNode_1.addChild("parameter", HUtil.copyIfNecessary(child, typeCheckingContext));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }

    public SNode createNode(Object parameter_4, Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.setReferent("classifier", (SNode) parameter_4);
        {
          List<SNode> nodes = (List<SNode>) parameter_5;
          for (SNode child : nodes) {
            quotedNode_1.addChild("parameter", HUtil.copyIfNecessary(child));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
