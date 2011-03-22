package jetbrains.mps.ui.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;

public class typeof_CompartmentReferenceExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_CompartmentReferenceExpression_InferenceRule() {
  }

  public void applyRule(final SNode cre, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    final SNode UIOBJECT_typevar_5776545240964942406 = typeCheckingContext.createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(cre, "uiObject", true);
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:f2d87002-eac7-4f98-addf-b2caa99c13a5(jetbrains.mps.ui.typesystem)", "5776545240964942393", 0, null);
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:f2d87002-eac7-4f98-addf-b2caa99c13a5(jetbrains.mps.ui.typesystem)", "5776545240964942385", true), (SNode) new typeof_CompartmentReferenceExpression_InferenceRule.QuotationClass_mr322_a0a1a0().createNode(typeCheckingContext.getRepresentative(UIOBJECT_typevar_5776545240964942406), typeCheckingContext), false, _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = cre;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:f2d87002-eac7-4f98-addf-b2caa99c13a5(jetbrains.mps.ui.typesystem)", "5776545240964961890", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:f2d87002-eac7-4f98-addf-b2caa99c13a5(jetbrains.mps.ui.typesystem)", "5776545240964942409", true), (SNode) new typeof_CompartmentReferenceExpression_InferenceRule.QuotationClass_mr322_a0a2a0().createNode(SLinkOperations.getTarget(cre, "container", false), typeCheckingContext.getRepresentative(UIOBJECT_typevar_5776545240964942406), typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ui.structure.CompartmentReferenceExpression";
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

  public static class QuotationClass_mr322_a0a1a0 {
    public QuotationClass_mr322_a0a1a0() {
    }

    public SNode createNode(Object parameter_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.UIObjectType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("uiObject", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.UIObjectType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("uiObject", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_mr322_a0a2a0 {
    public QuotationClass_mr322_a0a2a0() {
    }

    public SNode createNode(Object parameter_3, Object parameter_4, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.ContainerType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("container", (SNode) parameter_3);
        quotedNode1_2.setReferent("uiObject", (SNode) parameter_4);
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_3, Object parameter_4) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.ContainerType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("container", (SNode) parameter_3);
        quotedNode1_2.setReferent("uiObject", (SNode) parameter_4);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
