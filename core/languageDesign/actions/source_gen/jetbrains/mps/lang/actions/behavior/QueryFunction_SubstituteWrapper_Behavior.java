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

public class QueryFunction_SubstituteWrapper_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean virtual_usesParameterObjectFor_1213877374432(SNode thisNode, SNode parameter) {
    if (SNodeOperations.isInstanceOf(parameter, "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_nodeToWrap")) {
      return false;
    }
    if (SNodeOperations.isInstanceOf(parameter, "jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_model")) {
      return false;
    }
    return true;
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    SNode hostMenuPart = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.actions.structure.AddMenuPart", false, false);
    SNode concept = SLinkOperations.getTarget(hostMenuPart, "concept", false);
    return new QueryFunction_SubstituteWrapper_Behavior.QuotationClass_5223_l523emneplyp().createNode(concept);
  }

  public static class QuotationClass_5223_l523emneplyp {
    public QuotationClass_5223_l523emneplyp() {
    }

    public SNode createNode(Object parameter_5223_fhnb8vgx) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_5223_fhnb8vgv = null;
      {
        quotedNode_5223_fhnb8vgv = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5223_fhnb8vgv = quotedNode_5223_fhnb8vgv;
        quotedNode1_5223_fhnb8vgv.setReferent("concept", (SNode) parameter_5223_fhnb8vgx);
        result = quotedNode1_5223_fhnb8vgv;
      }
      return result;
    }
  }
}
