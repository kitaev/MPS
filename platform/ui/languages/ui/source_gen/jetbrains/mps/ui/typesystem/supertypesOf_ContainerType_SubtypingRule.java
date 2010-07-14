package jetbrains.mps.ui.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;

public class supertypesOf_ContainerType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public supertypesOf_ContainerType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode ct, TypeCheckingContext typeCheckingContext) {
    List<SNode> res = new ArrayList<SNode>();
    if ((SLinkOperations.getTarget(ct, "container", false) != null)) {
      if ((SLinkOperations.getTarget(SLinkOperations.getTarget(ct, "container", false), "specializes", false) != null)) {
        ListSequence.fromList(res).addElement(new supertypesOf_ContainerType_SubtypingRule.QuotationClass_d3sbvm_a0a0a0a0b0a().createNode(SLinkOperations.getTarget(SLinkOperations.getTarget(ct, "container", false), "specializes", false), SNodeOperations.as(SNodeOperations.getParent(SLinkOperations.getTarget(SLinkOperations.getTarget(ct, "container", false), "specializes", false)), "jetbrains.mps.ui.modeling.structure.UIObject"), typeCheckingContext));
      }
      ListSequence.fromList(res).addElement(new supertypesOf_ContainerType_SubtypingRule.QuotationClass_d3sbvm_a0a0b0b0a().createNode(SLinkOperations.getTarget(ct, "uiObject", false), typeCheckingContext));
    }
    if ((SLinkOperations.getTarget(ct, "uiObject", false) != null)) {
      ListSequence.fromList(res).addElement(new supertypesOf_ContainerType_SubtypingRule.QuotationClass_d3sbvm_a0a0a0c0a().createNode(SLinkOperations.getTarget(SLinkOperations.getTarget(ct, "uiObject", false), "extends", false), typeCheckingContext));
    }
    ListSequence.fromList(res).addElement(new supertypesOf_ContainerType_SubtypingRule.QuotationClass_d3sbvm_a0a0d0a().createNode(SLinkOperations.getTarget(ct, "uiObject", false), typeCheckingContext));
    return res;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ui.structure.ContainerType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return false;
  }

  public static class QuotationClass_d3sbvm_a0a0a0a0b0a {
    public QuotationClass_d3sbvm_a0a0a0a0b0a() {
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

  public static class QuotationClass_d3sbvm_a0a0b0b0a {
    public QuotationClass_d3sbvm_a0a0b0b0a() {
    }

    public SNode createNode(Object parameter_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.ContainerType", null, GlobalScope.getInstance(), false);
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
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.ContainerType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("uiObject", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_d3sbvm_a0a0a0c0a {
    public QuotationClass_d3sbvm_a0a0a0c0a() {
    }

    public SNode createNode(Object parameter_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.ContainerType", null, GlobalScope.getInstance(), false);
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
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.ContainerType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("uiObject", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_d3sbvm_a0a0d0a {
    public QuotationClass_d3sbvm_a0a0d0a() {
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
}
