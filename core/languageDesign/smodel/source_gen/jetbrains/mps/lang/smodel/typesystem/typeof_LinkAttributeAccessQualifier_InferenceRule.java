package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;

public class typeof_LinkAttributeAccessQualifier_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_LinkAttributeAccessQualifier_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode annotationLink = SLinkOperations.getTarget(nodeToCheck, "annotationLink", false);
    if (annotationLink == null) {
      return;
    }
    // assign type 
    if (SPropertyOperations.hasValue(annotationLink, "sourceCardinality", "0..1", "0..1")) {
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        BaseQuickFixProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1204926978423", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1204926978425", true), (SNode) new typeof_LinkAttributeAccessQualifier_InferenceRule.QuotationClass_o4tfis_a0a0a3a0().createNode(SLinkOperations.getTarget(annotationLink, "target", false), typeCheckingContext), _info_12389875345);
      }
    } else {
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        BaseQuickFixProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "5458013232459741121", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "5458013232459741118", true), (SNode) new typeof_LinkAttributeAccessQualifier_InferenceRule.QuotationClass_o4tfis_a0a0a0d0a().createNode(SLinkOperations.getTarget(annotationLink, "target", false), typeCheckingContext), _info_12389875345);
      }
    }
    // --- 
    if (!(SPropertyOperations.hasValue(annotationLink, "stereotype", "link", "node"))) {
      BaseQuickFixProvider intentionProvider = null;
      MessageTarget errorTarget = new NodeMessageTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(nodeToCheck, "link annotation link is expected", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1204849792143", intentionProvider, errorTarget);
    }
    SNode linkQualifier = SLinkOperations.getTarget(nodeToCheck, "linkQualifier", true);
    if (SNodeOperations.isInstanceOf(linkQualifier, "jetbrains.mps.lang.smodel.structure.PoundExpression")) {
      // link role expected 
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(SNodeOperations.cast(linkQualifier, "jetbrains.mps.lang.smodel.structure.PoundExpression"), "expression", true);
        BaseQuickFixProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1204849792161", 0, intentionProvider);
        typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1204849792163", false), (SNode) new typeof_LinkAttributeAccessQualifier_InferenceRule.QuotationClass_o4tfis_a0a1a7a0().createNode(typeCheckingContext), false, _info_12389875345);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.LinkAttributeAccessQualifier";
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

  public static class QuotationClass_o4tfis_a0a0a3a0 {
    public QuotationClass_o4tfis_a0a0a3a0() {
    }

    public SNode createNode(Object parameter_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("concept", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("concept", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_o4tfis_a0a0a0d0a {
    public QuotationClass_o4tfis_a0a0a0d0a() {
    }

    public SNode createNode(Object parameter_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("elementConcept", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("elementConcept", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_o4tfis_a0a1a7a0 {
    public QuotationClass_o4tfis_a0a1a7a0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
