package jetbrains.mps.lang.stubs.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ModelManagerDeclaration_Behavior {
  private static Class[] PARAMETERS_5553449326502622488 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_createType_1213877527970(SNode thisNode) {
    return new ModelManagerDeclaration_Behavior.QuotationClass_v31ybx_a0a0b().createNode(thisNode);
  }

  public static SNode call_createType_5553449326502622488(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.stubs.structure.ModelManagerDeclaration"), "virtual_createType_1213877527970", PARAMETERS_5553449326502622488);
  }

  public static SNode callSuper_createType_5553449326502622488(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.stubs.structure.ModelManagerDeclaration"), callerConceptFqName, "virtual_createType_1213877527970", PARAMETERS_5553449326502622488);
  }

  public static class QuotationClass_v31ybx_a0a0b {
    public QuotationClass_v31ybx_a0a0b() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.stubs.structure.ModelManagerType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("declaration", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
