package jetbrains.mps.lang.plugin.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class ActionParameterDeclaration_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getType_1171743928471337193(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "type", true);
  }

  public static SNode virtual_getFieldDeclaration_1171743928471867409(SNode thisNode) {
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "type", true), "jetbrains.mps.lang.smodel.structure.SNodeType")) {
      return SLinkOperations.getTarget(new ActionParameterDeclaration_Behavior.QuotationClass_ax10d1_a0a0a0a2().createNode(), "variableDeclaration", false);
    } else if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "type", true), "jetbrains.mps.lang.smodel.structure.SModelType")) {
      return SLinkOperations.getTarget(new ActionParameterDeclaration_Behavior.QuotationClass_ax10d1_a0a0a0a0c().createNode(), "variableDeclaration", false);
    } else if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(thisNode, "type", true), "jetbrains.mps.lang.smodel.structure.SNodeListType")) {
      return SLinkOperations.getTarget(new ActionParameterDeclaration_Behavior.QuotationClass_ax10d1_a0a0a1a0c().createNode(), "variableDeclaration", false);
    }
    throw new IllegalStateException("Action parameter has wrong type: " + BaseConcept_Behavior.call_getPresentation_1213877396640(SLinkOperations.getTarget(thisNode, "type", true)));
  }

  public static class QuotationClass_ax10d1_a0a0a0a2 {
    public QuotationClass_ax10d1_a0a0a0a2() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)"), SNodeId.fromString("~MPSDataKeys")));
        quotedNode1_2.addReference(SReference.create("variableDeclaration", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)"), SNodeId.fromString("~MPSDataKeys.NODE")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_ax10d1_a0a0a0a0c {
    public QuotationClass_ax10d1_a0a0a0a0c() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)"), SNodeId.fromString("~MPSDataKeys")));
        quotedNode1_2.addReference(SReference.create("variableDeclaration", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)"), SNodeId.fromString("~MPSDataKeys.CONTEXT_MODEL")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_ax10d1_a0a0a1a0c {
    public QuotationClass_ax10d1_a0a0a1a0c() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)"), SNodeId.fromString("~MPSDataKeys")));
        quotedNode1_2.addReference(SReference.create("variableDeclaration", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.workbench(jetbrains.mps.workbench@java_stub)"), SNodeId.fromString("~MPSDataKeys.NODES")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
