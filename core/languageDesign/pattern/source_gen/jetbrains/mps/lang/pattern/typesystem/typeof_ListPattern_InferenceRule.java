package jetbrains.mps.lang.pattern.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class typeof_ListPattern_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ListPattern_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    SNode attributedNode = SNodeOperations.getParent(nodeToCheck);
    SNode parent = SNodeOperations.getParent(attributedNode);
    if (parent == null) {
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.typesystem)", "1202491231731", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.typesystem)", "1202491231736", true), (SNode) new typeof_ListPattern_InferenceRule.QuotationClass_3754_l523emnf0173().createNode(typeCheckingContext), _info_12389875345);
      }
    } else {
      String role = attributedNode.getRole_();
      SNode linkDeclaration = AbstractConceptDeclaration_Behavior.call_findLinkDeclaration_1213877394467(SNodeOperations.getConceptDeclaration(parent), role);
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.typesystem)", "1202491231762", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590343(jetbrains.mps.lang.pattern.typesystem)", "1202491231771", true), (SNode) new typeof_ListPattern_InferenceRule.QuotationClass_3754_l523emnf018o().createNode(SLinkOperations.getTarget(linkDeclaration, "target", false), typeCheckingContext), _info_12389875345);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.pattern.structure.ListPattern";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

  public static class QuotationClass_3754_l523emnf0173 {
    public QuotationClass_3754_l523emnf0173() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3754_l523emnf00u6 = null;
      {
        quotedNode_3754_l523emnf00u6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3754_l523emnf00u6 = quotedNode_3754_l523emnf00u6;
        result = quotedNode1_3754_l523emnf00u6;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3754_l523emnf00u6 = null;
      {
        quotedNode_3754_l523emnf00u6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3754_l523emnf00u6 = quotedNode_3754_l523emnf00u6;
        result = quotedNode1_3754_l523emnf00u6;
      }
      return result;
    }
  }

  public static class QuotationClass_3754_l523emnf018o {
    public QuotationClass_3754_l523emnf018o() {
    }

    public SNode createNode(Object parameter_3754_l523emnf00ux, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3754_l523emnf00uv = null;
      {
        quotedNode_3754_l523emnf00uv = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3754_l523emnf00uv = quotedNode_3754_l523emnf00uv;
        quotedNode1_3754_l523emnf00uv.setReferent("elementConcept", (SNode) parameter_3754_l523emnf00ux);
        result = quotedNode1_3754_l523emnf00uv;
      }
      return result;
    }

    public SNode createNode(Object parameter_3754_l523emnf00ux) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3754_l523emnf00uv = null;
      {
        quotedNode_3754_l523emnf00uv = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3754_l523emnf00uv = quotedNode_3754_l523emnf00uv;
        quotedNode1_3754_l523emnf00uv.setReferent("elementConcept", (SNode) parameter_3754_l523emnf00ux);
        result = quotedNode1_3754_l523emnf00uv;
      }
      return result;
    }
  }
}
