package jetbrains.mps.lang.actions.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class QueryFunction_SideTransform_ConceptHandler_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean virtual_usesParameterObjectFor_1213877374432(SNode thisNode, SNode parameter) {
    if (SNodeOperations.isInstanceOf(parameter, "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_pattern")) {
      return false;
    }
    if (SNodeOperations.isInstanceOf(parameter, "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_result")) {
      return false;
    }
    return true;
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    SNode ancestor = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.actions.structure.ConceptRightTransformPart", false, false);
    return new QueryFunction_SideTransform_ConceptHandler_Behavior.QuotationClass_4394_l523emnepmhi().createNode(SLinkOperations.getTarget(ancestor, "concept", false));
  }

  public static class QuotationClass_4394_l523emnepmhi {
    public QuotationClass_4394_l523emnepmhi() {
    }

    public SNode createNode(Object parameter_4394_fhnbb3ym) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_4394_fhnbb3yk = null;
      {
        quotedNode_4394_fhnbb3yk = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4394_fhnbb3yk = quotedNode_4394_fhnbb3yk;
        quotedNode1_4394_fhnbb3yk.setReferent("concept", (SNode) parameter_4394_fhnbb3ym);
        result = quotedNode1_4394_fhnbb3yk;
      }
      return result;
    }
  }
}
