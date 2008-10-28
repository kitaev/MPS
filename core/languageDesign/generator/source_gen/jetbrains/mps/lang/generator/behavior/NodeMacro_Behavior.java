package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.generator.structure.RootTemplateAnnotation_AnnotationLink;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class NodeMacro_Behavior {
  private static Class[] PARAMETERS_1213877290799 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getInputNodeTypeInsideOfMacro_1213877290799(SNode thisNode) {
    SNode prevNodeMacro = NodeMacro_Behavior.call_getPreviousNodeMacro_1213877290823(thisNode);
    if (prevNodeMacro != null) {
      return NodeMacro_Behavior.call_getInputNodeTypeInsideOfMacro_1213877290799(prevNodeMacro);
    } else
    {
      return NodeMacro_Behavior.call_getInputNodeTypeFromEnvironment_1213877290892(thisNode);
    }
  }

  public static SNode call_getPreviousNodeMacro_1213877290823(SNode thisNode) {
    return NodeMacro_Behavior.call_getEnclosingMacro_1213877290834(thisNode, thisNode, SNodeOperations.getParent(thisNode));
  }

  public static SNode call_getEnclosingMacro_1213877290834(SNode thisNode, SNode currentMacro, SNode currentNode) {
    if (currentNode == null) {
      return null;
    }
    SNode result = null;
    for(SNode currentAttribute : currentNode.getAllAttributes()) {
      if (SNodeOperations.isInstanceOf(currentAttribute, "jetbrains.mps.lang.generator.structure.NodeMacro")) {
        if (currentAttribute == currentMacro) {
          break;
        }
        result = currentAttribute;
      }
    }
    if (result != null) {
      return result;
    }
    return NodeMacro_Behavior.call_getEnclosingMacro_1213877290834(thisNode, null, SNodeOperations.getParent(currentNode));
  }

  public static SNode call_getInputNodeTypeFromEnvironment_1213877290892(SNode thisNode) {
    SNode ancestor = SNodeOperations.getAncestorWhereConceptInList(thisNode, new String[]{"jetbrains.mps.lang.generator.structure.TemplateDeclaration","jetbrains.mps.lang.generator.structure.BaseMappingRule"}, false, false);
    if (SNodeOperations.isInstanceOf(ancestor, "jetbrains.mps.lang.generator.structure.TemplateDeclaration")) {
      return SLinkOperations.getTarget(ancestor, "applicableConcept", false);
    }
    if (SNodeOperations.isInstanceOf(ancestor, "jetbrains.mps.lang.generator.structure.BaseMappingRule")) {
      return SLinkOperations.getTarget(ancestor, "applicableConcept", false);
    }
    SNode rootAnnotation = SNodeOperations.getContainingRoot(thisNode).getAttribute(RootTemplateAnnotation_AnnotationLink.ROOT_TEMPLATE_ANNOTATION);
    return SLinkOperations.getTarget(rootAnnotation, "applicableConcept", false);
  }

  public static SNode call_getInputNodeTypeInsideOfMacro_1213877290799(SNode thisNode) {
    return (SNode)BehaviorManager.getInstance().invoke(Object.class, thisNode, "virtual_getInputNodeTypeInsideOfMacro_1213877290799", PARAMETERS_1213877290799);
  }

  public static SNode callSuper_getInputNodeTypeInsideOfMacro_1213877290799(SNode thisNode, String callerConceptFqName) {
    return (SNode)BehaviorManager.getInstance().invokeSuper(Object.class, thisNode, callerConceptFqName, "virtual_getInputNodeTypeInsideOfMacro_1213877290799", PARAMETERS_1213877290799);
  }

}
