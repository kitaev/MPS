package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import javax.swing.Icon;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class InstanceMethodDeclaration_Behavior {
  private static Class[] PARAMETERS_8884554759541381512 = {SNode.class};
  private static Class[] PARAMETERS_4025276038182459792 = {SNode.class};
  private static Class[] PARAMETERS_5014346297260520665 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isDataFlowChecked_1227714048980(SNode thisNode) {
    return !(SPropertyOperations.getBoolean(thisNode, "isAbstract"));
  }

  public static boolean virtual_canBeAnnotated_1233076312117(SNode thisNode) {
    return true;
  }

  public static Icon virtual_getAdditionalIcon_5017341185733863694(SNode thisNode) {
    return IVisible_Behavior.call_getVisibilityIcon_5017341185733869581(thisNode);
  }

  public static List<SNode> virtual_getChildrenToDisplayIntention_4025276038182319200(SNode thisNode) {
    List<SNode> result = HasAnnotation_Behavior.callSuper_getChildrenToDisplayIntention_4025276038182319200(thisNode, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration");
    ListSequence.fromList(result).addElement(SLinkOperations.getTarget(thisNode, "visibility", true));
    return result;
  }

  public static SNode virtual_getNearestOverriddenMethod_5358895268254685434(SNode thisNode) {
    SNode superclass = null;
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
      superclass = SLinkOperations.getTarget(SNodeOperations.cast(SNodeOperations.getParent(thisNode), "jetbrains.mps.baseLanguage.structure.ClassConcept"), "superclass", true);
    }
    while (superclass != null) {
      for (SNode methodCandidate : ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(superclass, "classifier", false), "method", true))) {
        if (SPropertyOperations.getString(methodCandidate, "name").equals(SPropertyOperations.getString(thisNode, "name")) && ListSequence.fromList(SLinkOperations.getTargets(methodCandidate, "parameter", true)).count() == ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true)).count()) {
          if (BaseMethodDeclaration_Behavior.call_hasSameSignature_1213877350435(methodCandidate, thisNode)) {
            return methodCandidate;
          }
        }
      }
      superclass = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(superclass, "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept"), "superclass", true);
    }
    return null;
  }

  public static Icon call_getAdditionalIcon_8884554759541381512(SNode thisNode) {
    return (Icon) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"), "virtual_getAdditionalIcon_5017341185733863694", PARAMETERS_8884554759541381512);
  }

  public static List<SNode> call_getChildrenToDisplayIntention_4025276038182459792(SNode thisNode) {
    return (List<SNode>) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"), "virtual_getChildrenToDisplayIntention_4025276038182319200", PARAMETERS_4025276038182459792);
  }

  public static SNode call_getNearestOverriddenMethod_5014346297260520665(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"), "virtual_getNearestOverriddenMethod_5358895268254685434", PARAMETERS_5014346297260520665);
  }

  public static Icon callSuper_getAdditionalIcon_8884554759541381512(SNode thisNode, String callerConceptFqName) {
    return (Icon) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"), callerConceptFqName, "virtual_getAdditionalIcon_5017341185733863694", PARAMETERS_8884554759541381512);
  }

  public static List<SNode> callSuper_getChildrenToDisplayIntention_4025276038182459792(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"), callerConceptFqName, "virtual_getChildrenToDisplayIntention_4025276038182319200", PARAMETERS_4025276038182459792);
  }

  public static SNode callSuper_getNearestOverriddenMethod_5014346297260520665(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"), callerConceptFqName, "virtual_getNearestOverriddenMethod_5358895268254685434", PARAMETERS_5014346297260520665);
  }
}
